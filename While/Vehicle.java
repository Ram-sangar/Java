class Vehicle
{
    int a;
	String Wheel;
	String Car;
	
	Vehicle(int a1, String wheel, String car)
	{
		this.a = a1;
		this.Wheel = wheel;
		this.Car = car;
	}
	
	public static toString()
	{
		System.out.println(a);
		System.out.println(Wheel);
		System.out.println(Car);
	}
	
	public static void main(String args[])
	{
	  Vehicle v = new Vehicle(1,"Four","BMW");
	}
}