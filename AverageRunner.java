package com.collegePrograms.MCA1;

import java.util.Scanner;

public class AverageRunner {

	public static void main(String[] args) {
		int sub1, sub2, sub3;

		Average average = new Average();
		Scanner sc = new Scanner(System.in);

		System.out.println("Marks in Subject 1 : ");
		sub1 = sc.nextInt();

		System.out.println("Marks in Subject 2 : ");
		sub2 = sc.nextInt();

		System.out.println("Marks in Subject 3 : ");
		sub3 = sc.nextInt();

		
		average.percente(sub1, sub2, sub3);
		sc.close();
		
	}
}
