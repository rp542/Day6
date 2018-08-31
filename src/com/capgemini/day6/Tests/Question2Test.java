package com.capgemini.day6.Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.Laptop;
import com.capgemini.day6.domain.Car;
import com.capgemini.day6.domain.CellPhone;
import com.capgemini.day6.domain.School;
import com.capgemini.day6.domain.Telivision;

class Question2Test {

	@Test
	void testLaptopProducts() {
		HashSet<Laptop> laptop = new HashSet<Laptop>();
		laptop.add(new Laptop("Dell", "Inspiron", "windows", "i5"));
		laptop.add(new Laptop("acer", "Inspiron990", "ubuntu", "i6"));
		
		assertEquals(2, laptop.size());
		for (Laptop laptop2 : laptop) {
			System.out.println(laptop2);
		}
	}

	@Test
	void testCarDetails() {
		HashSet<Car> car = new HashSet<Car>();
		car.add(new Car("maruthi", "m567", 2018, 200000.0));
		car.add(new Car("maruthi", "m567", 2018, 200000.0));
		car.add(new Car("tata", "m568", 20004, 300000.0));
		assertEquals(2, car.size());
		for (Car car2 : car) {
			System.out.println(car2);
		}
	}

	@Test
	void testTelivisionProducts() {
		HashSet<Telivision> telivision = new HashSet<Telivision>();
		telivision.add(new Telivision("Lg", "plasma", true, 20000.0));
		telivision.add(new Telivision("Lg", "plasma", true, 20000.0));
		telivision.add(new Telivision("samsung", "lcd", true, 30000.0));
		assertEquals(2, telivision.size());
		for (Telivision telivision2 : telivision) {
			System.out.println(telivision2);
		}
	}

	@Test
	void testSchoolDetails() {
		HashSet<School> school = new HashSet<School>();
		school.add(new School("PullaReddy", "Mp", "Hyderabad", 10));
		school.add(new School("PullaReddy", "Mp", "Hyderabad", 10));
		school.add(new School("Springblossoms", "g nagar", "Khammam", 20));
		assertEquals(2,school.size());
		for (School school2 : school) {
			System.out.println(school2);
		}
	}
	@Test
	void testCellphoneDetails() {
		HashSet<CellPhone> cellphone = new HashSet<CellPhone>();
		 cellphone.add(new CellPhone("motorola", "g4", "Smart phone", "Android", 8000.0));
		 cellphone.add(new CellPhone("nokia", "h4", "Portable", "Blackberry", 9000.0));
		 cellphone.add(new CellPhone("motorola", "g4", "Smart phone", "Android", 8000.0));
		 assertEquals(2, cellphone.size());
		 for (CellPhone cellPhone2 : cellphone) {
			 System.out.println(cellPhone2);
		}
	}
}
