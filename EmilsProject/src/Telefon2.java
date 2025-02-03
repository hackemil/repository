
public class Telefon2 {
	public static void main(String[] args) {
		Telefon telefon1 = new Telefon("Iphone","Blue",1999);
		Telefon telefon2 = new Telefon("Iphone","Blue");
		
		System.out.println(telefon1.model + " " + telefon1.color + " " + telefon1.price);
		System.out.println(telefon2.model + " " + telefon2.color + " " + telefon2.price);

		}
}
