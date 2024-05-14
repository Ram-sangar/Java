import java.util.*;

public class Vehicle{
	public static void main(String args[]){
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle();
		Vehicle v3 = new Vehicle();
		Vehicle v4 = new Vehicle();
		Vehicle v5 = new Vehicle();
		ArrayList<Vehicle> v = new ArrayList<>();
		v.add(v1);
		v.add(v2);
		v.add(v3);
		v.add(v4);
		v.add(v5);
		System.out.println(v);
	}
}