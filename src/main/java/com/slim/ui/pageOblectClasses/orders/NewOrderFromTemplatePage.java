package com.slim.ui.pageOblectClasses.orders;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class NewOrderFromTemplatePage {
    SelenideElement nextButton = $("[class*='btn mx-button mx-name-actionButton2 btnRight > img btn-default'] ");
    ElementsCollection fromInputList1Field = $$("[class*='mx-name-textBox23'] [class*='form-control']");
    ElementsCollection untilInputList1Field = $$("[class*='mx-name-textBox24'] [class*='form-control']");
    SelenideElement saveButton = $("[class*='btn mx-button mx-name-actionButton4 btn-success'] ");

    public NewOrderFromTemplatePage clickNextButton(){
        nextButton.click();
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
