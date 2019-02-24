package com.slim.ui.pageOblectClasses.orders;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class NewOrderFromTemplatePage {
    SelenideElement nextButton = $("[class*='btn mx-button mx-name-actionButton2 btnRight > img btn-default'] ");
    SelenideElement fromInputList1Field = $(" [class*='mx-listview mx-listview-selectable mx-name-listView3'] [class*='mx-listview-item mx-name-index-0'] [class*='mx-name-textBox23'] [class*='form-control']");
    SelenideElement fromInputList2Field = $(" [class*='mx-listview mx-listview-selectable mx-name-listView3'] [class*='mx-listview-item mx-name-index-1'] [class*='mx-name-textBox23'] [class*='form-control']");
    SelenideElement untilInputList1Field = $(" [class*='mx-listview mx-listview-selectable mx-name-listView3'] [class*='mx-listview-item mx-name-index-0'] [class*='mx-name-textBox24'] [class*='form-control']");
    SelenideElement untilInputList2Field = $(" [class*='mx-listview mx-listview-selectable mx-name-listView3'] [class*='mx-listview-item mx-name-index-1'] [class*='mx-name-textBox24'] [class*='form-control']");
    SelenideElement saveButton = $("[class*='btn mx-button mx-name-actionButton4 btn-success'] ");

    public NewOrderFromTemplatePage clickNextButton(){
        nextButton.click();
        return this;
    }
    public NewOrderFromTemplatePage inputDataToTheFromInputList1Field(String time){
        fromInputList1Field.click();
        fromInputList1Field.clear();
        sleep(300);
        fromInputList1Field.setValue(time);
        sleep(300);
        return this;
    }
    public NewOrderFromTemplatePage inputDataToTheFromInputList2Field(String time){
        fromInputList2Field.click();
        fromInputList2Field.clear();
        sleep(300);
        fromInputList2Field.sendKeys(time);
        sleep(300);
        return this;
    }

    public NewOrderFromTemplatePage inputDataToTheUntilInputList1Field(String time){
        untilInputList1Field.click();
        untilInputList1Field.clear();
        sleep(300);
        untilInputList1Field.setValue(time);
        sleep(300);
        return this;
    }
    public NewOrderFromTemplatePage inputDataToTheUntilInputList2Field(String time){
        untilInputList2Field.click();
        untilInputList2Field.clear();
        sleep(300);
        untilInputList2Field.setValue(time);
        sleep(300);
        return this;
    }

    public NewOrderFromTemplatePage clickSaveButton(){
        saveButton.click();
        return this;
    }
}
