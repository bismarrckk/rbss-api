package com.bizz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bizz.entity.Administrator;

@Repository
public interface UserRepo extends JpaRepository<Administrator,Integer>{
	Administrator findByEmail(String email);
}
