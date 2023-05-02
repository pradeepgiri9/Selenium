package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.DriverConnection;

public class FrameHandlingPractice {

	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://demoqa.com/frames");
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		

		driver.switchTo().frame(driver.findElement(By.id("frame2")));
		
		
		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
		
		driver.quit();
	}

}
