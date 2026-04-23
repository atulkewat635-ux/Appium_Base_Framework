package base;

import io.appium.java_client.android.AndroidDriver;
import pages.AboutPage;
import pages.LoginPage;
import pages.MenuPage;
import pages.MyCartPage;
import pages.ProductsPage;
import pages.SauceLabsWebViewPage;
import pages.WebViewPage;

public class SuiteFlow {
	
	public MyCartPage MyCartPageObj;
    public ProductsPage ProductPageObj;
    public LoginPage LoginPageObj;
    public AboutPage AboutPageObj;
    public MenuPage MenuPageObj;
    public SauceLabsWebViewPage SauceLabsWebViewPageObj;
    public WebViewPage WebViewObj;
    
    public SuiteFlow(AndroidDriver driver) {
    	MyCartPageObj = new MyCartPage(driver);
    	ProductPageObj = new ProductsPage(driver);
    	LoginPageObj = new LoginPage(driver);
    	AboutPageObj = new AboutPage(driver);
    	MenuPageObj =  new MenuPage(driver);
    	SauceLabsWebViewPageObj = new SauceLabsWebViewPage(driver);
        WebViewObj = new WebViewPage(driver);
    }
	/*
	public MyCartPage MyCartPageObj = new MyCartPage(driver);
	public ProductsPage ProductPageObj = new ProductsPage(driver);
	public LoginPage LoginPageObj = new LoginPage(driver);*/
	

}
