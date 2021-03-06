package com.slim.ui.pageOblectClasses.planning;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.text.DecimalFormat;
import java.util.regex.*;
import java.util.*;
import java.lang.*;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;
import static com.slim.ui.dataGenerator.DataGenerator.getTime;

public class PlanningPage {
    SelenideElement plansheetSelector = $("[class*='mx-referenceselector'] [class*='form-control']");
    ElementsCollection plansheetSelector2 = $$("[class*='mx-referenceselector'] [class*='form-control']");
    SelenideElement plansheetItem = $("[class*='mx-referenceselector'] [class*='form-control'] [value='27303072740938334']");
    SelenideElement backToEditingButton = $("[class='btn mx-button mx-name-actionButton3 fas fa-chevron-left btn-default']");
    SelenideElement deleteFirstActivityButton = $("[class='mx-listview-item mx-name-index-2'] [class*='btn mx-button mx-name-actionButton18 buttonnonborderred-image fa fa-times-circle btn-danger']");
    SelenideElement editPlansheetButton = $("[class='btn mx-button mx-name-actionButton7 fa-right fas fa-edit btn-default']");
    ElementsCollection newTripButton = $$("[class='btn mx-button mx-name-actionButton15 fa-right fas fa-plus btn-success']");
    ElementsCollection tractorClaimButton = $$("[class='btn mx-button mx-name-actionButton16 fa-right fas fa-chevron-right btn-default']");
    ElementsCollection trailerClaimButton = $$("[class='btn mx-button mx-name-actionButton13 fa-right fas fa-chevron-right btn-default']");
    SelenideElement goToPlanningButton = $("[class='btn mx-button mx-name-actionButton1 fa-right fas fa-chevron-right btn-default']");
    ElementsCollection deleteTrailerButton = $$("[class='btn mx-button mx-name-actionButton6 buttonnonborderred-image far fa-times-square btn-danger']");
    ElementsCollection shipmentList = $$("[class*='mx-layoutgrid mx-layoutgrid-fluid mx-name-layoutGrid33 center-align-childs']");
    SelenideElement tripActivitiesField = $("[class='mx-name-textBox2 h6']");
    SelenideElement yesButton = $("[class*='btn btn-primary']");
    ElementsCollection removeShipmentFromTripButton = $$(" [class='btn mx-button mx-name-actionButton18 buttonnonborderred-image fa fa-times-circle btn-danger']");
    SelenideElement calculateTripButton = $("[class*='btn mx-button mx-name-actionButton1 fa-right fas fa-clock ml-10 btn-success']");
    ElementsCollection drivers = $$("[class='mx-name-textBox8 h6']");
    SelenideElement textRittenInPlanblad = $("[class='mx-text mx-name-text8']");
    ElementsCollection tripToPlan = $$("[class='mx-name-column2 mx-left-aligned']");
    ElementsCollection deleteTripButtons =$$("[class*='btn mx-button mx-name-actionButton10 buttonnonborderred-image far fa-times-square btn-danger']");
    SelenideElement startAddressInputField = $("[class='mx-listview-item mx-name-index-0'] [class*='input-group'] input");
    SelenideElement startAddressSearchButton = $("[class='mx-listview-item mx-name-index-0'] [class*='btn btn-default']");
    SelenideElement secondAddressFromAddressBook = $("[class='mx-name-index-1']");
    SelenideElement attachingTrailerInputField = $("[class='mx-listview-item mx-name-index-1'] [class*='input-group'] input");
    SelenideElement attachingTrailerSearchButton = $("[class='mx-listview-item mx-name-index-1'] [class='btn btn-default']");
    SelenideElement detachingTrailerInputField = $("[class='mx-listview-item mx-name-index-2'] [class*='input-group'] input");
    SelenideElement detachingTrailerSearchButton = $("[class='mx-listview-item mx-name-index-2'] [class='btn btn-default']");
    SelenideElement endAddressInputField = $("[class='mx-listview-item mx-name-index-3'] [class*='input-group'] input");
    SelenideElement endAddressSearchButton = $("[class='mx-listview-item mx-name-index-3'] [class*='btn btn-default']");
    SelenideElement overviewButton = $("[class*='mx-link mx-name-actionButton21 far fa-list-alt']");
    ElementsCollection fromInputListField = $$("[class='mx-name-textBox25 timefrom'] input");
    ElementsCollection untilInputListField = $$("[class='mx-name-textBox26 timeuntil'] input");

