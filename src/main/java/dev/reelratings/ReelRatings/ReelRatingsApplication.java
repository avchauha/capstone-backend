package dev.reelratings.ReelRatings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude = {
		MongoAutoConfiguration.class
})
public class ReelRatingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReelRatingsApplication.class, args);
	}

}