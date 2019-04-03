package com.slim.ui.pageOblectClasses.Overview;

import com.codeborne.selenide.*;
import java.util.*;
import java.lang.*;
import java.util.List;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.slim.ui.pageOblectClasses.planning.PlanningPage.TractorLicense;
import static com.slim.ui.pageOblectClasses.planning.PlanningPage.TripNumber;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;


public class OverviewPage {
    ElementsCollection tripWithDriverLicence = $$("[class*='trip-status']");
    ElementsCollection tripWithoutDriverLicence = $$("[class*='trip-main trip-flex expandable']");
    ElementsCollection plannedTrips = $$("[chartertrip='false']");
    ElementsCollection charterTrips = $$("[chartertrip='true']");
    ElementsCollection tripOptions = $$("[class*='menu-option']");
    SelenideElement cancelUpdateButton = $("[class*='btn mx-button mx-name-actionButton2 btnRight > img btn-danger']");
    SelenideElement proceedButton = $("[class='modal-footer mx-dialog-footer'] [class*='btn btn-primary']");
    ElementsCollection lastShipment = $$("[class='mx-layoutgrid mx-layoutgrid-fluid mx-name-layoutGrid2 center-align-childs']");
    SelenideElement tripActivitiesField = $("[class='mx-layoutgrid mx-layoutgrid-fluid mx-name-layoutGrid18 center-align-childs']");
    SelenideElement recalculateTripButton = $("[class='btn mx-button mx-name-actionButton3 btnRight > img btn-success']");
    SelenideElement publishTripButton = $("[class*='glyphicon glyphicon-road']");
    SelenideElement okButton = $("[class='modal-footer mx-dialog-footer'] [class*='btn btn-primary']");
    ElementsCollection removeFirstShipmentFromTrip = $$("[class='btn mx-button mx-name-actionButton7 listview-content buttonnonborderred-image fa fa-times-circle btn-danger']");
    SelenideElement closeButton = $("[class='modal-dialog mx-window mx-window-active'] [class*='close']");
    SelenideElement tripDetailsButton = $("[class='btn mx-button mx-name-actionButton17 buttonnonborder-image fa fa-info-circle btn-info']");
    SelenideElement resultsTab = $("[class='mx-name-tabPage1']");
    ElementsCollection plannedPriceValue = $$("[class='mx-name-textBox35']");
    ElementsCollection plannedCostValue = $$("[class='mx-name-textBox16']");
    ElementsCollection plannedProfitValue = $$("[class='mx-name-textBox17']");
    SelenideElement revenueTotal = $("[class='mx-name-textBox3']");
    SelenideElement costTotal = $("[class='mx-name-textBox6']");
    SelenideElement profitTotal = $("[class='mx-name-textBox7']");
    SelenideElement iUnderstandButtonOnWarningPopUp = $("[class*='btn mx-button mx-name-actionButton1 fa-right fas fa-chevron-right btn-default']");
    // ElementsCollection tripActivities = $$("[class='timeline-item timeline-range timeline-selected timeline-readonly'][class='activities-row activities-plan']");
    double FinalSumPlannedPrice = 0;
    double FinalSumPlannedCost = 0;
    double FinalSumPlannedProfit = 0;

    public OverviewPage clickTrip(){
        sleep(5000);
        if (TractorLicense == null) {
            sleep(1000);
            tripWithoutDriverLicence.first().contextClick();
            System.out.println("Trip Without Driver Licence " + TractorLicense);
            sleep(1000);
        }
        else {
            sleep(1000);
            tripWithDriverLicence.findBy(Condition.exactText(TractorLicense)).contextClick();
            System.out.println("Find Last Trip " + TractorLicense);
            sleep(1000);
        }
        return this;
    }

