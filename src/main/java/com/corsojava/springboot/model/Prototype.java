package com.corsojava.springboot.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="prototypes")
public class Prototype {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private String urlPhoto;
	
	private Integer year;
	
	private String drivers;

	private String engine;
	
	private String ersSystem;
	
	private Integer weight;
	
	private Integer gears;
	
	private String frontSuspensions;
	
	private String rearSuspensions;
	
	private Integer tyreSize;
	
	private String slug;
	
	@ManyToOne
	@JoinColumn(name = "team_id")
	private Team team;
	
	@OneToMany(mappedBy = "prototype", cascade = CascadeType.ALL)
	private List<PrototypeComment> PrototypeComments = new ArrayList<>();

	
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

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}
	
	public String getDrivers() {
		return drivers;
	}

	public void setDrivers(String drivers) {
		this.drivers = drivers;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getErsSystem() {
		return ersSystem;
	}

	public void setErsSystem(String ersSystem) {
		this.ersSystem = ersSystem;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Integer getGears() {
		return gears;
	}

	public void setGears(Integer gears) {
		this.gears = gears;
	}

	public String getFrontSuspensions() {
		return frontSuspensions;
	}

	public void setFrontSuspensions(String frontSuspensions) {
		this.frontSuspensions = frontSuspensions;
	}

	public String getRearSuspensions() {
		return rearSuspensions;
	}

	public void setRearSuspensions(String rearSuspensions) {
		this.rearSuspensions = rearSuspensions;
	}

	public Integer getTyreSize() {
		return tyreSize;
	}

	public void setTyreSize(Integer tyreSize) {
		this.tyreSize = tyreSize;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

}
