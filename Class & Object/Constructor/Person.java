public class Person{
	String name ;
	int age ;
		
	public Person(String n,int a){
			this.name=n;
			this.age=a;
	}
	public static void main(String args[]){
		
		Person p = new Person("Guru balan",21);
		System.out.println("Name : " + p.name + "," + "Age : " + p.age );
		
	}
}