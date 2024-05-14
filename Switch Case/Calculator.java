public class Calculator{

	public static void main(String args[]){
		char C='&';
		int a=100;
		int b=20;
		System.out.println("Select the symbol:");
		System.out.println("Addition:+");
		System.out.println("Subtraction:-");
		System.out.println("Multiplication:*");
		System.out.println("Division:/");
		System.out.println("Modulas:%");
		System.out.println("Floor://");
		switch(C){
			
			case '+':
				int A=a+b;
				System.out.println("Addition:"+A);
				break;
			case '-':
				int S=a-b;
				System.out.println("Subtraction:"+S);
				break;
			case '*':
				int M=a*b;
				System.out.println("Multiplication:"+M);
				break;
			case '/':
				int D=a/b;
				System.out.println("Division:"+D);
				break;
			case '%':
				int N=a%b;
				System.out.println("Modulas:"+N);
				break;
				/*
			case '//':
				int F=a//b;
				System.out.println("Floor:"+c);
				break;*/
			default:
				System.out.println("Select the correct symbol");
				break;
			
			
			
		}
	}
}