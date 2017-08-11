package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	public WebDriver driver;
	
  @Test
  public void openMyBlog() {
	System.out.println("Welcome to Software Testing Material Website - First Message");
	driver.get("http://www.softwaretestingmaterial.com/");
	System.out.println("Welcome to Software Testing Material Website - Second Message");
  }
  
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\java\\drivers\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}