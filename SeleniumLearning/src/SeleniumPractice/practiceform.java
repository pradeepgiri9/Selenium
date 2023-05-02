package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class practiceform {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\prade\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
	driver.manage().window().maximize();
	
	driver.findElement(By.name("firstname")).sendKeys("test");
	driver.findElement(By.name("lastname")).sendKeys("test");
	driver.findElement(By.id("sex-0")).click();
	driver.findElement(By.id("exp-4")).click();
	driver.findElement(By.id("datepicker")).sendKeys("3/22/2023");
	driver.findElement(By.id("profession-1")).click();
	driver.findElement(By.id("tool-2")).click();
	
	WebElement  Continent = driver.findElement(By.id("continents"));
	Select Choicecontinent = new Select(Continent);
	Choicecontinent.selectByVisibleText("North America");
	
	WebElement Commands = driver.findElement(By.id("selenium_commands"));
	Select Choicecommand = new Select(Commands);
	Choicecommand.selectByVisibleText("Navigation Commands");
	Choicecommand.selectByVisibleText("Wait Commands");
	
	driver.findElement(By.id("photo")).sendKeys("C:\\Users\\prade\\Pictures\\IMGP2080.JPG");
	
	driver.findElement(By.linkText("Click here to Download File")).click();
	
	driver.findElement(By.id("submit")).click();
	driver.quit();
}
}
