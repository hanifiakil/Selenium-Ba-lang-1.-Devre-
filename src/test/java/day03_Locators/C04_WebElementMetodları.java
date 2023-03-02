package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElementMetodları{
    /*
    amazon.com a gidip arama kutusunu locate edin
    arama kutusunun tagName inin imput olduğunu test edin
    arama kutusunun name attribute nun değerinin...... olduğunu test edin
     */

    public static void main(String[] args) {

        System.setProperty("webdriver,chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //amazon.com a gidip arama kutusunu locate edin
        driver.get("https:/www.amazon.com");
        WebElement aramakutusu= driver.findElement(By.id("twotabsearchtextbox"));
  //  arama kutusunun tagName inin imput olduğunu test edin
        String expectedTagName="in put";
        String actualTagName=aramakutusu.getTagName();//daha önce locate ettiğimiz bir webelementin tagname ni döndürür

        if (expectedTagName.equals(actualTagName)) {
            System.out.println("tagName testi PASSED");
        }else {System.out.println("tagName testi FAILED");
        }
   // arama kutusunun name attribute nun değerinin....field-keywords.. olduğunu test edin

        String expectedNameDeğeri="field-keywords";
        String actualNameDeğeri=aramakutusu.getAttribute("name");//daha önce locate ettiğimiz bir webelementin istediğim attribute unun değerini döndürür
        if (expectedNameDeğeri.equals(actualNameDeğeri)) {
            System.out.println("Name değeri testi PASSED");
        }else {System.out.println("Name değeri testi FAILED");
        }
        driver.close();
    }
}
