package com.bizz.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bizz.controller.dto.UserDto;
import com.bizz.entity.User;
import com.bizz.controller.dto.AuthRequestDto;
import com.bizz.service.JwtService;
import com.bizz.service.UserService;

import exception.ResourceNotFoundException;

@RestController
@RequestMapping("/api/user")
@CrossOrigin("*")
public class UserController {
	@Autowired
	UserService userService;
	@Autowired
	JwtService jwtService;
	@Autowired
	AuthenticationManager authManager;
	
	@PostMapping
	public Object addUser(@Valid @RequestBody UserDto userDto) throws ResourceNotFoundException {
				
		return this.userService.addUser(userDto);
	}
	@PostMapping("/internalUser")
	public Object addInternalUser(@Valid @RequestBody UserDto userDto) throws ResourceNotFoundException {
				
		return this.userService.addInternalUser(userDto);
	}
	@GetMapping
	public List<User> getInternalUsers(){
		return this.userService.getAllUsers();
	}
	
	@PostMapping("/authenticate")
	public String authenticationToken(@RequestBody AuthRequestDto authRequest) throws Exception {
		try {
		authManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getEmail(),authRequest.getPassword()));
		}catch(Exception ex) {
			throw new Exception(ex);
		}	

		return jwtService.generateToken(authRequest.getEmail());
		
	}
	@GetMapping("/details")
	public ResponseEntity<Object> getAuthUser(Authentication auth){
		try {
	
		return new ResponseEntity<>(auth.getPrincipal(),HttpStatus.OK);
		
		}catch(RuntimeException ex) {
		return new ResponseEntity<>("Expired Token",HttpStatus.FORBIDDEN);
		}
		
	}
//	@GetMapping("/admin")
//	@PreAuthorize("hasAuthority('Admin')")
//	public String getUsers() {
//		return "All users";
//	}
//	@GetMapping("/user")
//	@PreAuthorize("hasAnyAuthority('User','Admin')")
//	public String getProfile() {
//		return "My profile";
//	}
	@DeleteMapping("{id}")
	public void deleteUser(@PathVariable int id) throws ResourceNotFoundException{
		userService.deleteUser(id);
		
	}
}
