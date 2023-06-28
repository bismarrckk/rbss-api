package com.bizz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bizz.entity.Years;

@Repository
public interface YearsRepo extends JpaRepository<Years,Integer> {
	
}
