interface Sum {
  void sum(int a,int b);
}
class Sum_Integer{
	public static void main(String args[]){
	Sum s = (i,j)->System.out.println("Sum : "+ (i+j));
	s.sum(10,20);
	}
}