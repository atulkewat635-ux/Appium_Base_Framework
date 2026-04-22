package utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URI;


public class DriverFactory {

    public static AndroidDriver initializeDriver() throws Exception {

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:automationName", "UiAutomator2");
        caps.setCapability("appium:deviceName", "sdk_gphone16k_x86_64");
        caps.setCapability("appium:platformVersion", "13");
        caps.setCapability("appium:app", System.getProperty("user.dir") + "\\src\\test\\java\\utils\\Resources\\mda-2.2.0-25.apk");
        caps.setCapability("appium:appPackage", "com.saucelabs.mydemoapp.android");
        caps.setCapability("appium:appActivity", "com.saucelabs.mydemoapp.android.view.activities.SplashActivity");
        caps.setCapability("appium:noReset", false);
        caps.setCapability("appium:ignoreHiddenApiPolicyError", true);
        caps.setCapability("autoWebview", false);
        caps.setCapability("chromedriverExecutable",
        		System.getProperty("user.dir") +"\\src\\test\\java\\utils\\Resources\\chromedriver.exe");
        caps.setCapability("autoGrantPermissions", true);
        return new AndroidDriver(URI.create("http://127.0.0.1:4723").toURL(),caps);
    }
}