package com.bizz.controller.dto;

import com.bizz.entity.Shareholders;


public class SharesDto {
	private int id;
	private int numberOfShares;
	private double valueOfShares;
	private double nominalCapital;
	private Shareholders directors;
	
	public SharesDto() {
		super();
	}

	public SharesDto(int id, int numberOfShares, double valueOfShares, double nominalCapital, Shareholders directors) {
		super();
		this.id = id;
		this.numberOfShares = numberOfShares;
		this.valueOfShares = valueOfShares;
		this.nominalCapital = nominalCapital;
		this.directors = directors;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumberOfShares() {
		return numberOfShares;
	}

	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}

	public double getValueOfShares() {
		return valueOfShares;
	}

	public void setValueOfShares(double valueOfShares) {
		this.valueOfShares = valueOfShares;
	}

	public double getNominalCapital() {
		return nominalCapital;
	}

	public void setNominalCapital(double nominalCapital) {
		this.nominalCapital = nominalCapital;
	}

	public Shareholders getDirectors() {
		return directors;
	}

	public void setDirectors(Shareholders directors) {
		this.directors = directors;
	}

	
	
	
}
