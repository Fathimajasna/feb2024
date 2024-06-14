package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.Regpage1;
public class Blazetest {


	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/register");
	}
	@Test
	public void test()
	{
		Regpage1  ob=new Regpage1(driver);
		ob.setvalues("Jasna","Luminar", "acb786@gmail.com", "Jasna786", "Jasna786");
		ob.regclick();
		driver.navigate().to("https://blazedemo.com/login");
		ob.loginset("acb786@gmail.com", "Jasna786");
		ob.loginclick();
	}

}

