package basic;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Google {
	public static void main(String[] args) {
		
		Logger logger=Logger.getLogger("Google");
		
		// configure log4j properties file
	       PropertyConfigurator.configure("D:\\AshokRavi_WorkSpace\\Selenium_Training\\src\\resource\\Log4j.properties");
	 
	 
	        // Open browser
 
	       WebDriverManager.chromedriver().setup();
	      WebDriver driver = new ChromeDriver();
	        logger.info("Browser Opened");
	      
	        // Set implicit wait
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        logger.info("Implicit wait given");
	      
	 
	        // Load application
	        driver.get("https://www.google.co.in/");
	        logger.info("Url opened");
	      
	 
	        // type Selenium
	        driver.findElement(By.name("q")).sendKeys("Selenium");
	        logger.info("keyword type");    
	        driver.close();
	}

}