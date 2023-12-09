package com.tutoring.classhub.local;

import com.tutoring.classhub.ClassHubApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;
//import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
//import org.springframework.context.annotation.Bean;
//import org.testcontainers.containers.PostgreSQLContainer;
//import org.testcontainers.utility.DockerImageName;

@TestConfiguration(proxyBeanMethods = false)
public class LocalClassHubApplication {

//	@Bean
//	@ServiceConnection
//	@RestartScope
//	PostgreSQLContainer<?> postgresContainer() {
//		return new PostgreSQLContainer<>(DockerImageName.parse("postgres:latest"));
//	}

	public static void main(String[] args) {
		SpringApplication.from(ClassHubApplication::main).with(LocalClassHubApplication.class).run(args);
	}

}
