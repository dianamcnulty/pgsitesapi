package com.dianamcnulty.pgweather.models;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection = "flyingSites")
public class FlyingSite {
	
	@Id 
	@JsonProperty()
	private String id;  
	@JsonProperty(required=true, value="name")
    private String name; 
	@JsonProperty(required=true, value="state")
    private String state;
	@JsonProperty(required=true, value="zip")
    private String zip;
	@JsonProperty(required=false, value="rating")
    private String rating;
	@JsonProperty(required=false, value="maxWindDir")
    private int maxWindDir; //wind direction expressed in degrees
	@JsonProperty(required=false, value="minWindDir")
    private int minWindDir; //wind direction expressed in degrees
	@JsonProperty(required=false, value="restrictions")
    private String[] restrictions;

	
    public FlyingSite() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(@JsonProperty("name")String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(@JsonProperty("state")String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(@JsonProperty("zip")String zip) {
		this.zip = zip;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(@JsonProperty("rating")String rating) {
		this.rating = rating;
	}

	public int getMaxWindDir() {
		return maxWindDir;
	}

	public void setMaxWindDir(@JsonProperty("maxWindDir")int maxWindDir) {
		this.maxWindDir = maxWindDir;
	}

	public int getMinWindDir() {
		return minWindDir;
	}

	public void setMinWindDir(@JsonProperty("minWindDir")int minWindDir) {
		this.minWindDir = minWindDir;
	}

	public String[] getRestrictions() {
		return restrictions;
	}

	public void setRestrictions(@JsonProperty("restrictions")String[] restrictions) {
		this.restrictions = restrictions;
	}
}
