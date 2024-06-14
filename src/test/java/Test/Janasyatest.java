package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.Janasya;

public class Janasyatest {
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
		driver.get("https://janasya.com/");
	}
	@Test
	public void test1()
	{
		Janasya ob=new Janasya(driver);
		ob.newarclick();
		ob.logopresent();
		ob.itempage();
		ob.category();
		ob.alllinks();
		ob.menus();
		//ob.wish();
		ob.adcart();
		ob.vwcart();
		ob.cshopping();
		ob.ethnics();
	}
}