package com.ct.springdemo;

public class RandomFortuneService implements FortuneService {
	
	String[] fortunes = {"Good","Bad","Neutral"};

	@Override
	public String getDailyFortune() {
		int index = (int) Math.floor(Math.random()*3);
		return fortunes[index];
	}

}
