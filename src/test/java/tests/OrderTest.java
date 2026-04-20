package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MyCartPage;
import pages.ProductsPage;
import testdata.DataProviders;
import testdata.LoginData;

public class OrderTest extends BaseTest {
	
	

    @Test(dataProvider = "loginData", dataProviderClass = DataProviders.class)
    public void OrderProduct(LoginData Logindata) throws InterruptedException {
    	
    	
    	
    	
    	//System.out.println(data.username);
    	//System.out.println(data.password);


        System.out.println("--- TEST STARTED ---");
        
       if(PageObj.ProductPageObj.OrangeBagImage().isDisplayed()) {
        	System.out.println("Orange bag Image is displayed");
        }
       
        
       waitFor2Seconds();
       
       click(PageObj.ProductPageObj.OrangeBagImage());
        
       waitFor2Seconds();
       
       
       
       
       click(PageObj.ProductPageObj.AddToCartBtn());
       
       
       click(PageObj.ProductPageObj.ViewCartBtn());
       
       
       click(PageObj.MyCartPageObj.ProceedToCheckOutBtn());
       
       
       
       sendKeys(PageObj.LoginPageObj.UsernameTxtFld(), Logindata.username);
       
       sendKeys(PageObj.LoginPageObj.PasswordTxtFld(), Logindata.password);
       
       click(PageObj.LoginPageObj.LoginBtn());
       
    }
}