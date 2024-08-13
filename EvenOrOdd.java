import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		int num1;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1 : ");
		num1 = sc.nextInt();

		if (num1 == 0) {
			System.out.println(num1 + " Number is Neutral ");
		} else if (num1 % 2 == 0) {
			System.out.println(num1 + " Is Even ");
		} else {
			System.out.println(num1 + " Number Is Odd");
		}

	}

}
