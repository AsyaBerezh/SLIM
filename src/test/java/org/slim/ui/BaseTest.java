package org.slim.ui;

import com.codeborne.selenide.Configuration;
import com.slim.ui.pageOblectClasses.LoginPage;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.codeborne.selenide.WebDriverRunner;
public class BaseTest {
    LoginPage loginPage = new LoginPage();
    WebDriver webDriver;
    @BeforeSuite
    public void preSuite(){

        //Configuration.browser = "chrome";
        // Configuration.browser = "firefox"; //for local
/*    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
    System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();*/

        //  System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.setPageLoadStrategy(PageLoadStrategy.NONE);
        System.setProperty("webdriver.chrome.driver", getPathToDriver());
        webDriver = new ChromeDriver(options);
        webDriver.manage().window().maximize();
      //  Configuration.browser =  "chrome";
       // Configuration.timeout =  20000;
        Configuration.reportsFolder = "target/test-result/reports";
      /*     ChromeOptions options  = new ChromeOptions().addArguments("no-sandbox");
        WebDriver driver = new ChromeDriver(options);
        driver.get(Configuration.browser =  "chrome");*/
    }
    private String getPathToDriver() {
        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.contains("win")) {
            return this.getClass().getResource("/chromedriver_windows32/chromedriver.exe").getPath();
        }
        if(osName.contains("nux")) {
            return "src/test/resources/chromedriver_linux64/chromedriver";
        }
        throw new RuntimeException("Your system type was not detected! Please download and set chromedriver by yourself");
    }
    @BeforeClass
    private void preClass (){
        loginPage
                .loginToDashboard("anastasia@fitsoft.nl", "QWEqwe123!@#");
    }
    @AfterClass
    protected void tearDown() {
        webDriver.quit();
    }
}
