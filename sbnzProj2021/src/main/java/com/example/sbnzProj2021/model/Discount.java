package com.example.sbnzProj2021.model;

public class Discount {
	
	private int id;
	private int amount;
	
	public Discount(int id, int amount) {
		super();
		this.id = id;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	

}
