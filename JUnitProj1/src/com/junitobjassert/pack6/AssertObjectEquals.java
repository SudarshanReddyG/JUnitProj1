package com.junitobjassert.pack6;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AssertObjectEquals {
	
	@Test
	public void a_StringEquals() {
		String str1 = "StringValue";
		String str2 = "StringValue";
		assertEquals("String equals test", str1, str2);
	}
	
	@Test
	public void b_ObjectEquals() {
		SampleClass sampleClass1 = new SampleClass(40, "a value");
		SampleClass sampleClass2 = new SampleClass(40, "a value");
		assertEquals("Comparing two objects", sampleClass1, sampleClass2);
	}
	
	@Test
	public void c_ObjectEqualsFails() {
		SampleClass sampleClass1 = new SampleClass(40, "a value");
		SampleClass sampleClass2 = new SampleClass(40, "b value");
		assertEquals("Comparing two objects", sampleClass1, sampleClass2);
	}
	
	@Test
	public void d_ObjectNotEquals() {
		SampleClass sampleClass1 = new SampleClass(50, "First Value");
		SampleClass sampleClass2 = new SampleClass(50, "Second Value");
		assertNotEquals("Objects not equals", sampleClass1, sampleClass2);
	}
	
	@Test
	public void e_ObjectSame() {
		String str1 = "Hello";
		String str2 = new String("Hello");
		assertNotSame("Checking for different objects", str1, str2);
		assertSame("Checking for same objects", str1, str2);
	}
	
	@Test
	public void f_assertEqualsNullFail() {
		String str1 = null;
		String str2 = "I have value";
		assertEquals("Checking null equals for string", str1, str2);
	}
	
	@Test
	public void g_asserEqualsNull() {
		String str1 = null;
		String str2 = null;
		assertEquals("Check null equals", str1, str2);
	}
	
	@Test
	public void h_assertNull() {
		String str1 = null;
		assertNull("Check Null", str1);
	}
	
	@Test
	public void h_assertNotNull() {
		String str1 = "I have value";
		assertNotNull("Check Not Null", str1);
	}
	
}
