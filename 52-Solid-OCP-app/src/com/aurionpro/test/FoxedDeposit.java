package com.aurionpro.test;

import com.aurionpro.model.Christmas;
import com.aurionpro.model.Diwali;
import com.aurionpro.model.Eid;
import com.aurionpro.model.FixedDeposit;

public class FoxedDeposit {

		public static void main(String[] args) {
			FixedDeposit fd1 = new FixedDeposit("reena", 1000, 2, new Christmas());
			System.out.println(fd1.CalculateSimpleInterest());
			
			FixedDeposit fd2 = new FixedDeposit("ritest", 4000, 1, new Diwali());
			System.out.println(fd2.CalculateSimpleInterest());
			
			FixedDeposit fd3 = new FixedDeposit("shubham",70000, 7, new Christmas());
			System.out.println(fd3.CalculateSimpleInterest());
		}
}
