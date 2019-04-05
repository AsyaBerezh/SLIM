package com.slim.ui.pageOblectClasses.orders;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static com.codeborne.selenide.Selenide.*;

public class OrdersPage {

SelenideElement newOrderButton = $("[class*='btn mx-button mx-name-actionButton2 fa-right fas fa-plus btn-success']");
SelenideElement orderFromTemplateButton = $("[class*='btn mx-button mx-name-actionButton3 fa-right fas fa-plus btn-success']");
SelenideElement newWorkOrderButton = $("[class*='btn mx-button mx-name-actionButton6 fa-right fas fa-plus btn-success']");
SelenideElement searchField = $("[class*='search-bar']");
SelenideElement infoItem1Button = $("[class='mx-listview-item mx-name-index-0'] [class*='btn mx-button mx-name-actionButton18 buttonnonborder-image fa fa-info-circle btn-info']");
SelenideElement infoItem2Button = $("[class='mx-listview-item mx-name-index-1'] [class*='btn mx-button mx-name-actionButton18 buttonnonborder-image fa fa-info-circle btn-info']");
SelenideElement editItem1Button = $("[class='mx-listview-item mx-name-index-0'] [class*='btn mx-button mx-name-Edit10 buttonnonborder-image fa fa-edit btn-default']");
SelenideElement editItem2Button = $("[class='mx-listview-item mx-name-index-1'] [class*='btn mx-button mx-name-Edit10 buttonnonborder-image fa fa-edit btn-default']");
SelenideElement templateSelector = $("[class='mx-referenceselector-input-wrapper'] [class*='form-control']");
SelenideElement templateItem = $("[class*='mx-referenceselector-input-wrapper'] [class*='form-control'] [value='33776997205279427']");
SelenideElement newOrderButtonOnChooseTemplatePopUp = $("[class='btn mx-button mx-name-actionButton1 btn-success'] ");
SelenideElement createNewOrderButton = $("[class='btn mx-button mx-name-actionButton1 fa-right fas fa-plus btn-success']");
SelenideElement deleteOrderButton = $("[class*='btn mx-button mx-name-actionButton7 btnRight > img btn-danger']");
SelenideElement proceedConfirmationButton = $("[class*='btn btn-primary']");
ElementsCollection editOrderButton = $$("[class*='btn mx-button mx-name-Edit10 buttonnonborder-image far fa-edit btn-info']");
SelenideElement shipmentTab = $("[class*='mx-name-tabPage2']");
SelenideElement saveButton = $("[class*='btn mx-button mx-name-actionButton3 fa-right fas fa-save btn-success']");
SelenideElement dateInputButton = $("[widgetid='mxui_widget_Button_5']");
ElementsCollection dateInputField = $$("[class='form-control mx-dateinput-input']");

    public static String getCurrentDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date currentDate = new Date();
        System.out.println(dateFormat.format(currentDate));
        return dateFormat.format(currentDate);
    }

    public static String getFutureDate(int addDays) {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date currentDate = new Date();
        System.out.println(dateFormat.format(currentDate));

        Calendar c = Calendar.getInstance();
        c.setTime(currentDate);
        c.add(Calendar.DATE, addDays);

        Date currentDatePlusOne = c.getTime();
        System.out.println(dateFormat.format(currentDatePlusOne));

        return dateFormat.format(currentDatePlusOne);
    }

    public OrdersPage clickEveryChangeButton(){
        sleep(1000);
        for(int i=0; i < editOrderButton.size(); i++) {
            editOrderButton.get(i).click();
            sleep(500);
            if (shipmentTab.isDisplayed()) {
                shipmentTab.click();
                if (dateInputField.get(1).isEnabled()) {
                    dateInputField.get(1).clear();
                    proceedConfirmationButton.click();
                    sleep(500);
                    String FutureDate = getFutureDate(1);
                    dateInputField.get(1).setValue(FutureDate);
                    System.out.println("dateInputField " + dateInputField.get(1).getValue());
                    System.out.println("FutureDate " + FutureDate);
                    saveButton.click();
                }
                else
                    saveButton.click();
            }
            else
            saveButton.click();
        }
        return this;
    }
    public OrdersPage clickNewOrderButton(){
        newOrderButton.click();
        return this;
    }
    public OrdersPage clickCreateNewOrderButton(){
        createNewOrderButton.click();
        return this;
    }
    public OrdersPage clickOrderFromTemplateButton(){
        orderFromTemplateButton.click();
        return this;
    }
    public OrdersPage clickNewWorkOrderButton(){
        newWorkOrderButton.click();
        return this;
    }
    public OrdersPage inputDataToSearchField(){
        searchField.click();
        return this;
    }
    public OrdersPage clickInfoItem1Button(){
        infoItem1Button.click();
        return this;
    }
    public OrdersPage clickInfoItem2Button(){
        infoItem2Button.click();
        return this;
    }
    public OrdersPage clickEditItem1Button(){
        editItem1Button.click();
        return this;
    }
    public OrdersPage clickEditItem2Button(){
        editItem2Button.click();
        return this;
    }
    public OrdersPage clickTemplateSelector(){
        templateSelector.click();
        return this;
    }
    public OrdersPage clickTemplateItem(){
        templateItem.click();
        return this;
    }
    public OrdersPage clickNewOrderButtonOnChooseTemplatePopUp(){
        newOrderButtonOnChooseTemplatePopUp.click();
        return this;
    }
    public OrdersPage clickDeleteOrderButton(){
        deleteOrderButton.click();
        return this;
    }
    public OrdersPage clickProceedButton(){
        proceedConfirmationButton.click();
        return this;
    }
}
