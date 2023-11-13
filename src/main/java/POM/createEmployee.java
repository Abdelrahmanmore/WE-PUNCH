package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class createEmployee {

	public static void createNewemployee(employeeBasicdata employee) {
		baseClass.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement name = baseClass.getDriver().findElement(By.name("displayName"));
		WebElement phone = baseClass.getDriver().findElement(By.name("phoneNumber"));
		WebElement jobTitle = baseClass.getDriver().findElement(By.name("jobTitle"));
		WebElement email = baseClass.getDriver().findElement(By.name("email"));
		WebElement password = baseClass.getDriver().findElement(By.name("password"));
		WebElement department = baseClass.getDriver()
				.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div/div[4]/div/div/div/div"));
		WebElement img = baseClass.getDriver().findElement(By.name("photoURL"));

		name.sendKeys(employee.name);
		phone.sendKeys(employee.phone);
		jobTitle.sendKeys(employee.jobTitle);
		email.sendKeys(employee.email);
		password.sendKeys(employee.password);
		department.click();
		baseClass.getDriver().findElement(By.xpath("/html/body/div[3]/div[3]/ul/li")).click();
		img.sendKeys(employee.imgPath);

		baseClass.getDriver().findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/button")).click();

	}
}
