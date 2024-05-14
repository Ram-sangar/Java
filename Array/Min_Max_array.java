import java.util.Scanner;

public class Min_Max_array
{
	public static void main(String args[])
	{
		int[] arr = new int [5];
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter the value:");
		int a = arr.length();
		
		for(int i=0;i<a;i++)
		{
			
			int b = scanner.nextInt();
			arr.add(b);
		}
		
		int min=arr[0];
		int max=arr[0];
		for (int i=1;i<arr.length;i++){
			if(min>arr[i]){
				min=arr[i];	
			}
			if(max<arr[i]){
				max=arr[i];	
			}
		}
		System.out.println("Minimum:"+min);
		System.out.println("Maximum:"+max);
		
	} 
}