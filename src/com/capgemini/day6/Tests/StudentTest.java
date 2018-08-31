package com.capgemini.day6.Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.domain.Student;

class StudentTest {

	@Test
	void testStudent() {
		TreeSet<Student> student = new TreeSet<Student>();
		student.add(new Student(14, "rp", "cse"));
		student.add(new Student(13, "rinky", "ece"));
		student.add(new Student(12, "priyanka", "it"));

		assertEquals(3, student.size());
		
		
	}
	@Test
	void testcheckStudentDetails()
	{
		LinkedList<Student> student=new LinkedList<>();
		
		student.add(new Student(14, "rp", "cse"));
		student.add(new Student(13, "rinky", "ece"));
		student.add(new Student(12, "priyanka", "it"));
		assertEquals(3, student.size());
for (Student student1 : student) {
	System.out.println(student1);
}
	}
}