    public OverviewPage clickPlannedTripTN() {
        sleep(5000);
        List<Integer> StartTimeAll = new ArrayList<Integer>();
        if (TripNumber == null) {
            sleep(1000);
            for (int i = 0; i < plannedTrips.size(); i++) {
                String StartTimeS = plannedTrips.get(i).getCssValue("startdatetime");
                int StartTimeI = Integer.parseInt(StartTimeS);
                StartTimeAll.add(StartTimeI);
                System.out.println("StartTimeI" + StartTimeI);
            }
            System.out.println("Start Time not sorted " + StartTimeAll);
            Collections.sort(StartTimeAll);
            System.out.println("Start Time sorted " + StartTimeAll);
            int StarTimeFirst = StartTimeAll.get(0);
            sleep(1000);
        } else {
            sleep(1000);
            for (int i = 0; i < plannedTrips.size(); i++) {
                String StartTimeS = plannedTrips.get(i).getCssValue("tripnumber");
                if (StartTimeS == TripNumber) {
                    plannedTrips.get(i).contextClick();
                    System.out.println("StartTimeS" + StartTimeS);
                    System.out.println("TripNumber" + TripNumber);
                }
            }
        }
        return this;
    }

    public OverviewPage clickCompleteTrip(){
        sleep(4000);
        if (TractorLicense == null) {
            sleep(1000);
            tripWithoutDriverLicence.first().click();
            System.out.println("Trip Without Tractor Licence " + TractorLicense);
            sleep(1000);
        }
        else {
            sleep(1000);
            tripWithDriverLicence.findBy(Condition.exactText(TractorLicense)).click();
            System.out.println("Find Last Trip " + TractorLicense);
            sleep(1000);
        }
        tripOptions.findBy(Condition.exactText("Rit Voltooien")).click();
      //  System.out.println("Rit Voltooien");
        return this;
    }
    public OverviewPage clickCloseButton(){
        sleep(5000);
        closeButton.click();
        return this;
    }
    public OverviewPage clickTripDetails(){
        sleep(1000);
        tripOptions.findBy(Condition.exactText("Rit Details")).click();
      //  System.out.println("Rit Details");
        sleep(1000);
        return this;
    }
    public OverviewPage clickTripUpdate(){
        sleep(1000);
        tripOptions.findBy(Condition.exactText("Rit Updaten")).click();
       // System.out.println("Rit Updaten");
        sleep(1000);
        return this;
    }
    public OverviewPage clickTripDetailsButton(){
        tripDetailsButton.click();
        sleep(2000);
        return this;
    }
    public OverviewPage findPriceSum(){
        List<Double> SumPlannedEachPrice = new ArrayList<Double>();
        for (int i = 0; i < plannedPriceValue.size(); i++) {
            String EachPrice = plannedPriceValue.get(i).getText();
            double PlannedEachPrice = Double.parseDouble(EachPrice);
            //     System.out.println("PlannedEachPrice " + PlannedEachPrice + " ");
            SumPlannedEachPrice.add(PlannedEachPrice);
            //   System.out.println("SumPlannedEachPrice " + SumPlannedEachPrice + " ");
        }
        FinalSumPlannedPrice = SumPlannedEachPrice.stream().mapToDouble(Double::doubleValue).sum();
        //  System.out.println("FinalSumPlannedPrice " + FinalSumPlannedPrice + " ");
        return this;
    }

    public OverviewPage findCostSum(){
        List<Double> SumPlannedEachCost = new ArrayList<Double>();
        for (int i = 0; i < plannedCostValue.size(); i++) {
            String EachCost = plannedCostValue.get(i).getText();
            double PlannedEachCost = Double.parseDouble(EachCost);
            //     System.out.println("PlannedEachCost " + PlannedEachCost + " ");
            SumPlannedEachCost.add(PlannedEachCost);
            //   System.out.println("SumPlannedEachCost " + SumPlannedEachCost + " ");
        }
        FinalSumPlannedCost = SumPlannedEachCost.stream().mapToDouble(Double::doubleValue).sum();
        //  System.out.println("FinalSumPlannedCost " + FinalSumPlannedCost + " ");
        return this;
    }
    public OverviewPage findProfitSum() {
        List<Double> SumPlannedEachProfit = new ArrayList<Double>();
        for (int i = 0; i < plannedProfitValue.size(); i++) {
            String EachProfit = plannedProfitValue.get(i).getText();
            double PlannedEachProfit = Double.parseDouble(EachProfit);
            //    System.out.println("PlannedEachProfit " + PlannedEachProfit + " ");
            SumPlannedEachProfit.add(PlannedEachProfit);
            //      System.out.println("SumPlannedEachProfit " + SumPlannedEachProfit + " ");
        }
        FinalSumPlannedProfit = SumPlannedEachProfit.stream().mapToDouble(Double::doubleValue).sum();
        //   System.out.println("FinalSumPlannedProfitSum " + FinalSumPlannedProfit + " ");
        return this;
    }

