package com.qa.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class CalculatorTest {

	@Test
	public void testAdd() {

 assertEquals(30, Calculator.add(10,20));
	}

	@Test
	public void testSub() {
assertEquals(25, Calculator.sub(30,5));
	}

	@Test
	public void testMult() {
		assertEquals(50, Calculator.mult(10,5));
	}

	@Test
	public void testDiv() {
		assertEquals(3, Calculator.div(30,10));
	}

}
