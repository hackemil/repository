package I27;

public class Main1 {
public static void main(String[] args) {
	CreditCardPayment CreditCard = new CreditCardPayment();
	CreditCard.pay(2.20);
	
	PayPalPayment paypal = new PayPalPayment();
	paypal.pay(4.50);
}
}
