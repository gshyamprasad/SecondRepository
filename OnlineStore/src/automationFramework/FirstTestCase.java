package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Create new instance of the Firefox Driver
		WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\Shyam\\Downloads\\geckodriver-v0.26.0-win64.exe");
		
		//Launch the online store application
		 driver.get("https://www.amazon.in");
		 
		 // Print log in message
		 System.out.println("Successfully opened Amazon Application");
		 
		 //Wait for 5 seconds
		 Thread.sleep(5000);
		 
		 //Close driver
		 driver.quit();
		 
		 
		
	}

}
