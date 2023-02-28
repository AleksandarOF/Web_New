package edu.fra.uas.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.fra.uas.model.Barchart;
import edu.fra.uas.repository.BarchartRepository;
import edu.fra.uas.repository.BarchartRepositoryValue;

@Component
public class intDBBarchart {

	@Autowired
	private BarchartRepositoryValue repository;
	
	@PostConstruct
	private void init() {
		
	}
}
