package com.lab1.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {

	private Calculator calculator;
	
	@Before
	public void setUP(){
		
		calculator = new Calculator();
	}
	
	
	
	@Test
	public void addTest()
	{	
		assertEquals(4,calculator.add(2,2));
		assertNotEquals(5,calculator.add(3, 4));
	}

	
	@Test
	public void substructTest()
	{	
		assertEquals(2,calculator.subtract(5, 3));
		assertNotEquals(10,calculator.subtract(3, 4));
	}
	
	
	
	@Test
	public void multiplyTest()
	{	
		assertEquals(35,calculator.multiply(7, 5));
		assertNotEquals(34,calculator.multiply(6, 4));
	}
	
	
		
	@Test
	public void divideTest()
	{	
		assertEquals(3,calculator.divide(6, 2));
		assertNotEquals(12,calculator.divide(3, 4));
		
	}
	
	
	@Test
	public void isEqualTest()
	{	
		assertEquals(true,calculator.isEqual(7, 7));
		assertTrue(true);
		assertNotEquals(true,calculator.isEqual(3, 4));
		assertFalse(false);
		
	}
	

	
}
