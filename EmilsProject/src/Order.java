
public class Order {
	    private int orderId;
	    private String dishName;
	    private boolean isCompleted;

	    
	    public Order(int orderId, String dishName) {
	        this.orderId = orderId;
	        this.dishName = dishName;
	        this.isCompleted = false; 
	    }
	    
	    public int getOrderId() {
	        return orderId;
	    }

	    public String getDishName() {
	        return dishName;
	    }
	    
	    public void getOrderStatus() {
	    	isCompleted=true;
	    	
	    	if (isCompleted) {
			System.out.println("Zakaz Ready!");
			} else {
				System.out.println("Zakaz ne ready!");
			}
		}
}
