package com.bizz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bizz.entity.KeyPersonnel;

@Repository
public interface KeyPersonnelRepo extends JpaRepository<KeyPersonnel,Integer>{
	
}
