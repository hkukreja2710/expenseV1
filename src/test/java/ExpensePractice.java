import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
public class ExpensePractice {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://qa.quest2travel.org/frontend/emplogin");
		driver.findElement(By.xpath("//input[@id='txtEmpId']")).sendKeys("DRL1061");
		driver.findElement(By.xpath("//input[@id='txtEmpPass']")).sendKeys("Quest@2024");
		driver.findElement(By.xpath("//input[@id='btnSubmit']")).click();	
		try {
			driver.findElement(By.id("btnYes")).click();
		}
		finally {
			driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Ok']")).click();
		}
		driver.findElement(By.id("manageclaims_frm")).click();
		driver.findElement(By.id("createTrip")).click();
		driver.findElement(By.id("addExpTitle")).sendKeys("Test"); WebElement
		we1=driver.findElement(By.xpath("//input[@id='addExpStartCity']"));
		we1.sendKeys("Mumbai"); Thread.sleep(2000); WebElement
		we2=driver.findElement(By.xpath("//input[@id='addExpDestCity']"));
		we2.sendKeys("Delhi"); Thread.sleep(2000);
		driver.findElement(By.id("addExpFrom")).click(); Thread.sleep(2000);
		WebElement dateInputFrom = driver.findElement(By.id("addExpFrom"));
		dateInputFrom.clear(); dateInputFrom.sendKeys("13-12-2024");




		driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Apply'])[1]")).click();
		WebElement dateInputTo = driver.findElement(By.id("addExpTo"));
		dateInputTo.clear(); dateInputTo.sendKeys("14-12-2024");
		driver.findElement(By.xpath(
				"(//button[@type='button'][normalize-space()='Apply'])[2]")).click();
		driver.findElement(By.id("addExpPurposeVisit")).sendKeys("test");
		driver.findElement(By.id("cmdCreate")).click();
		driver.findElement(By.xpath("(//tr[@class='odd'])[1]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("select2-expAddCategory_0-container")).click();
		WebElement dropdownoption=driver.findElement(By.id("select2-expAddCategory_0-results"));
		dropdownoption.click();
		Thread.sleep(5000);
		WebElement airFare=driver.findElement(By.xpath("//li[contains(text(), 'Air Fare')]"));
		airFare.click();
		// WebElement fileInput = driver.findElement(By.id("expAddFile_0"));
		 //fileInput.click();
	        // Provide the file path to upload
	       // String filePath = "C:\\Users\\harsha.kukreja\\Downloads\\jpeg_image_1734608752_1736162124_1736232939.jpg\"";
	       // fileInput.sendKeys(filePath);
		

	}



}


