package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class goToExpense extends basePage{

	public goToExpense(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="manageclaims_frm")
	WebElement manageExpense;
	
	public void goexpense() {
		manageExpense.click();
	}
}
