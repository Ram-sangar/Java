import java.util.List;
import java.util.ArrayList;

public class StringList{
	public static void main(String args[]){
		 List<String> list = new ArrayList<>();
		 list.add("RAM");
		 list.add("Hevin");
		 list.add("Gugan sakarathi");
		 
		 for(String S:list){
			System.out.println(S);
		 }
	}
}