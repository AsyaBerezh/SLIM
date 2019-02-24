package com.slim.ui.pageOblectClasses.orders;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class NewWorkOrderPage {
    SelenideElement customerField = $("[class='form-group mx-name-referenceSelector1 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [class*='form-control']");
    SelenideElement customerItem = $("[class='form-group mx-name-referenceSelector1 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [class*='form-control'] [value='7036874417767002']");
    SelenideElement plannedStartTime = $("[class='mx-name-textBox1']");
    SelenideElement plannedEndTime = $("[class='mx-name-textBox2']");
    SelenideElement planGroupField = $("[class='form-group mx-name-referenceSelector10 align-label-left'] [class='mx-referenceselector-input-wrapper'] [class*='form-control']");
    SelenideElement planGroupItem = $("[class='form-group mx-name-referenceSelector10 align-label-left'] [class='mx-referenceselector-input-wrapper'] [class*='form-control'] [value='27021597764223580']");
    SelenideElement nextButton = $("[class='btn mx-button mx-name-actionButton2 btnRight > img btn-default']");
    SelenideElement addDriverButton = $("[class*='btn mx-button mx-name-actionButton3 buttonnonbordergreen-image fa fa-plus-square btn-success']");
    SelenideElement addTractorLiceseButton = $("[class*='btn mx-button mx-name-actionButton6 buttonnonbordergreen-image fa fa-plus-square btn-success']");
    SelenideElement addTrailerLiceseButton = $("[class*='btn mx-button mx-name-actionButton7 buttonnonbordergreen-image fa fa-plus-square btn-success']");
    SelenideElement firstItemClaimButton = $("[class='mx-listview-item mx-name-index-0'] [class='btn mx-button mx-name-actionButton17 btn-success']");
    SelenideElement firstStopSelectorField = $("[class='mx-listview-item mx-name-index-2'] [class='mx-referenceselector mx-name-referenceSelector8 h6'] [class*='form-control']");
    SelenideElement firstStopItem = $("[class='mx-listview-item mx-name-index-2'] [class='mx-referenceselector mx-name-referenceSelector8 h6'] [class*='form-control'] [value='21673573206724637']");
    SelenideElement lastStopSelectorField = $("[class='mx-listview-item mx-name-index-3'] [class='mx-referenceselector mx-name-referenceSelector8 h6'] [class*='form-control']");
    SelenideElement lastStopItem = $("[class='mx-listview-item mx-name-index-3'] [class='mx-referenceselector mx-name-referenceSelector8 h6'] [class*='form-control'] [value='21673573206725016']");
    SelenideElement publishTripButton = $("[class='btn mx-button mx-name-actionButton4 btn-success'] ");

    public NewWorkOrderPage clickCustomerField(){
        customerField.click();
        return this;
    }
    public NewWorkOrderPage clickCustomerItem(){
        customerItem.click();
        return this;
    }
    public NewWorkOrderPage inputDataToPlannedStartTime(String time){
        plannedStartTime.click();
        plannedStartTime.clear();
        plannedStartTime.setValue(time);
        sleep(2000);
        return this;
    }
    public NewWorkOrderPage inputDataToPlannedEndTime(String time){
        plannedEndTime.click();
        plannedEndTime.clear();
        plannedEndTime.setValue(time);
        sleep(2000);
        return this;
    }
    public NewWorkOrderPage clickPlanGropField(){
        planGroupField.click();
        return this;
    }
    public NewWorkOrderPage clickPlanGroupItem(){
        planGroupItem.click();
        return this;
    }
    public NewWorkOrderPage clickNextButton(){
        nextButton.click();
        return this;
    }
    public NewWorkOrderPage clickAddDriverButton(){
        addDriverButton.click();
        return this;
    }
    public NewWorkOrderPage clickFirstItemClaimButton(){
        firstItemClaimButton.click();
        return this;
    }
    public NewWorkOrderPage clickFirstStopSelectorField(){
        firstStopSelectorField.click();
        return this;
    }
    public NewWorkOrderPage clickFirstStopItem(){
        firstStopItem.click();
        return this;
    }
    public NewWorkOrderPage clickLastStopSelectorField(){
        lastStopSelectorField.click();
        return this;
    }
    public NewWorkOrderPage clickLastStopItem(){
        lastStopItem.click();
        return this;
    }
    public NewWorkOrderPage clickPublishTripButton(){
        publishTripButton.click();
        return this;
    }
}
