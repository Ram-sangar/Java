class Shape{
  double radius;
  
  public Shape(double r){
	this.radius = r;
  }
  
  public double circle1(){
	 double circle2 = 3.14*radius*radius;
	 return circle2;
  }
  
  public double circumference(){
	 double circumference = 2*3.14*radius;
	 return circumference;
  }
  
}
class Circle{

	public static void main(String args[]){
		Shape c1 = new Shape(10);
		System.out.println("Circle : "+ c1.circle1());
		System.out.println("Circle : "+ c1.circumference());
		
		Shape c2 = new Shape(20);
		System.out.println("Circle : "+ c2.circle1());
		System.out.println("Circle : "+ c2.circumference());
	}
}


