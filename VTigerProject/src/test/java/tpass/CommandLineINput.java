package tpass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CommandLineINput {
	@Test
	public void launchURL_Test() {
		String browser=System.getProperty("browser");
		WebDriver driver=null;
		if(browser.equalsIgnoreCase("chrome"))
			driver=new ChromeDriver();
		else if(browser.equalsIgnoreCase("firefox"))
			driver=new FirefoxDriver();
		else if(browser.equalsIgnoreCase("edge"))
			driver=new EdgeDriver();
		else
			driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		String url=System.getProperty("url");
		driver.get(url);
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("Email")).sendKeys(System.getProperty("un"));
		driver.findElement(By.id("Password")).sendKeys(System.getProperty("pwd"));
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		driver.quit();
	}
	
	@Test
	public void display() {
		System.out.println("display method");
	}
	
	@Test
	public void method() {
		System.out.println("method method");
	}
}

/* Inorder to take input from command linee code
 *  mvn test -Dtest=CommandLineINput -Dbrowser=firefox -Durl=https://demowebshop.tricentis.com -Dun=sonawaletanuja55@gmail.com -Dpwd=Tanuja@0803 
 * 
 * 
 * In order to run a specific class and specific method of that class
 * mvn test -Dtest=CommandLineINput#display
 * */