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
    
    
    
    
    
    
    public WebElement OrangeBagImage() {
		return OrangeBagImage;
	}
    
    
    public WebElement AddToCartBtn() {
		return AddToCartBtn;
	}
    
    
    public WebElement ViewCartBtn() {
		return ViewCartBtn;
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
