package main;

import java.io.Serializable;

public class Location implements Serializable {

	String municipality;
	String latitude;
	String longitude;
	
	public Location (String municipality, String latitude, String longitude) {
		this.municipality = municipality;
		this.latitude = latitude;
		this.longitude = longitude;
	}
}
