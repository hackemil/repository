
public class bankshotu {
 public double balance = 100.0;
 
 public void deposit(double balans) {
	 balance += balans;
	
}
 public void withdraw(double balans) {
	balance -= balans;
}
 public double getBalance() {
	return balance;
}
}
