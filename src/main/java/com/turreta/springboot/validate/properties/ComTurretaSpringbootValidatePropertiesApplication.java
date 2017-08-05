package com.turreta.springboot.validate.properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ComTurretaSpringbootValidatePropertiesApplication {

	public static void main(String[] args) {

//		SpringApplication.run(ComTurretaSpringbootValidatePropertiesApplication.class, args);

		ApplicationContext context = SpringApplication.run(ComTurretaSpringbootValidatePropertiesApplication.class, args);

		Module1ConfigBean m1 = context.getBean(Module1ConfigBean.class);
		System.out.print(m1);


		Module2ConfigBean m2 = context.getBean(Module2ConfigBean.class);
		System.out.print(m2);
	}
}
