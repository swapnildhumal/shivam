package akshay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\selenium-java-4.8.0\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_g50zekzm1_e&adgrpid=74238127911&hvpone=&hvptwo=&hvadid=610644609009&hvpos=&hvnetw=g&hvrand=2194158779522315396&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9050526&hvtargid=kwd-29089120&hydadcr=5496_2359482&gclid=CjwKCAiA_vKeBhAdEiwAFb_nrWp6Bu--_DrfozVLLrX3vwEmMnUD-lnDrKrgomShL3GGSthBR-rN_BoCbr8QAvD_BwE");
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();

		driver.findElement(By.id("ap_email")).sendKeys("+917448077174");
		driver.findElement(By.id("continue")).click();
		//driver.findElement(By.id("auth-fpp-link-bottom")).click();
		//driver.findElement(By.id("ap_email"));
		//driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Pass@123");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
		//driver.findElement(By.xpath("//a[@class='hmenu-item']")).click();
		//driver.findElement(By.className("Sign Out")).click();
		
			
		

	}

}
