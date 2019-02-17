package com.slim.ui.pageOblectClasses.orders;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class OrdersPage {

SelenideElement newOrderButton =$("[class*='btn mx-button mx-name-actionButton2 btn-success']");
SelenideElement orderFromTemplateButton =$("[class*='btn mx-button mx-name-actionButton3 btn-success']");
SelenideElement newWorkOrderButton =$("[class*='btn mx-button mx-name-actionButton6 btn-success']");
SelenideElement searchField =$("[class*='search-bar']");
SelenideElement infoItem1Button =$("[class='mx-listview-item mx-name-index-0'] [class*='btn mx-button mx-name-actionButton18 buttonnonborder-image fa fa-info-circle btn-info']");
SelenideElement infoItem2Button =$("[class='mx-listview-item mx-name-index-1'] [class*='btn mx-button mx-name-actionButton18 buttonnonborder-image fa fa-info-circle btn-info']");
SelenideElement editItem1Button =$("[class='mx-listview-item mx-name-index-0'] [class*='btn mx-button mx-name-Edit10 buttonnonborder-image fa fa-edit btn-default']");
SelenideElement editItem2Button =$("[class='mx-listview-item mx-name-index-1'] [class*='btn mx-button mx-name-Edit10 buttonnonborder-image fa fa-edit btn-default']");

    public OrdersPage clickOnNewOrderButton(){
        newOrderButton.click();
        return this;
    }


}
