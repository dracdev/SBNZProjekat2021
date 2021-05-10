package com.example.sbnzProj2021.model;

import java.util.Date;

public class FilmLoan {
	
	
	private int filmdId;
	private int userId;
	
	private int id;
	
	private Date expiryDate;
	private boolean returned;
	private boolean expired;
	
	
	public FilmLoan(int filmdId, int userId, int id, Date expiryDate, boolean returned, boolean expired) {
		super();
		this.filmdId = filmdId;
		this.userId = userId;
		this.id = id;
		this.expiryDate = expiryDate;
		this.returned = returned;
		this.expired = expired;
	}


	public int getFilmdId() {
		return filmdId;
	}


	public void setFilmdId(int filmdId) {
		this.filmdId = filmdId;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Date getExpiryDate() {
		return expiryDate;
	}


	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}


	public boolean isReturned() {
		return returned;
	}


	public void setReturned(boolean returned) {
		this.returned = returned;
	}


	public boolean isExpired() {
		return expired;
	}


	public void setExpired(boolean expired) {
		this.expired = expired;
	}
	
	
	
	
	

}
