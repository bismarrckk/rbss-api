package com.bizz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bizz.entity.InternalUsers;

@Repository
public interface InternalUsersRepo extends JpaRepository<InternalUsers,Integer>{
	
}
