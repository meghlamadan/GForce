package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddanewcomputerPage 
{
	//Add a new computer in database
	
	public WebDriver driver;
	
	//Declaration
	@FindBy(xpath="//input[@name='name']")
	private WebElement Entercomputername;
	
	@FindBy(id="introduced")
	private WebElement Enterintroduceddate;
	
	@FindBy(id="discontinued")
	private WebElement Enterdiscontinueddate;
	
	@FindBy(xpath="//input[@value='Create this computer']")
	private WebElement Clickcreatethiscomputerbutton;
	
	@FindBy(xpath="//a[.='Cancel']")
	private WebElement Clickcancelbutton;
	
	//constructor (initialization)
	public AddanewcomputerPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void computerpagemethod()
	{
		Entercomputername.sendKeys("Apple");
		Enterintroduceddate.sendKeys("1981-08-23");
		Enterdiscontinueddate.sendKeys("2000-03-13");
		
	}
	public void choosecompanyMethod()
	{
		WebElement dropdownlist=driver.findElement(By.xpath("//select[@name='company']"));
		Select sel=new Select(dropdownlist);
		sel.selectByVisibleText("Apple Inc.");
	}
	
	public void clickcreatebuttonmethod()
	{
		Clickcreatethiscomputerbutton.click();
	}
	public void clickcancelbuttonmethod()
	{
		Clickcancelbutton.click();
	}

}
