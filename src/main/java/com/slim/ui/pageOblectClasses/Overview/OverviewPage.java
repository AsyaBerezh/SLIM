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
import java.text.DecimalFormat;

public class OverviewPage {
    ElementsCollection tripWithDriverLicence = $$("[class='trip-title']");
    ElementsCollection tripWithoutDriverLicence = $$("[class*='trip-main trip-flex expandable']");
    ElementsCollection plannedTrips = $$("[chartertrip='false']");
    ElementsCollection charterTrips = $$("[chartertrip='true']");
    ElementsCollection tripOptions = $$("[class*='menu-option']");
    SelenideElement cancelUpdateButton = $("[class*='btn mx-button mx-name-actionButton2 fa-right fas fa-times btn-default']");
    SelenideElement proceedButton = $("[class='modal-footer mx-dialog-footer'] [class*='btn btn-primary']");
    ElementsCollection lastShipment = $$("[class='mx-layoutgrid mx-layoutgrid-fluid mx-name-layoutGrid2 center-align-childs']");
    SelenideElement tripActivitiesField = $("[class='mx-layoutgrid mx-layoutgrid-fluid mx-name-layoutGrid18 center-align-childs']");
    SelenideElement recalculateTripButton = $("[class='btn mx-button mx-name-actionButton3 fa-right fas fa-clock btn-success']");
    SelenideElement publishTripButton = $("[class*='btn mx-button mx-name-actionButton2 fa-right fas fa-road btn-success']");
    SelenideElement okButton = $("[class='modal-footer mx-dialog-footer'] [class*='btn btn-primary']");
    ElementsCollection removeFirstShipmentFromTrip = $$("[class='btn mx-button mx-name-actionButton7 listview-content buttonnonborderred-image fa fa-times-circle btn-danger']");
/*    SelenideElement closeButtonSecondWindow = $("[class*='modal-dialog mx-window mx-window-active'] [class*='close']");*/
    SelenideElement closeButtonWindow = $("[class*='close']");
    ElementsCollection closeButtons = $$("[class*='close']");
    SelenideElement tripDetailsButton = $("[class*='btn mx-button mx-name-actionButton17 buttonnonborder-image fas fa-info-circle btn-info']");
    SelenideElement resultsTab = $("[class='mx-name-tabPage4']");
    ElementsCollection plannedPriceValue = $$("[class='mx-name-textBox49']");
    ElementsCollection plannedCostValue = $$("[class='mx-name-textBox87']");
    ElementsCollection plannedProfitValue = $$("[class='mx-name-textBox88']");
    SelenideElement revenueTotal = $("[class='mx-name-textBox68']");
    SelenideElement costTotal = $("[class='mx-name-textBox93']");
    SelenideElement profitTotal = $("[class='mx-name-textBox94']");
    SelenideElement planningPageButton = $("[class='mx-link mx-name-actionButton20 far fa-calendar-plus']");
    SelenideElement iUnderstandButtonOnWarningPopUp = $("[class*='btn mx-button mx-name-actionButton1 fa-right fas fa-chevron-right btn-default']");
    SelenideElement backToEditingR = $("[class='btn mx-button mx-name-actionButton3 fas fa-chevron-left btn-default']");
    // ElementsCollection tripActivities = $$("[class='timeline-item timeline-range timeline-selected timeline-readonly'][class='activities-row activities-plan']");
    // SelenideElement iUnderstandButtonOnWarningPopUpWrong = $("[class*='btn mx-button mx-name-actionButton1 fas fa-chevron-left btn-default']");
    double FinalSumPlannedPrice = 0;
    double FinalSumPlannedCost = 0;
    double FinalSumPlannedProfit = 0;

    public OverviewPage clickBackToEditingR(){
        backToEditingR.click();
        return this;
    }
    public OverviewPage clickTrip(){
        sleep(5000);
        if (TractorLicense == null) {
            //sleep(1000);
            tripWithoutDriverLicence.first().contextClick();
            System.out.println("Trip Without Driver Licence " + TractorLicense);
            //sleep(1000);
        }
        else {
           // sleep(1000);
            tripWithDriverLicence.findBy(Condition.exactText(TractorLicense)).contextClick();
            System.out.println("Find Last Trip " + TractorLicense);
            //sleep(1000);
        }
        return this;
    }

