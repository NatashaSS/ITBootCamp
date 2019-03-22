import java.io.ObjectInputStream.GetField;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver extends Konfiguraciona {
public static void main(String[] args) {
	WebDriver web = new ChromeDriver(); 
	web.get(url);
	String naslov= web.getTitle();
	System.out.println(naslov);
	String duzina=web.getPageSource();
	int duzinaNaslova=duzina.length();
	web.getCurrentUrl();
	web.getPageSource().length();
	System.out.print(web.getPageSource().length());
	web.close();
//	. Launch a new web browser
//	2. Open http://newtours.demoaut.com/
//		3. Get Page Title name and Title length
//		4. Print Page Title and Title length on the Eclipse Console
//		5. Get Page URL and verify if the it is a correct page opened
//		6. Get Page Source (HTML Source code) and Page Source length
//		7. Print Page Length on Eclipse Console
//		8. Close the browser
}
}
