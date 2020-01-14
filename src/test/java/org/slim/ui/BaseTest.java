package org.slim.ui;

import com.codeborne.selenide.Configuration;
import com.slim.ui.pageOblectClasses.LoginPage;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class BaseTest {
    LoginPage loginPage = new LoginPage();

    @BeforeSuite
    public void preSuite(){

/*        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-location\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        WebDriver browser = new ChromeDriver(options);
        browser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return browser;*/

/*        System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();*/

        Configuration.browser =  "firefox";
       // Configuration.timeout =  20000;
        Configuration.reportsFolder = "target/test-result/reports";
      /*     ChromeOptions options  = new ChromeOptions().addArguments("no-sandbox");
        WebDriver driver = new ChromeDriver(options);
        driver.get(Configuration.browser =  "chrome");*/
    }

/*    @BeforeClass
    private void preClass (){
        loginPage
                .loginToDashboard("anastasia@fitsoft.nl", "QWEqwe123!@#");
    }*/

}
