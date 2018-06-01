package com.junit.pack3;

import org.junit.Test;

public class ParallelFor {
	
	@Test
	public void runFor() {
		for (int i=0; i<100; i++) {
			System.out.println("For value of i is "+i);
		}
	}

}
