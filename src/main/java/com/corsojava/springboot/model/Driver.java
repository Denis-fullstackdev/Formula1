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
@Table(name="drivers")
public class Driver {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private String nationality;
	
	private String currentTeam;
	
	private Boolean active;
	
	private Integer raceStart;
	
	private Integer gpWon;
	
	private Integer polePosition;
	
	private Integer fastestLap;
	
	private Integer worldChampion;
	
	private String urlPhoto;
	
	private String slug;
	
	@ManyToOne
	@JoinColumn(name = "team_id")
	private Team team;
	
	@OneToMany(mappedBy = "driver", cascade = CascadeType.ALL)
	private List<DriverComment> DriverComments = new ArrayList<>();

	
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

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getCurrentTeam() {
		return currentTeam;
	}

	public void setCurrentTeam(String currentTeam) {
		this.currentTeam = currentTeam;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Integer getRaceStart() {
		return raceStart;
	}

	public void setRaceStart(Integer raceStart) {
		this.raceStart = raceStart;
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

	public Integer getWorldChampion() {
		return worldChampion;
	}

	public void setWorldChampion(Integer worldChampion) {
		this.worldChampion = worldChampion;
	}

	public String getUrlPhoto() {
		return urlPhoto;
	}

	public void setUrlPhoto(String urlPhoto) {
		this.urlPhoto = urlPhoto;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

}
