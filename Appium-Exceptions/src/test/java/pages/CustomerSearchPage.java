package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Data;
import org.openqa.selenium.support.PageFactory;
import testng.AppiumTestNG;

@Data
public class CustomerSearchPage {
    public CustomerSearchPage(){
        PageFactory.initElements(new AppiumFieldDecorator(AppiumTestNG.Driver), this);
    }

    @AndroidFindBy(id = "com.appium.patika:id/search_button")
    private MobileElement searchButton;

    @AndroidFindBy(id = "com.appium.patika:id/search_src_text")
    private MobileElement searchInput;

    @AndroidFindBy(id = "android:id/text1")
    private MobileElement firstSearchItem;

    @AndroidFindBy(id = "com.appium.patika:id/idTVtext")
    private MobileElement detailCustomer;

}
