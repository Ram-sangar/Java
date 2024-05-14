import java.util.ArrayList;

class Colours1{
	public static void main(String args[]){
		ArrayList<String> col = new ArrayList<>();
		col.add("Red");
		col.add("Green");
		col.add("Blue");
		col.add("Yellow");
		
		System.out.println(col);
		
		if(col.contains("Blue")){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}