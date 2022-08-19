package com.aurionpro.model;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your first number");
	int firstnum = sc.nextInt();
	System.out.println("second num");
	int secondnum = sc.nextInt();
	System.out.println("third num");
	int thirdnum = sc.nextInt();
	int result;
	System.out.println(result = sum(firstnum, secondnum,thirdnum));
	}

	private static int sum(int num,int ...a) {
		int sum=0;
		for(int i:a) {
			sum=sum+i;
		}
		return sum*num;
	}

}

