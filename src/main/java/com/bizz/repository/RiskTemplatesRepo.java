package com.bizz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bizz.controller.dto.TemplatesPerEntity;
import com.bizz.entity.RiskTemplates;

@Repository
public interface RiskTemplatesRepo extends JpaRepository<RiskTemplates,Integer>{
	@Query("SELECT DISTINCT new com.bizz.controller.dto.TemplatesPerEntity(r.riskTemplateId,r.fileName,r.entyType) FROM RiskTemplates r join "
			+ "Licences l ON r.entyType.entity_type_id=l.entityType.entity_type_id WHERE l.entity.entity_id=:id")
	List<TemplatesPerEntity> templatesPerEntity(@Param("id") Integer id);
}
