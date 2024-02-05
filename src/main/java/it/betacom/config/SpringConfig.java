package it.betacom.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import it.betacom.model.HelloWorld;


@Configuration
public class SpringConfig {
	
	@Bean
	public HelloWorld helloWorld() {
		return new HelloWorld();
		
	}

}
