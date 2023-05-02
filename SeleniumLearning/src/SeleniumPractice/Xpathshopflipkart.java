package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpathshopflipkart {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prade\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Deals on Amazon Devices']/parent::div/following-sibling::div/div/ul/li[1]")).click();
		driver.findElement(By.xpath("//*[@id='octopus-dlp-asin-stream']/ul/li[3]")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		
		
		driver.quit();
	}

}
