import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Test0 {
    public void DateConversion() {
        
        String dateString1 = "2022-03-05";
        String dateString2 = "06-Mar-2022 12:30:45";
        String dateString3 = "2022/03/07";

        try {

            Date date1 = convertStringToDate(dateString1, "yyyy-MM-dd");
            Date date2 = convertStringToDate(dateString2, "dd-MMM-yyyy HH:mm:ss");
            Date date3 = convertStringToDate(dateString3, "yyyy/MM/dd");

            System.out.println("Date 1: " + date1);
            System.out.println("Date 2: " + date2);
            System.out.println("Date 3: " + date3);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static Date convertStringToDate(String dateString, String format) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat(format);

        return sdf.parse(dateString);
    }
	public void DateFormatting() {

        Date currentDate = new Date();

        String format1 = formatDate(currentDate, "yyyy-MM-dd");
        String format2 = formatDate(currentDate, "dd-MMM-yyyy HH:mm:ss");
        String format3 = formatDate(currentDate, "E, MMM dd yyyy");

        System.out.println("Formatted Date 1: " + format1);
        System.out.println("Formatted Date 2: " + format2);
        System.out.println("Formatted Date 3: " + format3);
    }

    private static String formatDate(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

}
public class Test{
	Test0 test = new Test0();
	public static void main(String args[]){
		Test t = new Test();
		t.call();
		
	}
	public void call()
		{
			Scanner scanner = new Scanner(System.in);
			int num = test.scanner.nextInt;
			
			System.out.println("End : 0");
			System.out.println("Date Conversion : 1");
			System.out.println("DateFormatting : 2");
			if(num==0){
				return;
			}
			else if(num==1){
				test.DateConversion();
				t.call();
			}
			else if(num==2){
				test.DateFormatting();
				t.call();
			}
			else {
				System.out.println("Enter valid number");
			}
		}
		
}



    


