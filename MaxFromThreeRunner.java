package com.collegePrograms.MCA1;

import java.util.Scanner;

public class MaxFromThreeRunner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1 : ");
		int number1=sc.nextInt();
		System.out.println("Enter Number 2 : ");
		int number2 = sc.nextInt();
		System.out.println("Enter Number 3 : ");
		int number3 = sc.nextInt();
		
		MaxFromThree m=new MaxFromThree();
		m.maxFromThree(number1,number2,number3);
		sc.close();
	}

}
