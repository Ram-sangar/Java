import java.util.*;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import java.util.Iterator;



public class Test 
{
	Scanner scanner = new Scanner(System.in);
		
	public static void main(String args[])
	{
		System.out.println("Create: 1");
		System.out.println("Add Modify: 2");
		System.out.println("Object into set;: 3");
		System.out.println("Copy a set into Another: 4");
		System.out.println("Check Existence: 5");
		System.out.println("Remove Element in Set: 6");
		System.out.println("Get Size and Empty or not: 7");
		System.out.println("Convert set into array: 8");
		System.out.println("Iterator Set: 9");
		System.out.println("Forward Backward Set: 10");
		System.out.println("Iterator Remove Set: 11");
		System.out.println("Set Remove Element: 12");
		System.out.println("Set of Maps: 13");
		System.out.println("Set of Maps Iterator: 14");
		System.out.println("Modify Map In Set: 15");
		System.out.println("Delete Key In Map: 16");  
		System.out.println("Delete Key In Map Set: 17"); 
		System.out.println(" Set: 18"); 
		System.out.println("Map only in set: 19");
		System.out.println("Empty a set: 20");
		System.out.println("Set Existence Check: 21");
		System.out.println("Create Subset Set: 23");
		System.out.println("Duplicate And Null Set: 24");
		  Test test = new Test(); 
		  

        System.out.println("Select the Number:");
        int switc = test.scanner.nextInt();
		
		switch(switc)
		{
			case 1:
			    test.create();
				break;
			case 2:
			    test.addmodify();
				break;
			case 3:
			    test.addobject();
				break;
			case 4:
			    test.copyarrayintoset();
				break;
			case 5:
			    test.checkexistence();
				break;
			case 6:
			    removeelement();
				break;
			case 7:
			    getsizeemptyornot();
				break;
			case 8:
			    SetToArray();
				break;
			case 9:
			    IteratorSet();
				break;
			case 10:
			    ForwardBackward();
				break;
			case 11:
			    IteratorRemove();
				break;
			case 12:
			    SetRemove();
				break;
			case 13:
			    SetOfMaps();
				break;
			case 14:
			    SetOfMapsIterator();
				break;
			case 15:
			    ModifyMapInSet();
				break;
			case 16:
				DeleteKeyInMap();
				break;
			case 17:
				DeleteMapInSet();
				break;
			case 18:
				StringSet();
				break;
			case 19:
				MapSet();
				break;
			case 20:
				EmptySet();
				break;
			case 21:
				SetExistenceCheck();
				break;
			case 23:
				CreateSubsetSet();
				break;
			case 24:
				DuplicateAndNullSet();
				break;
		}
	}
	
	public  void create()
	{
		System.out.println("Create Tree: 1");
		System.out.println("Create Linked: 2");
		System.out.println("Create Hash: 3");
		
		System.out.println("Select the Number:");
		int switc1 = scanner.nextInt();
		
		switch(switc1)
		{
			case 1:
			    Tree();
				break;
			case 2:
				Linked();
				break;
			case 3:
			    Hash();
				break;
		}
		
	
	}
		private void Tree()
		{
			Set<String> treeset = new TreeSet<>();
		
			treeset.add("Apple");
			treeset.add("Orange");
			treeset.add("Apple");
		
			System.out.println("TreeSet: "+treeset);
		}
		
		private void Linked()
		{
			Set<Character> linkedhashset = new LinkedHashSet<>();
		
			linkedhashset.add('a');
			linkedhashset.add('e');
			linkedhashset.add('i');
			linkedhashset.add('o');
			linkedhashset.add('u');
			
			System.out.println("Linkedhashset: "+linkedhashset);
		}
		private void Hash()
		{
			Set<Integer> hash = new HashSet<>();
		
			hash.add(1);
			hash.add(2);
			hash.add(3);
			hash.add(4);
			hash.add(2);
		
			System.out.println(hash);
			
		}

		public void addmodify() {
        Set<String> hashSet = new HashSet<>();
       
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
  
        System.out.println("Original Set: " + hashSet);
 
        hashSet.add("Grapes");
      
        hashSet.remove("Banana");
        hashSet.add("Mango");
      
        System.out.println("Modified Set: " + hashSet);
		}
		
