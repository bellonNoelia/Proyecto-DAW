package com.photoraw.infrastructure.repository.execute;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.photoraw.domain.entity.User;
import com.photoraw.infrastructure.entities.PhotoEntity;
import com.photoraw.infrastructure.mapper.UserMapper;

@Repository
public interface PhotoCrudRepository extends JpaRepository<PhotoEntity, Integer> {
	
}
