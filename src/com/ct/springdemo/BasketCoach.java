package com.ct.springdemo;

public class BasketCoach implements Coach {
	
	private FortuneService service;
	private String name;
	private String team;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public void setService(FortuneService service) {
		this.service = service;
	}

	@Override
	public String getDailyWorkout() {
		return "practice dribbling";
	}

	@Override
	public String getDailyFortune() {
		return service.getDailyFortune();
	}

}
