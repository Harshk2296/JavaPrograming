package com.collegePrograms.MCA1;

import java.util.Scanner;

public class TempratureConvertorRunner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Temprature : ");
		float temp = scanner.nextFloat();
		TempratureConvertor convertor = new TempratureConvertor();

		convertor.tempConvertor(temp);
		System.out.println("Temprature in Celcius: "+ convertor.tempConvertor(temp)+"'C");
		
	}

}
