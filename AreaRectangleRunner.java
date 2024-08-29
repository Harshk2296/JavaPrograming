package com.collegePrograms.MCA1;

import java.util.Scanner;

public class AreaRectangleRunner {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Width : ");
		float width=sc.nextFloat();
		
		System.out.println("Height : ");
		float height=sc.nextFloat();
		
		AreaRectangle areaRectangle=new AreaRectangle();
		areaRectangle.calculteArea(width, height);
		System.out.println("Area : "+areaRectangle.calculteArea(width, height));
		sc.close();
		
		

	}

}
