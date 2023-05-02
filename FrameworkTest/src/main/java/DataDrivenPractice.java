import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.DriverConnection;



public class DataDrivenPractice {

	WebDriver driver;
	@BeforeClass
	public void openBrowser()
	{
		 driver = DriverConnection.connect("https://demoqa.com/automation-practice-form");
		
	}
	
	@Test(dataProvider = "dp")
	public void login(String Address, String phone, String Email)
	{
		
		WebElement email =  driver.findElement(By.id("userEmail"));
		email.clear();
		email.sendKeys(Email);
		WebElement mobile =  driver.findElement(By.id("userNumber"));
		mobile.clear();
		mobile.sendKeys(phone);
		WebElement address =  driver.findElement(By.id("currentAddress"));
		address.clear();
		address.sendKeys(Address);
		
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@DataProvider(name="dp")
	public Object[][] getdata()
	{
		
		ExcelReaderPractice rd = new ExcelReaderPractice("C:\\Users\\prade\\Documents\\FrameworkPracticeBook.xlsx", "Contact");
		int row = rd.getRowCount();
		int col = rd.getColCount();
		
		Object obj[][] = new Object[row-1][col];
		
		
		for(int i=1;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println(i+" "+j);
				String data = rd.getData(i, j);
				obj[i-1][j] = data;
			}
		}
		
		return obj;
	}
	
	
	
	
}
