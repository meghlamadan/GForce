package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.AddanewcomputerPage;
import pom.ComputerDatabaseHomePage;

public class TESTaddnewcomputerPage {
	@Test
	public void Addcomputerhomepage()
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://computer-database.herokuapp.com/computers");
		
		ComputerDatabaseHomePage addbutton=new ComputerDatabaseHomePage(driver);
		addbutton.homepageMethod();
		
		AddanewcomputerPage fields= new AddanewcomputerPage(driver);
		fields.computerpagemethod();
		
		AddanewcomputerPage choosecompany=new AddanewcomputerPage(driver);
		choosecompany.choosecompanyMethod();
		
		AddanewcomputerPage createbutton=new AddanewcomputerPage(driver);
		createbutton.clickcreatebuttonmethod();
	}

}
