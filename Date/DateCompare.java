import java.time.LocalDate;

public class DateCompare {
	public static void main(String args[]){
		LocalDate date1 = LocalDate.of(2023,3,15);
		LocalDate date2 = LocalDate.of(2022,8,10);
		
		int comparisonResult = date1.compareTo(date2);
		System.out.println(comparisonResult);
		if(comparisonResult > 0){
			System.out.println("Date 1 is after date 2.");
			
		}
		else if (comparisonResult < 0){
			System.out.println("Date 1 is before date 2.");
		}
		else {
			System.out.println("Date 1 is equal to Date 2.");
		}
	}
}