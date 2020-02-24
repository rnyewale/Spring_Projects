package com.pluralsight.repo;

import java.util.List;

import com.pluralsight.model.Speacker;

public interface SpeackerRepository {
	List<Speacker> findAll();
}
