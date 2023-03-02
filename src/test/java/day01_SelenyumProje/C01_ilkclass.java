package day01_SelenyumProje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_ilkclass {

    public static <webDriver> void main(String[] args) throws InterruptedException {
        /*en ilkel haliyle bir otomasyon yapmak için
        class ımıza otomasyon için gerekli olan webdriver in yerini göstermemiz gerekir
        bunun için java kütüphanesinden System.setProperty() methodu kullanırız
        metod 2 parametre istemektedir
        ilki kullanılacağımız driver : webdriver.chrome.driver
        ikincisi ise bu driverin fiziki yolu*/
  System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

  WebDriver driver=new ChromeDriver();

  driver.get("https://www.amazon.com");
  Thread.sleep(2000);
  driver.get("https://www.google.com.tr");

  driver.close();

    }
}
