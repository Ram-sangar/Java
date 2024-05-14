class Vehicle {
	
	//instance variables
	private int wheel = 10;
	private String color = "Red";
	private String type;
	
	public Vehicle(){
		System.out.println("parent Constructor");
	}
	
	public Vehicle(int w,String c){
		this.wheel=w;
		this.color=c;
		System.out.println("Parent Parameter Constructor");
	}
	
	public void display(){
		System.out.println("Parent"+this.wheel+" "+this.color);
		
	}
	
	public String getwheel(){
		return this.color;
	}
	
	public void setWheel(int wheel){
		this.wheel = wheel;
	} 
	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type = type;
	}
	
}

class Auto extends Vehicle{

	public Auto(int wheel,String color){
		super(wheel,color);
		System.out.println("Child paramater Constructor Auto");
	}
	
}
public class Car1 extends Vehicle{
	
	String name = "KIA";
	
	public Car1(){
		System.out.println("Child Constructor ");
	}
	
	public Car1(String n, int wheel, String color){
		super(wheel,color);
		this.name = n;
		System.out.println("Child paramater Constructor"+this.name);
	}
	
//	public void display1(){
//		System.out.println("child"+getwheel()+""+this.color+""+this.name);
//	}
	
//	public static void main(String args[]){
//		Car1 c = new Car1("blue",4,"Maruti");
//		c.display();
//		c.display1();
//
//		Auto a = new Auto(4,"yellow");
//		//a.display1();
//
//		Vehicle v = new Vehicle(100,"aaaaa");
//		v.display();
//
//		System.out.println(c.getwheel());
//
//	}
}	
