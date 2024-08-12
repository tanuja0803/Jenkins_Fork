package testCases;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import POMPages.CreateOrganizationPage;
import POMPages.HomePage;
import WD_JavaUtility.JavaUtility;
import baseUtility.BaseTest;

public class TC01_CreateOrganization_Test extends BaseTest{
	HomePage hp=null;
	JavaUtility ju=null;
	@Test(groups = "Smoke")
	public void creatingOrg_Test() {
		Reporter.log("creatingOrg_Test method of TC01_CreateOrganization_Test class", true);
		test=ereport.createTest("creatingOrg_Test");
		if(driver.getTitle().contains("Home"))
			test.log(Status.PASS, "User is succefully loggedin😁😊");
		else
			test.log(Status.FAIL, "There is some issue while logging in😐");
		hp=new HomePage(driver);
		hp.getOrg().click();
		if(driver.getTitle().contains("Organizations"))
			test.log(Status.PASS, "User is on Organization page☺☺");
		else
			test.log(Status.FAIL, "Something went wrong while moving to Oraganzation page😑😑");
		
		hp.getAddButton().click();
		
		CreateOrganizationPage cop=new CreateOrganizationPage(driver);
		ju=new JavaUtility();
		cop.getOrgName().sendKeys("OrgName_"+ju.generateRandomNumber());
		cop.getSaveButton().click();
	}
	
//	@Test(groups = "Regression")
//	public void viewOrg_Test() {
//		Reporter.log("viewOrg_Test method of TC01_CreateOrganization_Test class",true);
//		hp=new HomePage(driver);
//		hp.getOrg().click();
//	}
}