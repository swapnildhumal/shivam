package akshay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\selenium-java-4.8.0\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://www.hotstar.com/in";
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.navigate().to("https://rahulshettyacademy.com/locatorspractice");
		driver.get(url);
		driver.findElements(By.tagName("a"));
		WebElement web= driver.findElement(By.id("inputUsername"));

	}

}
