package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart {
	WebDriver driver;
	@FindBy(xpath="/html/body/div[1]/nav/div[2]/ul/li[2]/a")
	WebElement laptop$notebooks;
	
	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[2]/div/a")
	WebElement alllaptops$notebooks;
	
	@FindBy(xpath="//*[@id=\"column-left\"]/div[1]/a[2]")
	WebElement showalllaptops1;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[4]/div[1]/div/div[2]/div[1]/h4/a")
	WebElement laptops;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div[1]/button[1]")
	WebElement wishlist;
	
	@FindBy(xpath="//*[@id=\"button-cart\"]")
	WebElement addtocart;
	
	public  Addtocart (WebDriver driver)
	  {
	    this.driver=driver;
	    PageFactory.initElements(driver,this);
	  }
	public void Addtocart()
	{
		Actions act=new Actions(driver);

		act.moveToElement(laptop$notebooks).perform();
		
		
		alllaptops$notebooks.click();
		showalllaptops1.click();
		laptops.click();
		wishlist.click();
		addtocart.click();

	
	
	
	
	
}}
