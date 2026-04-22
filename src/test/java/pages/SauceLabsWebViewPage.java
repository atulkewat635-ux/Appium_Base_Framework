package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import java.util.Set;


public class SauceLabsWebViewPage extends BasePage {

    public SauceLabsWebViewPage(AndroidDriver driver) {
        super(driver);
    }

    public boolean switchToWebView() {

        Set<String> contexts = driver.getContextHandles();

        for (String context : contexts) {
            if (context.contains("WEBVIEW")) {
                driver.context(context);
                return true;
            }
        }
        return false;
    }

    public boolean isSauceLabsLoaded() {
        return driver.getCurrentUrl().contains("saucelabs");
    }
    
    public void switchBackToApp() {
    	driver.pressKey(new KeyEvent(AndroidKey.BACK));
    	driver.context("NATIVE_APP");
    }

}
