package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import testdata.DataProviders;
import testdata.LoginData;

public class ProductSortTest extends BaseTest {

    @Test(dataProvider = "loginData", dataProviderClass = DataProviders.class)
    public void WebView(LoginData Logindata) throws InterruptedException {

        System.out.println("--- TEST STARTED ---");

        waitFor2Seconds();
        click(PageObj.ProductPageObj.SortIcon());
        waitFor2Seconds();
        click(PageObj.ProductPageObj.NameDescOpt());
        waitFor2Seconds();
        //check result
        click(PageObj.ProductPageObj.SortIcon());
        click(PageObj.ProductPageObj.PriceAscOpt());
        waitFor2Seconds();
        //check result
        click(PageObj.ProductPageObj.SortIcon());
        click(PageObj.ProductPageObj.PriceDescOpt());
        waitFor2Seconds();
        // check result
        click(PageObj.ProductPageObj.SortIcon());
        click(PageObj.ProductPageObj.NameAscOpt());
        waitFor2Seconds();
        // check result
        
    }
}