    SelenideElement publishTripButton = $("[class='btn mx-button mx-name-actionButton2 fa-right fas fa-road btn-success']");
    SelenideElement iUnderstandButtonOnWarningPopUp = $("[class*='btn mx-button mx-name-actionButton1 fa-right fas fa-chevron-right btn-default']");
    SelenideElement iUnderstandButtonOnAddressWarningPopUp = $("[class*='btn mx-button mx-name-actionButton10 fa-right fas fa-chevron-right btn-default']");
    ElementsCollection tripsInPlansheet = $$("[class='mx-layoutgrid mx-layoutgrid-fluid mx-name-layoutGrid2']");
    SelenideElement tripDetailsButton = $("[class='btn mx-button mx-name-actionButton16 buttonnonborder-image fas fa-info-circle btn-info']");
    SelenideElement resultsTab = $("[class='mx-name-tabPage4']");
    SelenideElement closeButton = $("[class='close']");
    SelenideElement tripNumber = $("[class='modal-body mx-dialog-body']");
    ElementsCollection plannedPriceValue = $$("[class='mx-name-textBox48']");
    ElementsCollection plannedCostValue = $$("[class='mx-name-textBox84']");
    ElementsCollection plannedProfitValue = $$("[class='mx-name-textBox85']");
    SelenideElement revenueTotal = $("[class='mx-name-textBox67']");
    SelenideElement costTotal = $("[class='mx-name-textBox90']");
    SelenideElement profitTotal = $("[class='mx-name-textBox91']");
    double FinalSumPlannedPrice = 0;
    double FinalSumPlannedCost = 0;
    double FinalSumPlannedProfit = 0;
    static public String TractorLicense; // с большой, что бы отличалось от селектора
    static public String TrailerLicense; // с большой, что бы отличалось от селектора
    static public String TripNumber;
    String RandomDriver;

