package com.slim.ui.pageOblectClasses.Overview;

import com.codeborne.selenide.*;
import com.slim.ui.pageOblectClasses.planning.PlanningPage;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
public class OverviewPage {
    ElementsCollection trip = $$("[class='trip-main trip-flex expandable']");
    ElementsCollection tripOptions = $$("[class*='menu-option']");
    SelenideElement cancelUpdateButton = $("[class*='btn mx-button mx-name-actionButton2 btnRight > img btn-danger']");
    SelenideElement proceedButton = $("[class='modal-footer mx-dialog-footer'] [class*='btn btn-primary']");
    ElementsCollection lastShipment = $$("[class='mx-layoutgrid mx-layoutgrid-fluid mx-name-layoutGrid2 center-align-childs']");
    SelenideElement tripActivitiesField = $("[class='mx-layoutgrid mx-layoutgrid-fluid mx-name-layoutGrid18 center-align-childs']");
    SelenideElement recalculateTripButton = $("[class='btn mx-button mx-name-actionButton3 btnRight > img btn-success']");
    SelenideElement iUnderstandButtonOnWarningPopUp = $("[class*='btn mx-button mx-name-actionButton1 btn-success']");
    SelenideElement publishTripButton = $("[class*='btn mx-button mx-name-actionButton2 btnRight > img btn-success']");
    SelenideElement okButton = $("[class='modal-footer mx-dialog-footer'] [class*='btn btn-primary']");
    ElementsCollection removeFirstShipmentFromTrip = $$("[class='btn mx-button mx-name-actionButton7 listview-content buttonnonborderred-image fa fa-times-circle btn-danger']");

    public OverviewPage clickTrip(){
        sleep(6000);
        trip.last().contextClick();
        return this;
    }
    public OverviewPage clickTripDetails(){
        tripOptions.first().click();
        sleep(1000);
        return this;
    }
    public OverviewPage clickTripUpdate(){
        tripOptions.last().click();
        sleep(1000);
        return this;
    }
    public OverviewPage clickCancelUpdateButton(){
        sleep(8000);
        cancelUpdateButton.click();
        return this;
    }
    public OverviewPage clickProceedButton(){
        proceedButton.click();
        sleep(1000);
        return this;
    }

    public OverviewPage dragableUpdate(){
        sleep(2000);
        lastShipment.last().dragAndDropTo(tripActivitiesField);
        return this;
    }
    public OverviewPage clickRecalculateTripButton(){
        sleep(1000);
        recalculateTripButton.click();
        return this;
    }
    public OverviewPage clickRemoveFirstShipmentFromTrip(){
        removeFirstShipmentFromTrip.first().click();
        return this;
    }
    public OverviewPage clickIUnderstandButtonOnWarningPopUp(){
        if (isWarningPopUpPresent()) {
            sleep(2000);
            iUnderstandButtonOnWarningPopUp.click();
        }
        return this;
    }
    public Boolean isWarningPopUpPresent() {
        try {
            sleep(2000);
            return WebDriverRunner.getWebDriver().findElement(By.cssSelector("[class*='btn mx-button mx-name-actionButton1 btn-success']")).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
    public OverviewPage clickPublishTripButton(){
        sleep(2000);
        publishTripButton.click();
        return this;
    }
    public OverviewPage clickOKButton(){
        sleep(2000);
        okButton.click();
        return this;
    }
}