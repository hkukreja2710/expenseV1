package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class createExpense extends basePage{

	public createExpense(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="createTrip")
	WebElement CreateExpense;
	
	@FindBy(id="addExpTitle")
	WebElement addTitle;
	
	@FindBy(xpath="//input[@id='addExpStartCity']")
	WebElement startCity;
	
	@FindBy(xpath="//input[@id='addExpDestCity']")
	WebElement destinationCity;

	@FindBy(id="addExpFrom")
	WebElement expenseFrom;
	
	@FindBy(xpath="(//button[@class='applyBtn btn btn-sm btn-primary'])[1]")
	WebElement applyFrom_exp;
	
	@FindBy(id="addExpTo")
	WebElement expenseTo;

	@FindBy(xpath="(//button[@class='applyBtn btn btn-sm btn-primary'])[2]")
	WebElement applyTo_exp;
	
	@FindBy(id="addExpPurposeVisit")
	WebElement purpose_of_visit;
	
	@FindBy(id="cmdCreate")
	WebElement create;
	
	
	public void clickon_create() {
		CreateExpense.click();
	}
	public void addTitle() {
		addTitle.sendKeys("Test");
	}
	public void add_start_city() throws InterruptedException {
		startCity.sendKeys("Mumbai");
		Thread.sleep(2000);
	}
	public void add_destination_city() throws InterruptedException {
		destinationCity.sendKeys("Delhi");
		Thread.sleep(2000);
	}
	public void addExpenseFrom() throws InterruptedException {
		expenseFrom.clear();
		expenseFrom.sendKeys("09-03-2025");
		applyFrom_exp.click();
		Thread.sleep(1000);
	}
	public void addExpenseTo() throws InterruptedException {
		expenseTo.clear();
		expenseTo.sendKeys("11-03-2025");
		applyTo_exp.click();
		Thread.sleep(1000);
	}
	public void purposeOfVisit() {
		purpose_of_visit.sendKeys("test");
	}
	public void click_on_createExpense() {
		create.click();
	}
	

}
