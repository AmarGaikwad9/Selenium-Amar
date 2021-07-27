package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {

	@AfterTest
	public void lastExecution() {
		
		System.out.println("i will execute last");
		System.out.println("i will execute last");
	}
	
	
	    @Test
		public void demo() 
		{
		System.out.println("Hello");
		}
	 
	    @AfterSuite
	public void Afsuite() {
		System.out.println("i wall execute at last suite level ");
	}
	    
	    
	    @Test
	    public void test() {
	    	
	    	System.out.println("Amar");
	    }

}
