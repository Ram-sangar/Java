import java.util.Scanner;
class Rectangle{
	public void calculate(int l,int b){
		int r = l*b;
		System.out.println("Rectangle is : "+r);
	}
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length");
		int l = scanner.nextInt();
		System.out.println("Enter the breath");
		int b = scanner.nextInt();
		Rectangle rr = new Rectangle();
		rr.calculate(l,b);
		scanner.close();
	}
	
}
