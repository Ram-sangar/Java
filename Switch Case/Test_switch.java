public class Test_switch{

	public static void main(String a[]){
	
	int day=10;
	switch(day){
	
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.print("weekdays");
			break;
		case 6:
		case 7:
			System.out.print("Holiday");
			break;
		default:
			System.out.print("Invalid day");
			break;
	   }
	}
}
	