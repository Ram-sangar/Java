import java.util.*;
import java.text.LocalDate;
public class TwoDateEqualornot{
	public static void main(String args[]){
		LocalDate currentdate = LocalDate.of(2024,2,17);
		LocalDate date = LocalDate.now();
		
        result = date.compareTo(currentdate);
		if(date==0){
		System.out.println("Equal");
		}
		else if (date!= 0 ){
		System.out.println("not Equal");	
		}
	}
}
