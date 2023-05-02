package SeleniumPractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import utility.DriverConnection;

public class ScreenshotPractice {

	public static void main(String[] args) {
		
			
			WebDriver driver = DriverConnection.connect("https://www.amazon.com/");
			
			MyScreenShot.screenShot(driver,"C:\\Selenium\\Sceenshot.jpeg");
			
			
			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

			
			MyScreenShot.screenShot(driver,"C:\\Selenium\\Sceenshot1.jpeg");
			
			
			
		}

	}


