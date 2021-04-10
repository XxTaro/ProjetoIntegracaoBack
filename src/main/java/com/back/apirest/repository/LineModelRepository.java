package com.back.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.back.apirest.models.LineModelEntity;

public interface LineModelRepository extends JpaRepository<LineModelEntity, Integer>{

	LineModelEntity findById(int id);
}
