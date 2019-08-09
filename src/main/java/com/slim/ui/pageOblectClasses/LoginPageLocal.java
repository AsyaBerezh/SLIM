package com.slim.ui.pageOblectClasses;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class LoginPageLocal {
    SelenideElement emailInput = $("[id='usernameInput']");
    SelenideElement passwordInput = $("[id='passwordInput']");
    SelenideElement loginButton = $("[id='loginButton']");



    public DashboardPage loginToDashboard (String email, String password) {
        open("http://localhost:8080/login.html?profile=Responsive");
        emailInput.setValue(email);
        passwordInput.setValue(password);
        loginButton.click();
        sleep(10000);
        return new DashboardPage();
    }
}
