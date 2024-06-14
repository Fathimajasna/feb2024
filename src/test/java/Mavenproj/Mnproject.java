package Mavenproj;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mnproject
{
	
	ChromeDriver driver;

	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
	}
	@Test
	public void test1()
	{
		driver.get("https://www.google.com/");
	}
}
