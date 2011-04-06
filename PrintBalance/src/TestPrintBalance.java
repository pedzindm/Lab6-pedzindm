import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.Test;



public class TestPrintBalance {

	@Test
	public void testJUnit(){
		assertTrue("the complier is feeling well today ...", true);
	}
	@Test
	public void testEnglish(){
		Locale currentLocale = new Locale("en", "ENG");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		assertEquals("Hello World",messages.getString("HelloWorld"));
		
		}
	@Test
	public void testFrench(){
		Locale currentLocale = new Locale("fr", "FRA");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		assertEquals("Bonjour tout le monde",messages.getString("HelloWorld"));
		
		}
	@Test
	public void testGerman(){
		Locale currentLocale = new Locale("de", "DE");
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		assertEquals("Hallo Welt",messages.getString("HelloWorld"));
		
		}
	
}
