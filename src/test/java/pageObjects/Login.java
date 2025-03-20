package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import baseTest.ConfigReader;

public class Login extends basePage {
	
	public Login(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	ConfigReader cr=new ConfigReader();
	@FindBy(xpath="//input[@id='txtEmpId']")
	WebElement EmpId;
	@FindBy(xpath="//input[@id='txtEmpPass']")
	WebElement Pass;
	@FindBy(xpath="//input[@id='btnSubmit']")
	WebElement Submit;
	@FindBy(xpath="//a[@href='#'][normalize-space()='Ok']")
	WebElement OK_btn;
	@FindBy(id="btnYes")
	WebElement Yes_btn;
	
	public void setEmpId(String Emp) {
		EmpId.sendKeys(cr.getProperty("userId"));
	}
	public void setPassword(String pwd) {
		Pass.sendKeys(cr.getProperty("password"));
	}	 
	public void clickSubmit(){
		Submit.click();
		}
	public void continueFlow() {
		try {
			Yes_btn.click();
		}
		finally {
			OK_btn.click();
		}
	}

}
