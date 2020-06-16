package InterviewPrepQue.PracticeSL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SeleniumBasic {
    @Test
    public void method1() throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "src/BrowserDriver/geckodriver");

            WebDriver driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.get("http://www.google.com");
            driver.manage().window().maximize();
            System.out.println(driver.getTitle());
            Actions action = new Actions(driver);
            String parent = driver.getWindowHandle();
            WebElement imgLink = driver.findElement(By.xpath("//*[text() = 'Images']"));
            WebElement gmLink = driver.findElement(By.xpath("//*[text() = 'Gmail']"));

            action.keyDown(Keys.COMMAND).click(imgLink).keyUp(Keys.COMMAND).build().perform();
            action.keyDown(Keys.COMMAND).click(gmLink).keyUp(Keys.COMMAND).build().perform();

            Set<String> winid = driver.getWindowHandles();
        System.out.println("Total no. of windows: "+ winid.size());
            Iterator<String> iter = winid.iterator();
            String tab = iter.next();

            String tab1 = iter.next();
            String tab2 = iter.next();
            Thread.sleep(1500);
            driver.switchTo().window(tab2);
//        Thread.sleep(1500);
//            driver.switchTo().window(tab1);
//        Thread.sleep(1500);
//            driver.switchTo().window(tab2);
            //System.out.println(driver.getTitle());

           // driver.quit();
        }
    }