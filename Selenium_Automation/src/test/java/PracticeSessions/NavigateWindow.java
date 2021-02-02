package PracticeSessions;

import java.util.Iterator;
import java.util.Set;

import javax.swing.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NavigateWindow {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/");
		driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
		
		
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		Iterator<String> itr=windowHandles.iterator();
		
		
	
		Actions action = new Actions(driver);
		
		action.contextClick();
		
		action.doubleClick();
		
		
	}
	

}
