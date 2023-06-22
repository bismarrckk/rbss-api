package com.bizz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bizz.entity.KeyPersonnelType;
@Repository
public interface KeyPersonnelTypeRepo extends JpaRepository<KeyPersonnelType,Integer> {

}
