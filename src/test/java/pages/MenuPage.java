package pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MenuPage extends BasePage {

    public MenuPage(AndroidDriver driver) {
        super(driver);
    }
    
    // Hamburger menu
    @AndroidFindBy(accessibility = "View menu")
    private WebElement menuIcon;

    // About option
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.saucelabs.mydemoapp.android:id/itemTV' and @text='About']")
    private WebElement aboutOption;

    public void openMenu() {
        menuIcon.click();
    }

    public void clickAbout() {
        aboutOption.click();
    }
}
