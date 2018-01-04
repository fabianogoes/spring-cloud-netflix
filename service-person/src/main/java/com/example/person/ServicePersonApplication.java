package com.example.person;

import com.example.person.config.JacksonConfiguration;
import com.example.person.config.MessageResourceConfiguration;
import com.example.person.config.SwaggerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class ServicePersonApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(
				ServicePersonApplication.class,
				SwaggerConfiguration.class,
				JacksonConfiguration.class,
				MessageResourceConfiguration.class
		).run(args);
	}
}
