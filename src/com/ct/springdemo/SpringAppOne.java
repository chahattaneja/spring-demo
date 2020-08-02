package com.ct.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAppOne {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		BasketCoach coach = context.getBean("myBasketCoach",BasketCoach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getName());
		System.out.println(coach.getTeam());

		context.close();

	}

}
