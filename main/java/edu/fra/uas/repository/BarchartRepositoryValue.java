package edu.fra.uas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.fra.uas.model.Barchart;
import edu.fra.uas.model.Barchart_Value;

public interface BarchartRepositoryValue extends JpaRepository<Barchart_Value, Long> {
	

}
