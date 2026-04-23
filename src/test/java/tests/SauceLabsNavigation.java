package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import dev.failsafe.internal.util.Assert;
import pages.AboutPage;
import pages.MenuPage;
import pages.SauceLabsWebViewPage;

public class SauceLabsNavigation extends BaseTest {

    @Test
    public void verifySauceLabsNavigation() throws InterruptedException {

        MenuPage menuPage = new MenuPage(driver);
        AboutPage aboutPage = new AboutPage(driver);
        SauceLabsWebViewPage webViewPage = new SauceLabsWebViewPage(driver);

        // Step 1: Open menu
        menuPage.openMenu();

        // Step 2: Click About
        menuPage.clickAbout();

        // Step 3: Click Sauce Labs link
        aboutPage.clickSauceLabLink();

        Thread.sleep(2000); // better replace with wait
        
        // Step 4: Switch & Validate
        boolean switched = webViewPage.switchToWebView();
        org.testng.Assert.assertTrue(switched, "WebView not found");

        org.testng.Assert.assertTrue(webViewPage.isSauceLabsLoaded(),
                "Sauce Labs page not loaded");
        
        // Step 5: Navigate back from WebView / browser to APP
        webViewPage.switchBackToApp();

        //Step 6: validate App Navigation from Browser
        Thread.sleep(2000);
        org.testng.Assert.assertTrue(aboutPage.aboutTitleValidation(), "Not navigated back to About page");
    }


}
