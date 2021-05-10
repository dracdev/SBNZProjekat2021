package com.example.sbnzProj2021.model;

public class FilmRent {

	public enum RentStatus{RENTED,RETURNED}
	
	private int id;
	private Member member;
	private Film rentedFilm;
	
	
	public FilmRent(int id, Member member, Film rentedFilm) {
		super();
		this.id = id;
		this.member = member;
		this.rentedFilm = rentedFilm;
	}
	
	
	
	
}
