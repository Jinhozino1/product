package com.example.product;

//import org.modelmapper.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;

import javax.sql.*;
import java.sql.*;

@SpringBootApplication
public class ProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}

//	@Bean
//	public ModelMapper modelMapper() {
//		ModelMapper modelMapper = new ModelMapper();
//		modelMapper.getConfiguration()
//				.setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE)
//				.setFieldMatchingEnabled(true);
//
//		return modelMapper;
//	}

	@Bean
	@Profile("prod")
	public ApplicationRunner runner(DataSource dataSource) {
		return args -> {

			Connection connection = dataSource.getConnection();
		};
	}
}
