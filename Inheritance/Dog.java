class Animal
{
	String pet ="Dog";
	String pet1 = "Cow";
	
	public void print(){
			System.out.println(this.pet);
			System.out.println(this.pet1);
		
	}
	
}

public  class Dog extends Animal{
	String House = "Cute Animal";
	String Habit = "Care and love on family members";
	public void print1(){
			System.out.println(this.House);
			System.out.println(this.Habit);
		
	}
//	public static void main(String args[]){
//		Dog d = new Dog();
//		d.print();
//	}
}