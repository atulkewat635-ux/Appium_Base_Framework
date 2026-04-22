package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

import org.openqa.selenium.WebElement;

public class MyCartPage extends BasePage {

    public MyCartPage(AndroidDriver driver) {
        super(driver);
    }
    
    
    
    
    //private By OrangeBagImage = By.xpath("//android.view.ViewGroup[@index='2']//android.widget.ImageView[@index='0']");



	
    
    
    
    @AndroidFindBy(accessibility = "Confirms products for checkout")
    private WebElement ProceedToCheckOutBtn;
    
    
    
    
    
    
    
    
    public WebElement ProceedToCheckOutBtn() {
		return ProceedToCheckOutBtn;
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
