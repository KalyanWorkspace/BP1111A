package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LearnerSearchPage {
public WebDriver driver;
	
	public LearnerSearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//By learnerSearchTitle = By.xpath("//div[@class='row']/div/h3");
	By logout = By.xpath("//a[@class='btn btn-primary']");
	By learners = By.xpath("//ul[@class='navbar-nav me-auto mb-2 mb-lg-0']/li[2]");
	By centres = By.xpath("//ul[@class='navbar-nav me-auto mb-2 mb-lg-0']/li[3]");
	By admin = By.xpath("//ul[@class='navbar-nav me-auto mb-2 mb-lg-0']/li[4]");
	By centreSearch = By.xpath("//div[@class='container-fluid']/div[2]/div[1]");
	By keyDates = By.xpath("//a[@class='dropdown-item']");
	By LearnerDirectService = By.xpath("//div[@class='container-fluid']/div[2]/form");


	
/*	public WebElement getLearnerSearchTitle()
	{
		return driver.findElement(learnerSearchTitle);
	} */
	public WebElement clickOnLogout()
	{
		return driver.findElement(logout);
	}
	public WebElement clickOnLearners()
	{
		return driver.findElement(learners);
	}
	public WebElement clickOnCentres()
	{
		return driver.findElement(centres);
	}
	public WebElement centreSearchText()
	{
		return driver.findElement(centreSearch);
	}
	public WebElement clickOnAdmin()
	{
		return driver.findElement(admin);
	}
	public WebElement clickOnKeyDates()
	{
		return driver.findElement(keyDates);
	}
	public WebElement learnerDirectServiceText()
	{
		return driver.findElement(LearnerDirectService);
	}
	
	

}
