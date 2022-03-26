package io.pragra.learning.springfirst;

import io.pragra.learning.springfirst.domain.Car;
import io.pragra.learning.springfirst.domain.DieselEngine;
import io.pragra.learning.springfirst.domain.Person;
import io.pragra.learning.springfirst.domain.PetrolEngine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.nio.file.Path;
import java.nio.file.Paths;

//@SpringBootApplication
public class SpringfirstApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringfirstApplication.class, args);

		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/beans.xml");

		 Car car = context.getBean("car", Car.class);

		Person person = context.getBean(Person.class);

		System.out.println(person);


	}

}
