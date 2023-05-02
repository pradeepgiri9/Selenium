package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterizedLoginTest {

	WebDriver driver;
	@BeforeClass
	public void openBrowser()
	{
		 driver = DriverConnection.connect("https://www.facebook.com/");
		
	}
	
	@Test(dataProvider = "dp")
	public void login(String uname, String pass)
	{
		
		WebElement email =  driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys(uname);
		WebElement password =  driver.findElement(By.id("pass"));
		password.clear();
		password.sendKeys(pass);
		driver.findElement(By.name("login")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.navigate().back();
	}

	@DataProvider(name="dp")
	public Object[][] getdata()
	{
		Object obj[][] = new Object[3][2];
		
		obj[0][0] = "test@gmail.com";
		obj[0][1] ="test";
		
		obj[1][0] = "tech@gmail.com";
		obj[1][1] =	"tech";
				
		obj[2][0] = "abc@gmail.com";				
		obj[2][1] =	"abc";
		
		return obj;
	}
	
	
}
