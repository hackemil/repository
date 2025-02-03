

class Person1 {
    protected String name;
    
    public Person1(String name) {
        this.name = name;
    }
    
    public void introduce() {
        System.out.println("Меня зовут " + name + ".");
    }
}