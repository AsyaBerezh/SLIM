package com.slim.ui.pageOblectClasses;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class DashboardPageLocal {
    ElementsCollection ordersButton = $$("[class*='mx-link mx-name-actionButton19 far fa-handshake']");
    SelenideElement officeButton = $("[class*='btn mx-button mx-name-actionButton8 bigbuttonwhite-image fa fa-briefcase btn-default']");
    SelenideElement menuButton = $("[class*='mx-link mx-name-sidebarToggle3 navbutton navbutton-planning fas fa-bars']");
    ElementsCollection overviewButton = $$("[class*='mx-link mx-name-actionButton21 far fa-list-alt']");
    ElementsCollection planningButton = $$("[class*='mx-link mx-name-actionButton20 far fa-calendar-plus']");
    public DashboardPageLocal openDashBoard(){
        open("http://localhost:8080/login.html?profile=Responsive");
        return new DashboardPageLocal();
    }

    public DashboardPageLocal clickOrdersButton (){
        ordersButton.get(1).click();
        return this;
    }
    public DashboardPageLocal clickOfficeButton(){
        officeButton.click();
        return this;
    }
    public DashboardPageLocal clickMenuButton(){
        menuButton.click();
        return this;
    }
    public DashboardPageLocal clickPlanningButton(){
        planningButton.get(1).click();
        return this;
    }
    public DashboardPageLocal clickOverviewButton(){
        overviewButton.get(1).click();
        return this;
    }
}
