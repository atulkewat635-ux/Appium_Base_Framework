package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

import org.openqa.selenium.WebElement;

public class ProductsPage extends BasePage {

    public ProductsPage(AndroidDriver driver) {
        super(driver);
    }
    
    
    
    //private By OrangeBagImage = By.xpath("//android.view.ViewGroup[@index='2']//android.widget.ImageView[@index='0']");



	
    
    
    
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@index='2']//android.widget.ImageView[@index='0']")
    private WebElement OrangeBagImage;
    
    @AndroidFindBy(accessibility  = "Tap to add product to cart")
    private WebElement AddToCartBtn;
    
    
    @AndroidFindBy(accessibility  = "View cart")
    private WebElement ViewCartBtn;
    
    // sorting locators
    @AndroidFindBy(id  = "com.saucelabs.mydemoapp.android:id/sortIV")
    private WebElement SortIcon;
    @AndroidFindBy(xpath  = "//android.widget.TextView[@text=\"Name - Descending\"]")
    private WebElement NameDescOpt;
    @AndroidFindBy(xpath  = "//android.widget.TextView[@text=\"Price - Ascending\"]")
    private WebElement PriceAscOpt;
    @AndroidFindBy(xpath  = "//android.widget.TextView[@text=\"Price - Descending\"]")
    private WebElement PriceDescOpt;
    @AndroidFindBy(xpath  = "//android.widget.TextView[@text=\"Name - Ascending\"]")
    private WebElement NameAscOpt;
    @AndroidFindBy(xpath  = "//android.widget.TextView[@content-desc=\"Product Title\" and @text=\"Test.allTheThings() T-Shirt (yellow)\"]")
    private WebElement NameDescResult;
    @AndroidFindBy(accessibility  = "//android.widget.TextView[@content-desc=\"Product Price\" and @text=\"$ 7.99\"]")
    private WebElement PriceAscResult;
    @AndroidFindBy(accessibility  = "(//android.widget.TextView[@content-desc=\"Product Price\"])[1]")
    private WebElement PriceDescRes;
    @AndroidFindBy(accessibility  = "//android.widget.TextView[@content-desc=\"Product Title\" and @text=\"Sauce Labs Backpack\"]")
    private WebElement NameAscRes;
    
    
    
    
    
    
    public WebElement OrangeBagImage() {
		return OrangeBagImage;
	}
    
    
    public WebElement AddToCartBtn() {
		return AddToCartBtn;
	}
    
    
    public WebElement ViewCartBtn() {
		return ViewCartBtn;
	}
    
    public WebElement SortIcon() {
		return SortIcon;
	}
    
    
    public WebElement NameDescOpt() {
		return NameDescOpt;
	}
    
    
    public WebElement PriceAscOpt() {
		return PriceAscOpt;
	}
    public WebElement PriceDescOpt() {
 		return PriceDescOpt;
 	}
     
     
     public WebElement NameAscOpt() {
 		return NameAscOpt;
 	}
     
     
     public WebElement NameDescResult() {
 		return NameDescResult;
 	}
     public WebElement PriceAscResult() {
  		return PriceAscResult;
  	}
      
      
     public WebElement PriceDescRes() {
  		return PriceDescRes;
  	}
     public WebElement NameAscRes() {
   		return NameAscRes;
   	}
    
    
    
    /*

    private By username = By.id("com.sportstechbrands.sportstechlive:id/tv_user_name");

    public boolean isHomePageDisplayed() {
        return isDisplayed(logo) || isDisplayed(username);
    }

    public String getWelcomeText() {
        return getText(username);
    }*/
}
