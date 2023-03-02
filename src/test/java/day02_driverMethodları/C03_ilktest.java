package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class C03_ilktest {
    public static void main(String[] args) {
        /* 1-https://www.amazon.com url ine gidin
           2-başlığın Amazon kelimesi içerdiğini test edin
           3-url in "https://www.amazon.com" a eşit olduğunu test edin
           4-sayfayı kapatın
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        // 1-https://www.amazon.com url ine gidin
        driver.get("https://www.amazon.com");
        //   2-başlığın Amazon kelimesi içerdiğini test edin
        String actualTitle=driver.getTitle();
        String aranankelime="Amazon";
        if (actualTitle.contains(aranankelime)) {
            System.out.println("Title testi PASSED");
        }else {
            System.out.println("Title" + aranankelime + " yi içermiyor, titre testi FAILED");
        }
        //   3-url in "https://www.amazon.com" a eşit olduğunu test edin
        String actualUrl= driver.getCurrentUrl();
        String expectedUrl="https://www.amazon.com";
        if (actualTitle.equals(expectedUrl)){
            System.out.println("Url testi PASSED");
        }else {
            System.out.println("actual Url : "+actualUrl+" Url beklenen URL den farklı, test FAILED");
        };
        //   4-sayfayı kapatın

        driver.close();

    }
}
