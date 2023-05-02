package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.DriverConnection;

public class DragAndDropPractice {

	public static void main(String[] args) {
	
		WebDriver driver = DriverConnection.connect("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement Amount = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]"));
		WebElement Account = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ol[1]/li[1]"));
		
	
		Actions builder = new Actions(driver);
		
		builder.clickAndHold(Amount)
		.moveToElement(Account)
		.release().build().perform();
		
		
		

	}

	
	}


