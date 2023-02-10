package akshay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hotstar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\selenium-java-4.8.0\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("https://www.hotstar.com/in");
		driver.findElement(By.className("signIn")).click();
		driver.findElement(By.id("phoneNo")).sendKeys("7448077174");
		driver.findElement(By.className("submit-button")).click();
		driver.findElement(By.xpath("//div[@class='otp-input']")).sendKeys("7255");

	}

}
