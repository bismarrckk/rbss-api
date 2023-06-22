package com.bizz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bizz.controller.dto.RiskUploadsEntityName;
import com.bizz.entity.RiskUploads;

public interface RiskUploadsRepo extends JpaRepository<RiskUploads,Integer>{
	@Query("SELECT new com.bizz.controller.dto.RiskUploadsEntityName(r.riskUploadsId,r.fileName,r.downloadUri,r.financialYear,r.period,"
			+ "r.entity,e.entity_id,e.entityName) FROM RiskUploads r join Entities e ON e.entity_id=r.entity.entity_id")
	List<RiskUploadsEntityName> findRiskUploadsEntities();
}


