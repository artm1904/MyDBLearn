package ru.mpei.MyDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyDbApplication {

	public static void main(String[] args) {
		System.out.print("Hello!");
		SpringApplication.run(MyDbApplication.class, args);
	}

}
