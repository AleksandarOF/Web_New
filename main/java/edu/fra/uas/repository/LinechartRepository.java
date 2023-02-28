package edu.fra.uas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.fra.uas.model.Barchart;
import edu.fra.uas.model.Linechart;

public interface LinechartRepository extends JpaRepository<Linechart, Long> {
	

}
