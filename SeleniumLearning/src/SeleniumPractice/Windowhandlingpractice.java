package SeleniumPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.DriverConnection;

public class Windowhandlingpractice {

public static void main(String[] args) {  
		
		WebDriver driver = DriverConnection.connect("https://demoqa.com/browser-windows");
		
		driver.findElement(By.id("windowButton")).click();
		
		Set<String> AllWindows = driver.getWindowHandles();
		
		String MainWindow = driver.getWindowHandle();
		
		System.out.println(MainWindow);
		System.out.println(AllWindows);
		
		for(String win : AllWindows)
		{
			if(!win.equals(MainWindow))
			{
				driver.switchTo().window(win);
			}
		}
		
	String text =	driver.findElement(By.id("sampleHeading")).getText();
	
	System.out.println(text);
	
		
		
		
		
	
}
}
