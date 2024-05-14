public class Max{

	public static void main(String args[]){
		
		int a=10;
		int b=20;
		int c=1;
		
		switch (c){
			case 1:
				if(a>b){
					System.out.println("a is big");
				}
				else{
					System.out.println("b is big");
				}
				break;
			default:
				System.out.println("Both are equal");
				break;
	
		}
	} 
}