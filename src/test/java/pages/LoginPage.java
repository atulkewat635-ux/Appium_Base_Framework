package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    public LoginPage(AndroidDriver driver) {
        super(driver);
    }
    
    
    
    //private By OrangeBagImage = By.xpath("//android.view.ViewGroup[@index='2']//android.widget.ImageView[@index='0']");



	
    
    
    
    @AndroidFindBy(accessibility = "Tap to login with given credentials")
    private WebElement LoginBtn;
    
    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/nameET")
    private WebElement UsernameTxtFld;
    
    
    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/passwordET")
    private WebElement PasswordTxtFld;
    
    
    
    
    
    
    public WebElement LoginBtn() {
		return LoginBtn;
	}
    
    
    public WebElement UsernameTxtFld() {
		return UsernameTxtFld;
	}
    
    
    public WebElement PasswordTxtFld() {
		return PasswordTxtFld;
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
