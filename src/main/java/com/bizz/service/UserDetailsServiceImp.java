package com.bizz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.bizz.entity.Administrator;
import com.bizz.repository.UserRepo;
 
@Component
public class UserDetailsServiceImp implements UserDetailsService {
	@Autowired
	private UserRepo userRepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Administrator user=userRepo.findByEmail(username);
		if(user==null) {
			throw new UsernameNotFoundException("Email not found!!");
		}
		
		return new UserDetailsInfo(user);
		
	}

}
