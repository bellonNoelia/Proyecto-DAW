package com.photoraw.infrastructure.repository.execute;

import org.springframework.data.jpa.repository.JpaRepository;

import com.photoraw.infrastructure.entities.PhotoEntity;

public interface PhotoCrudRepository extends JpaRepository<PhotoEntity, Integer> {

}
