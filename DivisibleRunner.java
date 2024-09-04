
package com.collegePrograms.MCA1;

import java.util.Scanner;

public class DivisibleRunner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int number = sc.nextInt();
		
		Divisible d =new Divisible();
		d.checkDivisible(number);
		sc.close();
	}

}
