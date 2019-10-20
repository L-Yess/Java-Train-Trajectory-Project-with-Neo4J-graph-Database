package com.tramway.model;

public class Trajet {

	private String from;
	private String to;
	private int distance;
	private double time;
	public Trajet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trajet(String from, String to, int distance, double time) {
		super();
		this.from = from;
		this.to = to;
		this.distance = distance;
		this.time = time;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
	

	
	
	
	
}
