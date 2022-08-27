package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		
		//Setup system property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NanduVani\\Selenium\\1st_Selenium\\driver\\chromedriver.exe");
		//Object of chrome driver
		WebDriver driver = new ChromeDriver();
		// go to a website
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		//pause execution
		Thread.sleep(2000);
		//close browser
		driver.close();
		
	}
}
 