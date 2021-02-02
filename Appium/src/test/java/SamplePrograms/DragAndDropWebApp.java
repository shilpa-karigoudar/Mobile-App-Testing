package SamplePrograms;

import org.openqa.selenium.chrome.ChromeDriver;

public class DragAndDropWebApp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//skarigoudar//OneDrive - DXC Production//Desktop//chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		
		
		

	}

}
