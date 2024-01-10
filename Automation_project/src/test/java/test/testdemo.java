package test;



import org.testng.annotations.Test;

import basepkg.baseclass;
import pages.Addtocart;
import pages.Loginpage;
import pages.Registrationpage;
import pages.checkoutpage;

public class testdemo extends baseclass
{
	@Test
	public void test() throws Exception
	{
        Registrationpage ob=new Registrationpage(driver);
         ob.Registration();
         
  Loginpage ob1=new Loginpage(driver);
  ob1.Login();
  
  Addtocart ob2=new Addtocart(driver);
  ob2.Addtocart();
  
  checkoutpage ob3=new checkoutpage(driver);
  ob3.checkout();
  ob3.orderscreenshot();
	}
}