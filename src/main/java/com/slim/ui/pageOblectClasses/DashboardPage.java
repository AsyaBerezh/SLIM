package com.slim.ui.pageOblectClasses;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class DashboardPage {
    ElementsCollection ordersButton = $$("[class*='mx-link mx-name-actionButton19 far fa-handshake']");
    SelenideElement officeButton = $("[class*='btn mx-button mx-name-actionButton8 bigbuttonwhite-image fa fa-briefcase btn-default']");
    SelenideElement menuButton = $("[class*='mx-link mx-name-sidebarToggle3 navbutton navbutton-planning fas fa-bars']");
    ElementsCollection overviewButton = $$("[class*='mx-link mx-name-actionButton21 far fa-list-alt']");
    ElementsCollection planningButton = $$("[class*='mx-link mx-name-actionButton20 far fa-calendar-plus']");
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
        overviewButton.get(1).click();
        return this;
    }
}
