package com.collegePrograms.MCA1;

import java.util.Scanner;

public class DistanceCalculatorRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dstance : ");
		double distance = scanner.nextDouble();

		DistanceCalculator calculator = new DistanceCalculator();
		calculator.distanceInMeter(distance);
		System.out.println("Distance in meters: " + calculator.distanceInMeter(distance) + " meters");

		scanner.close();
	}

}
