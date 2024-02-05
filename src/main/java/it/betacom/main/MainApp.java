package it.betacom.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.betacom.config.SpringConfig;
import it.betacom.model.HelloWorld;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		helloWorld.setMessage("Benvenuto");
		System.out.println(helloWorld);
		
	}

}
