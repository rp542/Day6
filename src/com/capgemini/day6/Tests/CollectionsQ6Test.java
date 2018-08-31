package com.capgemini.day6.Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

import org.junit.jupiter.api.Test;

class CollectionsQ6Test {

	@Test
	void testStudentFavouriteFruit() {
		HashMap<String, ArrayList<String>> map= new HashMap<String,ArrayList<String>>();
		String[] favorites = new String[] {"fasgh","asdyau"};
		map.put("Priyanka", new ArrayList<>(Arrays.asList(favorites)));
		favorites = new String[] {"banana","kiwi","orange"};
		map.put("Amrin", new ArrayList<>(Arrays.asList(favorites)));
		favorites = new String[] {"peru","cockroach"};
		map.put("Himaja", new ArrayList<>(Arrays.asList(favorites)));
		favorites = new String[] {"peru","papaya","apple"};
		map.put("Kc", new ArrayList<>(Arrays.asList(favorites)));
		map.remove("Amrin");
		assertEquals(3, map.size());
		for (Entry<String, ArrayList<String>> entry : map.entrySet()) 
            System.out.println("Name = " + entry.getKey() +
                             ", Fruits = " + entry.getValue());
		
	}
	}


