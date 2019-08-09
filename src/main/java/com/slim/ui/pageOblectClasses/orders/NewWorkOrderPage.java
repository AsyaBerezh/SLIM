package com.slim.ui.pageOblectClasses.orders;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Random;
import java.util.*;

import static com.codeborne.selenide.Selenide.*;

public class NewWorkOrderPage {
    SelenideElement customerField = $("[class='form-group mx-name-referenceSelector1 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [class*='form-control']");
    SelenideElement abbinkVriezenveenCustomerSelect = $("[class='form-group mx-name-referenceSelector1 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='7036874417766605']");
    SelenideElement actifoodCustomerSelect = $("[class='form-group mx-name-referenceSelector1 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='7036874417766606']");
    SelenideElement plannedStartTime = $("[class='mx-name-textBox1'] [class*='form-control']");
    SelenideElement plannedEndTime = $("[class='mx-name-textBox2'] [class*='form-control']");
    SelenideElement planGroupField = $("[class='form-group mx-name-referenceSelector10 align-label-left'] [class='mx-referenceselector-input-wrapper'] [class*='form-control']");
    SelenideElement standaardPlangroupItemSelect = $("[class='form-group mx-name-referenceSelector10 align-label-left'] [class*='form-control'] [value='27021597764223177']");
    SelenideElement сontainersPlangroupItemSelect = $("[class='form-group mx-name-referenceSelector10 align-label-left'] [class*='form-control'] [value='27021597764223589']");
    SelenideElement nextButton = $("[class='btn mx-button mx-name-actionButton2 fa-right fas fa-chevron-right btn-default']");
    SelenideElement addDriverButton = $("[class*='btn mx-button mx-name-actionButton3 buttonnonborder-image fas fa-external-link-alt btn-info']");
    SelenideElement secondItemClaimButton = $("[class='mx-dataview mx-name-dataView2 form-horizontal'] [class='mx-listview-item mx-name-index-1'] [class='btn mx-button mx-name-actionButton17 btn-success']");
    SelenideElement publishTripButton = $("[class='btn mx-button mx-name-actionButton4 fa-right fas fa-road btn-success'] ");
    ElementsCollection startAndEndDate = $$("[class='form-control mx-dateinput-input']");
    SelenideElement iUnderstandButtonOnWarningPopUp = $("[class*='btn mx-button mx-name-actionButton1 fa-right fas fa-chevron-right btn-default']");

    ElementsCollection deleteTrailerButton = $$("[class*='btn mx-button mx-name-actionButton19 listview-content buttonnonborderred-image far fa-times-square btn-danger']");
    ElementsCollection randomClaimButton = $$("[class*='btn mx-button mx-name-actionButton17 fa-right fas fa-chevron-right btn-default']");
    ElementsCollection addressSelectors = $$("[class*='mx-referenceselector mx-name-referenceSelector8 h6'] [class*='form-control']");
    SelenideElement okButton = $("[class*='btn btn-primary']");

    public NewWorkOrderPage clickDeleteTrailerButton(){
        deleteTrailerButton.get(0).click();
        deleteTrailerButton.get(1).click();
        return this;
    }
    public NewWorkOrderPage clickCustomerField() {
        customerField.click();
        return this;
    }
    public NewWorkOrderPage clickRandomClaimButton() {
        sleep(1000);
        Collection claimButtons;
        claimButtons = randomClaimButton;
        int size = claimButtons.size();
        int rand = new Random().nextInt(size);
        ((ElementsCollection) claimButtons).get(rand).click();
        sleep(500);
        return this;
    }
    public NewWorkOrderPage changeAddresses() {
        for (int i=0; i< addressSelectors.size(); i++){
            String address = addressSelectors.get(i).getSelectedText();
            //System.out.println("address" + address);
           if (address.trim().contentEquals("") || address.contentEquals("Selecteer Adres") || address.trim().isEmpty()){
               //       if (address.contentEquals("Selecteer Adres")){
                     sleep(200);
                    addressSelectors.get(i).click();
                    List <WebElement> options = addressSelectors.get(i).findElements(By.tagName("option"));
                    int size = options.size();
                    //int rand = 1+(size-1)*new Random().nextInt(1);
                    int rand = new Random().nextInt(size - 1) + 1;
                    System.out.println("rand=" + rand);
                    options.get(rand).click();
                    sleep(100);
                }
        }
        return this;
    }

    public NewWorkOrderPage clickOKButton(){
        okButton.click();
        return this;
    }
    public NewWorkOrderPage clickAbbinkVriezenveenCustomerSelect() {
        abbinkVriezenveenCustomerSelect.click();
        return this;
    }
    public NewWorkOrderPage clickActifoodCustomerSelect() {
        actifoodCustomerSelect.click();
        return this;
    }
    public static String getCurrentDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date currentDate = new Date();
        //System.out.println(dateFormat.format(currentDate));
        return dateFormat.format(currentDate);
    }

    public static String getFutureDate(int addDays) {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date currentDate = new Date();
        //System.out.println(dateFormat.format(currentDate));

        Calendar c = Calendar.getInstance();
        c.setTime(currentDate);
        c.add(Calendar.DATE, addDays);

        Date currentDatePlusOne = c.getTime();
        //System.out.println(dateFormat.format(currentDatePlusOne));

        return dateFormat.format(currentDatePlusOne);
    }
//for commits
    public NewWorkOrderPage setPlanedStartAndEndDate() {
        startAndEndDate.get(0).clear();
        String FutureDateStart = getFutureDate(7);
        startAndEndDate.get(0).setValue(FutureDateStart);
        System.out.println("startDate " + startAndEndDate.get(0).getValue());
        System.out.println("FutureDateStart " + FutureDateStart);
        startAndEndDate.get(1).click();
        startAndEndDate.get(1).clear();
        String FutureDateEnd = getFutureDate(7);
        startAndEndDate.get(1).setValue(FutureDateEnd);
        System.out.println("EndDate " + startAndEndDate.get(1).getValue());
        System.out.println("FutureDateEnd " + FutureDateEnd);
        return this;
    }
    public NewWorkOrderPage inputDataToPlannedStartTime(String time) {
        plannedStartTime.click();
        sleep(200);
        for (int i = 0; i < time.replace(":", "").length(); i++) {
            plannedStartTime.sendKeys(String.valueOf(time.replace(":", "")));
            sleep(100);
        }
        return this;
    }

    public NewWorkOrderPage inputDataToPlannedEndTime(String time) {
        plannedEndTime.click();
        sleep(200);
        for (int i = 0; i < time.replace(":", "").length(); i++) {
            plannedEndTime.sendKeys(String.valueOf(time.replace(":", "")));
            sleep(100);
        }
        return this;
    }

    public NewWorkOrderPage clickPlanGroupField() {
        planGroupField.click();
        return this;
    }

    public NewWorkOrderPage clickStandaardPlangroupItemSelect(){
        standaardPlangroupItemSelect.click();
        return this;
    }
    public NewWorkOrderPage clickNextButton() {
        nextButton.click();
        return this;
    }

    public NewWorkOrderPage clickAddDriverButton() {
        addDriverButton.click();
        return this;
    }

    public NewWorkOrderPage clickSecondItemClaimButton() {
        sleep(2000);
        secondItemClaimButton.click();
        sleep(2000);
        return this;
    }
    public NewWorkOrderPage clickPublishTripButton() {
        publishTripButton.click();
        return this;
    }
    public NewWorkOrderPage clickIUnderstandButtonOnWarningPopUp() {
        if (isWarningPopUpPresent()) {
            sleep(1000);
            iUnderstandButtonOnWarningPopUp.click();
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
}

