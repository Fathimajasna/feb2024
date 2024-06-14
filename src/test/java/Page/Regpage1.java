package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Regpage1 {
WebDriver driver;
By bname=By.id("name");
By bcom=By.id("company");
By bmail=By.name("email");
By bpswd=By.id("password");
By bcpswd=By.name("password_confirmation");
By breg=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");
By lmail=By.xpath("//*[@id=\"email\"]");
By lpss=By.xpath("//*[@id=\"password\"]");
By logbtn=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button");


public Regpage1(WebDriver driver)
{
	this.driver=driver;
}
 public void setvalues(String name,String company,String email,String pasword,String cpassword)
 {
	 driver.findElement(bname).sendKeys(name);
	 driver.findElement(bcom).sendKeys(company);
	 driver.findElement(bmail).sendKeys(email);
	 driver.findElement(bpswd).sendKeys(pasword);
	 driver.findElement(bcpswd).sendKeys(cpassword);
 }
 public void regclick()
 {
	 driver.findElement(breg).click();
	// driver.navigate().to("https://blazedemo.com/login");
 }
	 public void loginset(String mailid,String pswd)
	 {
		 driver.findElement(lmail).sendKeys(mailid);
		 driver.findElement(lpss).sendKeys(pswd);
	 }
 public void loginclick()
 {
	 driver.findElement(logbtn).click();
 }

 
}