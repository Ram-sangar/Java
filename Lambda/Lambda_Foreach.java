import java.util.*;
class Lambda_Foreach{
	public static void main(String args[]){
		List<String> list = new ArrayList<>();
		list.add("RAM");
		list.add("Cyril");
		list.forEach(name->System.out.println("Names : "+name));
	}
} 