package I26;

public class main {
	 public static void main(String[] args) {
	        Book book1 = new Book("Title1", "Krasavcik", 2000);
	        Book book2 = new Book("Title1", "Krasavcik", 2000);
	        Book book3 = new Book("Title2", "stariy krasavcik", 1900);
	        
	        System.out.println(book1); 
	        System.out.println(book2.equals(book1)); 
	        System.out.println(book3.equals(book1));
	    }
	}


