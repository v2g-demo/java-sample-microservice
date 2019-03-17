package com.v2gdemo.sample;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAutoConfiguration
@RestController
public class SampleApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SampleApplication.class, args);
		SpringApplication app = new SpringApplication(SampleApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}



}