    public OverviewPage clickPlannedTripTN() {
        sleep(5000);
        List<Long> StartTimeAll = new ArrayList<Long>();
        if (TripNumber == null) {
        //    sleep(1000);

            for (int i = 0; i < plannedTrips.filter(Condition.attribute("tripstatus","Planned")).size(); i++) {
                System.out.println("plannedTrips size =" + plannedTrips.filter(Condition.attribute("tripstatus","Planned")).size());
                String StartTimeS = plannedTrips.filter(Condition.attribute("tripstatus","Planned")).get(i).getAttribute("startdatetime");
                long StartTimeI = Long.parseLong(StartTimeS);
                StartTimeAll.add(StartTimeI);
                System.out.println("StartTimeI=" + StartTimeI);
                System.out.println("StartTimeS=" + StartTimeS);
            }
            System.out.println("Start Time not sorted " + StartTimeAll);
            Collections.sort(StartTimeAll,Collections.reverseOrder());
            System.out.println("Start Time sorted " + StartTimeAll);
            String StarTimeFirst = StartTimeAll.get(0).toString();
            System.out.println("StarTimeFirst" + StarTimeFirst);
            for (int i = 0; i < plannedTrips.filter(Condition.attribute("tripstatus","Planned")).size(); i++) {
                if (plannedTrips.filter(Condition.attribute("tripstatus","Planned")).get(i).getAttribute("startdatetime").contentEquals(StarTimeFirst))
                    plannedTrips.filter(Condition.attribute("tripstatus","Planned")).get(i).contextClick();
            }
          //  sleep(1000);
        } else {
           // sleep(1000);
            for (int i = 0; i < plannedTrips.filter(Condition.attribute("tripstatus","Planned")).size(); i++) {
                if (plannedTrips.filter(Condition.attribute("tripstatus","Planned")).get(i).getAttribute("tripnumber").contentEquals(TripNumber)) {
                    plannedTrips.filter(Condition.attribute("tripstatus","Planned")).get(i).contextClick();
                    System.out.println("tripnumber" + plannedTrips.filter(Condition.attribute("tripstatus","Planned")).get(i).getAttribute("tripnumber"));
                    System.out.println("TripNumber" + TripNumber);
                }
            }
        }
        return this;
    }
    public OverviewPage clickFirstPlannedTrip() {
        sleep(5000);
        List<Long> StartTimeAll = new ArrayList<Long>();
        for (int i = 0; i < plannedTrips.filter(Condition.attribute("tripstatus","Planned")).size(); i++) {
          //  System.out.println("plannedTrips size =" + plannedTrips.filter(Condition.attribute("tripstatus","Planned")).size());
            String StartTimeS = plannedTrips.filter(Condition.attribute("tripstatus","Planned")).get(i).getAttribute("startdatetime");
            long StartTimeI = Long.parseLong(StartTimeS);
            StartTimeAll.add(StartTimeI);
         //   System.out.println("StartTimeI=" + StartTimeI);
         //   System.out.println("StartTimeS=" + StartTimeS);
        }
        System.out.println("Start Time not sorted " + StartTimeAll);
        Collections.sort(StartTimeAll,Collections.reverseOrder());
        System.out.println("Start Time sorted " + StartTimeAll);
        String StarTimeFirst = StartTimeAll.get(0).toString();
        System.out.println("Start Time First " + StarTimeFirst);
        for (int i = 0; i < plannedTrips.filter(Condition.attribute("tripstatus","Planned")).size(); i++) {
            if (plannedTrips.filter(Condition.attribute("tripstatus","Planned")).get(i).getAttribute("startdatetime").contentEquals(StarTimeFirst))
                plannedTrips.filter(Condition.attribute("tripstatus","Planned")).get(i).contextClick();
        }
        return this;
    }
    public OverviewPage clickSecondPlannedTrip() {
        sleep(5000);
        List<Long> StartTimeAll = new ArrayList<Long>();
        for (int i = 0; i < plannedTrips.filter(Condition.attribute("tripstatus","Planned")).size(); i++) {
          //  System.out.println("plannedTrips size =" + plannedTrips.filter(Condition.attribute("tripstatus","Planned")).size());
            String StartTimeS = plannedTrips.filter(Condition.attribute("tripstatus","Planned")).get(i).getAttribute("startdatetime");
            long StartTimeI = Long.parseLong(StartTimeS);
            StartTimeAll.add(StartTimeI);
            //System.out.println("StartTimeI=" + StartTimeI);
            //System.out.println("StartTimeS=" + StartTimeS);
        }
        System.out.println("Start Time not sorted " + StartTimeAll);
        Collections.sort(StartTimeAll,Collections.reverseOrder());
        System.out.println("Start Time sorted " + StartTimeAll);
        String StarTimeFirst = StartTimeAll.get(1).toString();
        System.out.println("Start Time Second " + StarTimeFirst);
        for (int i = 0; i < plannedTrips.filter(Condition.attribute("tripstatus","Planned")).size(); i++) {
            if (plannedTrips.filter(Condition.attribute("tripstatus","Planned")).get(i).getAttribute("startdatetime").contentEquals(StarTimeFirst))
                plannedTrips.filter(Condition.attribute("tripstatus","Planned")).get(i).contextClick();
        }
        return this;
    }
    public OverviewPage clickCharterTrip() {
        sleep(5000);
        List<Long> StartTimeAll = new ArrayList<Long>();
        if (TripNumber == null) {
            sleep(1000);
            for (int i = 0; i < charterTrips.size(); i++) {
                System.out.println("charterTrips size =" + charterTrips.size());
                String StartTimeS = charterTrips.get(i).getAttribute("startdatetime");
                long StartTimeI = Long.parseLong(StartTimeS);
                StartTimeAll.add(StartTimeI);
                System.out.println("StartTimeI=" + StartTimeI);
                System.out.println("StartTimeS=" + StartTimeS);
            }
            System.out.println("Start Time not sorted " + StartTimeAll);
            Collections.sort(StartTimeAll,Collections.reverseOrder());
            System.out.println("Start Time sorted " + StartTimeAll);
            String StarTimeFirst = StartTimeAll.get(0).toString();
            System.out.println("StarTimeFirst" + StarTimeFirst);
            for (int i = 0; i < charterTrips.size(); i++) {
                if (charterTrips.get(i).getAttribute("startdatetime").contentEquals(StarTimeFirst))
                    charterTrips.get(i).contextClick();
            }
            sleep(1000);
        } else {
            sleep(1000);
            for (int i = 0; i < charterTrips.size(); i++) {
                if (charterTrips.get(i).getAttribute("tripnumber").contentEquals(TripNumber)) {
                    charterTrips.get(i).contextClick();
                    System.out.println("tripnumber" + charterTrips.get(i).getAttribute("tripnumber"));
                    System.out.println("TripNumber" + TripNumber);
                }
            }
        }
        return this;
    }
    public OverviewPage clickPlanningPagebutton(){
        planningPageButton.click();
        return this;
    }
    public OverviewPage clickCompleteTrip(){
 /*       sleep(4000);
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
        }*/
        tripOptions.findBy(Condition.exactText("Rit Voltooien")).click();
      //  System.out.println("Rit Voltooien");
        return this;
    }
    public OverviewPage clickCloseButtonSecondWindow(){
        closeButtons.get(1).click();
        return this;
    }
    public OverviewPage clickCloseButtonFirstWindow(){
       // sleep(5000);
        closeButtonWindow.click();
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
       // sleep(1000);
        tripOptions.findBy(Condition.exactText("Rit Updaten")).click();
       // System.out.println("Rit Updaten");
        //sleep(1000);
        return this;
    }
    public OverviewPage clickTripDetailsButton(){
        tripDetailsButton.click();
/*        sleep(2000);*/
        return this;
    }
    public OverviewPage findPriceSum(){
        List<Double> SumPlannedEachPrice = new ArrayList<Double>();
        for (int i = 0; i < plannedPriceValue.size(); i++) {
            String EachPrice = plannedPriceValue.get(i).getText().replace(",",".");
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
            String EachCost = plannedCostValue.get(i).getText().replace(",",".");
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
            String EachProfit = plannedProfitValue.get(i).getText().replace(",",".");
            double PlannedEachProfit = Double.parseDouble(EachProfit);
            //    System.out.println("PlannedEachProfit " + PlannedEachProfit + " ");
            SumPlannedEachProfit.add(PlannedEachProfit);
            //      System.out.println("SumPlannedEachProfit " + SumPlannedEachProfit + " ");
        }
        FinalSumPlannedProfit = SumPlannedEachProfit.stream().mapToDouble(Double::doubleValue).sum();
        //   System.out.println("FinalSumPlannedProfitSum " + FinalSumPlannedProfit + " ");
        return this;
    }

