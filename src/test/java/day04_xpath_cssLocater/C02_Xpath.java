package day04_xpath_cssLocater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver,chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https//the-internet.herokuapp.com/add_remove_elements/ adresine gidiniz
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //Add elemennt butonuna basın
        WebElement addbutonu=driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addbutonu.click();
        //delete butonunun görünür olduğunu test edin
WebElement deletebutonu= driver.findElement(By.xpath("//button[@class='added-manually']"));
if (deletebutonu.isDisplayed()){
    System.out.println("delete butonu PASSED");}else {
    System.out.println("delete butonu FAILED");
}
        //delete tuşuna basın
deletebutonu.click();
        //"Add/Remove Elements" yazısının görünür olduğunu test edin
        WebElement addremoveelement=driver.findElement(By.xpath(" //h3"));
        if (addremoveelement.isDisplayed()){
            System.out.println("addremoveelement PASSED");}else {
            System.out.println("addremoveelement FAILED");}
        driver.close();
    }
}
