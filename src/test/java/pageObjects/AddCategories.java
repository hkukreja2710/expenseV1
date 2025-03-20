package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCategories extends basePage {

	public AddCategories(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//li[@id='select2-expAddCategory_0-result-od8c-2794']")
	WebElement airFare;
	
	@FindBy(xpath="//li[@id='select2-expAddCategory_0-result-rkf7-2796']")
	WebElement TrainBusFare;
}

//WebElement dropDown=driver.findElement(By.id("select2-expAddCategory_0-results"));
