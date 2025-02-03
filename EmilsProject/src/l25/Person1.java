package l25;

public class Person1 {
public static void main(String[] args) {
	Person person1 = new Person();
	Person person2 = new Person("Emil");
	Person person3 = new Person("Emil",15);
	
	person1.displayInfo();
	person2.displayInfo();
	person3.displayInfo();
	
}
}
