package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Regpage
{
	WebDriver driver;
	By blazename=By.id("name");
	By blazecompany=By.id("company");
	By blazeemail =By.id("email");
	By blazepass = By.id("password");
	By blazeconfirm=By.id("password-confirm");
	By blazeregister=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");

    By Logmail=By.xpath("//*[@id=\"email\"]");
    By Logpass=By.xpath("//*[@id=\"password\"]");
    By Logllogin=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button");

    public Regpage(WebDriver driver)
    {
    	this.driver=driver;
    }
    public void Setvalues(String name,String company,String email,String password,String confirm)
    {
    	//driver.navigate().refresh();
     driver.findElement(blazename).sendKeys(name);
     driver.findElement(blazecompany).sendKeys(company);
     driver.findElement(blazeemail).sendKeys(email);
     driver.findElement(blazepass).sendKeys(password);
     driver.findElement(blazeconfirm).sendKeys(confirm);    	
    }
    public void register()
    {
    	driver.findElement(blazeregister).click();
    	driver.navigate().to("https://www.blazedemo.com/login");
    }
    public void setlogin(String email,String password)
    {
    	driver.findElement(Logmail).sendKeys(email);
    	driver.findElement(Logpass).sendKeys(password);
    }
    public void login()
    {
    	driver.findElement(Logllogin).click();
    }
}

	
	


