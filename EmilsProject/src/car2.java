
public class car2 {
public static void main(String[] args) {
	carType car1 = carType.RED;
	switch (car1) {
	case RED: 
		System.out.println("Wait!");
		break;
	case YELLOW: 
		System.out.println("Get ready!");
		break;
	case GREEN: 
		System.out.println("You can go!");
		break;
	
	
	
	
	
	default:
		System.out.println("We are not moving!");
		break;
	}
}
}
