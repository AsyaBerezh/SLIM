package com.slim.ui.pageOblectClasses.planning;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class PlanningPage {

    SelenideElement plansheetSelector = $("[class*='mx-referenceselector'] [class*='form-control']");

    SelenideElement plansheetItem = $("[class*='mx-referenceselector'] [class*='form-control']");

    SelenideElement backToEditingButton = $("[class*='btn mx-button mx-name-actionButton3 btnRight > img btn-inverse']");
    SelenideElement deleteFirstActivityButton = $("[class='mx-listview-item mx-name-index-2'] [class*='btn mx-button mx-name-actionButton18 buttonnonborderred-image fa fa-times-circle btn-danger']");
    SelenideElement editPlansheetButton = $("[class='btn mx-button mx-name-actionButton7 btnRight > img btn-inverse']");
    ElementsCollection firstNewTripButton = $$("[class='btn mx-button mx-name-actionButton15 btn-success']");
    ElementsCollection changelastTractorbutton = $$("[class='mx-listview mx-listview-selectable mx-name-listView1 compact-listview'] [class='btn mx-button mx-name-actionButton17 buttonnonbordergreen-image fa fa-share-square btn-success']");
    ElementsCollection firstTractorClaimButton = $$("[class='btn mx-button mx-name-actionButton16 btn-success']");
    ElementsCollection changelastTrailerbutton = $$("[class='mx-listview mx-listview-selectable mx-name-listView1 compact-listview'] [class='btn mx-button mx-name-actionButton19 buttonnonbordergreen-image fa fa-share-square btn-success']");
    ElementsCollection firstTrailerClaimButton = $$("[class='btn mx-button mx-name-actionButton13 btn-success']");
    SelenideElement goToPlanningButton = $("[class='btn mx-button mx-name-actionButton1 btn-success']");

    ElementsCollection LastShipment = $$("[class='mx-layoutgrid mx-layoutgrid-fluid mx-name-layoutGrid33 center-align-childs']");
    SelenideElement tripActivitiesField = $("[class='mx-listview-item mx-name-index-1']");

    SelenideElement removeShipmentFromTripButton = $(" [class='btn mx-button mx-name-actionButton18 buttonnonborderred-image fa fa-times-circle btn-danger']");

    SelenideElement chooseStartAddress = $("[class*='mx-listview-item mx-name-index-0'] [class*='mx-referenceselector mx-name-referenceSelector9 h6'] [value='21673573206722155']");
    SelenideElement startAddress = $("[class*='mx-listview-item mx-name-index-0'] [class*='mx-referenceselector mx-name-referenceSelector9 h6']");
    SelenideElement chooseAttachingTrailerAddress = $("[class='mx-listview-item mx-name-index-1'] [class='mx-referenceselector mx-name-referenceSelector9 h6'] [value='21673573206722451']");
    SelenideElement AttachingTrailerAddress = $("[class='mx-listview-item mx-name-index-1'] [class='mx-referenceselector mx-name-referenceSelector9 h6']");
    SelenideElement DetachingTrailerAddress = $("[class='mx-listview-item mx-name-index-2'] [class='mx-referenceselector mx-name-referenceSelector9 h6']");
    SelenideElement chooseDetachingTrailerAddress = $("[class='mx-listview-item mx-name-index-2'] [class='mx-referenceselector mx-name-referenceSelector9 h6'] [value='21673573206720839']");
    SelenideElement endAddress = $("[class='mx-listview-item mx-name-index-3'] [class='mx-referenceselector mx-name-referenceSelector9 h6']");
    SelenideElement chooseEndAddress = $("[class='mx-listview-item mx-name-index-3'] [class='mx-referenceselector mx-name-referenceSelector9 h6'] [value='21673573206722117']");


    public PlanningPage clickPlansheetSelector() {
        plansheetSelector.click();
        return this;
    }

    public PlanningPage clickPlansheetItem() {
        plansheetItem.lastChild().click();
        sleep(1000);
        return this;
    }

    public PlanningPage clickBackToEditingButton() {
        return this;
    }

    public PlanningPage clickDeleteFirstActivityButton() {
        deleteFirstActivityButton.click();
        return this;
    }

    public PlanningPage clickEditPlansheetButton() {
        editPlansheetButton.click();
        return this;
    }

    public PlanningPage clickFirstNewTripButton() {
        firstNewTripButton.first().click();
        sleep(1000);
        return this;
    }

    public PlanningPage clickChangelastTractorbutton() {
        changelastTractorbutton.last().click();
        sleep(1000);
        return this;
    }

    public PlanningPage clickTractorClaimButton() {
        firstTractorClaimButton.first().click();
        sleep(1000);
        return this;
    }

    public PlanningPage clickChangelastTrailerbutton() {
        changelastTrailerbutton.last().click();
        sleep(1000);
        return this;
    }

    public PlanningPage clickTrailerClaimButton() {
        firstTrailerClaimButton.first().click();
        sleep(1000);
        return this;
    }

    public PlanningPage clickGoToPlanningButton() {
        goToPlanningButton.click();
        sleep(2000);
        return this;
    }

    public PlanningPage dragable() {
        sleep(6000);
        LastShipment.last().dragAndDropTo(tripActivitiesField);
        return this;
    }

    public PlanningPage clickRemoveShipmentFromTripButton() {
        sleep(1000);
        removeShipmentFromTripButton.click();
        return this;
    }

    public PlanningPage clickStartAddress() {
        startAddress.click();
        return this;
    }

    public PlanningPage clickChooseStartAddress() {
        chooseStartAddress.click();
        return this;
    }

    public PlanningPage clickAttachingTrailerAddress() {
        AttachingTrailerAddress.click();
        return this;
    }

    public PlanningPage clickChooseAttachingTrailerAddress() {
        chooseAttachingTrailerAddress.click();
        return this;
    }

    public PlanningPage clickDetachingTrailerAddress() {
        DetachingTrailerAddress.click();
        return this;
    }

    public PlanningPage clickChooseDetachingTrailerAddress() {
        chooseDetachingTrailerAddress.click();
        return this;
    }

    public PlanningPage clickEndAddress() {
        endAddress.click();
        return this;
    }

    public PlanningPage clickChooseEndAddress() {
        chooseEndAddress.click();
        return this;
    }
}
