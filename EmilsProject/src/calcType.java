import java.util.Scanner;

public class calcType {
	public static void main(String[] args) {
		calc2 calculator = new calc2();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number");	
		double a =scanner.nextDouble();
		System.out.println("Enter second number");	
		double b =scanner.nextDouble();
		System.out.println("Enter operation");
		
		String operation=scanner.next();
		if (operation.equals("+")) {
			System.out.println(calculator.add(a,b));
			
		}else if(operation.equals("-")) {
			calculator.substract(a,b);
		}else if(operation.equals("*")) {
			calculator.multiply(a,b);
	}	else if(operation.equals("/")) {
		calculator.devide(a,b);
}
	}
}