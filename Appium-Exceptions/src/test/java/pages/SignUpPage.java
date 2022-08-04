package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Data;
import org.openqa.selenium.support.PageFactory;
import testng.AppiumTestNG;

@Data
public class SignUpPage {
    public SignUpPage(){
        PageFactory.initElements(new AppiumFieldDecorator(AppiumTestNG.Driver), this);
    }

    @AndroidFindBy(id = "com.appium.patika:id/username")
    private MobileElement username;

    @AndroidFindBy(id = "com.appium.patika:id/password1")
    private MobileElement password;

    @AndroidFindBy(id = "com.appium.patika:id/sign")
    private MobileElement signUp;

    @AndroidFindBy(id = "com.appium.patika:id/signin")
    private MobileElement signIn;

}
