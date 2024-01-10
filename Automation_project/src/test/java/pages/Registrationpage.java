package pages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Registrationpage 
	{
	    WebDriver driver;
	    
	    @FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a")
	    WebElement MyAccount;
	    
	    @FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")
	    WebElement Register;
	    
	    @FindBy(id="input-firstname")
	    WebElement  Firstname;
	    
	    @FindBy(id="input-lastname")
	    WebElement Lastname;
	    
	    @FindBy(id="input-email")
	    WebElement Email;
	    
	    @FindBy(id="input-telephone")
	    WebElement Telephone;
	    
	    @FindBy(id="input-password")
	    WebElement Password;
	    
	    @FindBy(id="input-confirm")
	    WebElement Confirmpassword;
	    
	    @FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[1]")
	    WebElement PrivacyPolicy;
	    
	    @FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[2]")
	    WebElement Continue;
	    
	    @FindBy(xpath="//*[@id=\"column-right\"]/div/a[13]")
		WebElement Logout;
	    
	    
	public Registrationpage(WebDriver driver)
	{
		  this.driver=driver;
	    PageFactory.initElements(driver,this);
	    
	}

	public void Registration()
	{
		
		String email="hgjhiii36qyuptyryt@gmail.com";
		String pswd="ahbfhg234";
		
	MyAccount.click();
	Register.click();
	Firstname.sendKeys("aj");
	Lastname.sendKeys("m");
	Email.sendKeys(email);
	Telephone.sendKeys("4756778324678");
	Password.sendKeys(pswd);
	Confirmpassword.sendKeys(pswd);
	PrivacyPolicy.click();
	Continue.click();
	Logout.click();
		
	}

}
