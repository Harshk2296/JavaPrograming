//Write program to print Ascii table (0 -127)
package com.collegePrograms.MCA1;


public class PrintASCCIITable {

	public static void main(String[] args) {
		int count=0;
		for (char i = 0; i <= 127; i++) {
			char ch=i;
			System.out.println("The ASCII VALUE  "+count+++" : "+ch);
		
		}

	}

}
