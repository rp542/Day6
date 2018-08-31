package com.capgemini.day6.domain;

import java.util.Objects;

public class Car implements Comparable<Car> {
	private String make;
	private String model;
	private int year;
	private double price;

	public Car(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;

		Car car = (Car) obj;
		return this.make == car.make && this.model == car.model;
	}

	@Override
	public int hashCode() {
		return Objects.hash(make, model);
	}
	@Override
	public int compareTo(Car car) {
		
		int result = this.make.compareTo(car.make);
		
		return result;
		
	}
	@Override
	public String toString() {
		return "car [make=" + make + ", model=" + model + ", year=" + year + ",price=" +price+ "]";
	}

}
