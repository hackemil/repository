

class Employee {
    protected String name;
    protected String position;
    
    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }
    
    public void displayInfo() {
        System.out.println("Имя " + name);
        System.out.println("Должность " + position);
    }

	
}