package pages;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class checkoutpage {
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/a[2]")
	WebElement shoppingcart;

	@FindBy(xpath="/html/body/div[2]/div/div/div[3]/div[2]/a")
	WebElement checkout;
	
	@FindBy(xpath="//*[@id=\"input-payment-firstname\"]")
	WebElement Firstname;
	
	@FindBy(xpath="//*[@id=\"input-payment-lastname\"]")
	WebElement Lastname;
	
	@FindBy(xpath="//*[@id=\"input-payment-company\"]")
	WebElement Company;
	
	@FindBy(xpath="//*[@id=\"input-payment-address-1\"]")
	WebElement Address1;
	
	@FindBy(xpath="//*[@id=\"input-payment-address-2\"]")
	WebElement Address2;
	
	@FindBy(xpath="//*[@id=\"input-payment-city\"]")
	WebElement city;
	
	@FindBy(xpath="//*[@id=\"input-payment-postcode\"]")
	WebElement Postcode;
	
	@FindBy(xpath="//*[@id=\"input-payment-country\"]")
	WebElement country;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div[9]/div/select")
	WebElement state;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div[2]/div/form/div[2]/div/input")
	WebElement Continue1;
	
	@FindBy(xpath="//*[@id=\"button-shipping-address\"]")
	WebElement Continue2;
	
	@FindBy(xpath="//*[@id=\"button-shipping-method\"]")
	WebElement Continue3;
	
	@FindBy(xpath="//*[@id=\"collapse-payment-method\"]/div/div[2]/div/input[1]")
	WebElement Conditions;
	
	@FindBy(xpath="//*[@id=\"button-payment-method\"]")
	WebElement Continue4;
	
	@FindBy(xpath="//*[@id=\"button-confirm\"]")
	WebElement confirmorder;
	
	
	@FindBy(xpath="//*[@id=\"content\"]")
	WebElement orderplaced;
	
	public checkoutpage(WebDriver driver)
	{
		  this.driver=driver;
	    PageFactory.initElements(driver,this);
	}
	public void checkout() throws Exception
	{
	Thread.sleep(2000);
	shoppingcart.click();
	checkout.click();
	
	Firstname.sendKeys("abcd");
	Lastname.sendKeys("zyxw");
	Company.sendKeys("abc123xyz");
	Address1.sendKeys("palakkad");
	Address2.sendKeys("chittur");
	city.sendKeys("kochi");
	Postcode.sendKeys("564874");
	Select Country=new Select(country);
	Country.selectByVisibleText("Albania");
	Select State=new Select(state);
	State.selectByVisibleText("Berat");
	Continue1.click();
	Continue2.click();
	Continue3.click();
	Conditions.click();
	Continue4.click();
	confirmorder.click();
	
	}
	public void orderscreenshot() throws Exception
	{
		Thread.sleep(3000);
		File orderscr=orderplaced.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(orderscr, new File("./Screenshot/orderscreenshot.png"));
		Thread.sleep(3000);
		
		
		
	
	
	
	
	
	
	
	
	}

}
