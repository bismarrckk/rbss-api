package com.bizz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bizz.entity.Entities;

@Repository
public interface EntityRepo extends JpaRepository<Entities,Integer>{
	Entities findByEntityName(String name);
}
