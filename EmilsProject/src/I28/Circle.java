package I28;

class Circle implements Shape {
	public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
	
	@Override
	
	public double area() {
		return  radius * radius;	
		
	}
	
	  public double perimeter() {
	        return 2 * radius;
	    }
	
}
