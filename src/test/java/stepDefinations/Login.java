package stepDefinations;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import resources.DriverUtils;
import resources.LoginManagement;

public class Login
{
	/*
	WebDriver d;public LoginstepDefination() {// TODO Auto-generated constructor stub d = this.driver();}
	*/
	//Actual class implementation.
	
	@Given(": Admin is on login page")
	public void admin_is_on_login_page() throws IOException, InterruptedException {
	    // Navigate to login screen
		LoginManagement.LoginPage();
		
		/*
		 * ((JavascriptExecutor)DriverUtils.driver).
		 * executeScript("alert('You are on login page');"); Thread.sleep(2000);
		 * DriverUtils.driver.switchTo().alert().accept();
		 */
		
	}
	@When(": Admin enters credentials {string} {string}")
	public void admin_enters_credentials(String Username, String Password) throws IOException, InterruptedException {
	    // Enter the Username and Password
		Thread.sleep(2000);
		((JavascriptExecutor)DriverUtils.driver).
		executeScript("alert('Enter credentials...');");
	    Thread.sleep(3000);
	    DriverUtils.driver.switchTo().alert().accept();
		Thread.sleep(1000);
		DriverUtils.driver.findElement(By.xpath(DriverUtils.getloc("Login_Email"))).sendKeys(Username);
		DriverUtils.driver.findElement(By.xpath(DriverUtils.getloc("Login_Password"))).sendKeys(Password);
	}
	@Then(": Admin hit the login button")
	public void admin_hit_the_login_button() throws IOException, InterruptedException {
	    // User hit the login button
		LoginManagement.HitLoginButton();
	    
	}
	@Then(": Admin is on Dashboard")
	public void admin_is_on_dashboard() {
	    // Write code here that turns the phrase above into concrete actions
		LoginManagement.onDashboard();
	}
	

}
