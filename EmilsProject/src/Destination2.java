
public class Destination2 {
	public static void main(String[] args) {
		Destination destination1 = new Destination("Italy","France",12.0);
		Destination destination2 = new Destination("Italy","France");
		Destination destination3 = new Destination();
		
		System.out.println(destination1.place + " " + destination1.country + " " + destination1.distance);
		System.out.println(destination2.place + " " + destination2.country + " " + destination2.distance);
		System.out.println(destination3.place + " " + destination3.country + " " + destination3.distance);
	}
}
