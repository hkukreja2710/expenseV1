package baseTest;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class CountElementsOnScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.booksbykilo.in/new-books");
		driver.manage().window().maximize();
		/*List<WebElement> li=driver.findElements(By.xpath("//div[@id='productsDiv']//h3")); 
		System.out.println(li.size());*/
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		int intialCount=0;
		int currentCount=0;
		while(true) {
			List<WebElement> li=driver.findElements(By.xpath("//div[@id='productsDiv']//h3")); 
			currentCount=li.size();
			if(currentCount==intialCount) {
				break;
					
			}
			intialCount=currentCount;
			Actions act=new Actions(driver);
			//JavascriptExecutor js=(JavascriptExecutor)driver;
			//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			
			act.sendKeys(Keys.END).perform();
			Thread.sleep(3000);
			
		}
		System.out.println(intialCount);
		driver.quit();
	}

}
