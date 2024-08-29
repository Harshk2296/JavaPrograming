package com.collegePrograms.MCA1;

import java.util.Scanner;

public class AddTwoNumberRunner {

	public static void main(String[] args) {
		int number1=0, number2=0;
		AddTwoNumber add=new AddTwoNumber();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Number 1 : ");
		number1=sc.nextInt();
		
		System.out.println("Number 2 :");
		number2=sc.nextInt();
		
		add.addition(number1, number2);
		
		sc.close();

	}

}
