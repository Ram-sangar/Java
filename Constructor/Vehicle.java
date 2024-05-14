import java.util.Scanner;
public class Vehicle
{
	int wheel = 0;
	int stearing = 0;
	char carName = '1';
	String carMode = null;
	
	
	public Vehicle (){
		this.wheel = wheel;
		this.stearing = stearing;
		System.out.println("Rolls Royals Default");
	}
	
	Vehicle (int wheel,int stearing){
		this.wheel = wheel;
		this.stearing = stearing;
		System.out.println("Rolls Royals Parameter");
	}
	
	Vehicle (char car_name1,String car_model1)
	{
		this.carName = car_name1;
		this.carMode = car_model1;
		System.out.println("Car Name with model...");
		
	}
	
	public static void main(String args[])
	{
		
		
		/*Vehicle v1 = new Vehicle (1);
		  required: int,int
		  found:    int
		  reason: actual and formal argument lists differ in length */
		/*Vehicle v2 = new Vehicle (); 
		  required: int,int
		  found:    no arguments
	      reason: actual and formal argument lists differ in length */
		Vehicle v3 = new Vehicle ();	
		System.out.println("Rolls Royals Wheels : "+v3.wheel);
		System.out.println("Rolls Royals Stearing : "+v3.stearing);
		
		Vehicle v = new Vehicle (4,1);
		System.out.println("Rolls Royals Wheels : "+v.wheel);
		System.out.println("Rolls Royals Stearing : "+v.stearing);
		
		Vehicle v5 = new Vehicle ('J', "F-Pace");
		System.out.println("Rolls Royals Wheels : "+v5.carName);
		System.out.println("Rolls Royals Stearing : "+v5.carMode);
		
	}
}