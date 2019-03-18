package com.slim.ui.pageOblectClasses.orders;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class OrdersPage {

SelenideElement newOrderButton = $("[class*='btn mx-button mx-name-actionButton2 btn-success']");
SelenideElement orderFromTemplateButton = $("[class*='btn mx-button mx-name-actionButton3 btn-success']");
SelenideElement newWorkOrderButton = $("[class*='btn mx-button mx-name-actionButton6 btn-success']");
SelenideElement searchField = $("[class*='search-bar']");
SelenideElement infoItem1Button = $("[class='mx-listview-item mx-name-index-0'] [class*='btn mx-button mx-name-actionButton18 buttonnonborder-image fa fa-info-circle btn-info']");
SelenideElement infoItem2Button = $("[class='mx-listview-item mx-name-index-1'] [class*='btn mx-button mx-name-actionButton18 buttonnonborder-image fa fa-info-circle btn-info']");
SelenideElement editItem1Button = $("[class='mx-listview-item mx-name-index-0'] [class*='btn mx-button mx-name-Edit10 buttonnonborder-image fa fa-edit btn-default']");
SelenideElement editItem2Button = $("[class='mx-listview-item mx-name-index-1'] [class*='btn mx-button mx-name-Edit10 buttonnonborder-image fa fa-edit btn-default']");
SelenideElement templateSelector = $("[class='mx-referenceselector-input-wrapper'] [class*='form-control']");
SelenideElement templateItem = $("[class*='mx-referenceselector-input-wrapper'] [class*='form-control'] [value='33776997205278836']");
SelenideElement newOrderButtonOnChooseTemplatePopUp = $("[class='btn mx-button mx-name-actionButton1 btn-success'] ");
SelenideElement deleteOrderButton = $("[class*='btn mx-button mx-name-actionButton7 btnRight > img btn-danger']");
SelenideElement proceedConfirmationButton = $("[class*='btn btn-primary']");

    public OrdersPage clickNewOrderButton(){
        newOrderButton.click();
        return this;

    }
    public OrdersPage clickOrderFromTemplateButton(){
        orderFromTemplateButton.click();
        return this;
    }
    public OrdersPage clickNewWorkOrderButton(){
        newWorkOrderButton.click();
        return this;
    }
    public OrdersPage inputDataToSearchField(){
        searchField.click();
        return this;
    }
    public OrdersPage clickInfoItem1Button(){
        infoItem1Button.click();
        return this;
    }
    public OrdersPage clickInfoItem2Button(){
        infoItem2Button.click();
        return this;
    }
    public OrdersPage clickEditItem1Button(){
        editItem1Button.click();
        return this;
    }
    public OrdersPage clickEditItem2Button(){
        editItem2Button.click();
        return this;
    }
    public OrdersPage clickTemplateSelector(){
        templateSelector.click();
        return this;
    }
    public OrdersPage clickTemplateItem(){
        templateItem.click();
        return this;
    }
    public OrdersPage clickNewOrderButtonOnChooseTemplatePopUp(){
        newOrderButtonOnChooseTemplatePopUp.click();
        return this;
    }
    public OrdersPage clickDeleteOrderButton(){
        deleteOrderButton.click();
        return this;
    }
    public OrdersPage clickProceedButton(){
        proceedConfirmationButton.click();
        return this;
    }
}
