package akshay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class swapnil {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\selenium-java-4.8.0\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://rahulshettyacademy.com/locatorspractice";
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.navigate().to("https://rahulshettyacademy.com/locatorspractice");
		driver.get(url);
		driver.get("https://rahulshettyacademy.com/locatorspractice");
	
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//driver.findElement(By.id("inputUsername")).sendKeys("swapnil");
	    driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("swapnil");
		driver.findElement(By.name("inputPassword")).sendKeys("swapnil");
		driver.findElement(By.className("submit")).click();
		//Thread.sleep(5000);
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		//WebElement web = driver.findElement(By.xpath("//input[@placeholder='Name']"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("swapnil");
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("swapnildhumal093@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("7448077174");
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
        System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
	
	}

	}


