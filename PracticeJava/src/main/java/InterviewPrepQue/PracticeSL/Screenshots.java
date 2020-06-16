package InterviewPrepQue.PracticeSL;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Screenshots {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "src/BrowserDriver/chromedriver");
        WebDriver driver  =new ChromeDriver();
        driver.get("http://facebook.com");

        File scrn  =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrn, new File("/Users/sanuwar/Desktop/screeny.png"));
        driver.close();
    }
}
