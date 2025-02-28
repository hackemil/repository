package I32;

public class Main {
public static void main(String[] args) {
	//ArithmeticException
//	int a = 10;
//	int b = 0;
//	System.out.println(a/b);
//	System.out.println("hello");
//	
	
	//NullPointerException
//	String string = null;
//	System.out.println(string.length());
//	
	
	//ArrayIndexOutOfBoundsException
//	int[] numbers= {1,2,3,4};
//	System.out.println(numbers[10]);
//	
	//StringIndexOutOfBoundsException
//	String s2 = "Emil";
//	System.out.println(s2.charAt(5));
//	
	
	//NumberFormatException
//	String s3 = "Umud";
//	
//	int number = Integer.parseInt(s3);
//	System.out.println(number);
//	
	
//	try {
//		System.out.println(10/0);
//	} catch (ArithmeticException e) {
//	System.out.println("Mistake! Cant devide 0!");
//	}
	
//	try {
//		String s = null;
//		System.out.println(s.length());
//	} catch (NullPointerException e) {
//		System.out.println("Mistake! Obrashenie k null obyektu");
//	}
	
	
//	try {
//		int[] numbers = {1,2,3,4};
//		
//	} catch (ArrayIndexOutOfBoundsException e) {
//		System.out.println("Mistake! (Vixod za predela massiva)");
//	}
	
	
	try {
		String s2 = "Emil";
		System.out.println(s2.charAt(5));
	} catch (StringIndexOutOfBoundsException e) {
	System.out.println("Mistake!");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
