package com.example.sbnzProj2021.model;

public class Penalty {

	private Long id;
	private Double amount;
	
	public Penalty(Long id, Double amount) {
		super();
		this.id = id;
		this.amount = amount;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	
	
}
