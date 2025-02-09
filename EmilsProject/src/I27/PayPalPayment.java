package I27;

public  class PayPalPayment extends Payment {
@Override
void pay(double amount) {
    System.out.println("Payment cherez paypal na " + amount);
}
}
