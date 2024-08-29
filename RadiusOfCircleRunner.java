package com.collegePrograms.MCA1;

import java.util.Scanner;

public class RadiusOfCircleRunner {

	public static void main(String[] args) {
		RadiusOfCircle circle = new RadiusOfCircle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius : ");
		double radius = sc.nextDouble();

		circle.area(radius);

		System.out.println("Area of Circle is : " + circle.area(radius));
		sc.close();
	}

}
