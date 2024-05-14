import java.util.*;


public class Linkedset
{
	public static void main(String args[])
	{
			Set<Character> linkedhashset = new LinkedHashSet<>();
		
			linkedhashset.add('a');
			linkedhashset.add('e');
			linkedhashset.add('i');
			linkedhashset.add('o');
			linkedhashset.add('u');
			
			System.out.println("Linkedhashset: "+linkedhashset);
	}
}