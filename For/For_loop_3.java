public class For_loop_3{

	public static void main(String args[]){
	
		int a = 10;
		for (int i = 5; i<a; i+=2)
		{
			for(int j = 0; j <=i; j+=1)
			{
				for (int k = 0; k <= j; k++)
				{
					System.out.println(k);
				}
			
			}
		}
	}
}