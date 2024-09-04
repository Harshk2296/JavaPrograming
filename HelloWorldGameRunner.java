package com.collegePrograms.MCA1;

import java.util.Scanner;

public class HelloWorldGameRunner {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Number :" );
		int number= sc.nextInt();
		HelloWorldGame game= new HelloWorldGame();
		game.helloWorldGame(number);
		sc.close();

	}

}