    public OverviewPage clickResultsTab(){
        resultsTab.click();

        findPriceSum();
        findCostSum();
        findProfitSum();

        int correctTest = 0; //variable for test is right
        //check for All Shipment Prices and Trip Total revenue
        String revenueTotalS = revenueTotal.getText().replace(",",".");
        double revenueTotalD = Double.parseDouble(revenueTotalS);
/*        float roundRevenueTotalF = (float) Math.round(revenueTotalD);
        float roundFinalSumPlannedPrice = (float) Math.round(FinalSumPlannedPrice);
        if (roundRevenueTotalF == roundFinalSumPlannedPrice)
            System.out.println("roundRevenueTotalF equal roundFinalSumPlannedPrice " + " " + roundRevenueTotalF + " " + roundFinalSumPlannedPrice);
        else
            System.out.println("roundRevenueTotalF not equal roundFinalSumPlannedPrice " + " " + roundRevenueTotalF + " " + roundFinalSumPlannedPrice);*/
        if (revenueTotalD == Double.parseDouble(new DecimalFormat("##.####").format(FinalSumPlannedPrice))) {
            System.out.println("revenueTotalD equal FinalSumPlannedPrice " + " " + revenueTotalD + " " + FinalSumPlannedPrice);
            correctTest++;
        }
        else
            System.out.println("revenueTotalD not equal FinalSumPlannedPrice " + " " + revenueTotalD + " " + FinalSumPlannedPrice);

        //check for All Shipment Cost and Trip Total Cost
        String costTotalS = costTotal.getText().replace(",",".");
        double costTotalD = Double.parseDouble(costTotalS);
/*         float roundCostTotalF= (float) Math.round(costTotalD);
       float roundFinalSumPlannedCost = (float) Math.round(FinalSumPlannedCost);
        if (roundCostTotalF == roundFinalSumPlannedCost){
            System.out.println("roundCostTotalF equal roundFinalSumPlannedCost " + " " + roundCostTotalF + " " + roundFinalSumPlannedCost);
            correctTest++;
            //System.out.println("correctTest1 " + correctTest);
        }
        else
            System.out.println("roundCostTotalF not equal roundFinalSumPlannedCost " + " " + roundCostTotalF + " " + roundFinalSumPlannedCost);*/
        if (costTotalD == Double.parseDouble(new DecimalFormat("##.####").format(FinalSumPlannedCost))){
            System.out.println("costTotalD equal FinalSumPlannedCost " + " " + costTotalD + " " + FinalSumPlannedCost);
            correctTest++;
            //System.out.println("correctTest1 " + correctTest);
        }
        else
            System.out.println("costTotalD not equal FinalSumPlannedCost " + " " + costTotalD + " " + FinalSumPlannedCost);

        //check for All Shipment Profit and Trip Total Profit
        String profitTotalS = profitTotal.getText().replace(",",".");
        double profitTotalD = Double.parseDouble(profitTotalS);
      /*  float roundProfitTotalF= (float) Math.round(profitTotalD);
        float roundFinalSumPlannedProfit = (float) Math.round(FinalSumPlannedProfit);
        if (roundProfitTotalF == roundFinalSumPlannedProfit){
            System.out.println("roundProfitTotalF equal roundFinalSumPlannedProfit " + " " + roundProfitTotalF + " " + roundFinalSumPlannedProfit);
            correctTest++;
            //System.out.println("correctTest2 " + correctTest);
        }
        else
            System.out.println("roundProfitTotalF not equal roundFinalSumPlannedProfit " + " " + roundProfitTotalF + " " + roundFinalSumPlannedProfit);*/
        if (profitTotalD == Double.parseDouble(new DecimalFormat("##.####").format(FinalSumPlannedProfit))){
            System.out.println("profitTotalD equal FinalSumPlannedProfit " + " " + profitTotalD + " " + FinalSumPlannedProfit);
            correctTest++;
            //System.out.println("correctTest2 " + correctTest);
        }
        else
            System.out.println("profitTotalD not equal FinalSumPlannedProfit " + " " + profitTotalD + " " + FinalSumPlannedProfit);

        //check if the Profit is right
        double ProfitCalculation = FinalSumPlannedPrice - FinalSumPlannedCost;
        ProfitCalculation = Double.parseDouble(new DecimalFormat("##.####").format(ProfitCalculation));
        if (ProfitCalculation == FinalSumPlannedProfit)
        {
            System.out.println("ProfitCalculation equal FinalSumPlannedProfit " + " " + ProfitCalculation + " " + FinalSumPlannedProfit);
            correctTest++;
            //System.out.println("correctTest3 " + correctTest);
        }
        else
            System.out.println("ProfitCalculation not equal FinalSumPlannedProfit " + " " + ProfitCalculation + " " + FinalSumPlannedProfit);

        //check if the Cost is right
        double CostCalculation = FinalSumPlannedPrice - FinalSumPlannedProfit;
        CostCalculation = Double.parseDouble(new DecimalFormat("##.####").format(CostCalculation));
        if (CostCalculation == FinalSumPlannedCost){
            System.out.println("CostCalculation equal FinalSumPlannedCost " + " " + CostCalculation + " " + FinalSumPlannedCost);
            correctTest++;
            //System.out.println("correctTest4 " + correctTest);
        }
        else
            System.out.println("CostCalculation not equal FinalSumPlannedCost " + " " + CostCalculation + " " + FinalSumPlannedCost);


        //Autotest is correct
        if (correctTest == 5)
            System.out.println("Autotest on Overview Page is correct");
        else
            System.out.println("Autotest on Overview Page is not correct");

       // sleep(1000);
        return this;
    }

