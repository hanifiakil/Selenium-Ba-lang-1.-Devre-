package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_getPageSource {
    public static void main(String[] args) {
       //amazon sitesine gidip kaynak kodlarında "Gateway" yazdığını test ediniz

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        String sayfakaynakkodları=driver.getPageSource();
        String aranankelime="Gateway";
        if (sayfakaynakkodları.contains(aranankelime)) {
            System.out.println("kaynak kodu testi PASSED");
        }else {
            System.out.println("Kaynak kodlarında " + aranankelime+ " yok, FAILED");
        }
        driver.close();
    }
}
