package com.slim.ui.pageOblectClasses.orders;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.codeborne.selenide.Selenide.*;

public class OrdersPage {

SelenideElement newOrderButton = $("[class*='btn mx-button mx-name-actionButton2 fa-right fas fa-plus btn-success']");
SelenideElement orderFromTemplateButton = $("[class*='btn mx-button mx-name-actionButton3 fa-right fas fa-plus btn-success']");
SelenideElement newWorkOrderButton = $("[class*='btn mx-button mx-name-actionButton6 fa-right fas fa-plus btn-success']");
SelenideElement templateSelector = $("[class='mx-referenceselector-input-wrapper'] [class*='form-control']");
SelenideElement templateItem = $("[class*='mx-referenceselector-input-wrapper'] [class*='form-control'] [value='33776997205280021']");

SelenideElement newOrderButtonOnChooseTemplatePopUp = $("[class='btn mx-button mx-name-actionButton1 btn-success'] ");
SelenideElement createNewOrderButton = $("[class='btn mx-button mx-name-actionButton1 fa-right fas fa-plus btn-success']");
SelenideElement proceedConfirmationButton = $("[class*='btn btn-primary']");
ElementsCollection editOrderButton = $$("[class*='btn mx-button mx-name-Edit10 buttonnonborder-image far fa-edit btn-info']");
SelenideElement shipmentTab = $("[class*='mx-name-tabPage2']");
SelenideElement saveButton = $("[class*='btn mx-button mx-name-actionButton3 fa-right fas fa-save btn-success']");
SelenideElement dateInputButton = $("[widgetid='mxui_widget_Button_5']");
ElementsCollection dateInputField = $$("[class='form-control mx-dateinput-input']");
SelenideElement deleteOrderButton = $("[class*='btn mx-button mx-name-actionButton7 fa-right fas fa-trash-alt btn-danger']");
SelenideElement okButton = $("[class='modal-footer mx-dialog-footer'] [class*='btn btn-primary']");

    public OrdersPage clickEveryDeleteOrderButton(){
        sleep(2000);
        int size = editOrderButton.size();
        System.out.println("Size = " + size);
        for(int i = size -1; i >= 0; i--)
        {
            System.out.println("i ="+ i);
            editOrderButton.get(i).click();
            sleep(500);
            if (deleteOrderButton.isDisplayed())
            {
                deleteOrderButton.click();
                proceedConfirmationButton.click();
                sleep(500);
                okButton.click();
              //  System.out.println("Size after"+ "(" + i +")" + size);
            }
            else
                saveButton.click();
        }

        return this;
    }
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
            if (shipmentTab.isDisplayed())
            {
                shipmentTab.click();
                if (dateInputField.get(1).isEnabled())
                {
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
    public OrdersPage clickEdit1ItemButton(){
        editOrderButton.first().click();
        return this;
    }
    public OrdersPage clickTemplateSelector(){
        templateSelector.click();
        return this;
    }
    public OrdersPage clickTemplateItem(){
        templateItem.click();

/*        List <WebElement> options = templateItem.find(By.ByTagName("option"));
        int size = options.size();
        int rand = new Random().nextInt(size - 1) + 1;
        System.out.println("rand=" + rand);
        options.get(rand).click();
        sleep(100);*/

        return this;
    }
    public OrdersPage clickNewOrderButtonOnChooseTemplatePopUp(){
        newOrderButtonOnChooseTemplatePopUp.click();
        return this;
    }
    public OrdersPage clickProceedButton(){
        proceedConfirmationButton.click();
        return this;
    }
}
