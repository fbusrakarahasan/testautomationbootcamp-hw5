package testng;

import devices.DeviceFarm;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import jdk.jfr.Description;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CustomerSearchPage;
import pages.HomePage;
import pages.SignInPage;
import pages.SignUpPage;
import utility.DeviceFarmUtility;

import javax.net.ssl.SSLException;
import java.io.File;
import java.net.URL;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class AppiumTestNG {

    public static AppiumDriver<?> Driver;
    SignInPage signInPage;
    SignUpPage signUpPage;
    HomePage homePage;
    CustomerSearchPage customerSearchPage;
    String nougat;
    DesiredCapabilities capabilities;

    public AppiumTestNG() {
        nougat = DeviceFarm.ANDROID_NOUGAT.path;
    }

    @BeforeClass
    public void setup() throws SSLException {
        try {
            capabilities = new DesiredCapabilities();
            capabilities = DeviceFarmUtility.pathToDesiredCapabilitites(this.nougat); // Json olarak emulatorun bilgileri verilir.
            capabilities.setCapability("app", new File("src/test/resources/apps/patikaappium.apk").getAbsolutePath()); // Uygulama apk yolu
            Driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // Elementleri bulunana kadar 30sn bekler aksi takdirde timeout verir.

            signInPage = new SignInPage();
            signUpPage = new SignUpPage();
            homePage = new HomePage();
            customerSearchPage = new CustomerSearchPage();
        } catch (Exception e) {
            throw new SSLException("Remote URL'de SSL bulunmuyor ya da appium server başlatılmadı. Kontrol ediniz. Hata kodu: \n\n" + e.getMessage());
        }
    }

    @Test(priority = 0)
    @Description("Üst başlık alanının metin testi")
    public void CheckPageTitle() throws NullPointerException {
        try {
            Assert.assertEquals(signInPage.getHeaderTitle().getText(), "Appium Patika Tutorial"); // Üst Başlık doğru mu?
        } catch (NoSuchElementException e) {
            System.out.println("Element bulunamadı. Konumlandırıcınız hatalı olabilir. Kontrol ediniz. \n\nHata kodu:\n " + e.getMessage());
        } catch (ElementNotVisibleException e) {
            System.out.println("Element görünür değil. Konumlandırıcınız hatalı olabilir. Kontrol ediniz. \n\nHata kodu:\n " + e.getMessage());
        }
    }

    @Test(priority = 1)
    @Description("İçerik başlık alanının metin testi")
    public void CheckContentTitle() throws NullPointerException {
        try {
            Assert.assertEquals(signInPage.getContentTitle().getText(), "Appium Patika Tutorial"); // İçerik başlığı doğru mu?
        } catch (NoSuchElementException e) {
            System.out.println("Element bulunamadı. Konumlandırıcınız hatalı olabilir. Kontrol ediniz. \n\nHata kodu:\n " + e.getMessage());
        } catch (ElementNotVisibleException e) {
            System.out.println("Element görünür değil. Konumlandırıcınız hatalı olabilir. Kontrol ediniz. \n\nHata kodu:\n " + e.getMessage());
        }
    }

    @Test(priority = 2)
    @Description("Giriş yap başlık alanının metin testi")
    public void CheckLoginLabel() throws NullPointerException {
        try {
            Assert.assertEquals(signInPage.getLoginTitle().getText(), "Giriş Yap"); // Giriş Yap alanının labeli doğru mu?
        } catch (NoSuchElementException e) {
            System.out.println("Element bulunamadı. Konumlandırıcınız hatalı olabilir. Kontrol ediniz. \n\nHata kodu:\n " + e.getMessage());
        } catch (ElementNotVisibleException e) {
            System.out.println("Element görünür değil. Konumlandırıcınız hatalı olabilir. Kontrol ediniz. \n\nHata kodu:\n " + e.getMessage());
        }
    }

    @Test(priority = 3)
    @Description("Email başlık alanının metin testi")
    public void CheckEmailLabel() throws NullPointerException {
        try {
            Assert.assertEquals(signInPage.getEmailTitle().getText(), "Email"); // Email alanının labeli doğru mu?
        } catch (NoSuchElementException e) {
            System.out.println("Element bulunamadı. Konumlandırıcınız hatalı olabilir. Kontrol ediniz. \n\nHata kodu:\n " + e.getMessage());
        } catch (ElementNotVisibleException e) {
            System.out.println("Element görünür değil. Konumlandırıcınız hatalı olabilir. Kontrol ediniz. \n\nHata kodu:\n " + e.getMessage());
        }
    }

    @Test(priority = 4)
    @Description("Şifre başlık alanının metin testi")
    public void CheckPasswordLabel() throws NullPointerException {
        try {
            Assert.assertEquals(signInPage.getPasswordTitle().getText(), "Password"); // Şifre alanının labeli doğru mu?
        } catch (NoSuchElementException e) {
            System.out.println("Element bulunamadı. Konumlandırıcınız hatalı olabilir. Kontrol ediniz. \n\nHata kodu:\n " + e.getMessage());
        } catch (ElementNotVisibleException e) {
            System.out.println("Element görünür değil. Konumlandırıcınız hatalı olabilir. Kontrol ediniz. \n\nHata kodu:\n " + e.getMessage());
        }
    }

    @Test(priority = 5)
    @Description("Giriş Yap butonunun metin testi")
    public void CheckSignInButtonText() throws NullPointerException {
        try {
            Assert.assertEquals(signInPage.getSignInButton().getText(), "GIRIŞ YAP"); // Giriş Yap butonunun metni doğru geldi mi?
        } catch (NoSuchElementException e) {
            System.out.println("Element bulunamadı. Konumlandırıcınız hatalı olabilir. Kontrol ediniz. \n\nHata kodu:\n " + e.getMessage());
        } catch (ElementNotVisibleException e) {
            System.out.println("Element görünür değil. Konumlandırıcınız hatalı olabilir. Kontrol ediniz. \n\nHata kodu:\n " + e.getMessage());
        }
    }

    @Test(priority = 6)
    @Description("Beni hatırla alanının metin testi")
    public void CheckSaveLoginCheckBoxText() throws NullPointerException {
        try {
            Assert.assertEquals(signInPage.getSaveLoginCheckBox().getText(), "Beni Hatırla"); // Beni hatırla alanının metni doğru geldi mi?
        } catch (NoSuchElementException e) {
            System.out.println("Element bulunamadı. Konumlandırıcınız hatalı olabilir. Kontrol ediniz. \n\nHata kodu:\n " + e.getMessage());
        } catch (ElementNotVisibleException e) {
            System.out.println("Element görünür değil. Konumlandırıcınız hatalı olabilir. Kontrol ediniz. \n\nHata kodu:\n " + e.getMessage());
        }
    }

    @Test(priority = 7)
    @Description("Beni hatırla alanının işaretli olma testi")
    public void CheckSaveLoginCheckBoxChecked() throws NullPointerException {
        try {
            signInPage.getSaveLoginCheckBox().click(); // Beni hatırla alanına tıklanır.
            Assert.assertEquals(signInPage.getSaveLoginCheckBox().getAttribute("checked"), "true"); // Beni hatırla alanının kutusu doldu mu?
        } catch (NoSuchElementException e) {
            System.out.println("Element bulunamadı. Konumlandırıcınız hatalı olabilir. Kontrol ediniz. \n\nHata kodu:\n " + e.getMessage());
        } catch (ElementNotVisibleException e) {
            System.out.println("Element görünür değil. Konumlandırıcınız hatalı olabilir. Kontrol ediniz. \n\nHata kodu:\n " + e.getMessage());
        }
    }

    @Test(priority = 8)
    @Description("Kayıt olma buton metin testi")
    public void CheckSignUpButtonText() throws NullPointerException {
        try {
            Assert.assertEquals(signInPage.getSignUpBtn().getText(), "SIGN UP"); // Kayıt olma butonunun metni "SIGN UP" mı?
        } catch (NoSuchElementException e) {
            System.out.println("Element bulunamadı. Konumlandırıcınız hatalı olabilir. Kontrol ediniz. \n\nHata kodu:\n " + e.getMessage());
        } catch (ElementNotVisibleException e) {
            System.out.println("Element görünür değil. Konumlandırıcınız hatalı olabilir. Kontrol ediniz. \n\nHata kodu:\n " + e.getMessage());
        }
    }

    @Test(priority = 9)
    @Description("Boş email alanı testi")
    public void BlankEmailFieldTest() throws NullPointerException {
        try {
            signInPage.getSignInButton().click(); // Herhangi veri girişi olmadan giriş yap butonuna tıklanır.

            Assert.assertEquals(signInPage.getSignInErrorView().getText(), "Email boş olamaz"); // Boş email uyarısı geldi mi?
        } catch (NoSuchElementException e) {
            System.out.println("Element bulunamadı. Konumlandırıcınız hatalı olabilir. Kontrol ediniz. \n\nHata kodu:\n " + e.getMessage());
        } catch (ElementNotVisibleException e) {
            System.out.println("Element görünür değil. Konumlandırıcınız hatalı olabilir. Kontrol ediniz. \n\nHata kodu:\n " + e.getMessage());
        }
    }

    @Test(priority = 10)
    @Description("Boş şifre alanı testi")
    public void BlankPasswordFieldTest() throws NullPointerException {
        try {
            signInPage.getEmailInput().sendKeys("fbusra@gmail.com"); // Email alanı doldurulur.
            signInPage.getSignInButton().click(); // Giriş Yap butonuna tıklanır.

            Assert.assertEquals(signInPage.getSignInErrorView().getText(), "Password cant be empty"); // Boş şifre uyarısı geldi mi?
        } catch (NoSuchElementException e) {
            System.out.println("Element bulunamadı. Konumlandırıcınız hatalı olabilir. Kontrol ediniz. \n\nHata kodu:\n " + e.getMessage());
        } catch (ElementNotVisibleException e) {
            System.out.println("Element görünür değil. Konumlandırıcınız hatalı olabilir. Kontrol ediniz. \n\nHata kodu:\n " + e.getMessage());
        }
    }

    @Test(priority = 11)
    @Description("Hatalı email format testi")
    public void BadEmailFormatTest() throws NullPointerException {
        try {
            signInPage.getEmailInput().sendKeys("test"); // Email alanı doldurulur.
            signInPage.getPasswordInput().sendKeys("password"); // Password alanı doldurulur.
            signInPage.getSignInButton().click(); // Giriş Yap butonuna tıklanır.

            Assert.assertEquals(signInPage.getSignInErrorView().getText(), "The email address is badly formatted."); // Hatalı email format uyarısı geldi mi?
        } catch (NoSuchElementException e) {
            System.out.println("Element bulunamadı. Konumlandırıcınız hatalı olabilir. Kontrol ediniz. \n\nHata kodu:\n " + e.getMessage());
        } catch (ElementNotVisibleException e) {
            System.out.println("Element görünür değil. Konumlandırıcınız hatalı olabilir. Kontrol ediniz. \n\nHata kodu:\n " + e.getMessage());
        }
    }

    @Test(priority = 12)
    @Description("Hatalı mail ve şifre testi")
    public void LoginWithWrongEmailAndPassword() throws NullPointerException {
        try {
            signInPage.getEmailInput().sendKeys("fbusrawrong@gmail.com"); // Email alanı doldurulur.
            signInPage.getPasswordInput().sendKeys("enuygun");  // Password alanı doldurulur.
            signInPage.getSignInButton().click(); // Giriş Yap butonuna tıklanır.

            Assert.assertEquals(signInPage.getSignInErrorView().getText(), "There is no user record corresponding to this identifier. The user may have been deleted."); // Hatalı mail ve şifre uyarısı geldi mi?
        } catch (NoSuchElementException e) {
            System.out.println("Element bulunamadı. Konumlandırıcınız hatalı olabilir. Kontrol ediniz. \n\nHata kodu:\n " + e.getMessage());
        } catch (ElementNotVisibleException e) {
            System.out.println("Element görünür değil. Konumlandırıcınız hatalı olabilir. Kontrol ediniz. \n\nHata kodu:\n " + e.getMessage());
        }
    }

    @Test(priority = 13)
    @Description("Hatalı şifre testi")
    public void LoginWithWrongPassword() throws NullPointerException {
        try {
            signInPage.getEmailInput().sendKeys("fbusra@gmail.com");  // Email alanı doldurulur.
            signInPage.getPasswordInput().sendKeys("enuygun");  // Password alanı doldurulur.
            signInPage.getSignInButton().click(); // Giriş Yap butonuna tıklanır.

            Assert.assertEquals(signInPage.getSignInErrorView().getText(), "The password is invalid or the user does not have a password."); // Hatalı şifre uyarısı geldi mi?
        } catch (NoSuchElementException e) {
            System.out.println("Element bulunamadı. Konumlandırıcınız hatalı olabilir. Kontrol ediniz. \n\nHata kodu:\n " + e.getMessage());
        } catch (ElementNotVisibleException e) {
            System.out.println("Element görünür değil. Konumlandırıcınız hatalı olabilir. Kontrol ediniz. \n\nHata kodu:\n " + e.getMessage());
        }
    }

    @Test(priority = 14)
    @Description("Kayıt Ol sayfasındaki Giriş Yap butonunun Login sayfasına götürdüğünün testi")
    public void CheckSignUpPageSignInButton() throws NullPointerException {
        try {
            signInPage.getSignUpBtn().click(); // SignUp butonuna tıklanır.
            signUpPage.getSignIn().click(); // SignIn butonuna tıklanır. (Geri sayfaya önlendiriyor mu? diye kontrol etmek için)

            Assert.assertEquals(signInPage.getContentTitle().getText(), "Appium Patika Tutorial"); // İçerik başlığı doğru geldi mi?
        } catch (NoSuchElementException e) {
            System.out.println("Element bulunamadı. Konumlandırıcınız hatalı olabilir. Kontrol ediniz. \n\nHata kodu:\n " + e.getMessage());
        } catch (ElementNotVisibleException e) {
            System.out.println("Element görünür değil. Konumlandırıcınız hatalı olabilir. Kontrol ediniz. \n\nHata kodu:\n " + e.getMessage());
        }
    }

    @Test(priority = 15)
    @Description("Başarılı Giriş Testi")
    public void CheckSuccessfulLogin() throws NullPointerException {
        try {
            signInPage.getEmailInput().sendKeys("fbusra@gmail.com");  // Email alanı doldurulur.
            signInPage.getPasswordInput().sendKeys("enuygun123"); // Password alanı doldurulur.
            signInPage.getSignInButton().click(); // Giriş Yap butonuna tıklanır.

            Assert.assertTrue(homePage.getSearchCustomerInfoButton().isDisplayed()); // Müşteri Arama butonu görüntülendi mi?
        } catch (NoSuchElementException e) {
            System.out.println("Element bulunamadı. Konumlandırıcınız hatalı olabilir. Kontrol ediniz. \n\nHata kodu:\n " + e.getMessage());
        } catch (ElementNotVisibleException e) {
            System.out.println("Element görünür değil. Konumlandırıcınız hatalı olabilir. Kontrol ediniz. \n\nHata kodu:\n " + e.getMessage());
        }
    }

    @Test(priority = 16)
    @Description("Başarılı Müşteri Arama Testi [Giriş yapılır ve Müşteri araması yapılır]")
    public void CheckSuccessfulCustomerSearch() throws NullPointerException, InterruptedException {
        try {
            signInPage.getEmailInput().sendKeys("fbusra@gmail.com");  // Email alanı doldurulur.
            signInPage.getPasswordInput().sendKeys("enuygun123"); // Password alanı doldurulur.
            signInPage.getSignInButton().click(); // Giriş Yap butonuna tıklanır.

            Thread.sleep(1000);
            homePage.getSearchCustomerInfoButton().click(); // Müşteri Arama butonuna tıklanır.
            customerSearchPage.getSearchButton().click(); // Arama alanına tıklanır.
            customerSearchPage.getSearchInput().sendKeys("905419384520"); // Arama kutusuna veri yazılır
            customerSearchPage.getFirstSearchItem().click(); // İlk çıkan veri seçilir

            // Gelen verinin içeriği doğru mu? diye kontrol edilir.
            Assert.assertEquals(customerSearchPage.getDetailCustomer().getText(), "  addr: updated\n" +
                    "  teslimat: 31-Jul-2022\n" +
                    "  alma tarihi: 31-Jul-2022\n" +
                    "  takip numarası: 14206\n" +
                    "  tel no: 905419384520\n" +
                    "  adet: 2\n" +
                    "  isim soyisim: hasan\n");
        } catch (NoSuchElementException e) {
            System.out.println("Element bulunamadı. Konumlandırıcınız hatalı olabilir. Kontrol ediniz. \n\nHata kodu:\n " + e.getMessage());
        } catch (ElementNotVisibleException e) {
            System.out.println("Element görünür değil. Konumlandırıcınız hatalı olabilir. Kontrol ediniz. \n\nHata kodu:\n " + e.getMessage());
        }
    }

    @AfterClass
    // Testler yürütüldükten sonra çağırılacak method. Testler tamamlandıktan sonra Driver nesnesini kapatıyoruz.
    public void teardown() {
        Driver.quit();
    }

}
