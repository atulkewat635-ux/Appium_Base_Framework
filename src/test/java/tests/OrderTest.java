package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.RetryAnalyzer;
import pages.LoginPage;
import pages.MyCartPage;
import pages.ProductsPage;
import testdata.DataProviders;
import testdata.LoginData;

public class OrderTest extends BaseTest {
	
	
	private static final Logger log = LogManager.getLogger(OrderTest.class);

    @Test(dataProvider = "loginData", dataProviderClass = DataProviders.class, retryAnalyzer = RetryAnalyzer.class)
    public void OrderProduct(LoginData Logindata) throws InterruptedException {
    	
    	
    	log.info("--- TEST STARTED ---");
    	
    	//System.out.println(data.username);
    	//System.out.println(data.password);


        
       if(waitForVisibility(PageObj.ProductPageObj.OrangeBagImage()).isDisplayed()) {
        	System.out.println("Orange bag Image is displayed");
        }
       
        
       waitFor2Seconds();
       
       click(PageObj.ProductPageObj.OrangeBagImage());
       
       log.debug("Clicking orange icon button");
        
       waitFor2Seconds();
       
       
       
       
       click(PageObj.ProductPageObj.AddToCartBtn());
       
       
       click(PageObj.ProductPageObj.ViewCartBtn());
       
       
       click(PageObj.MyCartPageObj.ProceedToCheckOutBtn());
       
       
       
       sendKeys(PageObj.LoginPageObj.UsernameTxtFld(), Logindata.username);
       
       sendKeys(PageObj.LoginPageObj.PasswordTxtFld(), Logindata.password);
       
       click(PageObj.LoginPageObj.LoginBtn());
       
    }
}
