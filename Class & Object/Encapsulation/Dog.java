class Dog_Breed{
	private String Dog_name;
	private String Dog_breed;
	
	public Dog_Breed(String n, String b){
		this.Dog_name=n;
		this.Dog_breed = b;
	}
	
	public void setName(String name){
			this.Dog_name = name;
	}
		
	public void setBreed(String breed ){
			this.Dog_breed = breed;
	}
		
	public String getName(){
			return Dog_name;
	}
	public String getBreed(){
			return Dog_breed;
	}
}	
public class Dog{ 
	public static void main(String args[]){
		Dog_Breed d = new Dog_Breed("Hevin","Street Dog");
		//System.out.println("Dog name : "+d.Dog_name+" "+"Dog breed : "+d.Dog_breed);
		System.out.println(d.getName());
		System.out.println(d.getBreed());
		d.setName("Anisten");
		d.setBreed("Dalmia");
		System.out.println(d.getName());
		System.out.println(d.getBreed());
		
		
	}
}