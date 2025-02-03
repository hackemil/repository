import java.util.Iterator;
import java.util.Scanner;

public class dz01202 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter text!");
String inputString = scanner.nextLine();
StringBuilder sBuilder =new StringBuilder(inputString);


sBuilder.reverse();
System.out.println(sBuilder);
for (int i = 0; i < sBuilder.length(); i++) {
	if (sBuilder.charAt(i)== ' ') {
		sBuilder.setCharAt(i,'_');
	}
}
System.out.println(sBuilder);
}
}
