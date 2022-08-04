package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Data;
import org.openqa.selenium.support.PageFactory;
import testng.AppiumTestNG;

@Data
public class HomePage {
    public HomePage(){
        PageFactory.initElements(new AppiumFieldDecorator(AppiumTestNG.Driver), this);
    }

    @AndroidFindBy(id = "com.appium.patika:id/searchCustomerInfo")
    private MobileElement searchCustomerInfoButton; // Müşteri Arama Butonu

    @AndroidFindBy(id = "com.appium.patika:id/newCustomerInfo")
    private MobileElement newCustomerInfoButton; // Yeni Müşteri Gir Butonu

    @AndroidFindBy(id = "com.appium.patika:id/oldCustomerInfo")
    private MobileElement oldCustomerInfoButton; // Eski Müşteri Güncelle Butonu

}
