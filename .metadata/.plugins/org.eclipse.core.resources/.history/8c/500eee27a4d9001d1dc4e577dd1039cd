package basic;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.DriverConnection;

public class MyTest {
	
	static WebDriver driver=null;
	@BeforeClass
	public static void setUp()
	{
		driver = DriverConnection.connect("https://www.facebook.com/");
		
	}
	
	
	@Test
	public void titleCheck()
	{
		String actualTitle = driver.getTitle();
		String expectedTitle = "Facebook – log in or sign up";
		assertEquals(expectedTitle, actualTitle);
	}
	
	@Ignore
	@Test
	public void loginCheck()
	{
		
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("dgeb34");
		driver.findElement(By.name("login")).click();
		
		
		//title verify
//		String actual = driver.getTitle();
//		String expected = "Log in to Facebook";
//		assertEquals(expected, actual);
		
		//text verift
		String expected = "Forgotten password?";
		String actual = driver.findElement(By.xpath("//div[@class='_9ay7']/a")).getText();
	
		assertEquals(expected, actual);
	}
	
	@AfterClass
	public static void close()
	{
		driver.quit();
	}
	
}
