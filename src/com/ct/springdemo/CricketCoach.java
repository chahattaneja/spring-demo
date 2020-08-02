package com.ct.springdemo;

public class CricketCoach implements Coach {
	
	FortuneService service;
	
	public CricketCoach(FortuneService service) {
		super();
		this.service = service;
	}
	
	@Override
	public String getDailyWorkout() {
		return "bat for 30 minutes";
	}
	
	public String getDailyFortune() {
		return service.getDailyFortune();
	}
	
}
