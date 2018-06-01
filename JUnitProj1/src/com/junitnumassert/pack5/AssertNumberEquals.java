package com.junitnumassert.pack5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AssertNumberEquals {

	@Test
	public void a_IntegerAssertEquals() {
		long longValue = 10;
		assertEquals(longValue, longValue);
		assertEquals("Two Long Values", longValue, longValue);
		
		short shortValue = 10;
		int intValue = 10;
		
		assertEquals("Any two 'Integer' values", intValue, shortValue);
	}
	
	@Test
	public void b_FloatAssertEquals() {
		double doubleVal = 0.3;
		assertEquals("The double values", doubleVal, doubleVal, 0.000003);
		
		float floatValue = 0.4f;
		assertEquals("The float values", floatValue, floatValue, 0.0000001);
	}
	
	@Test
	public void c_FloatAssertWithOutPrecesion() {
		float floatValue = 0.5f;
		assertEquals("Float Values ", floatValue, floatValue);
	}
	
	@Test
	public void d_FloatAssertWithDelta() {
		float floatValue1 = 0.3f;
		float floatValue2 = 0.301f;
		
		assertEquals("Float values with delta", floatValue1, floatValue2, 0.001);
	}
	
	@Test
	public void e_AssertNotEquals() {
		float floatValue1 = 0.3f;
		float floatValue2 = 0.301f;
		assertNotEquals("Float values not equal", floatValue1, floatValue2);
	}
}
