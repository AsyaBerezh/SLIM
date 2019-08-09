package com.slim.ui.pageOblectClasses.planning;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import sun.plugin.javascript.navig.Window;

import java.awt.*;
import java.awt.event.WindowStateListener;
import java.util.*;
import java.lang.*;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class PlanningPage {
    SelenideElement plansheetSelector = $("[class*='mx-referenceselector'] [class*='form-control']");
    SelenideElement plansheetItem = $("[class*='mx-referenceselector'] [class*='form-control'] [value='27303072740935138']");
    SelenideElement backToEditingButton = $("[class*='btn mx-button mx-name-actionButton3 btnRight > img btn-inverse']");
    SelenideElement deleteFirstActivityButton = $("[class='mx-listview-item mx-name-index-2'] [class*='btn mx-button mx-name-actionButton18 buttonnonborderred-image fa fa-times-circle btn-danger']");
    SelenideElement editPlansheetButton = $("[class='btn mx-button mx-name-actionButton7 fa-right fas fa-edit btn-default']");
    ElementsCollection newTripButton = $$("[class='btn mx-button mx-name-actionButton15 fa-right fas fa-plus btn-success']");
    ElementsCollection changeTractorButton = $$("[class='btn mx-button mx-name-actionButton17 buttonnonborder-image fas fa-external-link-alt btn-info']");
    ElementsCollection tractorClaimButton = $$("[class='btn mx-button mx-name-actionButton16 fa-right fas fa-chevron-right btn-default']");
    ElementsCollection changeTrailerButton = $$("[class='btn mx-button mx-name-actionButton19 buttonnonborder-image fas fa-external-link-alt btn-info']");
    ElementsCollection trailerClaimButton = $$("[class='btn mx-button mx-name-actionButton13 fa-right fas fa-chevron-right btn-default']");
    SelenideElement goToPlanningButton = $("[class='btn mx-button mx-name-actionButton1 fa-right fas fa-chevron-right btn-default']");
    ElementsCollection deleteTrailerButton = $$("[class='btn mx-button mx-name-actionButton6 buttonnonborderred-image fa fa-times-circle btn-danger']");
    ElementsCollection ShipmentList = $$("[class='mx-layoutgrid mx-layoutgrid-fluid mx-name-layoutGrid33 center-align-childs']");
    SelenideElement tripActivitiesField = $("[class='mx-listview-item mx-name-index-1']");
    SelenideElement yesButton = $("[class*='btn btn-primary']");
    ElementsCollection removeShipmentFromTripButton = $$(" [class='btn mx-button mx-name-actionButton18 buttonnonborderred-image fa fa-times-circle btn-danger']");
    SelenideElement calculateTripButton = $("[class='btn mx-button mx-name-actionButton1 fa-right fas fa-clock btn-success']");
    SelenideElement chooseStartAddress = $("[class*='mx-listview-item mx-name-index-0'] [class*='mx-referenceselector mx-name-referenceSelector9 h6'] [value='21673573206722155']");
    SelenideElement startAddress = $("[class*='mx-listview-item mx-name-index-0'] [class*='mx-referenceselector mx-name-referenceSelector9 h6'] [class='form-control']");
    SelenideElement chooseAttachingTrailerAddress = $("[class='mx-listview-item mx-name-index-1'] [class='mx-referenceselector mx-name-referenceSelector9 h6'] [value='21673573206722451']");
    SelenideElement attachingTrailerAddress = $("[class='mx-listview-item mx-name-index-1'] [class='mx-referenceselector mx-name-referenceSelector9 h6'] [class='form-control']");
    SelenideElement detachingTrailerAddress = $("[class='mx-listview-item mx-name-index-2'] [class='mx-referenceselector mx-name-referenceSelector9 h6'] [class='form-control']");
    SelenideElement chooseDetachingTrailerAddress = $("[class='mx-listview-item mx-name-index-2'] [class='mx-referenceselector mx-name-referenceSelector9 h6'] [value='21673573206720839']");
    SelenideElement endAddress = $("[class='mx-listview-item mx-name-index-3'] [class='mx-referenceselector mx-name-referenceSelector9 h6'] [class='form-control']");
    SelenideElement chooseEndAddress = $("[class='mx-listview-item mx-name-index-3'] [class='mx-referenceselector mx-name-referenceSelector9 h6'] [value='21673573206722117']");
    SelenideElement overviewButton = $("[class*='mx-link mx-name-actionButton21 far fa-list-alt']");
    ElementsCollection fromInputListField = $$("[class*='mx-name-textBox23'] input");
    ElementsCollection untilInputListField = $$("[class*='mx-name-textBox24'] input");

    SelenideElement publishTripButton = $("[class='btn mx-button mx-name-actionButton2 fa-right fas fa-road btn-success']");
    SelenideElement iUnderstandButtonOnWarningPopUp = $("[class*='btn mx-button mx-name-actionButton1 fa-right fas fa-chevron-right btn-default']");
    ElementsCollection tranctorLicense = $$("[class='mx-name-textBox3 listview-content']");
    ElementsCollection trailerLicense = $$("[class='mx-name-textBox4 listview-content']");
    SelenideElement tripDetailsButton = $("[class='btn mx-button mx-name-actionButton16 buttonnonborder-image fa fa-info-circle btn-info']");
    SelenideElement resultsTab = $("[class='mx-name-tabPage1']");
    SelenideElement closeButton = $("[class='close']");
    SelenideElement tripNumber = $("[class='modal-body mx-dialog-body']");
    ElementsCollection plannedPriceValue = $$("[class='mx-name-textBox35']");
    ElementsCollection plannedCostValue = $$("[class='mx-name-textBox16']");
    ElementsCollection plannedProfitValue = $$("[class='mx-name-textBox17']");
    SelenideElement revenueTotal = $("[class='mx-name-textBox3']");
    SelenideElement costTotal = $("[class='mx-name-textBox6']");
    SelenideElement profitTotal = $("[class='mx-name-textBox7']");
    double FinalSumPlannedPrice = 0;
    double FinalSumPlannedCost = 0;
    double FinalSumPlannedProfit = 0;
    static public String TractorLicense; // с большой, что бы отличалось от селектора
    static public String TrailerLicense; // с большой, что бы отличалось от селектора
    static public String TripNumber;


    public String getTripNumber(String tNumber){
        TripNumber = tripNumber.getText().substring(26, 40);
        System.out.println(TripNumber);
        return TripNumber;
    }
    public PlanningPage inputTimeToEveryField(String fromTime, String untilTime){
        String timeWithoutDotFrom = fromTime.replace(":", "");
        String timeWithoutDotUntil = untilTime.replace(":", "");
        for (int i = 0; i <fromInputListField.size(); i++) {
            sleep(250);
            fromInputListField.get(i).click();
            fromInputListField.get(i).clear();
            sleep(550);
            fromInputListField.get(i).setValue(timeWithoutDotFrom);
            sleep(250);
            untilInputListField.get(i).click();
            untilInputListField.get(i).clear();
            sleep(550);
            untilInputListField.get(i).setValue(timeWithoutDotUntil);
        }
        return this;
    }

    public PlanningPage clickOverviewButton(){
        overviewButton.click();
        return this;
    }
    public PlanningPage inputTimeToFirstFromUntilTime(String fromTime, String untilTime) {
        fromInputListField.first().click();
        sleep(550);
        String timeWithoutDotFrom = fromTime.replace(":", "");
        fromInputListField.first().setValue(timeWithoutDotFrom);

        String timeWithoutDotUntil = untilTime.replace(":", "");
        untilInputListField.first().click();
        sleep(550);
        untilInputListField.first().clear();
        untilInputListField.first().setValue(timeWithoutDotUntil).pressEnter();
        return this;
    }

    public PlanningPage clickPlansheetSelector() {
        plansheetSelector.click();
        return this;
    }
    public PlanningPage clickPlansheetItem() {
        plansheetItem.click();
        sleep(1000);
        return this;
    }
    public PlanningPage clickBackToEditingButton() {
        backToEditingButton.click();
        return this;
    }
    public PlanningPage clickTripDetailsButton(){
        tripDetailsButton.click();
        sleep(2000);
        return this;
    }
    public PlanningPage clickCloseButton(){
        closeButton.click();
        return this;
    }

    public PlanningPage findPriceSum(){
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

    public PlanningPage findCostSum(){
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
    public PlanningPage findProfitSum() {
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

    public PlanningPage clickresultsTab(){
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
            System.out.println("Revenue equal Prices sum " + " " + roundRevenueTotalF + " " + roundFinalSumPlannedPrice);
        else
            System.out.println("Revenue is not equal Prices sum " + " " + roundRevenueTotalF + " " + roundFinalSumPlannedPrice);

        //check for All Shipment Cost and Trip Total Cost
        String costTotalS = costTotal.getText();
        float costTotalF = Float.parseFloat(costTotalS);
        float roundCostTotalF= (float) Math.round(costTotalF);
        float roundFinalSumPlannedCost = (float) Math.round(FinalSumPlannedCost);
        if (roundCostTotalF == roundFinalSumPlannedCost){
            System.out.println("Total Cost equal Costs sum " + " " + roundCostTotalF + " " + roundFinalSumPlannedCost);
            correctTest++;
            //System.out.println("correctTest1 " + correctTest);
        }
        else
            System.out.println("Total Cost is not equal Costs sum  " + " " + roundCostTotalF + " " + roundFinalSumPlannedCost);

        //check for All Shipment Profit and Trip Total Profit
        String profitTotalS = profitTotal.getText();
        float profitTotalF = Float.parseFloat(profitTotalS);
        float roundProfitTotalF= (float) Math.round(profitTotalF);
        float roundFinalSumPlannedProfit = (float) Math.round(FinalSumPlannedProfit);
        if (roundProfitTotalF == roundFinalSumPlannedProfit){
          System.out.println("Total Profit equal Profit sum " + " " + roundProfitTotalF + " " + roundFinalSumPlannedProfit);
          correctTest++;
          //System.out.println("correctTest2 " + correctTest);
        }
        else
            System.out.println("Total Profit is not equal Profit sum " + " " + roundProfitTotalF + " " + roundFinalSumPlannedProfit);

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
            System.out.println("Autotest on Planning Page is correct");
        else
            System.out.println("Autotest on Planning Page is not correct");

        sleep(1000);
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

    public PlanningPage clickRandomNewTripButton() {
        sleep(2000);
        Collection resourceButtons;
        resourceButtons = newTripButton;
        int size = resourceButtons.size();
        int rand = new Random().nextInt(size);
        ((ElementsCollection) resourceButtons).get(rand).click();
        //System.out.println("ResourceButtons rand " + rand);
        return this;
    }
    public PlanningPage clickDeleteAttachingTrailerButton(){
        deleteTrailerButton.first().click();
        return this;
    }
    public PlanningPage clickDeleteDetachingTrailerButton(){
        deleteTrailerButton.last().click();
        return this;
    }
    public PlanningPage clickChangelastTractorbutton() {
        changeTractorButton.last().click();
        sleep(1000);
        return this;
    }
    public PlanningPage checkLicenses(){
        sleep(1000);

        getValueTractorLicense(TractorLicense);
        if (TractorLicense != null && TractorLicense.trim().isEmpty())
        {
            // if Tractor License is empty
            sleep(500);
            clickChangelastTractorbutton();
            sleep(500);
           // tractorClaimButton.last().click();
            clickTractorClaimButton();
        }
        sleep(500);

        getValueTrailerLicense(TrailerLicense);
        if (TrailerLicense  != null && TrailerLicense.trim().isEmpty()){
            //if Trailer License is empty
            sleep(500);
            getValueTractorLicense(TractorLicense);
            //sleep(500);
            clickChangelastTrailerbutton();
            sleep(500);
            clickRandomTrailerClaimButton();
        }
        else
        {
            //if Trailer License is not empty
            //We need it to find the trip on Overview Page
            getValueTractorLicense(TractorLicense);
        }
        return this;
    }

    public String getValueTractorLicense(String Tractor){

        TractorLicense = tranctorLicense.last().getText();
        return TractorLicense;
    }
    public String getValueTrailerLicense(String Trailer){

        TrailerLicense = trailerLicense.last().getText();
        return TrailerLicense;
    }
    public PlanningPage clickTractorClaimButton() {
        sleep(500);
        Collection tractorButtons;
        tractorButtons = tractorClaimButton;
        int size = tractorButtons.size();
        int rand = new Random().nextInt(size);
        ((ElementsCollection) tractorButtons).get(rand).click();
        sleep(500);
        //System.out.println("Tractor rand: " + rand);
        return this;
    }
    public PlanningPage clickChangelastTrailerbutton() {
        changeTrailerButton.last().click();
        sleep(1000);
        return this;
    }
    public PlanningPage clickRandomTrailerClaimButton() {
        sleep(1000);
        Collection trailerButtons;
        trailerButtons = trailerClaimButton;
        int size = trailerButtons.size();
        int rand = new Random().nextInt(size);
        ((ElementsCollection) trailerButtons).get(rand).click();
        //System.out.println("Trailer rand " +rand);
        sleep(1000);
        return this;
    }

    public PlanningPage clickGoToPlanningButton() {
        goToPlanningButton.click();
        sleep(2000);
        return this;
    }
    public PlanningPage dragLastShipment() {
        sleep(2000);
        ShipmentList.last().dragAndDropTo(tripActivitiesField);
        return this;
    }
    public PlanningPage clickRemoveFirstShipmentFromTripButton() {
        sleep(1000);
        removeShipmentFromTripButton.first().click();
        return this;
    }
    public PlanningPage clickRemoveLastShipmentFromTripButton() {
        sleep(1000);
        removeShipmentFromTripButton.last().click();
        return this;
    }
    public PlanningPage changeAddresses(){
        //Function to combine all checks of addresses in Planning page
        clickStartAddress();
        clickAttachingTrailerAddress();
        clickDetachingTrailerAddress();
        clickEndAddress();
        return this;
    }
    public PlanningPage clickStartAddress() {

        String StartAddress = startAddress.getSelectedText();
        //System.out.println("Start Address"+StartAddress+"||");
        if (StartAddress.contentEquals("Selecteer Adres")|| StartAddress.trim().contentEquals(""))
        {
            startAddress.click();
            chooseStartAddress.click();
        }
        return this;
    }

    public PlanningPage clickAttachingTrailerAddress() {
        String AttachingTrailerAddress = attachingTrailerAddress.getSelectedText();
        //System.out.println("Attaching Trailer Address"+AttachingTrailerAddress+"||");
        if (AttachingTrailerAddress.contentEquals("Selecteer Adres"))
        {
            attachingTrailerAddress.click();
            chooseAttachingTrailerAddress.click();
        }
        return this;
    }
    public PlanningPage clickDetachingTrailerAddress() {
        String DetachingTrailerAddress = detachingTrailerAddress.getSelectedText();
      //  System.out.println("Detaching Trailer Address"+DetachingTrailerAddress+"||");
        if (DetachingTrailerAddress.contentEquals("Selecteer Adres"))
        {
            detachingTrailerAddress.click();
            chooseDetachingTrailerAddress.click();
        }

        return this;
    }
    public PlanningPage clickEndAddress() {
        String EndAddress = endAddress.getSelectedText();
   //     System.out.println("End Address"+EndAddress+"||");
        if (EndAddress.contentEquals("Selecteer Adres"))
        {
            endAddress.click();
            chooseEndAddress.click();
        }
        return this;
    }
    public PlanningPage clickYesButton(){
        getTripNumber(TripNumber);
        yesButton.click();
        return this;
    }
    public PlanningPage clickCalculateTripButton(){
        sleep(1000);
        calculateTripButton.click();
        return this;
    }
    public PlanningPage clickPublishTripButton(){
        publishTripButton.click();
        return this;
    }
    public PlanningPage clickIUnderstandButtonOnWarningPopUp(){
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
}
