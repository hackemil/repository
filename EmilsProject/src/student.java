
public class student {
	
	    private String name;
	    private int age;
	    private double gpa;
	    
	    
	    public student(String name, int age, double gpa) {
	        this.name = name;
	        this.age = age;
	        this.gpa = gpa;
	    }        
	   
	    public String getName() {
	        return name;
	    }
	    public int getAge() {
	        return age;
	    }
	    public double getGpa() {
	        return gpa;
	    }
	    public void setGpa(double gpa) {
	        if (gpa >= 0.0 && gpa <= 4.0) {
	            this.gpa = gpa;
	        } else {
	            System.out.println("GPA должен быть в диапазоне от 0.0 до 4.0");
	        }
	    }
}

