package com.bizz.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="shares")
public class Shares {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int share_id;
	private int numberOfShares;
	private double valueOfShares;
	private double nominalCapital;
	@JsonBackReference(value="shareholders-shares")
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="shareholder_id")
	private Shareholders shareholders;
	
	public Shares() {
		super();
	}
	
	public Shares(int share_id, int numberOfShares, double valueOfShares, double nominalCapital,
			Shareholders shareholders) {
		super();
		this.share_id = share_id;
		this.numberOfShares = numberOfShares;
		this.valueOfShares = valueOfShares;
		this.nominalCapital = nominalCapital;
		this.shareholders = shareholders;
	}

	public int getShare_id() {
		return share_id;
	}

	public void setShare_id(int share_id) {
		this.share_id = share_id;
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

	public Shareholders getShareholders() {
		return shareholders;
	}

	public void setShareholders(Shareholders shareholders) {
		this.shareholders = shareholders;
	}

	
	
}
