package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.Regpage;

public class Regtestpage {
	
	WebDriver driver;
	@BeforeTest
	public void set ()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void get()
	{
		driver.get("https://www.blazedemo.com/register");
	}
	@Test
	public void testregister()
	{
		Regpage obj=new Regpage(driver);
		obj.Setvalues("fathima", "abcder", "jas123@gmail.com", "jas@123", "jas@123");
		obj.register();
		driver.navigate().to("https://www.blazedemo.com/login");
		obj.setlogin("jas123@gmail.com", "jas@123");
		obj.login();
	}

}
