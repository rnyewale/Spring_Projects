package com.pluralsight.repo;

import java.util.Arrays;
import java.util.List;

import com.pluralsight.model.Speacker;

public class HibernameSpeackerRepositoryImpl implements SpeackerRepository {

	public List<Speacker> findAll() {
		
		List<Speacker> speackers = Arrays.asList(
				new Speacker("Ram Yewale", "Java Spring"),
				new Speacker("Priya Yewale", "HM"),
				new Speacker("Alexa", "Google"),
				new Speacker("Serie", "iPhone"));
		
		return speackers;
	}

	
}
