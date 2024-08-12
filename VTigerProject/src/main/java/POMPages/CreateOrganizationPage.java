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
	
	@FindBy(id = "employees")
	private WebElement emp;
	
	@FindBy(id = "email2")
	private WebElement email;
	
	@FindBy(xpath = "//select[@name='industry']")
	private WebElement industry;
	
	@FindBy(xpath = "//select[@name='accounttype']")
	private WebElement acttype;
	
	@FindBy(xpath = "//input[@name='emailoptout']")
	private WebElement emailoptout;
	
	@FindBy(xpath ="//input[@value='U']")
	private WebElement assignToUser;
	
	@FindBy(xpath = "//input[@value='T']")
	private WebElement assignToGroup;
	
	@FindBy(id = "assign_user")
	private WebElement userDropdown;
	
	@FindBy(id = "assign_team")
	private WebElement groupDropdown;
	
	@FindBy(xpath = "(//input[@class='crmbutton small save'])[1]")
	private WebElement saveButton;


	public WebElement getOrgName() {
		return orgName;
	}

	public WebElement getWebsite() {
		return website;
	}

	public WebElement getTicketSymbol() {
		return ticketSymbol;
	}

	public WebElement getAccName() {
		return accName;
	}

	public WebElement getPlusBut() {
		return plusBut;
	}

	public WebElement getClearBut() {
		return clearBut;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmp() {
		return emp;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getIndustry() {
		return industry;
	}

	public WebElement getActtype() {
		return acttype;
	}

	public WebElement getEmailoptout() {
		return emailoptout;
	}

	public WebElement getAssignToUser() {
		return assignToUser;
	}

	public WebElement getAssignToGroup() {
		return assignToGroup;
	}

	public WebElement getUserDropdown() {
		return userDropdown;
	}

	public WebElement getGroupDropdown() {
		return groupDropdown;
	}
}
