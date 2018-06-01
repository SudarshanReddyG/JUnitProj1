package com.junit.pack2;

import org.junit.Ignore;
import org.junit.Test;

import junit.framework.TestCase;

public class TestTarget {

	@Test
	public void testAdd() {
		MyTarget myTarget = new MyTarget();
		int sum = myTarget.basicAdd(10, 5);
		TestCase.assertEquals("The answer is right?", 15, sum);
	}
	
	@Test
	public void badTestCase() {
		MyTarget myTarget = new MyTarget();
		int sum = myTarget.basicAdd(4, 5);
		TestCase.assertEquals("The sum correct", 6, sum);
	}
	
	public void doSomeThing() {
		throw new RuntimeException();
	}
	
	@Test(expected=ArithmeticException.class)
	public void divideByZero() {
		MyTarget myTarget = new MyTarget();
		myTarget.basicDivide(100, 0);
	}
	
	@Test
	@Ignore
	public void ignoreTestCase() {
		System.out.println("This test case is ignored.");
	}

}
