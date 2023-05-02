package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.DriverConnection;

public class DatePickerPractice {

	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://www.globalsqa.com/demo-site/datepicker/");
		
		
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		

	}

}
