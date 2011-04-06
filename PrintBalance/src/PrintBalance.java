import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * TODO A simple class that needs to be localized
 * 
 * @author mohan. Created Mar 27, 2010.
 */
public class PrintBalance {

	

	/**
	 * Simple Java Method that is crying out to be localized.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {

		Scanner scanInput = new Scanner(System.in);
		Date today = new Date();
		Locale currentLocale;
		ResourceBundle messages;
		NumberFormat num;
		DateFormat date;
		currentLocale = new Locale("de", "DE");
		num= NumberFormat.getCurrencyInstance(currentLocale);
		date =DateFormat.getDateInstance(0,currentLocale);
		messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		// Greeting
		
		System.out.println(messages.getString("HelloWorld"));

		// Get User's Name
		
		System.out.println(messages.getString("inquiry"));
		String name = scanInput.nextLine();
		System.out.println(messages.getString("Greeting") + name);
		
		// print today's date, balance and bid goodbye
		System.out.println(messages.getString("asof")  + date.format(today));
		System.out.println(messages.getString("balance")+ num.format(9876543.21));
		System.out.println(messages.getString("farewell"));
	}
}