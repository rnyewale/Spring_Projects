package com.pluralsight;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pluralsight.repo.HibernameSpeackerRepositoryImpl;
import com.pluralsight.repo.SpeackerRepository;
import com.pluralsight.service.SpeackerService;
import com.pluralsight.service.SpeackerService1;
import com.pluralsight.service.SpeakerServiceImpl;

@Configuration
public class AppConfig {

	@Bean(name = "speackerRepositoryBean")
	public SpeackerRepository getSpeackerRepo() {
		return new HibernameSpeackerRepositoryImpl();
	}

	@Bean(name = "speackerServiceBean")
	public SpeackerService1 getSpeackerService() {
		SpeakerServiceImpl service = new SpeakerServiceImpl();
		service.setRepository(getSpeackerRepo());

		return service;
	}

}
