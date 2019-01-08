package com.example;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.Aspects;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Slf4j
public class InterceptorApplication {

	@RequestMapping("/")
	public String home() {
		log.info("/ called");
		return "Hello World";
	}

	@Bean
	public Interceptor interceptor() {
		// This will barf at runtime if the weaver isn't working (probably a
		// good thing)
		return Aspects.aspectOf(Interceptor.class);
	}

	public static void main(String[] args) {
		new SpringApplicationBuilder(InterceptorApplication.class).run(args);
	}
}
