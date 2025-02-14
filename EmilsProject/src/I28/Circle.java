package I28;

class Circle implements Shape {
	public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
	
	@Override
	
	public double area() {
		return Math.PI * radius * radius;	
		
	}
	
	  public double perimeter() {
	        return Math.PI * 2 * radius;
	    }
	
}
