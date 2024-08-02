package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationPage extends HomePage{
	WebDriver driver=null;
	public CreateOrganizationPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "accountname")
	private WebElement orgName;
	
	@FindBy(name = "website")
	private WebElement website;
	
	@FindBy(name = "tickersymbol")
	private WebElement ticketSymbol;
	
	@FindBy(name = "account_name")
	private WebElement accName;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/select.gif']")
	private WebElement plusBut;
	
	@FindBy(xpath = "//input[@src='themes/images/clear_field.gif']")
	private WebElement clearBut;
}
