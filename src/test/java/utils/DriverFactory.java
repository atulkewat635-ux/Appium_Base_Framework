package utils;

import io.appium.java_client.android.AndroidDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URI;
import java.nio.file.Paths;


public class DriverFactory {

    private static final Logger log = LogManager.getLogger(DriverFactory.class);
    private static final String DEFAULT_APPIUM_SERVER_URL = "http://127.0.0.1:4723";

    public static AndroidDriver initializeDriver() throws Exception {

        DesiredCapabilities caps = new DesiredCapabilities();
        String appiumServerUrl = getConfigValue("appium.server.url", "APPIUM_SERVER_URL", DEFAULT_APPIUM_SERVER_URL);

        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:automationName", "UiAutomator2");
        caps.setCapability("appium:deviceName", "emulator-5554");
        caps.setCapability("appium:platformVersion", "17");
        caps.setCapability("appium:app", Paths.get(System.getProperty("user.dir"), "src", "test", "resources", "mda-2.2.0-25.apk").toString());
        caps.setCapability("appium:appPackage", "com.saucelabs.mydemoapp.android");
        caps.setCapability("appium:appActivity", "com.saucelabs.mydemoapp.android.view.activities.SplashActivity");
        caps.setCapability("appium:noReset", false);
        caps.setCapability("appium:ignoreHiddenApiPolicyError", true);

        log.info("Starting AndroidDriver session using Appium server: {}", appiumServerUrl);
        return new AndroidDriver(URI.create(appiumServerUrl).toURL(), caps);
    }

    private static String getConfigValue(String systemProperty, String environmentVariable, String defaultValue) {
        String value = System.getProperty(systemProperty);
        if (value == null || value.trim().isEmpty()) {
            value = System.getenv(environmentVariable);
        }
        return value == null || value.trim().isEmpty() ? defaultValue : value.trim();
    }
}
