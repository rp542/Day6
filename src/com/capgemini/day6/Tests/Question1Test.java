package com.capgemini.day6.Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.domain.Car;
import com.capgemini.day6.domain.CellPhone;
import com.capgemini.day6.domain.Laptop;
import com.capgemini.day6.domain.School;
import com.capgemini.day6.domain.Telivision;

class Question1Test {

	@Test
	void testLaptop() {
		ArrayList<Laptop> laptop = new ArrayList<Laptop>();
		assertEquals(true, laptop.add(new Laptop("Dell", "Inspiron", "windows", "i5")));
		assertEquals(true, laptop.add(new Laptop("HP", "Inspiron515", "Linux", "i7")));
		assertEquals(true, laptop.add(new Laptop("acer", "Inspiron990", "ubuntu", "i6")));
		for (Laptop laptop2 : laptop) {
			System.out.println(laptop2);
		}
	}

	@Test
	void testCar() {
		ArrayList<Car> car = new ArrayList<Car>();
		assertEquals(true, car.add(new Car("maruthi", "m567", 2018, 200000.0)));
		assertEquals(true, car.add(new Car("nano", "n789", 2015, 300000.0)));
		assertEquals(true, car.add(new Car("fiesta", "f567", 2004, 600000.0)));
		for (Car car2 : car) {
			System.out.println(car2);  
		}
	}

	@Test
	void testTelivision() {
		ArrayList<Telivision> telivision = new ArrayList<Telivision>();
		assertEquals(true, telivision.add(new Telivision("Lg", "plasma", true, 20000.0)));
		assertEquals(true, telivision.add(new Telivision("samsung", "led", false, 30000.0)));
		assertEquals(true, telivision.add(new Telivision("micromax", "Lcd", false, 10000.0)));
		for (Telivision telivision2 : telivision) {
			System.out.println(telivision2);
		}
	}

	@Test
	void testCellPhone() {
		ArrayList<CellPhone> cellphone = new ArrayList<CellPhone>();
		assertEquals(true, cellphone.add(new CellPhone("motorola", "g4", "Smart phone", "Android", 8000.0)));
		assertEquals(true, cellphone.add(new CellPhone("apple", "g3", "iphone", "mac", 7000.0)));
		assertEquals(true, cellphone.add(new CellPhone("motorola", "g5", "portable phone", "blackberry", 9000.0)));
		for (CellPhone cellPhone2 : cellphone) {
			System.out.println(cellPhone2);
		}
	}

	@Test
	void testSchool() {
		ArrayList<School> school = new ArrayList<School>();
		assertEquals(true, school.add(new School("PullaReddy", "Mp", "Hyderabad", 10)));
		assertEquals(true, school.add(new School("Goutham", "gandhiNagar", "RangaReddy", 14)));
		assertEquals(true, school.add(new School("SpringBlossoms", "maruthinagar", "Khammam", 17)));
		for (School school2 : school) {
			System.out.println(school2);
		}
	}
}
