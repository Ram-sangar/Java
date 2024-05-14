class React {
 int width;
 int height;
 
 public React(int a,int b){
	this.width = a;
	this.height = b;
 }
 
 public int Calculate (){
	int r = width * height; 
	return r;
 } 
 
}

public class Rectangle {
	public static void main(String args[]){
		React rr = new React(10,10);
		System.out.println(rr.Calculate());
	}
}

