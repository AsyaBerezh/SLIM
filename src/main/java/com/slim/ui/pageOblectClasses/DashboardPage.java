package com.slim.ui.pageOblectClasses;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DashboardPage {
    SelenideElement ordersButton = $("[class='btn mx-button mx-name-actionButton3 fa fa-handshake-o btn-default']");
    SelenideElement officeButton = $("[class*='btn mx-button mx-name-actionButton8 bigbuttonwhite-image fa fa-briefcase btn-default']");
    SelenideElement menuButton = $("[class*='btn mx-button mx-name-sidebarToggle3 bigbuttonwhite-image fa fa-bars btn-primary']");
    SelenideElement planningButton = $("[class*='mx-name-container25 menuimagebox'] button");
    SelenideElement overviewButton = $ ("[class*='btn mx-button mx-name-actionButton11 fa fa-calendar btn-default']");

    public DashboardPage openDashBoard(){
        open("https://slim-accp.mendixcloud.com");
        return new DashboardPage();
    }

    public DashboardPage clickOrdersButton (){
        ordersButton.click();
        return this;
    }
    public DashboardPage clickOfficeButton(){
        officeButton.click();
        return this;
    }
    public DashboardPage clickMenuButton(){
        menuButton.click();
        return this;
    }
    public DashboardPage clickPlanningButton(){
        planningButton.click();
        return this;
    }
    public DashboardPage clickOverviewButton(){
        overviewButton.click();
        return this;
    }
}
