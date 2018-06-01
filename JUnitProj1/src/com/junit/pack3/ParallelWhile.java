package com.junit.pack3;

import org.junit.Test;

public class ParallelWhile {

	@Test
	public void testWhile() {
		int i = 0;
		while(i<100) {
			System.out.println("While value of i is "+i);
			i++;
		}
	}

}
