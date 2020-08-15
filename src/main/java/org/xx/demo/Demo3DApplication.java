package org.xx.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "org.xx.demo.*")
public class Demo3DApplication {

	public static void main(String[] args) {
		SpringApplication.run(Demo3DApplication.class, args);
	}

}
