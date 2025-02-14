package I28;



public class Main {
public static void main(String[] args) {
	Circle circle = new Circle(7); 
	Rectangle rectangle = new Rectangle(2,8);
	
	System.out.println("Площадь круга: " + circle.area());
    System.out.println("Периметр круга: " + circle.perimeter());
    System.out.println("Площадь прямоугольника: " + rectangle.area());
    System.out.println("Периметр прямоугольника: " + rectangle.perimeter());
}
}
