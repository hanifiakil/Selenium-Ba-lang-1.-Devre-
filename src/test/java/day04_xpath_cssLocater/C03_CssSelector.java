package day04_xpath_cssLocater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_CssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver,chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
         //verilen web sitesine gidin.
        driver.get("https://www.facebook.com");
        //locate email textbox
        WebElement emailelement= driver.findElement(By.xpath("//input[@type='text']"));
        //locate passwoed textbox
        WebElement password= driver.findElement(By.cssSelector("input[type='password']"));
        //locate signin button
        WebElement giriş=driver.findElement(By.xpath("//button[@value='1']"));
        //kullanıcı adı ve şifreyi girip sign in dümesine tıklayın
emailelement.sendKeys("rahmet_kerem@gmail.com");
password.sendKeys("rahmanallah1");
giriş.click();
    }
}
