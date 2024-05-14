import java.util.Scanner;
import java.util.*;
class Test{
	
	List<String> list;
	
	Test() {
		list = new ArrayList<>();
		
	}
	
	public void add(List<String> list1){
		list.addAll(list1);
		
	}
	
	public void add(String a){
		list.add(a);
		
	}
	public void remove(String a){
		list.remove(a);
		
	}
	public  void display(){
		System.out.println("List : "+list);
	}
	
}

public class Listinclass{
	public static void main(String args[]){
		Test test = new Test();
		List<String> list2 = List.of("Ram","Yova","Hevin","Rex");
		test.add(list2);
		test.add("Cyril");
		test.remove("Ram");
		test.display();
		
	}
	
}