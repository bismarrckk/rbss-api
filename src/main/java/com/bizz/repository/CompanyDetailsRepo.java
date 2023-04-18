package com.bizz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bizz.entity.CompanyDetails;
@Repository
public interface CompanyDetailsRepo extends JpaRepository<CompanyDetails,Integer> {

}
