package com.slim.ui.pageOblectClasses;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DashboardPage {
    SelenideElement ordersButton = $("[class='btn mx-button mx-name-actionButton3 fa fa-handshake-o btn-default']");
    public DashboardPage openDashBoard(){
        open("https://slim-accp.mendixcloud.com");
        return new DashboardPage();
    }

    public DashboardPage clickOrdersButton (){
        ordersButton.click();
        return this;
    }
}
