package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class employeesList {

	public static void openCreateemployee() {
		baseClass.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		baseClass.getDriver()
				.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div[1]/div[2]/div/div/button")).click();
	}
}
