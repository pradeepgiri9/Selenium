package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.DriverConnection;

public class StudentSignUpPractice {

	public static void main(String[] args) {
		
		WebDriver driver = DriverConnection.connect("https://demoqa.com/automation-practice-form");
		
		driver.findElement(By.id("firstName")).sendKeys("Test");
		driver.findElement(By.id("lastName")).sendKeys("Tester");
		driver.findElement(By.id("userEmail")).sendKeys("Test@Tester.com");
		driver.findElement(By.xpath("//*[@id='gender-radio-1']/following-sibling::label")).click();
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
		
		String myYear = "2000";
		String myMonth = "March";
		String myDate = "8";
		
		
		
		WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
		Select months = new Select(month);
		months.selectByVisibleText(myMonth);
		
		WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
		Select years = new Select(year);
		years.selectByVisibleText(myYear);
		
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]")).click();
		
//		WebElement day = driver.findElement(By.xpath("//*[@aria-label = 'Choose Monday, March 8th, 2010']"));
//		Select days = new Select(day);
//		days.selectByVisibleText(myDate);
		
		
		
		
		
		
		
		
		
		

	}

}
