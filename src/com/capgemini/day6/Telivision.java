package com.capgemini.day6;

public class Telivision {
private String company;
private String type;
private boolean enable3D;
private double price;
public Telivision() {
	super();
	// TODO Auto-generated constructor stub
}
public Telivision(String company, String type, boolean enable3d, double price) {
	super();
	this.company = company;
	this.type = type;
	enable3D = enable3d;
	this.price = price;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public boolean isEnable3D() {
	return enable3D;
}
public void setEnable3D(boolean enable3d) {
	enable3D = enable3d;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
}
