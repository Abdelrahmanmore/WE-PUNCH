package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class splashScreen {

	
	public static void login(String email , String password)
	{
		baseClass.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement Email = baseClass.getDriver().findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div[1]/div/input"));
		WebElement Password = baseClass.getDriver().findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div[2]/div/input"));
		
		Email.sendKeys(email);
		Password.sendKeys(password);
		
		
		WebElement loginBtn = baseClass.getDriver().findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/button"));
		
		loginBtn.click();
	}
}
