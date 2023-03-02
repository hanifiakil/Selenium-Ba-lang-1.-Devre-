package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_Locators {
    /*main method oluşturun ve aşagıdaki görevi tamamlayın
    a.http://a.testaddressbook.com adresine gidiniz.
    b.sign in butonuna basın
    c.email textbox,password textbox and signin button elementlerini locate ediniz
    d.kullanıcı adını ve şifreyi aşagıya girin ve oturum aç(sign in) butonunu tıklayın:
    i. username : testtechproed@gmail.com
    ii. password : Test1234!
    e.expected user id nin testtechproed@gmail.com olduğunu doğrulayın (verify)
    f."Addresses" ve "Sing Out" textlerinin görüntülendiğini (displayed) doğrulayın(verify)
    sayfada kaç tane link olduğunu bulun
     */
    public static void main(String[] args) {
        System.setProperty("webdriver,chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // a.http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");
        // b.sign in butonuna basın
        WebElement singınlinki = driver.findElement(By.linkText("Sing in"));
        singınlinki.click();
        // c.email textbox,password textbox and signin button elementlerini locate ediniz

        WebElement emailTextBox = driver.findElement(By.id("session_email"));
        WebElement passwordTextBox = driver.findElement(By.name("session[password]"));
        WebElement signInButonu = driver.findElement(By.name("connit"));
        // d.kullanıcı adını ve şifreyi aşagıya girin ve oturum aç(sign in) butonunu tıklayın:
        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signInButonu.click();
        // i. username : testtechproed@gmail.com
        //  ii. password : Test1234!
        //     e.expected user id nin testtechproed@gmail.com olduğunu doğrulayın (verify)
        //bir web elementin üzerinde ne yazdığını görmek istiyorsak webElementiİsmi.getText() kullanılır
        WebElement actualKullanıcıAdıElementi = driver.findElement(By.className("navbar-text"));
        System.out.println(actualKullanıcıAdıElementi.getText());
        String expectedUserMail = "testtechproed@gmail.com";
        if (expectedUserMail.equals(actualKullanıcıAdıElementi.getText())) {
            System.out.println("Expected kullanıcı testi PASSED");
        } else {
            System.out.println("Expected kullanıcı testi FAILED");
        }


        //       f."Addresses" ve "Sing Out" textlerinin görüntülendiğini (displayed) doğrulayın(verify)
        WebElement addressesElementi = driver.findElement(By.linkText("Addresses"));
        WebElement singOutElementi = driver.findElement(By.linkText("Sign out"));
        if (addressesElementi.isDisplayed()) {
            System.out.println("adresses testi PASSED");
        } else {
            System.out.println("adresses testi FAILED");}

        if (singOutElementi.isDisplayed()) {
            System.out.println("adresses testi PASSED");
        } else {
            System.out.println("adresses testi FAILED");}
        //  sayfada kaç tane link olduğunu bulun

        List<WebElement> linklerListesi=driver.findElements(By.tagName("a"));
        System.out.println("sayfadaki link sayısı : " +linklerListesi.size());

        //linkleri yazalım
        //listemiz webelementlerinden oluştugu için direk yazdıramayız
        //onun için for-each loop yapıp her bir webelementinin üzerindeki yazıyı yazdırmalıyız
        for (WebElement each: linklerListesi
             ) {
            System.out.println(each.getText());
        }
        driver.close();
    }
}
