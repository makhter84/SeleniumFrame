package mytest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstProgram {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		//System.setProperty(null, null)
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Test
	public void verifyTitle() {
		String strTitle = driver.getTitle();
		Assert.assertEquals(strTitle, "Google");
	}

	@Test
	public void verifyTitle1() {
		String strTitle = driver.getTitle();
		Assert.assertEquals(strTitle, "Google");
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
