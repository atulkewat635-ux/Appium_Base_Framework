package base;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import utils.DriverFactory;

import java.time.Duration;

public class BaseTest {

    public AndroidDriver driver;
    public WebDriverWait wait;
    public SuiteFlow PageObj;
    
    


    @BeforeSuite
    public void setup() throws Exception {
        driver = DriverFactory.initializeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @AfterSuite
    public void tearDown() {
        if (driver != null) {
           // driver.quit();
        }
    }
    
    @BeforeClass
  	public void beforeMethod() {
    PageObj = new SuiteFlow(driver);}
    
    public WebElement waitForVisibility(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(15));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
    
    
    
    public void sendKeys(WebElement element, String text) {

        try {
        	waitForVisibility(element);
            element.clear();
            element.sendKeys(text);
        } catch (Exception e) {
            throw new RuntimeException("Unable to send keys to element: " + element, e);
        }
    }
    
    public void click(WebElement element) {
    	try {
    	waitForVisibility(element);
        element.click();}
    	
    	catch (Exception e) {
    		System.out.println("Element not clicked" + e);
    	}
    }
    
    public void waitFor2Seconds() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // restore interrupt status
            throw new RuntimeException("Thread sleep interrupted", e);
        }
    }
    
    
    public void waitFor5Seconds() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // restore interrupt status
            throw new RuntimeException("Thread sleep interrupted", e);
        }
    }
    
    
    public void waitFor10Seconds() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // restore interrupt status
            throw new RuntimeException("Thread sleep interrupted", e);
        }
    }
    
    
    
    
    
    
}