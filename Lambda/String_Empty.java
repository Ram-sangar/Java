interface String{
	boolean s (String a);
}
Class String_Empty{
	public static void main(String args[]){
		String s1 = a -> a.isEmpty();
		System.out.println("Is the empty string empty? " + s1.s(""));
		System.out.println("Is the empty string empty? " + s1.s("RAM"));
		
	}
}0