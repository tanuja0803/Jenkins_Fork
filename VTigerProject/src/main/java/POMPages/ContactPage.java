package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends HomePage{
	public WebDriver driver=null;
	public ContactPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "salutationtype")
	private WebElement salutationtype;
	
	@FindBy(name = "firstname")
	private WebElement fname;
	
	@FindBy(name = "lastname")
	private WebElement lname;
	
	@FindBy(name = "account_name")
	private WebElement accName;
	
	@FindBy(xpath = "(//img[@src='themes/softed/images/select.gif'])[1]")
	private WebElement add;
	
	@FindBy(xpath = "(//input[@accesskey='S'])[1]")
	private WebElement saveButton;
	
	@FindBy(xpath = "//input[@value='U']")
	private WebElement user;
	
	@FindBy(xpath = "//input[@value='T']")
	private WebElement group;
	
	@FindBy(name = "assigned_user_id")
	private WebElement userDropdown;
	
	@FindBy(name = "assigned_group_id")
	private WebElement groupDropdown;
	
	public WebElement getSalutationtype() {
		return salutationtype;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAccName() {
		return accName;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getGroup() {
		return group;
	}

	public WebElement getUserDropdown() {
		return userDropdown;
	}

	public WebElement getGroupDropdown() {
		return groupDropdown;
	}
}
