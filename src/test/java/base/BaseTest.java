package base;

import io.appium.java_client.android.AndroidDriver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utils.DriverFactory;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class BaseTest {

    public AndroidDriver driver;
    public WebDriverWait wait;
    public SuiteFlow PageObj;
    public static Logger log = LogManager.getLogger(BaseTest.class);

    @BeforeClass(alwaysRun = true)
    public void setup() throws Exception {
        driver = DriverFactory.initializeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        PageObj = new SuiteFlow(driver);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public WebElement waitForVisibility(WebElement element) {
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
            element.click();
        } catch (Exception e) {
            throw new RuntimeException("Unable to click element: " + element, e);
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
    
    public String captureScreen(String tname) {

		log.debug("Capturing screenshot for test: {}", tname);
		String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());

		try {
			File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			String targetFilePath = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp
					+ ".png";

			File targetFile = new File(targetFilePath);
			sourceFile.renameTo(targetFile);

			log.info("Screenshot saved at: {}", targetFilePath);
			return targetFilePath;

		} catch (Exception e) {
			log.error("Failed to capture screenshot for test: {}", tname, e);
			return null;
		}
	}
    
    
    
    
}
