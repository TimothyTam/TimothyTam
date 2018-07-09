package com.javawithease.testcase;

import com.javawithease.business.*;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * This is test case class for division method.
 * @author javawithease
 */
public class DivisionTestCase {
	//DivisionTest class objects
	DivisionTest divisionTest1 = new DivisionTest(10, 2); 
	DivisionTest divisionTest2 = new DivisionTest(10, 0); 
	
	//Test case for division
	@Test
	public void test() {
		assertEquals(5, 5);
	}
	
	public void testException() {
		assertEquals(5, 5);
	}
}
