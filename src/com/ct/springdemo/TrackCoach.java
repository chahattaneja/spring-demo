package com.ct.springdemo;

public class TrackCoach implements Coach{

	FortuneService service;

	public TrackCoach(FortuneService service) {
		super();
		this.service = service;
	}

	@Override
	public String getDailyWorkout() {
		return "run for 30 minutes";
	}	
	
	public String getDailyFortune() {
		return service.getDailyFortune();
	}
	
	public void startUp() {
		System.out.println("starting up");
	}
	
	public void endUp() {
		System.out.println("end up");
	}
}
