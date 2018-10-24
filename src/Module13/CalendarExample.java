package Module13;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author Kasper
 */
public class CalendarExample {

	public static void main(String[] args) {
		//We create a calendar object that represents a date two weeks into the future
		Calendar expiration = Calendar.getInstance();
		expiration.add(Calendar.DAY_OF_YEAR, 14);

		//We can edit a Calendar object in other ways too - it is a little messy for some fields:
		//Milliseconds: Calendar.MILLISECOND
		//Seconds:      Calendar.SECOND
		//Minutes:      Calendar.MINUTE
		//Hours:        Calendar.HOUR or Calendar.HOUR_OF_DAY
		//Days:         Calendar.DAY_OF_WEEK or Calendar.DAY_OF_MONTH or Calendar.DAY_OF_YEAR or Calendar.DATE
		//Weeks:        Calendar.WEEK_OF_YEAR or Calendar.WEEK_OF_MONTH or Calendar.DAY_OF_WEEK_IN_MONTH
		//Months:       Calendar.MONTH
		//Years:        Calendar.YEAR

		//Printing the calendar object is ugly, and not what we want
		System.out.println(expiration);

		//The method .getTime() gets a Date object representing the same day as the Calendar, and Date objects look good
		//when printed
		System.out.println(expiration.getTime());

		//We can also use this construction to tailor the format of the output to our own format
		//For an explanation of the "dd-MM-yyyy" format, see:
		//https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
		SimpleDateFormat expirationDateFormatter = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(expirationDateFormatter.format(expiration.getTime()));
	}
}
