import java.util.ArrayList;

class Colours2{
	public static void main(String args[]){
		ArrayList<String> col = new ArrayList<>();
		col.add("Red");
		col.add("Green");
		col.add("Blue");
		col.add("Yellow");
		System.out.println(col);
		ArrayList<String> col1 = new ArrayList<>(col);
		
		System.out.println(col1);
	}
}