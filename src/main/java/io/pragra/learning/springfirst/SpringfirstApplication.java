package io.pragra.learning.springfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringfirstApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringfirstApplication.class, args);
	}

}
