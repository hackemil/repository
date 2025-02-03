import java.util.Iterator;

public class work2 {
public static void main(String[] args) {
	int[] numbers = new int[5];
	numbers[0] = 2;	
	numbers[1] = 3;
	numbers[2] = 4;
	numbers[3] = 5;
	numbers[4] = 6;
	
	int max = numbers[0];
	int min = numbers[0];
	
	
	for (int i = 0; i < numbers.length; i++) {
		if (numbers[i] > max) {
			max = numbers[i];
		}	
		if (numbers[i] < min) {
		 min = numbers[i];
		}
	}
	 System.out.println("Max number!" + max);
	 System.out.println("Min number!" + min);
}
}
