import java.util.ArrayList;
import java.util.Collections;
class Colours3{
	public static void main(String args[]){
		ArrayList<String> col = new ArrayList<>();
		col.add("Red");
		col.add("Green");
		col.add("Blue");
		col.add("Yellow");
		System.out.println(col);
		Collections.shuffle(col);
		
		System.out.println(col);
	}
}