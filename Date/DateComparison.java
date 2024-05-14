import java.time.LocalDate;

public class DateComparison {
	public static void main(String args[]){
		LocalDate currentDate = LocalDate.now();
		LocalDate givenDate = LocalDate.of(2024,5,1);
		
		if(givenDate.isBefore(currentDate)){
				System.out.println("Given date is before date.");
		}
		else if(givenDate.isAfter(currentDate)){
				System.out.println("Given date is after date.");		
		}
		else{
				System.out.println("Given date is same date.");
		}
		
	}
}