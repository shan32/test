package newproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
import java.util.List;
 
public class newnew {
 
    HtmlUnitDriver driver;
 
    @BeforeTest
    public void startDriver() {
        driver = new HtmlUnitDriver();
    }
 
    @AfterTest
    public void stopDriver() {
        driver.close();
    }
 
    @Test
    public void listCheesecakes() {
        driver.get("http://www.thecheesecakefactory.com/");
        driver.findElement(By.linkText("Menu")).click();
        driver.findElement(By.linkText("Cheesecake")).click();
        List<WebElement> cheesecakes = driver.findElements(By.xpath("id('leftNav_levelTwo')//li"));
 
        System.out.println(cheesecakes.size() + " cheesecakes:");
        for (int i=0; i<cheesecakes.size(); i++) {
            System.out.println(i+1 + ". " + cheesecakes.get(i).getText());
        }
    }
 
}