    public OverviewPage clickresultsTab(){
        resultsTab.click();

        findPriceSum();
        findCostSum();
        findProfitSum();

        int correctTest = 0; //variable for test is right
        //check for All Shipment Prices and Trip Total revenue
        String revenueTotalS = revenueTotal.getText();
        float revenueTotalF = Float.parseFloat(revenueTotalS);
        float roundRevenueTotalF = (float) Math.round(revenueTotalF);
        float roundFinalSumPlannedPrice = (float) Math.round(FinalSumPlannedPrice);
        if (roundRevenueTotalF == roundFinalSumPlannedPrice)
            System.out.println("roundRevenueTotalF equal roundFinalSumPlannedPrice " + " " + roundRevenueTotalF + " " + roundFinalSumPlannedPrice);
        else
            System.out.println("roundRevenueTotalF not equal roundFinalSumPlannedPrice " + " " + roundRevenueTotalF + " " + roundFinalSumPlannedPrice);

        //check for All Shipment Cost and Trip Total Cost
        String costTotalS = costTotal.getText();
        float costTotalF = Float.parseFloat(costTotalS);
        float roundCostTotalF= (float) Math.round(costTotalF);
        float roundFinalSumPlannedCost = (float) Math.round(FinalSumPlannedCost);
        if (roundCostTotalF == roundFinalSumPlannedCost){
            System.out.println("roundCostTotalF equal roundFinalSumPlannedCost " + " " + roundCostTotalF + " " + roundFinalSumPlannedCost);
            correctTest++;
            //System.out.println("correctTest1 " + correctTest);
        }
        else
            System.out.println("roundCostTotalF not equal roundFinalSumPlannedCost " + " " + roundCostTotalF + " " + roundFinalSumPlannedCost);

        //check for All Shipment Profit and Trip Total Profit
        String profitTotalS = profitTotal.getText();
        float profitTotalF = Float.parseFloat(profitTotalS);
        float roundProfitTotalF= (float) Math.round(profitTotalF);
        float roundFinalSumPlannedProfit = (float) Math.round(FinalSumPlannedProfit);
        if (roundProfitTotalF == roundFinalSumPlannedProfit){
            System.out.println("roundProfitTotalF equal roundFinalSumPlannedProfit " + " " + roundProfitTotalF + " " + roundFinalSumPlannedProfit);
            correctTest++;
            //System.out.println("correctTest2 " + correctTest);
        }
        else
            System.out.println("roundProfitTotalF not equal roundFinalSumPlannedProfit " + " " + roundProfitTotalF + " " + roundFinalSumPlannedProfit);

        //check if the Profit is right
        float ProfitCalculation = roundFinalSumPlannedPrice - roundFinalSumPlannedCost;
        if (ProfitCalculation == roundFinalSumPlannedProfit){
            System.out.println("ProfitCalculation equal roundFinalSumPlannedProfit " + " " + ProfitCalculation + " " + roundFinalSumPlannedProfit);
            correctTest++;
            //System.out.println("correctTest3 " + correctTest);
        }
        else
            System.out.println("ProfitCalculation not equal roundFinalSumPlannedProfit " + " " + ProfitCalculation + " " + roundFinalSumPlannedProfit);

        //check if the Cost is right
        float CostCalculation = roundFinalSumPlannedPrice - roundFinalSumPlannedProfit;
        if (CostCalculation == roundFinalSumPlannedCost){
            System.out.println("CostCalculation equal roundFinalSumPlannedCost " + " " + CostCalculation + " " + roundFinalSumPlannedCost);
            correctTest++;
            //System.out.println("correctTest4 " + correctTest);
        }
        else
            System.out.println("CostCalculation not equal roundFinalSumPlannedCost " + " " + CostCalculation + " " + roundFinalSumPlannedCost);


        //Autotest is correct
        if (correctTest == 4)
            System.out.println("Autotest on Overview Page is correct");
        else
            System.out.println("Autotest on Overview Page  not correct");

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
            return WebDriverRunner.getWebDriver().findElement(By.cssSelector("[class*='btn mx-button mx-name-actionButton1 fa-right fas fa-chevron-right btn-default']")).isDisplayed();
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