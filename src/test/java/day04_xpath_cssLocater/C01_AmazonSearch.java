package day04_xpath_cssLocater;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_AmazonSearch {
    public static void main(String[] args) {
        System.setProperty("Webdriver,chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //web sayfasına gidin https://www.amazon.com
        driver.get("https://www.amazon.com");
        //search(ara) "city bike"
        WebElement aramakutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramakutusu.sendKeys("city bike"+ Keys.ENTER);
        //amazon da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> istenenelementlistesi=driver.findElements(By.className("sg-col-inner"));
        WebElement sonuçyazısıelementi= istenenelementlistesi.get(0);
        System.out.println(sonuçyazısıelementi.getText());
        //sonra karşınıza çıkan ilk sonucun resmine tıklayın
        List<WebElement> ürünresimlerilist=driver.findElements(By.className("s-image"));
        WebElement ilkürün=ürünresimlerilist.get(0);
        ilkürün.click();
        driver.close();

    }
}
