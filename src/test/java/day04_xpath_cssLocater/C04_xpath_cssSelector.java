package day04_xpath_cssLocater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C04_xpath_cssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver,chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //bazı elementleri yanında yada altında olarak tarif ederiz
        WebElement boston=driver.findElement(By.id("..."));
        WebElement mountie= driver.findElement(RelativeLocator.with(By.tagName("img")).below(boston));
//şeklinde ayarlanır mountie bostonun şurasında gibi
    }
}
