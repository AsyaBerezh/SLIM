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
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        Configuration.browser = "chrome";
/*        System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();*/

/*        System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized"); // open Browser in maximized mode
        options.addArguments("disable-infobars"); // disabling infobars
        options.addArguments("--disable-extensions"); // disabling extensions
        options.addArguments("--disable-gpu"); // applicable to windows os only
        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
        options.addArguments("--no-sandbox"); // Bypass OS security model
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);*/

      //  Configuration.browser =  "chrome";
       // Configuration.timeout =  20000;
        Configuration.reportsFolder = "target/test-result/reports";
      /*     ChromeOptions options  = new ChromeOptions().addArguments("no-sandbox");
        WebDriver driver = new ChromeDriver(options);
        driver.get(Configuration.browser =  "chrome");*/
    }

    @BeforeClass
    private void preClass (){
        loginPage
                .loginToDashboard("anastasia@fitsoft.nl", "QWEqwe123!@#");
    }

}
