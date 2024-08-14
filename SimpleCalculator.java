
public class SimpleCalculator {

	int num1 ,num2,res ;
	
	
		public String Addition(int num1, int num2) {
		res = num1 + num2;
		System.out.println("Addition Is  " + res);
			return "Addition Is  " + res;
		}
		
		public String Substration(int num1, int num2) {
			res = num1 - num2;
			System.out.println("Substraction Is  " + res);
				return "Substraction Is  " + res;
			}
		
		public String Multiuplication(int num1, int num2) {
			res = num1 * num2;
			System.out.println("Multiplication Is  " + res);
				return "Multiplication Is  " + res;
			}
		public String Division(int num1, int num2) {
			res = num1 / num2;
			System.out.println("Division Is  " + res);
				return "Division Is  " + res;
			}

	}


