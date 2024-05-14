public class For_nested{

	public static void main(String args[]){
		
		for(int i=0;i<2;i++){
			System.out.println("Outer:"+i);
			System.out.println();
			for(int j=0;j<3;j++){
				System.out.println("Inner:"+j);
			}
			System.out.println();
		}
	}
}