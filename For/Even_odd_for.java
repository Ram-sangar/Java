public class Even_odd_for{

	public static void main(String args[]){
	
		int even = 0;
		int odd = 0;
		
		for (int i=0;i<=100;i++){
			if(i%2==0){
				System.out.println("Even:"+i);
				System.out.println();
			}
			else{
				System.out.println("odd:"+i);
				System.out.println();
			}
		}
	}
}