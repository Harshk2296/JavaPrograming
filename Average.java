//Write a program to accept marks of 3 subjects and calculate and display total and percentage

package com.collegePrograms.MCA1;

public class Average {

	public void percente(int sub1,int sub2, int sub3) {
		int total=sub1+sub2+sub3;
		float percentage = total/3;
		System.out.println("Total Marks "+total+", Percentage : "+ percentage );
			
	}

}
