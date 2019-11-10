package com.nordeste.nordesteApp.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nordeste.nordesteApp.model.Companie;
import com.nordeste.nordesteApp.repository.CompanieRepository;

@Service
public class CompanieService {

	@Autowired
	private CompanieRepository repository;
	
	public void save(Companie companie) {
		companie.setCreatedAt(new Date());
		companie.setUpdateAt(new Date());
		repository.save(companie);
	}
}
