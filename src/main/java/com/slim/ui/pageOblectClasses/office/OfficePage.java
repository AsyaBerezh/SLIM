package com.slim.ui.pageOblectClasses.office;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class OfficePage {
    SelenideElement firstLogTripButton = $("[class='mx-listview-item mx-name-index-0'] [class*='btn mx-button mx-name-actionButton10 btnRight > img btn-inverse']");
    SelenideElement secondLogTripButton = $("[class='mx-listview-item mx-name-index-1'] [class*='btn mx-button mx-name-actionButton10 btnRight > img btn-inverse']");

    public OfficePage clickFirstLogTripButton(){
        firstLogTripButton.click();
        return this;
    }

    public OfficePage clickSecondLogTripButton(){
        secondLogTripButton.click();
        return this;
    }
}




