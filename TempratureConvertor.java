package com.collegePrograms.MCA1;

public class TempratureConvertor {

	public float tempConvertor(float temp) {
		float celcius;
		float a = 5, b = 9, div;
		div = a / b;

		float sub = temp - 32;
		celcius = sub * div;
		return celcius;

	}

}
