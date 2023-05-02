package SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.DriverConnection;

public class Alerts {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = DriverConnection.connect("https://demoqa.com/alerts");
		
//		driver.findElement(By.id("confirmButton")).click();
//		Alert alertBox = driver.switchTo().alert();
//		
//		alertBox.dismiss();
		
		driver.findElement(By.id("promtButton")).click();
		Alert alertBox = driver.switchTo().alert();
		Thread.sleep(3000);
		alertBox.sendKeys("Test");
		alertBox.accept();
		
		
		
	}
	
}
