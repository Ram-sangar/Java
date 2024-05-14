import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist{

	public static void main(String args[]){
		create();
		add();
	}	
    public static void create(){
	
		ArrayList<String> Fruit = new ArrayList<>();

		System.out.println(Fruit);
	}
	public static void add(){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number of Fruits:");
		int a=scanner.nextInt();
		
		for(int i=0;i<a;i++){
			System.out.println("Enter the Fruits name:");
			String b=scanner.nextLine();
			Fruit.add(b);
		}
	}
}