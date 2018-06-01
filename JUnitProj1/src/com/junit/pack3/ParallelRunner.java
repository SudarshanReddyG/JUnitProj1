package com.junit.pack3;

import org.junit.experimental.ParallelComputer;
import org.junit.runner.Computer;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ParallelRunner {
	
	public static void main(String[] args) {
		
		//Result result = JUnitCore.runClasses(ParallelFor.class, ParallelWhile.class);
		//Computer computer = new Computer(); //Sequential Execution
		Computer computer = new ParallelComputer(true, true); //Parallel Execution
		Result result = JUnitCore.runClasses(computer, ParallelFor.class, ParallelWhile.class);
		
		System.out.println("Total test cases : " +result.getRunCount());
		System.out.println("Total failure test cases : " +result.getFailureCount());
		System.out.println("Total ignored test cases : " +result.getIgnoreCount());
		System.out.println("Total runtime for test cases : " +result.getRunTime());
		
		for(Failure failure:result.getFailures()) {
			System.out.println("The reason for failure "+failure.getMessage());
		}
	}

}
