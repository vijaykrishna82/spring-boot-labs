package io.pivotal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloSpringBootWebGradleApplication {

	Logger logger = LoggerFactory.getLogger(HelloSpringBootWebGradleApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringBootWebGradleApplication.class, args);
	}



	@Bean
	CommandLineRunner loadDatabase(GreetingRepository gr) {
		return args -> {
			logger.debug("loading database..");
			gr.save(new Greeting(1, "Hello"));
			gr.save(new Greeting(2, "Hola"));
			gr.save(new Greeting(3, "Ohai"));
			logger.debug("record count: {}", gr.count());
			gr.findAll().forEach(x -> logger.debug(x.toString()));
		};

	}
}
