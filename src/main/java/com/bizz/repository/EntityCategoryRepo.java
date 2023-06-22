package com.bizz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bizz.entity.EntityCategory;

@Repository
public interface EntityCategoryRepo extends JpaRepository<EntityCategory,Integer>{

}
