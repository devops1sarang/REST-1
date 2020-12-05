package com.example;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sbm1BannerApplication {
	private Map<String, Object> map = new HashMap<String, Object>();

	public static void main(String[] args) {
		SpringApplication.run(Sbm1BannerApplication.class, args);
	}

	public void m1() {
	}

}
