package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver=null;
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(xpath = "//input[contains(@value,'Search.')]")
	private WebElement searchBox;
	
	@FindBy(xpath  = "//input[@title='Find']")
	private WebElement searchBut;
	
	@FindBy(xpath = "//a[@href='index.php?module=Home&action=index']")
	private WebElement home;
	
	@FindBy(linkText = "Calendar")
	private WebElement cal;
	
	@FindBy(linkText = "Leads")
	private WebElement leads;
	
	@FindBy(linkText = "Organizations")
	private WebElement org;
	
	@FindBy(linkText = "Contacts")
	private WebElement cont;
	
	@FindBy(linkText = "Opportunities")
	private WebElement oppor;
	
	@FindBy(linkText = "Products")
	private WebElement prds;
	
	@FindBy(linkText = "Documents")
	private WebElement doc;
	
	@FindBy(linkText = "Email")
	private WebElement email;
	
	@FindBy(linkText = "Trouble Tickets")
	private WebElement tTickets;
	
	@FindBy(linkText = "Dashboard")
	private WebElement dashBoard;
	
	@FindBy(linkText = "More")
	private WebElement more;
	
	@FindBy(id = "qccombo")
	private WebElement quickCreate;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement addButton;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement calButton;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Clock.gif']")
	private WebElement timeButton;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Calc.gif']")
	private WebElement calculatorButton;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/tbarChat.gif']")
	private WebElement chatButton;
	
	@FindBy(xpath = "//img[@src='themes/images/orgshar.gif']")
	private WebElement changeLayoutButton;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSearchBut() {
		return searchBut;
	}

	public WebElement getHome() {
		return home;
	}

	public WebElement getCal() {
		return cal;
	}

	public WebElement getLeads() {
		return leads;
	}

	public WebElement getOrg() {
		return org;
	}

	public WebElement getCont() {
		return cont;
	}

	public WebElement getOppor() {
		return oppor;
	}

	public WebElement getPrds() {
		return prds;
	}

	public WebElement getDoc() {
		return doc;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement gettTickets() {
		return tTickets;
	}

	public WebElement getDashBoard() {
		return dashBoard;
	}

	public WebElement getMore() {
		return more;
	}

	public WebElement getQuickCreate() {
		return quickCreate;
	}

	public WebElement getAddButton() {
		return addButton;
	}

	public WebElement getCalButton() {
		return calButton;
	}

	public WebElement getTimeButton() {
		return timeButton;
	}

	public WebElement getCalculatorButton() {
		return calculatorButton;
	}

	public WebElement getChatButton() {
		return chatButton;
	}

	public WebElement getChangeLayoutButton() {
		return changeLayoutButton;
	}
}
