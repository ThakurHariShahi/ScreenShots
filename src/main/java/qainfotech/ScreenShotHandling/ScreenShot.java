package qainfotech.ScreenShotHandling;
import java.io.File;
import java.io.IOException;

import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ScreenShot 
{
//	@Test
//	public  void captureScreenMethod() throws Exception{
//	System.setProperty("webdriver.gecko.driver","D://geckodriver.exe");
//	WebDriver driver = new FirefoxDriver();
//	driver.manage().window().maximize();
//	driver.get("https://www.softwaretestingmaterial.com/capture-screenshot-using-selenium-webdriver");
//	File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	FileUtils.copyFile(screenshotFile, new File("D:\\SoftwareTestingMaterial.png"));
//	driver.close();
//	driver.quit(); 
//	}
	 
	@Test
	public void fileHandlerTest() throws WebDriverException, IOException {
	            //Initialize webdriver	    
	            System.setProperty("webdriver.chrome.driver","C:\\Selenium Project\\Drivers\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    // To open Softwaretestingmaterial.com site
	            driver.get("https://www.softwaretestingmaterial.com/");
	            // Following code captures the screenshot and place it in specified location
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File("C:\\Selenium Project\\CaptureScreenshot.png"));
	    driver.quit();
	}



}
