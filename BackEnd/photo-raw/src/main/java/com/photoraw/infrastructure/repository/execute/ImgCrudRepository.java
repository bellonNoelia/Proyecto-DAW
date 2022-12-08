package com.photoraw.infrastructure.repository.execute;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.photoraw.infrastructure.entities.ImgEntity;
import com.photoraw.infrastructure.entities.PhotoEntity;
@Repository
public interface ImgCrudRepository extends JpaRepository<ImgEntity, Integer> {
	@Query("SELECT u FROM #{#entityName} u WHERE u.id = :id")
	ImgEntity findById(@Param("id") int id);
}
