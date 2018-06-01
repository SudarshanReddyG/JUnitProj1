package com.junitassert.pack4;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class GeneralAssertions {
	
	private Weather weather = new Weather(8);
	
	@Test
	public void testAssertTrue() {
		assertTrue("No Rainbow", weather.isItSundayToday() && weather.willItRainToday());
		System.out.println("Ok, test Rainbow");
	}
	
	@Test
	public void testAssertFalse() {
		assertFalse("Unsafe to drive", !(weather.isItFreezingToday() && weather.willItRainToday()));
		System.out.println("Test the new Vehicle");
	}
	
	@Test
	public void testFail() {
		if(weather.isItFreezingToday() || weather.willItRainToday()) {
			fail("Not good conditions");
		}
	}

}
