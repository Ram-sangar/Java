import java.util.ArrayList;
import java.util.List;

public class List_array{
	public static void main(String args[]){
		List<Integer> a = new ArrayList<>();
		for (int i =1; i<=10 ; i++){
		a.add(i);
		}
		System.out.println(a);
		Integer[] arr = new Integer[a.size()];
		a.toArray(arr);
		
		System.out.println("foreach :");
		for(int b:arr){
			System.out.println(b);
		}
		
	}
	
}