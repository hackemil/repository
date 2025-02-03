package package1;

public class Calc1 {
 
	public int add(int a,int b) {
	 return a + b;
 }
 
 protected int subtract(int a,int b) {
	 return a - b;
 }
 
 int multiply(int a,int b) {
	 return a * b;
 }
 private int devide(int a,int b) {
	 return a / b;
 }
 public int devideWrapper(int a,int b) {
	 return devide(a,b);
 }
}
