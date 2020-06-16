package InterviewPrepQue.PracticeSL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static common.WebAPI.sleepFor;

public class BaseAPI {
    WebDriver driver;
    String url="https://www.google.com/";
    @AfterMethod
    public void close(){
        driver.close();
    }
    public void navigateToUrl(String url)  {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\tanz9\\IdeaProjects\\PracticeAndNote\\Generic\\src\\main\\java\\BrowserDriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to(url);
    }
    public void navigateToLetskodeit() {
        navigateToUrl("");
    }
    @Test
    public void getGoogle()  {
        navigateToUrl(url);
    }
    // new window handling
    @Test
    public void switchNewWindow() throws InterruptedException {
        navigateToUrl("https://learn.letskodeit.com/p/practice");
        System.out.println("page title is : " + driver.getTitle());
        driver.findElement(By.xpath("//button[@id='openwindow']")).click();
        System.out.println("page title is : " + driver.getTitle());

        Set<String> windows=driver.getWindowHandles();
        Iterator<String> iter=windows.iterator();
        String mainWindow=iter.next();
        String childWindow=iter.next();
        Thread.sleep(3);
        driver.switchTo().window(childWindow);
        Thread.sleep(6);
        driver.close();
        driver.switchTo().window(mainWindow);
    }
    //1. Click
    public void clickOn(String locator) {
        try {
            driver.findElement(By.xpath(locator)).click();
        } catch (Exception e) {
            try {
                driver.findElement(By.cssSelector(locator)).click();
            } catch (Exception e1) {
                try {
                    driver.findElement(By.id(locator)).click();
                } catch (Exception e2) {
                    try {
                        driver.findElement(By.name(locator)).click();
                    } catch (Exception e3) {
                        try {
                            driver.findElement(By.className(locator)).click();
                        } catch (Exception e4) {
                            try {
                                driver.findElement(By.linkText(locator)).click();
                            } catch (Exception e5) {
                                try {
                                    driver.findElement(By.partialLinkText(locator)).click();
                                } catch (Exception e6) {
                                    driver.findElement(By.tagName(locator)).click();
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    @Test
    public void click() {
        navigateToUrl("https://learn.letskodeit.com/p/practice");
        clickOn("//a[@id='header-sign-up-btn']");
    }
    //1.SendKeys
    public void typeInsideBox(WebElement element,String value) {
        element.sendKeys(value);
    }

    // .new tab
    public void tabhandling(){

    }


    public void searchFromArray(String [] array,String url, String locatorOfCurrentDomain) throws InterruptedException {
        navigateToUrl(url);
        // navigateToUrl("https://www.google.com/");
        for (String searchWord:array) {
            driver.findElement(By.xpath(locatorOfCurrentDomain)).sendKeys(searchWord,Keys.ENTER);
            sleepFor(2);
            driver.navigate().back();
        }

    }
    @Test
    public void testSearchFromArray() throws InterruptedException {
        String [] fashion={"Shirt","Pant","Shoe","Belt","Hand Bag"};
        String googleUrl="https://www.google.com/";
        String xpathOfGoogleSearch="//input[@name='q']";

        String [] grocery={"egg","coffee","milk","cheese","bean"};
        String amazonUrl="https://www.amazon.com/";
        String xpathOfAmazonSearch="//input[@id='twotabsearchtextbox']";

        searchFromArray(fashion,googleUrl,xpathOfGoogleSearch);
        searchFromArray(grocery,amazonUrl,xpathOfAmazonSearch);
    }
    // Mouse Hover Method
    public WebElement makeWebElement(String locator) {
        WebElement element;
        try {
            element = driver.findElement(By.xpath(locator));
            return element;
        } catch (Exception e) {
            try {
                element = driver.findElement(By.cssSelector(locator));
                return element;
            } catch (Exception e1) {
                try {
                    element = driver.findElement(By.id(locator));
                    return element;
                } catch (Exception e2) {
                    try {
                        element = driver.findElement(By.name(locator));
                        return element;
                    } catch (Exception e3) {
                        try {
                            element = driver.findElement(By.className(locator));
                            return element;
                        } catch (Exception e4) {
                            try {
                                element = driver.findElement(By.linkText(locator));
                                return element;
                            } catch (Exception e5) {
                                try {
                                    element = driver.findElement(By.partialLinkText(locator));
                                    return element;
                                } catch (Exception e6) {
                                   element = driver.findElement(By.tagName(locator));
                                    return element;
                                }
                            }
                        }
                    }
                }
            }
        }

    }
    // Mouse Hover
    public void mouseHover(String locator) {
        try {
            WebElement element=makeWebElement(locator);
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();
        } catch (Exception ex) {
            System.out.println("First attempt has been done, This is second try");
            WebElement element=makeWebElement(locator);
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();
        }
    }
    @Test
    public void testmouse() throws InterruptedException {
        navigateToUrl("https://learn.letskodeit.com/p/practice");
        scroll(0,900);
        mouseHover("#mousehover");
        sleepFor(5);
    }
    public void scroll(int horizontal,int vertical){
        JavascriptExecutor scroll =  (JavascriptExecutor) driver;
        String script="window.scrollBy("    +horizontal+  ","  +vertical+  ")";
        //String script1="window.scrollBy(200,300)";
        scroll.executeScript(script);
    }
    public void selectFromDropByValue(String locator1, String locator2){
        WebElement element = driver.findElement(By.xpath(locator1));
        Select drpWrd = new Select(element);
        drpWrd.selectByVisibleText(locator2);
    }
    // Drop down selectOneByOneDropDownElementFromArray
    public void selectOneByOneDropDownElementFromArray(String[] array, String locator){
        for (String visibleText : array) {
            selectFromDropByValue(locator, visibleText);
            System.out.println(visibleText);
        }
    }
    @Test
    public void testSelectDropDownItemFromArray(){
        String[]  listVisibleText= {"Auto","ATV", "Condo", "RV", "Flood", "Travel", "Pet", "Life", "Umbrella", "Landlord"};
        navigateToUrl("https://www.geico.com/");
        selectOneByOneDropDownElementFromArray(listVisibleText, "//select[@id='homepage_manage_select']");
    }
    // Screenshot Capture.. SimpleDateFormat is implementing all features of (abstract(DateFormat interface))

    public static void captureScreenshot(WebDriver driver, String screenshotName) {
        DateFormat df = new SimpleDateFormat("(MM.dd.yyyy-HHmma)");
        Date date = new Date();
        df.format(date);

        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file,
                    new File(System.getProperty("user.dir") + "/Screenshots/" + screenshotName + " " + df.format(date) + ".png"));
            System.out.println("Screenshot captured");
        } catch (Exception e) {
            System.out.println("Exception while taking screenshot " + e.getMessage());
        }
    }
    //Select single or multiple From Array

    public void selectOneByOneSelectMenuFromArray(String[] array, String locator) {
        for (String visibleText : array) {
            selectFromDropByValue(locator, visibleText);
            System.out.println(visibleText);
            // sleepFor(2);
        }
    }
    @Test
    public void testSelectItemfromArray() throws InterruptedException {
        String[] listVisibleText = {"Apple", "Peach"};
        navigateToUrl("https://learn.letskodeit.com/p/practice");

        selectOneByOneDropDownElementFromArray(listVisibleText, "//select[@id='multiple-select-example']");
        sleepFor(2);

    }
    // only send key
    public void sendKey(String locator, String value) {
        makeWebElement(locator).sendKeys(value);
    }
    //======================================Alert Handle==========================================//
    // Ok Alart
    public void okAlert() {
        driver.switchTo().alert().accept();
    }
    // Dismiss alart
    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }
    @Test
    public void testAlert() throws InterruptedException {
        navigateToLetskodeit();
        scroll(0,500);
        String alertSendKey = "Zahid"; //declare and initialize send key value for alert box
        String expectedTextFromAlart = "Hello " + alertSendKey + ", Are you sure you want to confirm?";
        sendKey("//input[@id='name']", alertSendKey); //call send key method and put two parameter
        sleepFor(2);
        clickOn("//input[@id='confirmbtn']");// click for generate alert
        sleepFor(1);
        String actualTextFromAlart = driver.switchTo().alert().getText();   // get actual text of alert.
        Assert.assertEquals(actualTextFromAlart, expectedTextFromAlart);  // assert or verify the alert text
        sleepFor(3);
        okAlert(); // click ok button on alert.
    }
    @Test
    public void  testShowHide() {
        navigateToLetskodeit();
        sendKey("//input[@id='displayed-text']","kollol");
        clickOn("//input[@id='hide-textbox']"); //click on hide button
        captureScreenshot(driver,"HideTheTextBox");
        clickOn("//input[@id='show-textbox']");  //click on show button
        captureScreenshot(driver,"ShowTheTextBox");
    }
    /*==================================iFrame Handle====================================*/
    public  void goInsideIframe(WebElement element) {
        driver.switchTo().frame(element);
    }
    public  void goBackToHomeWindow() {
        driver.switchTo().defaultContent();
    }
    @Test
    public void TestHandleIframe() throws InterruptedException {
        navigateToLetskodeit();
        scroll(0,1300);
        sleepFor(3);
        WebElement element = makeWebElement("//iframe[@id='courses-iframe']");
        goInsideIframe(element);
        sleepFor(5);
        scroll(0, 1000);
        sleepFor(3);
        goBackToHomeWindow();
    }





}







