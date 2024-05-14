import java.util.HashSet;
public class Color3{
	public static void main(String args[]){
	HashSet<String> col = new HashSet<>();
		col.add("Red");
		col.add("Green");
		col.add("Blue");
		col.add("Yellow");
		System.out.println(col);
		String a=col.get(1);
		System.out.println(a);
	}
}