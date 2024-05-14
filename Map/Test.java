import java.util.*;
import java.util.HashMap;

class Test0{
	
	Scanner scanner = new Scanner(System.in);
	
	Map<String, Integer> myMap;
	NavigableMap<String, Integer> myMap1;

	
	Test0(){
		
		myMap = new HashMap<>();
		myMap1 = new TreeMap<>();

		
	}
	
	public void create(){

        System.out.println("My Map: " + myMap);
	}
	
	public void add(){

		System.out.println("Original map : "+myMap);
		System.out.println("Enter how many student are you add in this map :");
		int number = scanner.nextInt();
		
		for (int i = 0;i<number;i++){
			System.out.println("Enter the name :");
			String s = scanner.next();
			System.out.println("Enter the number :");
			int n = scanner.nextInt();
			myMap.put(s,n);
			myMap1.put(s,n);

			System.out.println("My Map: " + myMap);
		}
		System.out.println("Keys of the Map : " +myMap.keySet());
		System.out.println("Values of the Map : " +myMap.values());
		System.out.println("Entry Set of the Map : " +myMap.entrySet());

	}
	
	public void objectMap(){

		System.out.println("Original map : "+myMap);
		Map<String, Integer> myMap1 = new HashMap<>();
		
		System.out.println("Enter how many student are you add in this map :");
		int number = scanner.nextInt();
		
		for (int i = 0;i<number;i++){
			System.out.println("Enter the name :");
			String s = scanner.next();
			System.out.println("Enter the number :");
			int n = scanner.nextInt();
			myMap1.put(s,n);
		}
		
		myMap.putAll(myMap1);
		System.out.println("My Map: " + myMap);
		
	}
	
	public void checkexistence(){

		System.out.println("Original map : "+myMap);
		
		System.out.println("For Check Key and Value...");
		
		System.out.println("Enter the name :");
		String s1 = scanner.next();
		
		if(myMap.containsKey(s1)){
			System.out.println("key is Exist : "+ s1);	
		}
		else{
			System.out.println("key not Exist : "+ s1);
		}
		
		System.out.println("Enter the number :");
		int n1 = scanner.nextInt();
		
		if(myMap.containsValue(n1)){
			System.out.println("value is Exist : "+ n1);	
		}
		else{
			System.out.println("value not Exist : "+ n1);
		}
	}
	
	public void copymap()
	{

		System.out.println("Original map : "+myMap);
		Map<String, Integer> copied = new HashMap<>(myMap);
		System.out.println("Copied Map : "+copied);
	}
	
	public void getallmap() {

		System.out.println("Original map : "+myMap);
		Collection <String> keys = myMap.keySet();

        System.out.println("Keys in the original map: " + keys);
		
		Collection <Integer>  Values = myMap.values();

        System.out.println("Keys in the original map: " + Values);
	}
	
	public void iterate(){

		System.out.println("Original map : "+myMap);
		for (String key : myMap.keySet()){
			System.out.println("Keys : "+key+" Values : "+myMap.get(key));
		}
	}
	public void printkeyvalue(){
		System.out.println("");
		System.out.println("Original map : "+myMap);
		for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
	}
	public void modify(){

		System.out.println("Original map : "+myMap);
		System.out.println("Before "+myMap);
		System.out.println("Enter the key already in the map for modify");
		System.out.println("Enter the name :");
		String s = scanner.next();
		System.out.println("Enter the number :");
		int n = scanner.nextInt();
		myMap.put(s,n);
		System.out.println("After "+myMap);
		
	}
	
	public void remove(){

		System.out.println("Original map : "+myMap);
		System.out.println("Enter how many student are you add in this map :");
		int number = scanner.nextInt();
		
		for (int i = 0;i<number;i++){
			System.out.println("Enter the name :");
			String s = scanner.next();
			System.out.println("Enter the number :");
			int n = scanner.nextInt();
			myMap.remove(s,n);
			System.out.println("My Map: " + myMap);
		}

	}
	public void first_last_map(){

		System.out.println("Original map : "+myMap);
		Map.Entry<String, Integer> firstEntryHashMap = null;
        Map.Entry<String, Integer> lastEntryHashMap = null;

        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            if (firstEntryHashMap == null) {
                firstEntryHashMap = entry;
            }
            lastEntryHashMap = entry;
        }

