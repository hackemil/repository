

class Student1 extends Person1 {
    public Student1(String name) {
        super(name);
    }
    
    @Override
    public void introduce() {
        super.introduce();
        System.out.println("Я студент.");
    }
}