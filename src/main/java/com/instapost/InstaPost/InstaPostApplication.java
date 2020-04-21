package com.instapost.InstaPost;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDiscoveryClient
public class InstaPostApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstaPostApplication.class, args);
	}

}
