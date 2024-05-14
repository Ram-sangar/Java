interface A
{
	void show(int i);
}

public class DemoLambda
{
	public static void main(String args[]){
		A obj =  i ->  System.out.println("In Show : "+i );
		obj.show(5);
	}
}