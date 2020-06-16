package InterviewPrepQue.PracticeSL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumBrowserOpen {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\tanz9\\\\IdeaProjects\\\\PracticeAndNote\\\\Generic\\\\src\\\\main\\\\java\\\\BrowserDriver\\\\chromedriver.exe");
       WebDriver driver  = new ChromeDriver();
        driver.get("http://automate-apps.com/");
        Thread.sleep(3000);
        Actions action = new Actions (driver);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"menu-item-1284\"]/a"));
        action.contextClick(element).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
        driver.close();
    }



}
