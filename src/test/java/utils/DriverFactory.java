package utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URI;


public class DriverFactory {

    public static AndroidDriver initializeDriver() throws Exception {

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:automationName", "UiAutomator2");
        caps.setCapability("appium:deviceName", "Redmi Note 7 Pro");
        caps.setCapability("appium:platformVersion", "10");
        //caps.setCapability("appium:app", "C:\\Users\\atulkewat\\Downloads\\mda-2.2.0-25.apk\\mda-2.2.0-25.apk");
        caps.setCapability("appium:appPackage", "com.saucelabs.mydemoapp.android");
        caps.setCapability("appium:appActivity", "com.saucelabs.mydemoapp.android.view.activities.SplashActivity");
        caps.setCapability("appium:noReset", false);
        caps.setCapability("appium:ignoreHiddenApiPolicyError", true);
        return new AndroidDriver(URI.create("http://127.0.0.1:4723").toURL(),caps);
        // dummy test
    }
}