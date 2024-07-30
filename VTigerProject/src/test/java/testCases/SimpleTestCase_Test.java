package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import baseUtility.BaseTest;

public class SimpleTestCase_Test extends BaseTest{
	WebDriver driver=null;
	@Test(groups = "Smoke")
	public void show_Test() {
		//driver=new ChromeDriver();
		//driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("SimpleTestCase_Test show_Test method", true);
		//driver.quit();
	}
	
	@Test(groups = "Regression")
	public void show1_Test() {
		//driver=new ChromeDriver();
		//driver.get("https://www.purplle.com/");
		Reporter.log("SimpleTestCase_Test show1_Test method", true);
		//driver.quit();
	}
	
	@Test(groups = "Regression")
	public void show2_Test() {
		//driver=new ChromeDriver();
		//driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("SimpleTestCase_Test show2_Test method", true);
		//driver.quit();
	}
}
