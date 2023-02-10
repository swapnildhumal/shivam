package akshay;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\selenium-java-4.8.0\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://rahulshettyacademy.com/locatorspractice";
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.navigate().to("https://rahulshettyacademy.com/locatorspractice");
		driver.get(url);
		
		WebElement web = driver.findElement(By.id("inputUsername"));
	   
	    if (web.isDisplayed()==true) {
	    	 web.sendKeys("swapnil");
			
		} 
	    List<WebElement> links= driver.findElements(By.tagName("a"));
	    System.out.println(links.size());
	    for(int i=0; i<links.size();i++) {
	    	System.out.println(links.get(i).getText());
	    }
	    

	}

}
