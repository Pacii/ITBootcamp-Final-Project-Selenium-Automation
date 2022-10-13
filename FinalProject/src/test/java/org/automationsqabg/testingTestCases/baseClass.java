package org.automationsqabg.testingTestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class baseClass {

    public WebDriver wd;

    @BeforeClass
    public void beforeClass(){

//        String baseDir = System.getProperty("user.dir");
//        String chromeDir = baseDir + "/browser/chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver", chromeDir);

        //String firefoxDir = baseDir + "/browser/geckodriver";
        //System.setProperty("webdriver.gecko.driver", firefoxDir);


//        ChromeOptions chromeOptions = new ChromeOptions();
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver(chromeOptions);

        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();

//        WebDriverManager.firefoxdriver().setup();
//        driver = new FirefoxDriver();

//        https://www.toolsqa.com/selenium-webdriver/webdrivermanager/
//        A specific browser version? =>
//        ChromeOptions chromeOptions = new ChromeOptions ();
//        WebDriverManager.chromedriver().driverVersion("97.0.4692.71").setup();
//        WebDriver driver = new ChromeDriver(chromeOptions);

        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    @BeforeMethod
    public void beforeMethod() {
        wd.navigate().to("https://www.automationexercise.com/");
        sleepTest(1000);
    }
    @AfterMethod
    public void afterTest(){
        System.out.println("Method is passing");
    }

    @AfterClass
    public void afterClass(){
        wd.quit();
    }

    public static void sleepTest(long sleeptime){
        try{Thread.sleep(sleeptime);
        }catch (Exception e){

        }
    }
}