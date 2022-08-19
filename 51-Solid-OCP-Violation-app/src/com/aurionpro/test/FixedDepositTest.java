package com.aurionpro.test;

import com.aurionpro.model.FestivalType;
import com.aurionpro.model.FixedDeposit;

public class FixedDepositTest {

	public static void main(String[] args) {
		
		FixedDeposit fd1 = new FixedDeposit("reena", 10000, 2,FestivalType.CHRISTMAS);
		System.out.println(fd1.CalculateSimpleInterest());
		FixedDeposit fd2 = new FixedDeposit("kunal", 34862, 5, FestivalType.EID);
		System.out.println(fd2.CalculateSimpleInterest());
		FixedDeposit fd3 = new FixedDeposit("jsh", 4732, 1,FestivalType.OTHER );
		System.out.println(fd3.CalculateSimpleInterest());
	}

}
