package com.javahly.javajob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class JavaJobApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaJobApplication.class, args);
	}

}
