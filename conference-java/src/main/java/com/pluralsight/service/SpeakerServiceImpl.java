package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Speacker;
import com.pluralsight.repo.SpeackerRepository;

public class SpeakerServiceImpl implements SpeackerService1 {

	private SpeackerRepository repository;

	public List<Speacker> findAll() {
		return repository.findAll();
	}

	public void setRepository(SpeackerRepository repository){
		this.repository = repository;
	}
}
