package com.collegePrograms.MCA1;

import java.util.Scanner;

public class StudentDetailInfoRunner {

	public static void main(String[] args) {

		String name, courseName, cityName;
		short rollNumber;

		StudentDetailInfo st = new StudentDetailInfo();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name : ");
		name = sc.next();

		System.out.println("Enter Roll Number : ");
		rollNumber = sc.nextShort();

		System.out.println("Enter Course : ");
		courseName = sc.next();

		System.out.println("Enter City Name : ");
		cityName = sc.next();

		st.studInfo(name, rollNumber, courseName, cityName);
		System.out.println(st.studInfo(name, rollNumber, courseName, cityName));

		sc.close();
	}

}
