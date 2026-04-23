package pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AboutPage extends BasePage {

    public AboutPage(AndroidDriver driver) {
        super(driver);
    }
    
    // "Go to Sauce Labs website"
    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/webTV")
    private WebElement sauceLabLink;

    
    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/aboutTV")
    private WebElement aboutTitle;
    

    public void clickSauceLabLink() {
        sauceLabLink.click();
    }
    
    //verifying the aboutPage navigation
    public boolean aboutTitleValidation()
    {
    	return aboutTitle.isDisplayed();
    }
}
