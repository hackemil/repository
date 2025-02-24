package I31;

public class OrderService {
	private PaymentProcessor paymentProcessor;

	public OrderService(PaymentProcessor paymentProcessor) {
		this.paymentProcessor = paymentProcessor;
	}
	
	public void completeOrder(double amount) {
		paymentProcessor.proccesPayment(amount);
	}
	
	

}
