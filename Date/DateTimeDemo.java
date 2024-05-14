import java.time.LocalDate ;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTimeDemo{

	public static void main(String args[]){
		
		 LocalDate d = LocalDate.now();
		 System.out.println(d);
		 
		 LocalTime t0 = LocalTime.now(ZoneId.of("Asia/Kuwait"));
		 System.out.println(t0);
		 
		 LocalDate d1 = LocalDate.of(2002,03,29);
		 System.out.println(d1);
		 
		 LocalDate d2 = LocalDate.of(2002,Month.MARCH,29);
		 System.out.println(d1);
		 
		 LocalTime t = LocalTime.now();
		// LocalTime t1 = LocalTime.of(12:43:29.923629500);
		 System.out.println(t);
		//  System.out.println(t1);
		 
		 for(String s : ZoneId.getAvailableZoneIds())
		 {
			 System.out.println(s);
		 }
		 
		 
		 
		 
		 
		 
		 
		 
	}
}