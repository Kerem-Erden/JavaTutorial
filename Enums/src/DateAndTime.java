//import the java.time package
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
	
	public static void main(String[] args) {
		
		//local date
		LocalDate localDate = LocalDate.now();
		System.out.println("Date is: " + localDate);
		
		//current time
		LocalTime localTime = LocalTime.now();
		System.out.println("Local time: " + localTime);
		
		//display current date and time
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Local date and time: " + localDateTime);
	
		//formating date and time
		System.out.println("Befor formatting: " + localDateTime);
		//ofPattern and DateTimeFormatter
		DateTimeFormatter formatingObject = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate = localDateTime.format(formatingObject);
		System.out.println("After formatting: " + formattedDate);
	
		/*
		 * date and time separating forms
		 * yyyy-MM-dd	"1988-09-29
		 * dd/MM/yyyy	"29/09/1988
		 * dd-MMM-yyyy	"29-Sep-1988
		 * E, MMM dd yyyy	"Thu, Sep 29 1988
		*/
	}

}
