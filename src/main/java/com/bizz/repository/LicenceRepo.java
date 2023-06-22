package com.bizz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bizz.entity.Licences;
@Repository
public interface LicenceRepo extends JpaRepository<Licences,Integer>{

}
