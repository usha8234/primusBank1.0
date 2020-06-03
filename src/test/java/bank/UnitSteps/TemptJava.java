package bank.UnitSteps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TemptJava implements TemptData

{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\devis\\OneDrive\\Desktop\\Automation Support Systems\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//*[@id='txtuId']").sendKeys(username);
		driver.findElementByXPath("//*[@type=\"password\"]").sendKeys(password);
		driver.findElementByXPath("//*[@id=\"login\"]").click();
		driver.findElementByXPath("//*[@src=\"images/Branches_but.jpg\"]").click();
		
		Select c =new Select(driver.findElementByXPath("//*[@name=\"lst_countryS\"]"));
		
		c.selectByVisibleText(country);
		
		
        Select s =new Select(driver.findElementByXPath("//*[@id=\"lst_stateS\"]"));
		
		s.selectByVisibleText(state);
		
        Select ct =new Select(driver.findElementByXPath("//*[@id=\"lst_cityS\"]"));
		
		ct.selectByVisibleText(city);
		
		driver.findElementByXPath("//*[@id=\"btn_search\"]").click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

