package POM;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class homePage {

	
	public static void openEmployeeslist() throws IOException
	{
		baseClass.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		File file = ((TakesScreenshot) baseClass.getDriver()).getScreenshotAs(OutputType.FILE);	
		FileUtils.copyFile(file,new File("new screen shot.jpg"));
		FileUtils.copyFile(file,new File("screen.png"));
		baseClass.getDriver().findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div[2]/div/ul/div[7]/div[1]")).click();
		
	}
}
