package com.example.sbnzProj2021.model;

import java.util.List;

import com.example.sbnzProj2021.model.Enums.FilmClassification;
import com.example.sbnzProj2021.model.Enums.FilmGenre;

public class Film {
	
	private int id;
	private String filmName;
	private FilmGenre filmGenre;
	private String directorName;
	private int yearOfProduction;
	private List<String> actorsNames;
	private int filmLength;
	private FilmClassification filmClassification;
	
	
	public Film(int id, String filmName, FilmGenre filmGenre, String directorName, int yearOfProduction,
			List<String> actorsNames, int filmLength, FilmClassification filmClassification) {
		super();
		this.id = id;
		this.filmName = filmName;
		this.filmGenre = filmGenre;
		this.directorName = directorName;
		this.yearOfProduction = yearOfProduction;
		this.actorsNames = actorsNames;
		this.filmLength = filmLength;
		this.filmClassification = filmClassification;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFilmName() {
		return filmName;
	}


	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}


	public FilmGenre getFilmGenre() {
		return filmGenre;
	}


	public void setFilmGenre(FilmGenre filmGenre) {
		this.filmGenre = filmGenre;
	}


	public String getDirectorName() {
		return directorName;
	}


	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}


	public int getYearOfProduction() {
		return yearOfProduction;
	}


	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}


	public List<String> getActorsNames() {
		return actorsNames;
	}


	public void setActorsNames(List<String> actorsNames) {
		this.actorsNames = actorsNames;
	}


	public int getFilmLength() {
		return filmLength;
	}


	public void setFilmLength(int filmLength) {
		this.filmLength = filmLength;
	}


	public FilmClassification getFilmClassification() {
		return filmClassification;
	}


	public void setFilmClassification(FilmClassification filmClassification) {
		this.filmClassification = filmClassification;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
