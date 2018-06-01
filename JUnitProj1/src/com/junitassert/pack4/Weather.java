package com.junitassert.pack4;

public class Weather {
	
	private int answer;
	
	public boolean willItRainToday() {
		return answer%2 == 0;
	}
	
	public boolean isItSundayToday() {
		return answer%3 == 0;
	}
	
	public boolean isItFreezingToday() {
		return answer%5 == 3;
	}
	
	public Weather(int answer) {
		this.answer = answer;
	}

}
