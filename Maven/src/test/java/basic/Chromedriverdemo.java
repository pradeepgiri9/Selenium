package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Chromedriverdemo {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prade\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		WebDriver driver = new ChromeDriver(options);
//		driver.get("https://www.facebook.com/");
//		
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\prade\\Downloads\\edgedriver_win64\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
//		driver.get("https://www.google.com/");
		
//		System.setProperty("webdriver.firefox.driver", "C:\\Users\\prade\\Downloads\\geckodriver-v0.32.2-win-aarch64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://timesofindia.indiatimes.com/us");
		
		System.setProperty("webdriver.opera.driver", "C:\\Users\\prade\\Downloads\\operadriver_win64\\operadriver_win64\\operadriver.exe");
		WebDriver driver = new OperaDriver();
		driver.get("https://www.thehindu.com/");
	}
	
}
