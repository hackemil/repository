package l25;

public class Person {
	String name;
	int age;

	 
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

  
    public Person(String name) {
        this.name = name;
        this.age = 0;
    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

   
   
    public void displayInfo() {
        System.out.println("Name: " + name + " Age: " + age);
    }
	
	
}






