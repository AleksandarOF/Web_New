package edu.fra.uas.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.fra.uas.model.Linechart;
import edu.fra.uas.repository.LinechartRepository;

@Component
public class initDBlinechart {

	@Autowired
	private LinechartRepository repository;
	
	@PostConstruct
	private void init() {
		Linechart linechart1 = new Linechart(34,56);
		this.repository.save(linechart1);
	}
}
