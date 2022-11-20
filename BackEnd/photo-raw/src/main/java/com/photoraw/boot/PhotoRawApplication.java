package com.photoraw.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.photoraw"})
public class PhotoRawApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoRawApplication.class, args);
	}

}
