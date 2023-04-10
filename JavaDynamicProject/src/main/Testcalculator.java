package com.calculator.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.calculator.project.Calculator;

public class Testcalculator {

	@Test
	public void calTest() {
		assertEquals(31, Calculator.add(11, 20));
	}

	@Test
	public void calTestSub() {
		assertEquals(30, Calculator.sub(50, 20));
	}

	@Test
	public void calcTestMul() {
		assertEquals(30, Calculator.mul(6, 5));
	}

	@Test
	public void calcTestDiv() {
		assertEquals(6, Calculator.div(30,5));
	}

}

