package package2;

import package1.Calc1;

public class Calc2 {
public static void main(String[] args) {
	Calc1 calculatr = new Calc1();
	System.out.println(calculatr.add(2,23));
	System.out.println(calculatr.subtract(10,5));
	System.out.println(calculatr.multiply(10,5));
	System.out.println(calculatr.devide(10,5));
	System.out.println(calculatr.devideWrapper(10,5));
	
}
}