		public void addobject(){
        
        Set<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Orange");
    
        Set<String> set2 = new HashSet<>();
        set2.add("Grapes");
        set2.add("Banana");
        set2.add("Mango");
      
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
   
        set1.addAll(set2);
    
        System.out.println("Modified Set 1 after adding set2: " + set1);
    }
	public void copyarrayintoset(){ 
        
        Set<String> originalSet = new HashSet<>();
		Set<String> copySet = new HashSet<>();
        originalSet.add("Apple");
        originalSet.add("Banana");
        originalSet.add("Orange");
       
        System.out.println("Original Set: " + originalSet);
		System.out.println("Copied Set: " + copySet);
      
        String[] newArray = {"Grapes", "Banana", "Mango"};

        copySet.addAll(Set.of(newArray));

        System.out.println("Modified Copied Set after adding array elements: " + copySet);
    }
	public void checkexistence() {
       
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        
        String targetElement = "Banana";
        if (set.contains(targetElement)) {
            System.out.println(targetElement + " exists in the set.");
        }
		else {
            System.out.println(targetElement + " does not exist in the set.");
        }
	}
	public static void removeelement() {
        
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
   
        System.out.println("Original Set: " + set);

        String elementToRemove = "Banana";
        if (set.contains(elementToRemove)) {
            set.remove(elementToRemove);
            System.out.println("Removed element: " + elementToRemove);
        } else {
            System.out.println("Element " + elementToRemove + " not found in the set.");
        }

        System.out.println("Modified Set: " + set);
    }
	public static void getsizeemptyornot() {
        
        Set<String> set = new HashSet<>();

        System.out.println("Original Set: " + set);

        int size = set.size();
        System.out.println("Size of the set: " + size);

        boolean isEmpty = set.isEmpty();
        System.out.println("Is the set empty? " + isEmpty);

        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        System.out.println("Modified Set: " + set);

        size = set.size();
        System.out.println("Size of the set after adding elements: " + size);

        isEmpty = set.isEmpty();
        System.out.println("Is the set empty after adding elements? " + isEmpty);
    }
	public static void SetToArray() {

        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        System.out.println("Original Set: " + set);

        String[] array = set.toArray(new String[0]);

        System.out.print("Array: [");
        for (String element : array) {
            System.out.print(element + ", ");
        }
        System.out.println("]");
    }
	public static void IteratorSet() {

        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        Iterator<String> iterator = set.iterator();

        System.out.println("Iterating through the set using Iterator:");
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
	public static void ForwardBackward() {

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");

        System.out.println("Forward order:");
        Iterator<String> forwardIterator = linkedHashSet.iterator();
        while (forwardIterator.hasNext()) {
            System.out.println(forwardIterator.next());
        }

        System.out.println("\nReverse order (manually):");
        Object[] elementsArray = linkedHashSet.toArray();
        for (int i = elementsArray.length - 1; i >= 0; i--) {
            System.out.println(elementsArray[i]);
        }
    }
	public static void IteratorRemove() {
    
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        System.out.println("Original Set: " + set);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if ("Banana".equals(element)) {
                iterator.remove(); 
                System.out.println("Removed: " + element);
            }
        }

        System.out.println("Modified Set: " + set);
    }
	public static void SetRemove() {

        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        System.out.println("Original Set: " + set);

        String elementToRemove = "Banana";
        boolean removed = set.remove(elementToRemove);

        if (removed) {
            System.out.println("Removed: " + elementToRemove);
        } else {
            System.out.println(elementToRemove + " not found in the set.");
        }

        System.out.println("Modified Set: " + set);
    }
	public static void SetOfMaps() {

        Set<Map<String, String>> setOfMaps = new HashSet<>();

        Map<String, String> map1 = new HashMap<>();
        map1.put("Key1", "Value1");
        map1.put("Key2", "Value2");
        setOfMaps.add(map1);

        Map<String, String> map2 = new HashMap<>();
        map2.put("Key3", "Value3");
        map2.put("Key4", "Value4");
        setOfMaps.add(map2);

        System.out.println("Set of Maps: " + setOfMaps);
    }
	public static void SetOfMapsIterator() {

        Set<Map<String, String>> setOfMaps = new HashSet<>();

        Map<String, String> map1 = new HashMap<>();
        map1.put("Key1", "Value1");
        map1.put("Key2", "Value2");
        setOfMaps.add(map1);

        Map<String, String> map2 = new HashMap<>();
        map2.put("Key3", "Value3");
        map2.put("Key4", "Value4");
        setOfMaps.add(map2);

        Iterator<Map<String, String>> iterator = setOfMaps.iterator();
        while (iterator.hasNext()) {
            Map<String, String> currentMap = iterator.next();

            System.out.println("Map:");

            Iterator<Map.Entry<String, String>> mapIterator = currentMap.entrySet().iterator();
            while (mapIterator.hasNext()) {
                Map.Entry<String, String> entry = mapIterator.next();
                System.out.println("  " + entry.getKey() + ": " + entry.getValue());
            }
        }
    }
	public static void ModifyMapInSet() {

        Set<Map<String, String>> setOfMaps = new HashSet<>();

        Map<String, String> map1 = new HashMap<>();
        map1.put("Key1", "Value1");
        map1.put("Key2", "Value2");
        setOfMaps.add(map1);

        Map<String, String> map2 = new HashMap<>();
        map2.put("Key3", "Value3");
        map2.put("Key4", "Value4");
        setOfMaps.add(map2);

        System.out.println("Set of Maps (Before Modification): " + setOfMaps);

        String targetKey = "Key2";
        String newValue = "UpdatedValue";
        modifyValueForKey(setOfMaps, targetKey, newValue);

        System.out.println("Set of Maps (After Modification): " + setOfMaps);
    }

    
    private static void modifyValueForKey(Set<Map<String, String>> setOfMaps, String key, String newValue) {
        Iterator<Map<String, String>> iterator = setOfMaps.iterator();
        while (iterator.hasNext()) {
            Map<String, String> currentMap = iterator.next();
            if (currentMap.containsKey(key)) {
                currentMap.put(key, newValue);
				break;
            }
        }
    }
	
