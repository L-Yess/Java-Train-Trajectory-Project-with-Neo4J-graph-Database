package com.tramway.model;

public class Gare {

	private String name;
	private int x;
	private int y;
	
	public String toString() {
		return "Gare::"+this.name+" ("+x+","+y+")";
	}
	
	public Gare(String name, int x, int y) {
		super();
		this.name = name;
		this.x = x;
		this.y = y;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Gare() {
		super();
	}
	
	
	public Point toPoint() {
		return new Point(this.x, this.y);
	}
	
}
