package com.bizz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bizz.entity.Industry;

@Repository
public interface IndustryRepo extends JpaRepository<Industry,Integer>{

}
