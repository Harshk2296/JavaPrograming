import java.util.Scanner;

public class SimpleCalculatorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleCalculator s = new SimpleCalculator();
//		System.out.println(s.Addition(1, 1));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number");
		int num2 = sc.nextInt();
		s.Addition(num1, num2);
		s.Substration(num1, num2);
		s.Multiuplication(num1, num2);
		s.Division(num1, num2);

	}

}
