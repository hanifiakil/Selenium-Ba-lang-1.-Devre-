package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    public static void main(String[] args) {

        System.setProperty("webdriver,chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //amazon a gidip nutella aratalım

        driver.get("https://www.amazon.com");
        //findElement(By ... locator)--> istediğimiz web elementini bize döndürür
        //biz de o webelementleri kullanmak için bir objeye assing ederiz
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));


        /*WebElement aramaKutusu= driver.findElement(By.className("nav-search-field "));
        bu locator çalışmadı
        locator alırken gözümüzden kaçan detaylar olabilir
        aldığımız bir locator çalışmazsa alternatif locator lar denemeliyiz

         <input type="text" id="twotabsearchtextbox" value=""
         name="field-keywords" autocomplete="off" placeholder=""
         class="nav-input nav-progressive-attribute" dir="auto" tabindex="0"
         aria-label="Search" spellcheck="false">*/

        //herhangi bir webelementine istediğimiz yazıyı yollamak istersek

        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        driver.close();


    }
}
