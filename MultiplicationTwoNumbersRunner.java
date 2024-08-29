package com.collegePrograms.MCA1;

import java.util.Scanner;

public class MultiplicationTwoNumbersRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1=0, number2=0;
		MultiplicationTwoNumbers mult=new MultiplicationTwoNumbers();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Number 1 : ");
		number1=sc.nextInt();
		
		System.out.println("Number 2 :");
		number2=sc.nextInt();
		
		mult.multiplication(number1, number2);
		
		sc.close();

	}

}
