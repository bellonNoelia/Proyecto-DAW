package com.photoraw.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.photoraw")
@EnableJpaRepositories("com.photoraw.infrastructure.respository.execute")
@EntityScan("com.photoraw.infrastructure.entities")
@MapperScan("com.photoraw.infrastructure.mapper")
public class PhotoRawApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoRawApplication.class, args);
	}

}
