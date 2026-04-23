package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

import org.openqa.selenium.WebElement;

public class AddressPage extends BasePage {

    public AddressPage(AndroidDriver driver) {
        super(driver);
    }
    
    
    
    //private By OrangeBagImage = By.xpath("//android.view.ViewGroup[@index='2']//android.widget.ImageView[@index='0']");



	
    
    
    
    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/fullNameET")
    private WebElement FullNameTxtFld;
    
    
    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/address1ET")
    private WebElement AddressLine1TxtFld;
    
    
    
    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/address2ET")
    private WebElement AddressLine2TxtFld;
    
    
    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/cityET")
    private WebElement CityTxtFld;
    
    
    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/stateET")
    private WebElement StateTxtFld;
    
    
    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/zipET")
    private WebElement ZipCodeTxtFld;
    
    
    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/countryET")
    private WebElement CountryTxtFld;
    
    
    @AndroidFindBy(accessibility = "Saves user info for checkout")
    private WebElement ToPaymentBtn;
    
    
    
    
    
    
    public WebElement FullNameTxtFld() {
		return FullNameTxtFld;
	}
    
    public WebElement AddressLine1TxtFld() {
		return AddressLine1TxtFld;
	}
    
    public WebElement AddressLine2TxtFld() {
		return AddressLine2TxtFld;
	}
    
    public WebElement CityTxtFld() {
		return CityTxtFld;
	}
    
    public WebElement StateTxtFld() {
		return StateTxtFld;
	}
    
    
    public WebElement ZipCodeTxtFld() {
		return ZipCodeTxtFld;
	}
    
    
    public WebElement CountryTxtFld() {
		return CountryTxtFld;
	}
    
    
    public WebElement ToPaymentBtn() {
		return ToPaymentBtn;
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
