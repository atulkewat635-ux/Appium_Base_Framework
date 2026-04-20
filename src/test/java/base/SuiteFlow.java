package base;

import io.appium.java_client.android.AndroidDriver;
import pages.LoginPage;
import pages.MyCartPage;
import pages.ProductsPage;

public class SuiteFlow {
	
	public MyCartPage MyCartPageObj;
    public ProductsPage ProductPageObj;
    public LoginPage LoginPageObj;
    

    public SuiteFlow(AndroidDriver driver) {
    	MyCartPageObj = new MyCartPage(driver);
    	ProductPageObj = new ProductsPage(driver);
    	LoginPageObj = new LoginPage(driver);
    }
	/*
	public MyCartPage MyCartPageObj = new MyCartPage(driver);
	public ProductsPage ProductPageObj = new ProductsPage(driver);
	public LoginPage LoginPageObj = new LoginPage(driver);*/
	

}
