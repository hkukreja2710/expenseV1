package testCases;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Utilities.DataProvider;
import baseTest.basicTest;
import pageObjects.Login;
import pageObjects.createExpense;
import pageObjects.goToExpense;


public class TC001_Domestic_DRL_createExpense extends basicTest{
	//public WebDriver driver;
	//public Properties p;
	@Test//(dataProvider="LoginData",dataProviderClass=DataProvider.class)
	public void Login( ) throws InterruptedException {
		Login lp=new Login(driver);
		
		//lp.setEmpId(UserName);
		//lp.setPassword(Password);
		lp.setEmpId(p.getProperty("userId"));
		lp.setPassword(p.getProperty("password"));
		lp.clickSubmit();   
		lp.continueFlow(); 
		goToExpense gt=new goToExpense(driver);
		gt.goexpense();
		
	
		createExpense ce=new createExpense(driver);
		ce.clickon_create();  
		ce.addTitle();
		ce.add_start_city();
		ce.add_destination_city();
		ce.addExpenseFrom();
		ce.addExpenseTo();
		ce.purposeOfVisit();
		Thread.sleep(1000);
		ce.click_on_createExpense();
	
	}
	
}
