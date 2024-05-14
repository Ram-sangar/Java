import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;
 class Addition {
    public void add(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
}
 class Subtraction extends Addition {
    public void sub(int a,int b){
        int c=a-b;
        System.out.println(c);
    }
}

public class Calculator extends Subtraction{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A value:");
        int a = scanner.nextInt();
        System.out.println("Enter B value:");
        int b = scanner.nextInt();

        Calculator c = new Calculator();
        c.sub(a,b);
    }
}