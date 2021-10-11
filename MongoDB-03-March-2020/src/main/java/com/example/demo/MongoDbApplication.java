package com.example.demo;

import com.mongodb.MongoClientOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.example.repository")
@ComponentScan("com.example.*")
public class MongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoDbApplication.class, args);
	}

	@Bean
	public MongoClientOptions mongoOptions() {
		return MongoClientOptions.builder().connectTimeout(2).maxWaitTime(1).build();
	}

}
