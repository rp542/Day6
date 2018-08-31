package com.capgemini.day6.Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.List;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.domain.Car;

class CartDetailsTest {

	@Test
	void testCarDetails() {
		TreeSet<Car> car = new TreeSet<>();
		car.add(new Car("maruthi", "m567", 2018, 200000.0));
		car.add(new Car("fiesta", "m567", 2018, 200000.0));
		car.add(new Car("tata", "m568", 20004, 300000.0));
		assertEquals(3, car.size());
		//for (Car car2 : car) {
			//System.out.println(car2);
		//}
		 Iterator<Car> itr=car.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
	}
	}


