package org.slim.ui;

import com.codeborne.selenide.Configuration;
import com.slim.ui.pageOblectClasses.LoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    LoginPage loginPage = new LoginPage();

    @BeforeSuite
    public void preSuite(){
        Configuration.browser =  "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout =  20000;
        Configuration.reportsFolder = "target/test-result/reports";
    }

    @BeforeClass
    private void preClass (){
        loginPage
                .loginToDashboard("marharyta@fitsoft.nl", "QWEqwe123!@#");
    }

}
