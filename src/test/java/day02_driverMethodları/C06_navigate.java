package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_navigate {
    public static void main(String[] args) throws InterruptedException {
        //eğer testiiz sırasında birden fazla sayfa ararsında ileri geri hareket edeceksek
        //driver.get() yerine driver.navigate().to() method unu kullanırız
        //ve sonrasında forword(), back() veya refresh() metod larını kullanabiliriz


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);
        driver.navigate().to("https://www.facebook.com");

        Thread.sleep(2000);
        driver.navigate().back();//amazon a geri döndük

        Thread.sleep(2000);
        driver.navigate().forward();//yeniden facebooka geldik
        Thread.sleep(2000);
        driver.navigate().refresh();//sayfayı referans yaptık

        driver.close();
    }
}
