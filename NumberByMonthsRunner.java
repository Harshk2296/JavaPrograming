package com.collegePrograms.MCA1;

import java.util.Scanner;

public class NumberByMonthsRunner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Month : ");
		int month = sc.nextInt();
		NumberByMonths n = new NumberByMonths();
		n.monthByNumber(month);
		sc.close();
		
	}

}
