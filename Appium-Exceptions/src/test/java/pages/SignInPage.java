package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Data;
import org.openqa.selenium.support.PageFactory;
import testng.AppiumTestNG;

@Data
public class SignInPage {

    public SignInPage(){
        PageFactory.initElements(new AppiumFieldDecorator(AppiumTestNG.Driver), this);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.TextView")
    private MobileElement HeaderTitle; // Appium Patika Tutorial

    @AndroidFindBy(id = "com.appium.patika:id/Title")
    private MobileElement contentTitle; // Appium Patika Tutorial

    @AndroidFindBy(id = "com.appium.patika:id/signUpPageTitle")
    private MobileElement loginTitle; // Giriş Yap

    @AndroidFindBy(id = "com.appium.patika:id/signInEmailTitle")
    private MobileElement emailTitle; // Email

    @AndroidFindBy(id = "com.appium.patika:id/signInEmailTextInput")
    private MobileElement emailInput; // Email Input

    @AndroidFindBy(id = "com.appium.patika:id/SignInPasswordTitle")
    private MobileElement passwordTitle; // Password

    @AndroidFindBy(id = "com.appium.patika:id/signInPasswordTextInput")
    private MobileElement passwordInput; // Password Input

    @AndroidFindBy(id = "com.appium.patika:id/signInButton")
    private MobileElement signInButton; // GIRIŞ YAP button

    @AndroidFindBy(id = "com.appium.patika:id/saveLoginCheckBox")
    private MobileElement saveLoginCheckBox; // Beni Hatırla

    @AndroidFindBy(id = "com.appium.patika:id/signUpBtn")
    private MobileElement signUpBtn; // SIGN UP button

    @AndroidFindBy(id = "com.appium.patika:id/signInErrorView")
    private MobileElement signInErrorView; // Hata bildirimi
}
