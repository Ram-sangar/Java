public class Static_Test{
	public static void main(String args[]){
		System.out.println(Demo.a);
		System.out.println(Demo.testdemo());
		Demo d = new Demo();
		d.test();
		test_1();
	}
	public static void test_1(){
		System.out.println("Print");
	}
}
class Demo{
	static int a;
	public static int testdemo(){
		
		int a=10;
		return a;
		
	}
	public void test(){
		System.out.println("aafasfa");
	}
}