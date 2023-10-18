package com.corsojava.springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="circuits")
public class Circuit {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private String urlPhoto;
	
	private String country;
	
	private String location;
	
	private Integer yearInauguration;
	
	private Integer length;
	
	private Integer turns;
	
	private Integer races;
	
	private Double lapTimeRecord;
	
	private String slug;

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrlPhoto() {
		return urlPhoto;
	}

	public void setUrlPhoto(String urlPhoto) {
		this.urlPhoto = urlPhoto;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getYearInauguration() {
		return yearInauguration;
	}

	public void setYearInauguration(Integer yearInauguration) {
		this.yearInauguration = yearInauguration;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Integer getTurns() {
		return turns;
	}

	public void setTurns(Integer turns) {
		this.turns = turns;
	}

	public Integer getRaces() {
		return races;
	}

	public void setRaces(Integer races) {
		this.races = races;
	}

	public Double getLapTimeRecord() {
		return lapTimeRecord;
	}

	public void setLapTimeRecord(Double lapTimeRecord) {
		this.lapTimeRecord = lapTimeRecord;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

}
