package com.photoraw.infrastructure.repository.execute;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.photoraw.infrastructure.entities.UserEntity;

@Repository
public interface UserCrudRepository extends JpaRepository<UserEntity, Integer> {

	@Query("SELECT u FROM #{#entityName} u WHERE u.email = :email and u.pwd = :pwd")
	UserEntity findUser(@Param("email") String email, @Param("pwd") String pwd);
	
	@Query("SELECT u FROM #{#entityName} u WHERE u.idRol = :rol")
	List<UserEntity> findByRol(@Param("rol") int rol);
}
