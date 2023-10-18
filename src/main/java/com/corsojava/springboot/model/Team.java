package com.corsojava.springboot.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="teams")
public class Team {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private String urlPhoto;
	
	private String nationality;
	
	private String teamPrincipal;
	
	private Integer seasons;
	
	private Integer races;
	
	private Integer gpWon;
	
	private Integer polePosition;
	
	private Integer fastestLap;
	
	private Integer constructorWC;
	
	private Integer driverWC;
	
	private String slug;
	
	@OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
	private List<Driver> drivers = new ArrayList<>();
	
	@OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
	private List<Prototype> prototypes = new ArrayList<>();

	
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

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getTeamPrincipal() {
		return teamPrincipal;
	}

	public void setTeamPrincipal(String teamPrincipal) {
		this.teamPrincipal = teamPrincipal;
	}

	public Integer getSeasons() {
		return seasons;
	}

	public void setSeasons(Integer seasons) {
		this.seasons = seasons;
	}

	public Integer getRaces() {
		return races;
	}

	public void setRaces(Integer races) {
		this.races = races;
	}

	public Integer getGpWon() {
		return gpWon;
	}

	public void setGpWon(Integer gpWon) {
		this.gpWon = gpWon;
	}

	public Integer getPolePosition() {
		return polePosition;
	}

	public void setPolePosition(Integer polePosition) {
		this.polePosition = polePosition;
	}

	public Integer getFastestLap() {
		return fastestLap;
	}

	public void setFastestLap(Integer fastestLap) {
		this.fastestLap = fastestLap;
	}

	public Integer getConstructorWC() {
		return constructorWC;
	}

	public void setConstructorWC(Integer constructorWC) {
		this.constructorWC = constructorWC;
	}

	public Integer getDriverWC() {
		return driverWC;
	}

	public void setDriverWC(Integer driverWC) {
		this.driverWC = driverWC;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

}
