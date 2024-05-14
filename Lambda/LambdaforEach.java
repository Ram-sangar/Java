import java.util.*;
public class LambdaforEach{
	public static void main(String args[]){
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.forEach( (n) -> {
			if(n % 2 == 0) {
				System.out.println("Even:"+n);
				} else {
					System.out.println("Odd:"+n);
				}
				} );
	}
}