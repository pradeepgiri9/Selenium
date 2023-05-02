package SeleniumPractice;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	import utility.DriverConnection;

	public class StudentPracticeForm {
		public static void main(String[] args) {
			
			
			WebDriver driver = DriverConnection.connect("https://demoqa.com/automation-practice-form");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			//js.executeScript("window.scrollBy(0,200)");

			driver.findElement(By.id("firstName")).sendKeys("test");
			driver.findElement(By.id("lastName")).sendKeys("test");
			driver.findElement(By.id("userEmail")).sendKeys("test@gmail.com");
			driver.findElement(By.xpath("//*[@for='gender-radio-1']")).click();
			driver.findElement(By.id("userNumber")).sendKeys("9563524152");
			driver.findElement(By.id("dateOfBirthInput")).click();
			
			
			String myYear = "2005";
			String myMonth = "June";
			String myDate = "29";
			
			
			
			WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
			Select months = new Select(month);
			months.selectByVisibleText(myMonth);
			
			WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
			Select years = new Select(year);
			years.selectByVisibleText(myYear);
			
			List<WebElement> dates = driver.findElements(By.xpath("//div[@class='react-datepicker__week']/div"));
			
			for(WebElement date : dates)
			{
				if(date.getText().equals(myDate))
				{
					if(date.getAttribute("aria-label").contains(myMonth))
					{
						date.click();
						break;
					}
				}
			}
			
			
			WebElement subject = driver.findElement(By.id("subjectsContainer"));
			
			Actions builder = new Actions(driver);
			builder.click(subject)
					.sendKeys("Maths")
					.sendKeys(Keys.ARROW_DOWN)
					.sendKeys(Keys.ENTER)
					.sendKeys("Chemistry")
					.sendKeys(Keys.ARROW_DOWN)
					.sendKeys(Keys.ENTER)
					.build()
					.perform();
			
			
			driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
			
			driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\prade\\Pictures\\IMGP2062.JPG");
			
			
			driver.findElement(By.id("currentAddress")).sendKeys("Agra,UP");
			WebElement state = driver.findElement(By.id("state"));
			
			
			builder.click(state)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ENTER)
			.build()
			.perform();
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.quit();
			
		
			
		}
			
		}
	

