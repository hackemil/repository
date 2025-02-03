
public class Order1 {
	   public static void main(String[] args) {
	       
	        Order order1 = new Order(1, "Salat");
	        Order order2 = new Order(5, "Cay");
	        Order order3 = new Order(7, "Doner");
System.out.println("Order 1" + ": " + order1.getOrderId() + " " + order1.getDishName());
System.out.println("Order 2" + ": " + order2.getOrderId() + " " + order2.getDishName());
System.out.println("Order 3" + ": " + order3.getOrderId() + " " + order3.getDishName());


	   }
}