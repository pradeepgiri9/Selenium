package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpathpraticeform {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\prade\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//form/div[2]/div[4]/input")).sendKeys("test");
		driver.findElement(By.xpath("//form/div[2]/div[5]/input")).sendKeys("tested");
		driver.findElement(By.xpath("//form/div[2]/div[7]/input")).sendKeys("123456789");
		driver.findElement(By.xpath("//form/div[2]/div[9]/input")).sendKeys("USA");
		driver.findElement(By.xpath("//form/div[2]/div[11]/input")).sendKeys("El Paso");
		driver.findElement(By.xpath("//form/div[2]/div[13]/input")).sendKeys("tester@test.com");
		driver.findElement(By.xpath("//form/div[2]/div[15]/table/tbody/tr/td/label")).click();
		driver.findElement(By.xpath("//form/div[2]/div[17]/table/tbody/tr/td/label")).click();
		driver.findElement(By.xpath("//form/div[2]/div[17]/table/tbody/tr[7]/td/label")).click();
		driver.findElement(By.xpath("//form/div[2]/div[19]/select/option[3]")).click();
		driver.findElement(By.xpath("//form/div[2]/div[21]/div/input")).sendKeys("C:\\Users\\prade\\Pictures\\IMGP2080.JPG");
		
	}
	
}
