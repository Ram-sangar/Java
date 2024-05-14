import java.util.HashSet;
public class Color1{
	public static void main(String args[]){
	HashSet<String> col = new HashSet<>();
		col.add("Red");
		col.add("Green");
		col.add("Blue");
		col.add("Yellow");
		System.out.println(col);
		col.clear();
		System.out.println(col);
	}
}