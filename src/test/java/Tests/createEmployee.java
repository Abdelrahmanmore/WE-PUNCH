package Tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM.baseClass;
import POM.employeeBasicdata;
import POM.employeesList;
import POM.homePage;
import POM.splashScreen;

public class createEmployee extends baseClass{

	@Test(priority = 1)
	public void login()
	{
		splashScreen.login("demo@admin.com", "12345678");
	}
	@Test(priority = 2)
	public void createEmployee() throws IOException
	{
		homePage.openEmployeeslist();
		
		employeesList.openCreateemployee();
		employeeBasicdata employee = new employeeBasicdata();
		employee.name = "abdelrahman3";
		employee.phone = "01028400";
		employee.jobTitle = "tester";
		employee.email = "e3@auto.com";
		employee.password = "12345678";
		employee.department = "general";  
		employee.imgPath = "/home/rania/Downloads/American Latin.jpg";
		
		POM.createEmployee.createNewemployee(employee);
	}
}
