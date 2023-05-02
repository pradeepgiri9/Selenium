package JUnitPractice;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;

	public class DriverConnection {
			
		public static WebDriver connect(String url)
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\prade\\Downloads\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(options);
			driver.get(url);
			driver.manage().window().maximize();
			return driver;
		}
	}
	
