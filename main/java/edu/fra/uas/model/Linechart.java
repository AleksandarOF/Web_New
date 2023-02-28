package edu.fra.uas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "linechart")
public class Linechart {
	@Id
    @GeneratedValue
    private long id;
	
	@Column(name = "wertx")
    private Integer Wertx;
	
	@Column(name = "werty")
    private Integer Werty;
    
    
    public Linechart() {
    
    }
	public Linechart(Integer wertx, Integer werty) {
		super();
		this.Wertx = wertx;
		this.Werty = werty;
	}
	
	public Integer getWertx() {
		return Wertx;
	}
	public void setWertx(Integer wertx) {
		Wertx = wertx;
	}
	public Integer getWerty() {
		return Werty;
	}
	public void setWerty(Integer werty) {
		Werty = werty;
	}
	public long getId() {
		return id;
	}
    
	
	
}