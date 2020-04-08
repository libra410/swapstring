package com.example.swapstring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,WebMvcAutoConfiguration.class }) 
public class SwapstringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwapstringApplication.class, args);
		
	}

}
