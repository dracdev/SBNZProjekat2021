package com.example.sbnzProj2021.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Member extends User{


	private Date joinDate;
	private boolean membershipExpired = false;
	private Penalty penalty;
	
	private FilmLoan filmLoan;
	
	private Set<FilmRent> rentalHistory = new HashSet<FilmRent>();
	
	private boolean canRent=true;

	public Member(int id, String username, String password, Date joinDate, boolean membershipExpired, Penalty penalty,
			FilmLoan filmLoan, Set<FilmRent> rentalHistory, boolean canRent) {
		super(id, username, password);
		this.joinDate = joinDate;
		this.membershipExpired = membershipExpired;
		this.penalty = penalty;
		this.filmLoan = filmLoan;
		this.rentalHistory = rentalHistory;
		this.canRent = canRent;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public boolean isMembershipExpired() {
		return membershipExpired;
	}

	public void setMembershipExpired(boolean membershipExpired) {
		this.membershipExpired = membershipExpired;
	}

	public Penalty getPenalty() {
		return penalty;
	}

	public void setPenalty(Penalty penalty) {
		this.penalty = penalty;
	}

	public FilmLoan getFilmLoan() {
		return filmLoan;
	}

	public void setFilmLoan(FilmLoan filmLoan) {
		this.filmLoan = filmLoan;
	}

	public Set<FilmRent> getRentalHistory() {
		return rentalHistory;
	}

	public void setRentalHistory(Set<FilmRent> rentalHistory) {
		this.rentalHistory = rentalHistory;
	}

	public boolean isCanRent() {
		return canRent;
	}

	public void setCanRent(boolean canRent) {
		this.canRent = canRent;
	}
	

}
