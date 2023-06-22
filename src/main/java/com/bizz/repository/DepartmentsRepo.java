package com.bizz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bizz.entity.Departments;

@Repository
public interface DepartmentsRepo extends JpaRepository<Departments,Integer> {
	

}
