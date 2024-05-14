public class Stringconcatenation {
	public static void main(String args[]){
		StringBuffer str = new StringBuffer ("hello");
		String str1=str.reverse().toString();
		System.out.println(str1);
		System.out.println(str.append(",World"));
	}
}