    public static void DeleteKeyInMap() {

        Set<Map<String, String>> setOfMaps = new HashSet<>();

        Map<String, String> map1 = new HashMap<>();
        map1.put("Key1", "Value1");
        map1.put("Key2", "Value2");
        setOfMaps.add(map1);

        Map<String, String> map2 = new HashMap<>();
        map2.put("Key3", "Value3");
        map2.put("Key4", "Value4");
        setOfMaps.add(map2);

        System.out.println("Set of Maps (Before Deletion): " + setOfMaps);

        String targetKey = "Key2";
        deleteKeyInMap(setOfMaps, targetKey);

        System.out.println("Set of Maps (After Deletion): " + setOfMaps);
    }

    private static void deleteKeyInMap(Set<Map<String, String>> setOfMaps, String key) {
        Iterator<Map<String, String>> iterator = setOfMaps.iterator();
        while (iterator.hasNext()) {
            Map<String, String> currentMap = iterator.next();
            if (currentMap.containsKey(key)) {
                currentMap.remove(key);
                break;
            }
        }
    }
	public static void DeleteMapInSet() {
   
        Set<Map<String, String>> setOfMaps = new HashSet<>();

        Map<String, String> map1 = new HashMap<>();
        map1.put("Key1", "Value1");
        map1.put("Key2", "Value2");
        setOfMaps.add(map1);

        Map<String, String> map2 = new HashMap<>();
        map2.put("Key3", "Value3");
        map2.put("Key4", "Value4");
        setOfMaps.add(map2);

        System.out.println("Set of Maps (Before Deletion): " + setOfMaps);

        deleteMapInSet(setOfMaps, map1);

        System.out.println("Set of Maps (After Deletion): " + setOfMaps);
    }

    private static void deleteMapInSet(Set<Map<String, String>> setOfMaps, Map<String, String> mapToDelete) {
        Iterator<Map<String, String>> iterator = setOfMaps.iterator();
        while (iterator.hasNext()) {
            Map<String, String> currentMap = iterator.next();
            if (currentMap.equals(mapToDelete)) {
                iterator.remove();
                break;
            }
        }
    }
	public static void StringSet(){

        Set<String> stringSet = new HashSet<>();

        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Orange");
        System.out.println("String Set: " + stringSet);
    }
	public static void MapSet() {

        Set<Map<String, String>> mapSet = new HashSet<>();

        Map<String, String> map1 = new HashMap<>();
        map1.put("Key1", "Value1");
        map1.put("Key2", "Value2");
        mapSet.add(map1);

        Map<String, String> map2 = new HashMap<>();
        map2.put("Key3", "Value3");
        map2.put("Key4", "Value4");
        mapSet.add(map2);

        System.out.println("Map Set: " + mapSet);
    }
	public static void EmptySet() {

        Set<String> mySet = new HashSet<>();
        mySet.add("Apple");
        mySet.add("Banana");
        mySet.add("Orange");

        System.out.println("Set before emptying: " + mySet);

        mySet.clear();

        System.out.println("Set after emptying: " + mySet);
    }
	public static void SetExistenceCheck() {
    
        Set<String> originalSet = new HashSet<>();
        originalSet.add("Apple");
        originalSet.add("Banana");
        originalSet.add("Orange");

        Set<String> elementsToCheck = new HashSet<>();
        elementsToCheck.add("Banana");
        elementsToCheck.add("Orange");

        boolean exists = originalSet.containsAll(elementsToCheck);

        System.out.println("Existence Check Result: " + exists);
    }
	public static void CreateSubsetSet() {

        Set<String> originalSet = new HashSet<>();
        originalSet.add("Apple");
        originalSet.add("Banana");
        originalSet.add("Orange");
        originalSet.add("Grapes");

        System.out.println("Original Set: " + originalSet);

        Set<String> subsetSet = createSubsetSet(originalSet);

        System.out.println("Subset Set: " + subsetSet);
    }
    private static Set<String> createSubsetSet(Set<String> originalSet) {

        return new HashSet<>(originalSet);
    }
	public static void DuplicateAndNullSet() {
    
        Set<String> mySet = new LinkedHashSet<>();

        mySet.add("Apple");
        mySet.add("Banana");
        mySet.add("Orange");
        mySet.add("Apple"); 
        mySet.add(null);    
        mySet.add(null);    

        System.out.println("LinkedHashSet with Duplicate and Null Values: " + mySet);

        int hashCode = mySet.hashCode();
        System.out.println("Hash Code of LinkedHashSet: " + hashCode);
    }

		
}
