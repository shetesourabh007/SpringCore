package com.marlabs.springdemo;

public class BaseballCoach implements Coach {

	private final FortuneService fortuneService;

	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "spend 30 minutes on batting";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
