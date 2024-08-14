import java.util.Scanner;

public class DayOfWeek {
	public static void main(String[] args) {
		int day = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day :");
		day = sc.nextInt();
		
		
		if (day<=0 || day>=7) {
			System.out.println("Invalid Input !!!!!!");
		}else if(day == 1) {
			System.out.println("Sunday");
		}else if(day == 2) {
			System.out.println("Monday");
		}else if(day == 3) {
			System.out.println("Tuesday");
		}else if(day == 4) {
			System.out.println("Wendsday");
		}else if(day == 5) {
			System.out.println("Thursday");
		}else if(day == 6) {
			System.out.println("Friday");
		}else if(day == 7) {
			System.out.println("Staurday");
		}
	}

}
