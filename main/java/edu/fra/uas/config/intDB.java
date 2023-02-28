package edu.fra.uas.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.fra.uas.model.Barchart;
import edu.fra.uas.repository.BarchartRepository;

@Component
public class intDB {

	@Autowired
	private BarchartRepository repository;
	
	@PostConstruct
	private void init() {
		
	}
}
