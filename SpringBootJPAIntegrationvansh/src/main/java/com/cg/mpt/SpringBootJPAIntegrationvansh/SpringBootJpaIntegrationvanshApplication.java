package com.cg.mpt.SpringBootJPAIntegrationvansh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cg")
@EntityScan("com.cg.mpt.beans")
public class SpringBootJpaIntegrationvanshApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaIntegrationvanshApplication.class, args);
	}

}
