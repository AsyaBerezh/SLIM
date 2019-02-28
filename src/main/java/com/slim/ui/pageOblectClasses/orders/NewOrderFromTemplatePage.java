package com.slim.ui.pageOblectClasses.orders;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class NewOrderFromTemplatePage {
    SelenideElement nextButton = $("[class*='btn mx-button mx-name-actionButton2 btnRight > img btn-default'] ");
    ElementsCollection fromInputList1Field = $$("[class*='mx-name-textBox23'] [class*='form-control']");
    ElementsCollection untilInputList1Field = $$("[class*='mx-name-textBox24'] [class*='form-control']");

    ElementsCollection inputFromDate = $$("[class='mx-dateinput mx-name-datePicker3'] input");
    ElementsCollection inputUntilDate = $$("[class='mx-dateinput mx-name-datePicker4'] input");

    SelenideElement okButtonInModalWindow = $("[class='modal-dialog mx-dialog mx-dialog-error'] button");
    SelenideElement saveButton = $("[class*='btn mx-button mx-name-actionButton4 btn-success'] ");

    public NewOrderFromTemplatePage clickNextButton(){
        nextButton.click();
        return this;
    }

    public NewOrderFromTemplatePage setFromDate(String fromDate){
        inputFromDate.get(0).clear();
        okButtonInModalWindow.click();
        sleep(300);
        inputFromDate.get(0).setValue(fromDate);

        inputFromDate.get(1).clear();
        okButtonInModalWindow.click();
        sleep(300);
        inputFromDate.get(1).setValue(fromDate);
        return this;
    }

    public NewOrderFromTemplatePage setUntilDate(String untilDate){
        inputUntilDate.get(0).clear();
        okButtonInModalWindow.click();
        sleep(300);
        inputUntilDate.get(0).setValue(untilDate);

        inputUntilDate.get(1).clear();
        okButtonInModalWindow.click();
        sleep(300);
        inputUntilDate.get(1).setValue(untilDate);
        return this;
    }

    public NewOrderFromTemplatePage inputDataToTheFromInputList1Field(String fromTime, String untilTime) {
        fromInputList1Field.get(0).click();
        sleep(250);
        String timeWithoutDot = fromTime.replace(":", "");
        for (int i = 0; i < timeWithoutDot.length(); i++) {
            fromInputList1Field.get(0).sendKeys(String.valueOf(timeWithoutDot.charAt(i)));
            sleep(150);
        }

        timeWithoutDot = untilTime.replace(":", "");
        untilInputList1Field.get(0).click();
        sleep(250);
        untilInputList1Field.get(0).clear();
        for (int i = 0; i < timeWithoutDot.length(); i++) {
            untilInputList1Field.get(0).sendKeys(String.valueOf(timeWithoutDot.charAt(i)));
            sleep(150);
        }
        untilInputList1Field.get(0).pressEnter();
        return this;
    }

    public NewOrderFromTemplatePage inputDataToTheUntilInputList1Field(String fromTime, String untilTime) {
        fromInputList1Field.get(1).click();
        sleep(250);
        String timeWithoutDot = fromTime.replace(":", "");
        for (int i = 0; i < timeWithoutDot.length(); i++) {
            fromInputList1Field.get(1).sendKeys(String.valueOf(timeWithoutDot.charAt(i)));
            sleep(150);
        }

        timeWithoutDot = untilTime.replace(":", "");
        untilInputList1Field.get(1).click();
        sleep(250);
        untilInputList1Field.get(1).clear();
        for (int i = 0; i < timeWithoutDot.length(); i++) {
            untilInputList1Field.get(1).sendKeys(String.valueOf(timeWithoutDot.charAt(i)));
            sleep(150);
        }
        untilInputList1Field.get(1).pressEnter();
        return this;
    }

//    public NewOrderFromTemplatePage inputDataToTheFromInputList1Field(String time){
//        fromInputList1Field.click();
//        fromInputList1Field.clear();
//        sleep(300);
//        fromInputList1Field.setValue(time);
//        sleep(300);
//        return this;
//    }
//    public NewOrderFromTemplatePage inputDataToTheFromInputList2Field(String time){
//        fromInputList2Field.click();
//        fromInputList2Field.clear();
//        sleep(300);
//        fromInputList2Field.sendKeys(time);
//        sleep(300);
//        return this;
//    }
//
//    public NewOrderFromTemplatePage inputDataToTheUntilInputList1Field(String time){
//        untilInputList1Field.click();
//        untilInputList1Field.clear();
//        sleep(300);
//        untilInputList1Field.setValue(time);
//        sleep(300);
//        return this;
//    }
//    public NewOrderFromTemplatePage inputDataToTheUntilInputList2Field(String time){
//        untilInputList2Field.click();
//        untilInputList2Field.clear();
//        sleep(300);
//        untilInputList2Field.setValue(time);
//        sleep(300);
//        return this;
//    }

    public NewOrderFromTemplatePage clickSaveButton(){
        saveButton.click();
        return this;
    }
}
