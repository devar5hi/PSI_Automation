package resources;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class LoginManagement {
	//static WebElement loginmsg;
	

	
	public static void LoginPage() throws IOException, InterruptedException
	{
		if(DriverUtils.driver==null) {
			DriverUtils.driver();
		}
		
	    DriverUtils.driver.navigate().to(DriverUtils.getlink("Community_Login_Page"));
	    DriverUtils.driver.manage().window().maximize();
	    ((JavascriptExecutor)DriverUtils.driver).executeScript("alert('We are on Login page....');");
	    Thread.sleep(3000);
		DriverUtils.driver.switchTo().alert().accept();
	    
		/*
		 * DriverUtils.driver.switchTo().alert().sendKeys(""); Thread.sleep(2000);
		 * DriverUtils.driver.switchTo().alert().accept();
		 */
	    Thread.sleep(1000);
	    
	    
	}
	
	public static void HitLoginButton() throws IOException, InterruptedException
	{
		Thread.sleep(1000);
	    ((JavascriptExecutor)DriverUtils.driver).executeScript("alert('Hit login button...');");
		Thread.sleep(2000);
		DriverUtils.driver.switchTo().alert().accept();
		DriverUtils.driver.findElement(By.xpath(DriverUtils.getloc("Login_Button"))).click();
	}
	
	public static void onDashboard()
	{
		try
		{
			Thread.sleep(20000);
			String url = DriverUtils.driver.getCurrentUrl();
			
			if(url.equalsIgnoreCase("https://stgappnavigator.parkstreet.com/select-client"))
			{
				((JavascriptExecutor)DriverUtils.driver).executeScript("alert('User is on Select client Page');");
			    Thread.sleep(3000);
			    DriverUtils.driver.switchTo().alert().accept();
			}
			else 
			{
				((JavascriptExecutor)DriverUtils.driver).executeScript("alert('Login Failed Due to Invalid Credentials');");
				Thread.sleep(3000);
				DriverUtils.driver.switchTo().alert().accept();
				Assert.assertTrue(false);
				//DriverUtils.driver.navigate().refresh();
			}
		}
		catch(Exception e)
		{
			System.out.print(e.getMessage());
		}
	}
	
	
	
	

}
