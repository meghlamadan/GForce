package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.ComputerDatabaseHomePage;

public class TESThomepage {
	@Test
	public void homepage()
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://computer-database.herokuapp.com/computers");
		
		ComputerDatabaseHomePage addbutton=new ComputerDatabaseHomePage(driver);
				addbutton.homepageMethod();
		
	}
	
	

}
