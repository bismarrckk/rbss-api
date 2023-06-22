package com.bizz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bizz.entity.Shareholders;



@Repository
public interface ShareholdersRepo extends JpaRepository<Shareholders,Integer>{
	
}
