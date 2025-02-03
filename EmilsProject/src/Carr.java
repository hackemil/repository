
public class Carr {
	
	   
	    private String brand;
	    private int speed;

	   
	    public Carr(String brand, int speed) {
	        this.brand = brand;
	        this.speed = speed;
	    }

	   
	    public void accelerate(int increment) {
	        if (increment > 0) {
	            speed += increment;
	            System.out.println("Скорость увеличена на " + increment + ". Новая скорость: " + speed);
	        } 
	         
	      
	    }
}
