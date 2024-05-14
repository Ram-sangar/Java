import java.util.Scanner;

class Prime{
	
	Scanner scanner = new Scanner(System.in);
	
	public boolean Cal(int n){
		for (int i=2; i<n;i++){
			if(n%i==0){
				return false;
			}
			
		}return true;
	}
	
}
class Prime_cal{
	public static void main(String args[]){
		Prime p = new Prime();
		int a = p.scanner.nextInt();
		if(p.Cal(a)){
		System.out.println("Prime Number : "+a);
		}
		else{
		System.out.println("Not Prime Number : "+a);
		}
	}
}
