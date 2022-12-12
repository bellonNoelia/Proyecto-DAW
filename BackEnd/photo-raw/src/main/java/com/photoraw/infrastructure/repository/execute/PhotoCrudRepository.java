package com.photoraw.infrastructure.repository.execute;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.photoraw.infrastructure.entities.ImgEntity;
import com.photoraw.infrastructure.entities.PhotoEntity;

@Repository
public interface PhotoCrudRepository extends JpaRepository<PhotoEntity, Integer> {
	
	@Query("SELECT p FROM #{#entityName} p WHERE p.idUser = :idUser")
	List<PhotoEntity> findPhotosByUser(@Param("idUser") int idUser);
	
	@Query("SELECT p FROM #{#entityName} p WHERE p.id = :id")
	PhotoEntity readById(@Param("id") int id);
}
