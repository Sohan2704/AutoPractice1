package day16.Utility;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtility {

		public static String getRequiredDateBasedOnNumberOfDays(String format,int numberOfDays) {
			 
			Calendar cal  = Calendar.getInstance();	    
		    cal.add(Calendar.DATE, numberOfDays);
		    SimpleDateFormat s = new SimpleDateFormat(format);
		    return s.format(new Date(cal.getTimeInMillis()));
		}
		public static String getRequiredDateBasedOnNumberOfMonths(String format,int numberOfMonths) {
			 
			Calendar cal  = Calendar.getInstance();	    
		    cal.add(Calendar.MONTH, numberOfMonths);
		    SimpleDateFormat s = new SimpleDateFormat(format);
		    return s.format(new Date(cal.getTimeInMillis()));
		}
		public static String getRequiredDateBasedOnNumberOfYears(String format,int numberOfYears) {
			 
			Calendar cal  = Calendar.getInstance();	    
		    cal.add(Calendar.YEAR, numberOfYears);
		    SimpleDateFormat s = new SimpleDateFormat(format);
		    return s.format(new Date(cal.getTimeInMillis()));
		}
		public static void main(String[] args) {
				
				Date date=new Date(00);
				System.out.println("Date without formating: "+date);
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MMM/dd");
				System.out.println("Date with formating: "+sdf.format(date));
				
				System.out.println("*******************************************");
				Calendar cal  = Calendar.getInstance();	    
			    cal.add(Calendar.YEAR, -3);
			    SimpleDateFormat s = new SimpleDateFormat("yyyy/MMM/dd");
			    System.out.println(s.format(new Date(cal.getTimeInMillis())));
			    
			    System.out.println("*****************************************");
			    System.out.println(getRequiredDateBasedOnNumberOfYears("yyyy/MMM/dd", -1));
	}

}