    public OverviewPage clickCancelUpdateButton(){
      //  sleep(8000);
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
        //sleep(1000);
        recalculateTripButton.click();
        return this;
    }
    public OverviewPage clickRemoveFirstShipmentFromTrip(){
        removeFirstShipmentFromTrip.first().click();
        return this;
    }
/*    public OverviewPage clickIUnderstandButtonOnWarningPopUp(){
        if (isWarningPopUpPresent()) {
            //sleep(2000);
            if (iUnderstandButtonOnWarningPopUpWrong.isDisplayed())
                iUnderstandButtonOnWarningPopUpWrong.click();
            else
                iUnderstandButtonOnWarningPopUp.click();
        }
        return this;
    }
    public Boolean isWarningPopUpPresent() {
        try {
            return WebDriverRunner.getWebDriver().findElement(By.cssSelector("[class*='btn mx-button mx-name-actionButton1 fas fa-chevron-left btn-default']")).isDisplayed() || WebDriverRunner.getWebDriver().findElement(By.cssSelector("[class*='btn mx-button mx-name-actionButton1 fa-right fas fa-chevron-right btn-default']")).isDisplayed() ;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }*/
public OverviewPage clickIUnderstandButtonOnWarningPopUp(){
    if (isWarningPopUpPresent()) {
        iUnderstandButtonOnWarningPopUp.waitUntil(Condition.visible,1000).click();
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
      //  sleep(2000);
        publishTripButton.click();
        return this;
    }
    public OverviewPage clickOKButton(){
     //   sleep(2000);
        okButton.click();
        return this;
    }
}