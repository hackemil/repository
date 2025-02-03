import java.util.Iterator;

public class dvumerniymassiv {
public static void main(String[] args) {
	String[][] dninedeli= {
			{"1","Monday"},
			{"2","Tuesday"},
			{"3","Wednesday"},
			{"4","Thursday"},
			{"5","Friday" },
			{"6","Saturday "},
			{"7","Sunday"},
			
	};
	for (int i = 0; i < dninedeli.length; i++) {
		for (int j = 0; j < dninedeli[i].length; j++) {
			System.out.print(dninedeli[i][j] + " ");

		}
		System.out.println();
	}
}
}
