import java.util.Scanner;

public class MaxNumRunner {

	public static void main(String[] args) {
		MaxNum n =new MaxNum();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter Number 2 : ");
		int num2 = sc.nextInt();
		
		n.maxNum(num1, num2);
		
	}

}
