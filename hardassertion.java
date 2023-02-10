package akshay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class hardassertion {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\selenium-java-4.8.0\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://rahulshettyacademy.com/locatorspractice";
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(url);
		
		//System.out.println(driver.getTitle());
		String exp_title="Rahul Shetty Academy - ";
		String act_title=driver.getTitle();
		Boolean bn=exp_title.equals(act_title);
		System.out.println(bn);
		
		Assert.assertNotNull(bn);
		
		Assert.assertEquals(act_title, exp_title);
		System.out.println("swapnil");
		

	}

}
