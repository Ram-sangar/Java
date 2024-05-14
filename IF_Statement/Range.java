public class Range{

	public static void main(String args[]){
		
		int a=5000;
		if(a>0){
			
			if(a<10){
				System.out.println("one Digit:"+a);
			}
			
			else if(a<100){
			     if(a>=10){
					System.out.println("Two Digit:"+a);
				 }
			}
			
			else if(a<1000){
			     if(a>=100){
					System.out.println("Three Digit:"+a);
				 }
			}
			
			else if(a<10000){
			     if(a>=1000){
					System.out.println("Four Digit:"+a);
				 }
			}
		}
	}
}