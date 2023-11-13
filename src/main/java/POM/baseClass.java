package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class baseClass {
	 static WebDriver driver;
	 
	 @BeforeTest
	 public static void setup()
	 {
		driver = new ChromeDriver();
		driver.get("https://wepunch-morecreatives-net.web.app/");
		driver.manage().window().maximize();
	 }
	
	 public static WebDriver getDriver()
	 {
		 return driver;
	 }
	 
}
