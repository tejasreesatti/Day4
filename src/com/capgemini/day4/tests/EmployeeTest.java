package com.capgemini.day4.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.icici.domain.Employee;

class EmployeeTest {

	Employee employee;
	@BeforeEach
	void setUp() {
		employee = new Employee(157849, "S.Tejasree", "Andhra", "1234567890", 3_50_000);
	}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@AfterEach
	void tearDown() {
		employee = null;
	}

}
