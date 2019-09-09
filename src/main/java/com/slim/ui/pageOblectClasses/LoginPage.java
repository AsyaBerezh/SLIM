package com.slim.ui.pageOblectClasses;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class LoginPage {
    SelenideElement emailInput = $("[id='usernameInput']");
    SelenideElement passwordInput = $("[id='passwordInput']");
    SelenideElement loginButton = $("[id='loginButton']");



    public DashboardPage loginToDashboard (String email, String password) {
        open("https://slim-accp.mendixcloud.com/admin.html");
        emailInput.setValue(email);
        passwordInput.setValue(password);
        loginButton.click();
        sleep(2000);
        return new DashboardPage();
    }
}
