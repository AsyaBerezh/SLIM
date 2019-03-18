package com.slim.ui.pageOblectClasses.planning;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class PlanningPage {

    SelenideElement plansheetSelector =$("[class*='mx-referenceselector'] [class*='form-control']");
    SelenideElement plansheetItem =$("[class*='mx-referenceselector'] [class*='form-control'] [value='27303072740934833']");
    SelenideElement backToEditingButton =$("[class*='btn mx-button mx-name-actionButton3 btnRight > img btn-inverse']");
    SelenideElement deleteFirstActivityButton =$("[class='mx-listview-item mx-name-index-2'] [class*='btn mx-button mx-name-actionButton18 buttonnonborderred-image fa fa-times-circle btn-danger']");

    public PlanningPage clickPlansheetSelector(){
        plansheetSelector.click();
        return this;
    }
    public PlanningPage clickPlansheetItem(){
        plansheetItem.click();
        return this;
    }
    public PlanningPage clickBackToEditingButton(){
        backToEditingButton.click();
        return this;
    }
    public PlanningPage clickDeleteFirstActivityButton(){
        deleteFirstActivityButton.click();
        return this;
    }

}
