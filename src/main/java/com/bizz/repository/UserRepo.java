package com.bizz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bizz.entity.User;
@Repository
public interface UserRepo extends JpaRepository<User,Integer>{
	User findByEmail(String email);
	
	@Query("SELECT a FROM User a WHERE a.userType=:type")
	List<User> findByType(@Param("type") String type);
}
