package com.capgemini.day6.domain;

import java.util.Objects;

public class Laptop {

	public Laptop(String company, String model, String operatingSystem, String processor) {
		super();
		this.company = company;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.processor = processor;
	}

	String company;
	String model;
	String operatingSystem;
	String processor;

	public Laptop() {
		super();

	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		
		Laptop laptop = (Laptop) obj;
		return this.company == laptop.company && this.model == laptop.model;
	}	
	
	@Override
	public int hashCode() {
		return Objects.hash(company,model);
	}
	@Override
	public String toString() {
		return "laptop [company=" + company + ", model=" + model + ", operatingsystem=" + operatingSystem + ",processor=" +processor+ "]";
	}
}
