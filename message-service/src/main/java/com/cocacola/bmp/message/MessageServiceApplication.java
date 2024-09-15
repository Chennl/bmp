package com.cocacola.bmp.message;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class MessageServiceApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(MessageServiceApplication.class, args);
		String env = applicationContext.getEnvironment().getProperty("current.environment");
		String ver = applicationContext.getEnvironment().getProperty("current.version");
		String port = applicationContext.getEnvironment().getProperty("server.port");
		String address = applicationContext.getEnvironment().getProperty("server.address");

		System.out.println("environment:" + env + "; version: " + ver+ ";server address:"+address +" port: " + port);

	}
	@GetMapping("/health")
	public String health(){

		return " The message-service is health!";
	}
}
