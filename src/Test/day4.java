package Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day4 {
	@Test
		public void Webloginhomeloan() {
			System.out.println("Web homeloan");
			
		
		}
	
	@Test(groups= {"ST"})
	public void Mobileloginhomeloan() 
	{
		System.out.println("Mobile homeloan");
		
	}
	@BeforeMethod
	public void beverymethod()
	{
		System.out.println("i will execute before every method");
	}
	
   @Test
   public void APILoginhomeloan() 
   {
	   System.out.println("API homeloan");
   }

}

