package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import testdata.DataProviders;
import testdata.LoginData;

public class WebViewTest extends BaseTest {

    @Test(dataProvider = "loginData", dataProviderClass = DataProviders.class)
    public void WebView(LoginData Logindata) throws InterruptedException {

        System.out.println("--- TEST STARTED ---");

        waitFor2Seconds();
        click(PageObj.WebViewObj.menuButton());
        waitFor2Seconds();
        click(PageObj.WebViewObj.webViewMenuItem());
        waitFor2Seconds();
        sendKeys(PageObj.WebViewObj.urlTextBox(),"www.youtube.com");
        waitFor2Seconds();
        click(PageObj.WebViewObj.goToSiteButton());
    }
}
