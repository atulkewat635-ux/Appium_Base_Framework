package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.time.Duration;

public class BasePage {

    protected AndroidDriver driver;
    protected WebDriverWait wait;

    public BasePage(AndroidDriver driver) {
    	
    	if (driver == null) {
            throw new RuntimeException("Driver is NULL in BasePage constructor");
        }

        this.driver = driver;
        //this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)),this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

}