    public String getTripNumber(String tNumber){
        String tripNumberContent = tripNumber.getText();
        Pattern tripNumberPattern = Pattern.compile("[0-9]{8}- T[0-9][0-9][0-9]");
        Matcher matcher = tripNumberPattern.matcher(tripNumberContent);
/*        System.out.println("Trip Number String" + tripNumberContent);
        System.out.println("Trip Number Pattern" + tripNumberPattern);
        System.out.println("Matcher" + matcher);*/
        if (matcher.find()){
            TripNumber = matcher.group();
            System.out.println("Trip Number" + TripNumber);
        }
/*        if (tripNumberContent.contains("Trip Published.") ) {
            TripNumber = tripNumber.getText().substring(25, 39);
            System.out.println("English version Trip Number = " + TripNumber);
        }
        else{
            TripNumber = tripNumber.getText().substring(26, 40);
            System.out.println("Dutch version Trip Number = " + TripNumber);
        }*/
        return TripNumber;
    }
    public PlanningPage clickFirstTripOnTripToPlan()
    {
        tripToPlan.first().click();
        return this;
    }
    public PlanningPage clickLastTripOnTripToPlan()
    {
        tripToPlan.last().click();
        return this;
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
    public PlanningPage inputTime(){
        fromInputListField.first().click();
        fromInputListField.first().clear();
        fromInputListField.first().sendKeys("11:12", Keys.ENTER);
    //    System.out.println("fromInputListField" + fromInputListField.first().getText().trim().isEmpty());

        untilInputListField.first().click();
        untilInputListField.first().clear();
        untilInputListField.first().sendKeys("22:22");
      //  System.out.println("untilInputListField" + untilInputListField.first().getText().trim().isEmpty());

        return this;
    }
    public PlanningPage inputTimeToFirstFromUntilTime(String fromTime, String untilTime) {
        fromInputListField.first().click();
        //sleep(550);
        fromInputListField.first().clear();
        String timeWithoutDotFrom = fromTime.replace(":", "");
/*        fromInputListField.first().clear();*/
        fromInputListField.first().setValue(timeWithoutDotFrom).pressEnter();

        String timeWithoutDotUntil = untilTime.replace(":", "");
        untilInputListField.first().click();
        //sleep(550);
        untilInputListField.first().clear();
        untilInputListField.first().setValue(timeWithoutDotUntil).pressEnter();
        return this;
    }
    public PlanningPage chooseDateofPlansheet() {
            plansheetSelector.click();
        for (int i=0; i< plansheetSelector2.size(); i++) {
            plansheetSelector2.get(i).click();
            List <WebElement> options = plansheetSelector2.get(i).findElements(By.tagName("option"));
            int size = options.size() - 1;
            //int rand = 1+(size-1)*new Random().nextInt(1);
            //int rand = new Random().nextInt(size - 1) + 1;
            //System.out.println("rand=" + rand);
            options.get(size).click();
        }
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
            String EachPrice = plannedPriceValue.get(i).getText().replace(",",".");
                double PlannedEachPrice = Double.parseDouble(EachPrice);
                SumPlannedEachPrice.add(PlannedEachPrice);
/*            System.out.println("PlannedEachPrice " + PlannedEachPrice + " ");
            System.out.println("SumPlannedEachPrice " + SumPlannedEachPrice + " ");*/
         }
        FinalSumPlannedPrice = SumPlannedEachPrice.stream().mapToDouble(Double::doubleValue).sum();
      //  System.out.println("FinalSumPlannedPrice " + FinalSumPlannedPrice + " ");
        return this;
    }

    public PlanningPage findCostSum(){
        List<Double> SumPlannedEachCost = new ArrayList<Double>();
        for (int i = 0; i < plannedCostValue.size(); i++) {
            String EachCost = plannedCostValue.get(i).getText().replace(",",".");
            double PlannedEachCost = Double.parseDouble(EachCost);
        /*    System.out.println("PlannedEachCost " + PlannedEachCost + " ");
            System.out.println("SumPlannedEachCost " + SumPlannedEachCost + " "); */
            SumPlannedEachCost.add(PlannedEachCost);
        }
        FinalSumPlannedCost = SumPlannedEachCost.stream().mapToDouble(Double::doubleValue).sum();
      //  System.out.println("FinalSumPlannedCost " + FinalSumPlannedCost + " ");
        return this;
    }
    public PlanningPage findProfitSum() {
        List<Double> SumPlannedEachProfit = new ArrayList<Double>();
        for (int i = 0; i < plannedProfitValue.size(); i++) {
            String EachProfit = plannedProfitValue.get(i).getText().replace(",",".");
            double PlannedEachProfit = Double.parseDouble(EachProfit);
/*            System.out.println("PlannedEachProfit " + PlannedEachProfit + " ");
            System.out.println("SumPlannedEachProfit " + SumPlannedEachProfit + " ");*/
            SumPlannedEachProfit.add(PlannedEachProfit);
        }
        FinalSumPlannedProfit = SumPlannedEachProfit.stream().mapToDouble(Double::doubleValue).sum();
     //   System.out.println("FinalSumPlannedProfitSum " + FinalSumPlannedProfit + " ");
        return this;
    }

