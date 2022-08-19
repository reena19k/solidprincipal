package com.aurionpro.model;

public class FixedDeposit {
	private String name;
	private double principal;
	private int duration;
	private FestivalType festival;

	public FixedDeposit(String name, double principal, int duration, FestivalType festival) {
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		this.festival = festival;
	}

	public String getName() {
		return name;
	}

	public double getPrincipal() {
		return principal;
	}

	public int getDuration() {
		return duration;
	}

	public FestivalType getFestival() {
		return festival;
	}

	private double getInterestRates() {
		if (festival == FestivalType.DIWALI)
			return 7.9;
		else if (festival == FestivalType.CHRISTMAS)
			return 7.8;
		else if (festival == FestivalType.EID)
			return 7.5;
		else if (festival == FestivalType.NEWYEAR)
			return 7;
		
		return 6;

	}

	public double CalculateSimpleInterest() {
		return (getPrincipal() * getInterestRates() * getDuration()) / 100;
	}

	public String toString() {
		return "FixedDeposit{" + "name=" + name + ", principal=" + principal + ", duration=" + duration + '}';
	}
}