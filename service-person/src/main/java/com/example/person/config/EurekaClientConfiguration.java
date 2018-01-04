package com.example.person.config;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;

/**
 * The @EnableDiscoveryClient activates the Netflix Eureka DiscoveryClient implementation.
 * There are other implementations for other service registries like Hashicorp’s Consul or Apache Zookeeper.
 *
 * There are multiple implementations of "Discovery Service" (eureka, consul, zookeeper).
 * @EnableDiscoveryClient lives in spring-cloud-commons and picks the implementation on the classpath.
 * @EnableEurekaClient lives in spring-cloud-netflix and only works for eureka. If eureka is on your classpath, they are effectively the same.
 */
@EnableDiscoveryClient
@Configuration
public class EurekaClientConfiguration {
}
