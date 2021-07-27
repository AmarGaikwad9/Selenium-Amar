package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	@Test(groups= {"ST"})
	public void loan() {
		System.out.println("approved");
		System.out.println("approvedgit");
	}

	@Test(timeOut=4000)
	public void Aloan()
	{
		
	}
	
	@BeforeTest
	public void Prerequsite()
	{
		System.out.println("i will execute first");
	}
	
	
}
