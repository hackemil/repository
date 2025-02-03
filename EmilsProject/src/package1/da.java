package package1;

import java.security.PrivateKey;

public class da {

 private String name;
 protected int age;
 String country;
 public int id;
 
 
 
 public da(String name, int age, String country,int id) {
	 this.name = name;
	 this.age = age;
	 this.country = country;
	 this.id = id;
	 
	 
 }
	
 public void getDetails() {
	System.out.println("Imya: " + name);
	System.out.println("vozrast: " + age);
	System.out.println("Strana: " + country);
	System.out.println("ID: " + id);

	
}
 
 
 
}