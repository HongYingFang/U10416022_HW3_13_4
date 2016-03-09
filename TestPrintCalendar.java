//U10416022
import java.util.Calendar;
//import java.util.GregorianCalendar;

public class TestPrintCalendar {
  public static void main(String[] args) {
	  
	  //Data field
	  Calendar day;
	  
	  int month1;
	  int year1;
	  //use Calendar method
	  day = Calendar.getInstance();
	  int userinput = args.length;
	  //use if-else to give condition which it was input by user for the year,month or nothing
	  //print out the calendar
	  if (userinput == 2) {
		  month1  = Integer.parseInt(args[0]);
		  year1 = Integer.parseInt(args[1]);
		  PrintCalendar.printMonth(year1,month1);
	  }else if (userinput == 1) {
		  month1  = Integer.parseInt(args[0]);
		  year1 = (day.get(Calendar.YEAR));
		  PrintCalendar.printMonth(year1,month1);
	  } else {
		  month1 = (day.get(Calendar.MONTH))+1;
		  year1 = (day.get(Calendar.YEAR));
		  PrintCalendar.printMonth(year1,month1);
		  }
	  }	
  
}
