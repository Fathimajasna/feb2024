

package Page;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Janasya {
	WebDriver driver;
	By newar=By.xpath("//*[@id=\"HeaderNavigation\"]/nav/ul/li[1]/a/span");
	By logo=By.xpath("//*[@id=\"shopify-section-sections--16349892411562__0551e2c3-4916-467e-a6e9-b0d8594a3ff3\"]/header/div/div/div[2]/div/div/div/a/img");
	By itemperpage=By.xpath("/html/body/div[2]/main/div[2]/div[1]/div/div[1]/div[2]/div/toolbar-item/div[2]/div[3]/div[1]/div/div/span[1]");
	By selectfiftn=By.xpath("//*[@id=\"CollectionProductGrid\"]/div/toolbar-item/div[2]/div[3]/div[1]/div/ul/li[2]/span");
	By categories=By.xpath("//*[@id=\"halo-sidebar\"]/div[2]/div[1]/div[1]/h3");
	By kurta=By.xpath("/html/body/div[2]/main/div[2]/div[1]/div/div[1]/div[1]/div[2]/div[1]/div[2]/div/ul/li[1]/a/span");
	By links=By.tagName("a");
	By menu=By.tagName("nav");
	//By wishlist=By.xpath("//button[@title='Add to wishlist']/span/span/svg");
	By cart=By.xpath("//*[@id=\"44199301382314\"]");
	By vcart=By.xpath("//*[@id=\"halo-cart-sidebar\"]/div[2]/cart-coupon-discount/div/div[3]/div/div/a");
	By cshop=By.xpath("//*[@id=\"main-cart-items\"]/div/div[2]/form/div/div/a");
	By ethnic=By.xpath("//*[@id=\"HeaderNavigation\"]/nav/ul/li[3]/a/span[1]");
	By kurset=By.xpath("//*[@id=\"HeaderNavigation\"]/nav/ul/li[3]/ul/li[2]/a/span");
	public Janasya(WebDriver driver)
	{
		this.driver=driver;
	}	
	public void newarclick()
	{
		driver.findElement(newar).click();
	}
	public void logopresent()
	{
		if(driver.findElement(logo).isDisplayed())
		{
			System.out.println("Janasya logo present");
		}
		else
		{
			System.out.println("Janasya logo not present");
		}
	}
	public void itempage()
	{
		driver.findElement(itemperpage).click();
		driver.findElement(selectfiftn).click();
		driver.navigate().refresh();
	}
	public void category()
	{
		driver.findElement(categories).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(kurta).click();
		driver.navigate().to("https://janasya.com/collections/kurti-kurta");
	}
	public void alllinks()
	{
		List<WebElement>li=driver.findElements(links);
		for(WebElement link:li)
		{
			String s1=link.getAttribute("href");
			String s2=link.getText();
			System.out.println("links :"+s1+"-----------"+"Text "+s2 );
		}
	}
	public void menus()
	{
		List<WebElement> m=driver.findElements(menu);
		for(WebElement men:m)
		{
			String menustr=men.getText();
			System.out.println("Menues :"+menustr );
		}
	}
	/*public void wish()
	{
		driver.findElement(wishlist).click();
	}*/
	public void adcart()
	{
		driver.findElement(cart).click();
	}
	public void vwcart()
	{
		driver.findElement(vcart).click();
	}
	public void cshopping()
	{
		driver.findElement(cshop).click();
	}
	public void ethnics()
	{
		Actions act=new Actions(driver);
		WebElement w=driver.findElement(ethnic);
		act.moveToElement(w).build().perform();
		driver.findElement(By.xpath("//*[@id=\"HeaderNavigation\"]/nav/ul/li[3]/ul/li[2]/a/span")).click();
	}
	 
}