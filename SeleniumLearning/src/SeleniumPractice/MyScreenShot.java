package SeleniumPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class MyScreenShot {
	public static void screenShot(WebDriver driver,String path)
	{
		TakesScreenshot ts  =(TakesScreenshot) driver;
		File source =  ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		try {
			//FileUtils.copyFile(source, dest);
			Files.copy(source, dest);
			System.out.println("Screenshot taken");
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
}
