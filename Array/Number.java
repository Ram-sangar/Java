import java.util.*;

public class Number
{
	public static void main(String args[])
	{
		int[] arr = new int[5];
		for (int i = 0; i < arr.length;i++ )
		{
			arr[i]=i+1;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[1]);
	}
}