package com.mletech.webapp.services.test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.*;

import com.mletech.webapp.services.Calculator;

public class CalculatorTest {

	private Calculator cal = new Calculator();

	@Test
	public void testAdd() {
		try {

			assertEquals(2, cal.add(1, 1));

		} catch (Exception e) {
			e.printStackTrace();;
		}

	}

	@Test
	public void testMinus() {

		try {

			assertEquals(0, cal.minus(2, 2));

		} catch (Exception e) {
			e.printStackTrace();;
		}

	}
}