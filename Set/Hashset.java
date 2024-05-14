import java.util.*;


public class Hashset
{
	public static void main(String args[])
	{
		Set<Integer> hash = new HashSet<>();
		
		hash.add(1);
		hash.add(2);
		hash.add(3);
		hash.add(4);
		hash.add(2);
		
		System.out.println(hash);
		
	}
}