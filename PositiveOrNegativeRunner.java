package com.collegePrograms.MCA1;

import java.util.Scanner;

public class PositiveOrNegativeRunner {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number : ");
		int number = sc.nextInt();
		
		
		PositiveOrNegative pn = new PositiveOrNegative();
		pn.identifyNumber(number);
		sc.close();
	}

}
