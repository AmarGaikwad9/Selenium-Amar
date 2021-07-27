package Test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;



public class day3 {
	
	
	
	@Test
	public void Webcarloan() 
	{
		System.out.println("webcarloan ");
		System.out.println("webcarloangit");
		
		//System.out.println(urlname);
	}


	@Test(groups= {"ST"})
	public void Mobilecarloan() 
	{
		System.out.println("mobile car loan");		
	}
	
	
	
	@BeforeSuite
	public void Bfsuite() {
		System.out.println("i am parent of all tesngxml annotation");
	}
	
	@Test(dependsOnMethods= {"Webcarloan"})
	public void APIcarloan() 
	{
	  System.out.println("APIcar loan");	
	}
	
	@Test (dataProvider="getData")
	public void DataPro(String username, String pswd)
	{
		
		System.out.println("fetch data from dada provider method getData");
		
		System.out.println(username);
		System.out.println(pswd);
		
	}
	
	@DataProvider
	public Object[][] getData() {
		//1st : combination of username , pswd
		//2:usern, pswd
		//3 fraudelent credit history
		Object[][] data=new Object[3][2];
		data[0][0]="firstusername";
		data[0][1]="pswd";
		//columns in the row ate particular value
		
		data[1][0]="secondusername";
		data[1][1]="pswdsecond";
		
		data[2][0]="thirdusername";
		data[2][1]="thirdpswd";
		
		return data;		
				
		
	}
	
	
	
	
	
	
	
	
	
	
}
