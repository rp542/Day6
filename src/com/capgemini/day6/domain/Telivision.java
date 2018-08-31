package com.capgemini.day6.domain;

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
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((company == null) ? 0 : company.hashCode());
	long temp;
	temp = Double.doubleToLongBits(price);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((type == null) ? 0 : type.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Telivision other = (Telivision) obj;
	if (company == null) {
		if (other.company != null)
			return false;
	} else if (!company.equals(other.company))
		return false;
	if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
		return false;
	if (type == null) {
		if (other.type != null)
			return false;
	} else if (!type.equals(other.type))
		return false;
	return true;
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
@Override
public String toString() {
	return "Telivision [company=" + company + ", type=" + type + ", enable3D=" + enable3D + ", price=" + price + "]";
}
public void setPrice(double price) {
	this.price = price;
}

}
