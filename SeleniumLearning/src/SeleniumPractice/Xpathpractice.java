package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpathpractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\prade\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();

		List<WebElement> rowheading = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/thead"));
		for (int k = 1; k <= rowheading.size(); k++) {
			String dt1 = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/thead[" + k + "]")).getText();
			System.out.print(dt1 + " ");

			System.out.println();

		}
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr"));

		for (int i = 1; i <= rows.size(); i++) {
			String dt = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[" + i + "]/th"))
					.getText();
			System.out.print(dt + " ");

			List<WebElement> cols = driver
					.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[" + i + "]/td"));
			for (int j = 0; j < cols.size(); j++) {
				String data = cols.get(j).getText();
				System.out.print(data + " ");

			}

			System.out.println();
		}

			List<WebElement> footer = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tfoot"));
			for (int m = 1; m <= footer.size(); m++) {
				String dt2 = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tfoot[" + m + "]")).getText();
				System.out.print(dt2 + " ");
			}
			driver.quit();
		}
	}

