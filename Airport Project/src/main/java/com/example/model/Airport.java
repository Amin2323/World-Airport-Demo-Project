package com.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "airport")
public class Airport {
	
	@Id
	private String id;
	private String number;
	private String name;
	private String city;
	private String country;
	private String ita;
	private String icato;
	private String latitude;
	private String longtitude;
	private String altitude;
	private String timezone;
	private String dst;
	private String tztimezone;
	private String type;
	private String source;
	
	
	public Airport(){
		
	}


	public Airport(String id, String number, String name, String city, String country, String ita, String icato,
			String latitude, String longtitude, String altitude, String timezone, String dst, String tztimezone,
			String type, String source) {
		super();
		this.id = id;
		this.number = number;
		this.name = name;
		this.city = city;
		this.country = country;
		this.ita = ita;
		this.icato = icato;
		this.latitude = latitude;
		this.longtitude = longtitude;
		this.altitude = altitude;
		this.timezone = timezone;
		this.dst = dst;
		this.tztimezone = tztimezone;
		this.type = type;
		this.source = source;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getString() {
		return number;
	}


	public void setString(String number) {
		this.number = number;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getIta() {
		return ita;
	}


	public void setIta(String ita) {
		this.ita = ita;
	}


	public String getIcato() {
		return icato;
	}


	public void setIcato(String icato) {
		this.icato = icato;
	}


	public String getLatitude() {
		return latitude;
	}


	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}


	public String getLongtitude() {
		return longtitude;
	}


	public void setLongtitude(String longtitude) {
		this.longtitude = longtitude;
	}


	public String getAltitude() {
		return altitude;
	}


	public void setAltitude(String altitude) {
		this.altitude = altitude;
	}


	public String getTimezone() {
		return timezone;
	}


	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}


	public String getDst() {
		return dst;
	}


	public void setDst(String dst) {
		this.dst = dst;
	}


	public String getTztimezone() {
		return tztimezone;
	}


	public void setTztimezone(String tztimezone) {
		this.tztimezone = tztimezone;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}
	
	
	
}
