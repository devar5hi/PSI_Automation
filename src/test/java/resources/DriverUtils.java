package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang3.ObjectUtils.Null;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverUtils {
	
	public static WebDriver driver;
	public static ChromeOptions Option;
	/*
	 * public DriverUtils() { driver = this.driver(); }
	 */
	
	public static WebDriver driver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91990\\Downloads\\chromedriver.exe");
		if(driver==null)
		{
			Option = new ChromeOptions();
			Option.addArguments("--enable-notifications");
			Option.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(Option);
		}
		return driver;
	}
	
	public static String getlink(String Key) throws IOException
	{
		Properties prop1 = new Properties();
		FileInputStream fis1 = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\resources\\platforms.properties");
		prop1.load(fis1);
		return prop1.getProperty(Key);
		
	}
	
	public static String getloc(String Key) throws IOException
	{
		Properties prop2 = new Properties();
		FileInputStream fis2 = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\resources\\locators.properties");
		prop2.load(fis2);
		return prop2.getProperty(Key);
		
	}
	
	public static String randomestring()
	  {
	    String generatedstring=RandomStringUtils.randomAlphabetic(8);
	    return(generatedstring);
	   }
	
	public static String randompassword()
	  {
	    String generatedstring=RandomStringUtils.randomAlphanumeric(8);
	    return(generatedstring);
	   }
	
	public static String randomnumber()
	  {
	    String generatedstring=RandomStringUtils.randomNumeric(5);
	    return(generatedstring);
	   }
	
	
	
	
}