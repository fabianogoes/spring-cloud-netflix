package com.example.admin;

import com.example.admin.config.EurekaClientConfiguration;
import com.example.admin.config.SecurityConfig;
import com.example.admin.config.SpringBootAdminConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@EnableAutoConfiguration
public class Application {

	public static void main(String[] args) {
		new SpringApplicationBuilder(
				Application.class,
				SecurityConfig.class,
				SpringBootAdminConfiguration.class,
				EurekaClientConfiguration.class
		).run(args);
	}
}