        System.out.println("First Entry (HashMap): " + firstEntryHashMap);
        System.out.println("Last Entry (HashMap): " + lastEntryHashMap);
}
	
	public void submap(){

		System.out.println("Original map : "+myMap);
		System.out.println("create Sub Map for original map");
		System.out.println("Enter some keys form original map");
		
		Set<String> s = new HashSet<>();
		
		System.out.println("Enter how many student are you add in this map :");
		int number = scanner.nextInt();
		for (int i = 0;i<number;i++){
			System.out.println("Enter the name :");
			String s1 = scanner.next();
			s.add(s1);
		
		Map<String, Integer> submap = new HashMap<>();
		for(String key : s){
			if(myMap.containsKey(key)){
				submap.put(key,myMap.get(key));
			}
		}
		System.out.println(submap);
		
	}
	}
	public void empty(){
		
		System.out.println(myMap);
		myMap.clear();
		System.out.println(myMap);
	}
	public void sort(){
		
		System.out.println("Original map : "+myMap);
		List<String> l = new ArrayList<>(myMap.keySet());
		Collections.sort(l);
		System.out.println("Sorted map : "+l);
	}
	public void ReverseMap() {

        System.out.println("Original Map: " + myMap1);

        // Reversing the order of entries
        NavigableMap<String,Integer> reversedMap = myMap1.descendingMap();

        System.out.println("Reversed Map: " + reversedMap);
    }
	 public void Hashcode() {

        System.out.println("Tree Map: " + myMap);

        int hashCode = myMap.hashCode();
        System.out.println("Hash Code of HashMap: " + hashCode);
    }
	public  void Commaseparatedstring() {
        
        String mapAsString = getMapAsString(myMap);
        System.out.println("Map as Comma-Separated String: " + mapAsString);
    }

    private static String getMapAsString(Map<String, Integer> map) {
        StringBuilder result = new StringBuilder();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result.append(entry.getKey())
                  .append("=")
                  .append(entry.getValue())
                  .append(", ");
        }

        if (result.length() > 0) {
            result.setLength(result.length() - 2);
        }

        return result.toString();
    }
	
	
}
public class Test{
	
	 Test0 test = new Test0();
	
	public static void main(String args[]){
		Test t = new Test();
		t.cal();	
	}
	public void cal(){
		System.out.println("");
		System.out.println("End:0");
		System.out.println("Create:1");
		System.out.println("Add:2");
		System.out.println("Object Map:3");
		System.out.println("Check existence:4");
		System.out.println("Copy map:5");	
		System.out.println("Get all map :6");
		System.out.println("Iterate:7");
        System.out.println("print key value:8");
		System.out.println("Modify:9");
		System.out.println("Remove:10");
		System.out.println("First Last Map:11");
		System.out.println("Sub Map:12");
		System.out.println("Empty:13");
		System.out.println("Sort:14");
		System.out.println("Reverse Map:15");
		System.out.println("Hash Code:16");
		System.out.println("Comma Separated String:17");
		
		System.out.println("");
		
		System.out.println("Enter the number :");
		int num = test.scanner.nextInt();
			if(num==0){
				return;
			}
			else if(num==1){
				test.create();
				cal();
			}
			else if(num==2){
				test.add();
				cal();
			}
			else if(num==3){
				test.objectMap();
				cal();
			}
			else if(num==4){
				test.checkexistence();
				cal();
			}
			else if(num==5){
				test.copymap();
				cal();
			}
			else if(num==6){
				test.getallmap();
				cal();
			}
			else if(num==7){
				test.iterate();
				cal();
			}
			else if(num==8){
				test.printkeyvalue();
				cal();
			}
			else if(num==9){
				test.modify();
				cal();
			}
			else if(num==10){
				test.remove();
				cal();
			}
			else if(num==11){
				test.first_last_map();
				cal();
			}
			else if(num==12){
				test.submap();
				cal();
			}
			else if(num==13){
				test.empty();
				cal();
			}
			else if(num==14){
				test.sort();
				cal();
			}
			else if(num==15){
				test.ReverseMap();
				cal();
			}
			else if(num==16){
				test.Hashcode();
				cal();
			}
			else if(num==17){
				test.Commaseparatedstring();
				cal();
			}
			else{
				System.out.println("Enter the Correct number");
			}				
									
	}
}
