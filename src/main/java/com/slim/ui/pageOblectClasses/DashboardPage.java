package com.slim.ui.pageOblectClasses;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class DashboardPage {
    ElementsCollection ordersButton = $$("[class*='mx-link mx-name-actionButton19 far fa-handshake']");
    SelenideElement officeButton = $("[class*='btn mx-button mx-name-actionButton8 bigbuttonwhite-image fa fa-briefcase btn-default']");
    SelenideElement menuButton = $("[class*='btn mx-button mx-name-sidebarToggle3 bigbuttonwhite-image fa fa-bars btn-primary']");
    SelenideElement overviewButton = $ ("[class*='btn mx-button mx-name-actionButton11 fa fa-calendar btn-default']");
    ElementsCollection planningButton = $$("[class*='mx-link mx-name-actionButton20 far fa-calendar-plus']");
    //need to be change in order of a new slim
    public DashboardPage openDashBoard(){
        open("https://slim-accp.mendixcloud.com");
        return new DashboardPage();
    }

    public DashboardPage clickOrdersButton (){
        ordersButton.get(1).click();
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
        planningButton.get(1).click();
        return this;
    }
    public DashboardPage clickOverviewButton(){
        overviewButton.click();
        return this;
    }
}
