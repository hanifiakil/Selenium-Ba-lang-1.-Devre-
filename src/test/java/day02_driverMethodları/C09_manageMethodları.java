package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_manageMethodları {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amaazon.com");
        /*ileride wait konusunu daha geniş olarak ele alacagız
        Bir sayfa açılırken, ilk başta sayfanın içerisinde bulunan elementlere göre
        bir yüklenme süresine ihtiyaç vardır
        veya bir webelementinin kullanıla bilmesi için zaman a ihtiyaç olabilir
        implicitlyWait bize sayfanın yüklenmesi ve sayfadaki elementlere ulaşım için beklenecek
        maximum süreyi belirleme olanağı tanır
         */
        driver.close();
    }
}
