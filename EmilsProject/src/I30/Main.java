package I30;


public class Main {
public static void main(String[] args) {
	Adder adder = new Adder();
	Printer printer = new Printer();
	
    int sum = adder.add(5, 10);
    printer.print(sum);
}

}