    public PlanningPage clickResultsTab(){
        resultsTab.click();

        findPriceSum();
        findCostSum();
        findProfitSum();

        int correctTest = 0; //variable for test is right
        //check for All Shipment Prices and Trip Total revenue
        String revenueTotalS = revenueTotal.getText().replace(",",".");
        double revenueTotalD = Double.parseDouble(revenueTotalS);
        if (revenueTotalD == FinalSumPlannedPrice) {
            System.out.println("revenueTotalD equal FinalSumPlannedPrice " + " " + revenueTotalD + " " + FinalSumPlannedPrice);
            correctTest++;
        }
        else
            System.out.println("revenueTotalD not equal FinalSumPlannedPrice " + " " + revenueTotalD + " " + FinalSumPlannedPrice);

        //check for All Shipment Cost and Trip Total Cost
        String costTotalS = costTotal.getText().replace(",",".");
        double costTotalD = Double.parseDouble(costTotalS);
        if (costTotalD == FinalSumPlannedCost){
            System.out.println("costTotalD equal FinalSumPlannedCost " + " " + costTotalD + " " + FinalSumPlannedCost);
            correctTest++;
        }
        else
            System.out.println("costTotalD not equal FinalSumPlannedCost " + " " + costTotalD + " " + FinalSumPlannedCost);

        //check for All Shipment Profit and Trip Total Profit
        String profitTotalS = profitTotal.getText().replace(",",".");
        double profitTotalD = Double.parseDouble(profitTotalS);
        if (profitTotalD == FinalSumPlannedProfit){
            System.out.println("profitTotalD equal FinalSumPlannedProfit " + " " + profitTotalD + " " + FinalSumPlannedProfit);
            correctTest++;
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
        }
        else
            System.out.println("ProfitCalculation not equal FinalSumPlannedProfit " + " " + ProfitCalculation + " " + FinalSumPlannedProfit);

        //check if the Cost is right
        double CostCalculation = FinalSumPlannedPrice - FinalSumPlannedProfit;
        CostCalculation = Double.parseDouble(new DecimalFormat("##.####").format(CostCalculation));
        if (CostCalculation == FinalSumPlannedCost){
            System.out.println("CostCalculation equal FinalSumPlannedCost " + " " + CostCalculation + " " + FinalSumPlannedCost);
            correctTest++;
        }
        else
            System.out.println("CostCalculation not equal FinalSumPlannedCost " + " " + CostCalculation + " " + FinalSumPlannedCost);

        //Autotest is correct
        if (correctTest == 5)
            System.out.println("Calculation on Planning Page is correct");
        else
            System.out.println("Calculation on Planning Page is not correct");
        return this;
    }
    public PlanningPage clickDeleteFirstActivityButton() {
        deleteFirstActivityButton.click();
        return this;
    }
    public PlanningPage clickEditPlansheetButton() {
        editPlansheetButton.click();
        /*deleteNewTrips();*/
        return this;
    }
    public PlanningPage deleteNewTrips(){
        sleep(1000);
        int size = deleteTripButtons.size() - 1;
        for (int i = size; i >= 0; i--) {
            //System.out.println(size);
            deleteTripButtons.get(i).click();
                if (isInformationErrorPopUpPresent()) {
                    yesButton.waitUntil(Condition.visible, 50).click();
                }
        }
        return this;
    }
    public PlanningPage clickRandomNewTripButton() {
        sleep(2000);
        Collection resourceButtons;
        Collection driversC = drivers;
        resourceButtons = newTripButton;
        int size = resourceButtons.size();
        int rand = new Random().nextInt(size);
/*      TractorLicense = newTripRow.get(rand).findElement(By.cssSelector("[class='mx-referenceselector mx-name-referenceSelector8 h6']")).getText();
        TrailerLicense = newTripRow.get(rand).findElement(By.cssSelector("[class='mx-referenceselector mx-name-referenceSelector9 h6']")).getText();
        System.out.println("Tractor License in click Random New Trip Button " + TractorLicense);
        System.out.println("Trailer License in click Random New Trip Button " + TrailerLicense);
        System.out.println("Random Driver " + RandomDriver);  */
        RandomDriver = ((ElementsCollection) driversC).get(rand).getText();;
        ((ElementsCollection) resourceButtons).get(rand).click();
        return this;
    }
    public PlanningPage clickDeleteAttachingTrailerButton(){
        deleteTrailerButton.first().click();
        yesButton.waitUntil(Condition.appear, 1000).click();
        return this;
    }
    public PlanningPage clickDeleteDetachingTrailerButton(){
        deleteTrailerButton.last().click();
        yesButton.click();
        return this;
    }
    public PlanningPage checkLicenses(){
        getValueTractorLicense(TractorLicense);
        if (TractorLicense != null && TractorLicense.trim().isEmpty())
        {
        // if Tractor License is empty
         /*sleep(500);
         tractorClaimButton.last().click();*/
            clickChangeTractorButton();
            clickTractorClaimButton();
        }
        sleep(500);

        getValueTrailerLicense(TrailerLicense);
        if (TrailerLicense  != null && TrailerLicense.trim().isEmpty())
        {
            //if Trailer License is empty
           // sleep(500);
            getValueTractorLicense(TractorLicense);
            //sleep(500);
            clickChangeTrailerButton();
           // sleep(500);
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
        if (textRittenInPlanblad.getText().contains("Ritten in Planblad:")) {
            //String tripStatus = tripsInPlansheet.findBy(Condition.matchesText(RandomDriver)).findElement(By.cssSelector("[class='mx-name-radioButtons1 listview-content']")).getText();
            //  System.out.println("Trip Status in getValueTractorLicense" + tripStatus);
            String tripStatus = "Nieuw";
            TractorLicense = tripsInPlansheet.findBy(Condition.matchesText(RandomDriver)).should(Condition.matchesText(tripStatus)).findElement(By.cssSelector("[class = 'mx-name-textBox3 listview-content']")).getText();
            //    System.out.println("Tractor License in getValueTractorLicense" + TractorLicense);
        }
        else
        {
            String tripStatus = "New";
            TractorLicense = tripsInPlansheet.findBy(Condition.matchesText(RandomDriver)).should(Condition.matchesText(tripStatus)).findElement(By.cssSelector("[class = 'mx-name-textBox3 listview-content']")).getText();
            //    System.out.println("Tractor License in getValueTractorLicense" + TractorLicense);
        }
        return TractorLicense;
    }

    public String getValueTrailerLicense(String Trailer){
        TrailerLicense = tripsInPlansheet.findBy(Condition.matchesText(RandomDriver)).findElement(By.cssSelector("[class = 'mx-name-textBox4 listview-content']")).getText();;
        //System.out.println("TrailerLicense " + TrailerLicense);
        return TrailerLicense;
    }
    public PlanningPage clickChangeTractorButton() {
       tripsInPlansheet.findBy(Condition.matchesText(RandomDriver)).findElement(By.cssSelector("[class = 'btn mx-button mx-name-actionButton17 buttonnonborder-image fas fa-external-link-alt btn-info']")).click();
       return this;
    }
    public PlanningPage clickChangeTrailerButton() {
        tripsInPlansheet.findBy(Condition.matchesText(RandomDriver)).findElement(By.cssSelector("[class = 'btn mx-button mx-name-actionButton19 buttonnonborder-image fas fa-external-link-alt btn-info']")).click();
        return this;
    }
    public PlanningPage clickTractorClaimButton() {
        sleep(500);
        Collection tractorButtons;
        tractorButtons = tractorClaimButton;
        int size = tractorButtons.size();
        int rand = new Random().nextInt(size);
        ((ElementsCollection) tractorButtons).get(rand).click();
        //sleep(500);
        //System.out.println("Tractor rand: " + rand);
        return this;
    }
    public PlanningPage clickRandomTrailerClaimButton() {
        sleep(1000);
        Collection trailerButtons;
        trailerButtons = trailerClaimButton;
        int size = trailerButtons.size();
        int rand = new Random().nextInt(size);
        ((ElementsCollection) trailerButtons).get(rand).click();
        //System.out.println("Trailer rand " + rand);
       // sleep(1000);
        return this;
    }

    public PlanningPage clickGoToPlanningButton() {
        goToPlanningButton.click();
        return this;
    }
    public PlanningPage dragShipment() {
        shipmentList.first().dragAndDropTo(tripActivitiesField);

/*        int shipmentListSize =  shipmentList.size();
        System.out.println("shipment List Size" + shipmentListSize);
        if (shipmentListSize > 6)
        {
            shipmentList.first().dragAndDropTo(tripActivitiesField);
        }
        else{
            shipmentList.last().dragAndDropTo(tripActivitiesField);
        }*/

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
        /*try {
            if (WebDriverRunner.getWebDriver().findElement(By.cssSelector("[class='mx-listview-item mx-name-index-0'] [class*='input-group']")).isDisplayed())
            {
                startAddressSearchButton.click();
                secondAddressFromAddressBook.waitUntil(Condition.visible, 5000).doubleClick();
            }
            return this;
        } catch (org.openqa.selenium.NoSuchElementException e) {

        }
        return this;*/
        if (startAddressInputField.isDisplayed())
        {
            startAddressSearchButton.click();
            secondAddressFromAddressBook.waitUntil(Condition.visible, 1000).doubleClick();
        }
        return this;
    }

    public PlanningPage clickAttachingTrailerAddress() {
        try {
            if (attachingTrailerInputField.isDisplayed())
            {
                attachingTrailerSearchButton.click();
                secondAddressFromAddressBook.waitUntil(Condition.visible, 1000).doubleClick();
            }
        }
        catch (java.lang.RuntimeException exception){
            System.out.println(exception.getMessage());
            System.out.println("No attaching trailer address input field");
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        return this;
    }
    public PlanningPage clickDetachingTrailerAddress() {
        try {
            if (detachingTrailerInputField.isDisplayed())
            {
                detachingTrailerSearchButton.click();
                secondAddressFromAddressBook.waitUntil(Condition.visible, 1000).doubleClick();
            }
        }
        catch (org.openqa.selenium.NoSuchElementException exception){
            System.out.println("No detaching trailer address input field");
        }
        return this;
    }
    public PlanningPage clickEndAddress() {
        if (endAddressInputField.isDisplayed())
        {
            endAddressSearchButton.click();
            secondAddressFromAddressBook.waitUntil(Condition.visible, 1000).doubleClick();
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
    public PlanningPage clickOKButtonOnWarningPopUp(){
        if (isInformationErrorPopUpPresent()) {
            yesButton.waitUntil(Condition.visible,50).click();
            for (int i = 0; i <= 100; i++){
                inputTimeToFirstFromUntilTime(getTime(10,11), getTime(14,15));
                clickCalculateTripButton();
                clickOKButtonOnWarningPopUp();
                clickIUnderstandButtonOnWarningPopUp();
                if (!isInformationErrorPopUpPresent()) {
                    break;
                }
            }
        }
        return this;
    }
    public Boolean isInformationErrorPopUpPresent() {
        try {
            sleep(500);
            return WebDriverRunner.getWebDriver().findElement(By.cssSelector("[class*='modal-header mx-dialog-header']")).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public PlanningPage clickIUnderstandButtonOnWarningPopUp(){
        if (isWarningPopUpPresent()) {
            iUnderstandButtonOnWarningPopUp.waitUntil(Condition.visible,1000).click();
        }
        return this;
    }
    public Boolean isWarningPopUpPresent() {
        try {
            sleep(1000);
            return WebDriverRunner.getWebDriver().findElement(By.cssSelector("[class*='btn mx-button mx-name-actionButton1 fa-right fas fa-chevron-right btn-default']")).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
    public PlanningPage clickIUnderstandButtonOnAddressWarningPopUp(){
        if (isAddressWarningPopUpPresent()) {
            iUnderstandButtonOnAddressWarningPopUp.waitUntil(Condition.visible,1000).click();
        }
        return this;
    }
    public Boolean isAddressWarningPopUpPresent() {
        try {
            sleep(1000);
            return WebDriverRunner.getWebDriver().findElement(By.cssSelector("[class*='btn mx-button mx-name-actionButton10 fa-right fas fa-chevron-right btn-default']")).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
}
