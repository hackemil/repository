package classwork1;

public class CreditCard implements Payment{

	public void pay(double amount) {
		System.out.println("Payed" + amount);
	}
	public void refund(double amount) {
		System.out.println("Refunded" + amount);
	}
}
