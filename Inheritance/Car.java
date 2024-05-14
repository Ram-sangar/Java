class Vehicle1{
	int a = 10;
	String b = "Red";
	
	//public Vehicle(int a1,String b1){
		//this.a=a1;
		//this.b=b1;
	//}
	
	public void display(){
		System.out.println(this.a);
		
	}
}
public class Car extends Vehicle1{
	
	String name = "RAM";
	public static void main(String args[]){
	    
		Car c = new Car();
			System.out.println(c.a);
			System.out.println(c.b);
			c.display();
			System.out.println(c.name);
		Vehicle1 v = new Vehicle1();
		System.out.println(v.a);
		System.out.println(v.b);
//		System.out.println(v.name);
			
		
		
		 
	}
}