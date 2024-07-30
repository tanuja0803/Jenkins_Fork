package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationPage extends HomePage{
	WebDriver driver=null;
	public CreateOrganizationPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy
}
