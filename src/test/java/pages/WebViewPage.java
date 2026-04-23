package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

import org.openqa.selenium.WebElement;

public class WebViewPage extends BasePage {

    public WebViewPage(AndroidDriver driver) {
        super(driver);
    }


   @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/menuIV" )
   private WebElement menuButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/itemTV\" and @text=\"WebView\"]" )
    private WebElement webViewMenuItem;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/urlET" )
    private WebElement urlTextBox;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/goBtn" )
    private WebElement goToSiteButton;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/webView" )
    private WebElement webView;

    public WebElement menuButton() {
        return menuButton;
    }

    public WebElement webViewMenuItem() {
        return webViewMenuItem;
    }

    public WebElement urlTextBox() {
        return urlTextBox;
    }

    public WebElement goToSiteButton() {
        return goToSiteButton;
    }

    public WebElement webView() {
        return webView;
    }


}
