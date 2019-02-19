package com.slim.ui.pageOblectClasses.orders;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class NewOrderPage {

    SelenideElement customerSelectorField = $("[class='form-group mx-name-referenceSelector1 align-label-left'] [class*='mx-referenceselector-input-wrapper']");
    SelenideElement firstCustomerSelect = $("[class='form-group mx-name-referenceSelector1 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='7036874417767002']");
    SelenideElement cargoSelectorField = $("[class='form-group mx-name-referenceSelector8 align-label-left'] [class*='mx-referenceselector-input-wrapper']");
    SelenideElement cargoFirstItemSelect = $("[class='form-group mx-name-referenceSelector8 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='13792273858822745']");
    SelenideElement carrierSelectorField = $("[class='form-group mx-name-referenceSelector2 align-label-left'] [class*='mx-referenceselector-input-wrapper']");
    SelenideElement carrierFirstItemSelect = $("[class='form-group mx-name-referenceSelector2 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='20266198323167333']");
    SelenideElement unitsInputFields = $("[class='form-group mx-name-textBox4 align-label-left'] [class='form-control'] ");
    SelenideElement plangroupSelectorField = $("[class='form-group mx-name-referenceSelector10 align-label-left'] [class*='form-control'] ");
    SelenideElement plangroupItemSelect = $("[class='form-group mx-name-referenceSelector10 align-label-left'] [class*='form-control'] [value='27021597764223580']");
    SelenideElement orderTypeSelectorField = $("[class='form-group mx-name-referenceSelector9 align-label-left'] [class*='form-control']");
    SelenideElement orderItemSelect = $("[class='form-group mx-name-referenceSelector9 align-label-left'] [class*='form-control'] [value='2533274790396405']");
    SelenideElement nextButton = $("[class*='btn mx-button mx-name-actionButton2 btnRight > img btn-default']");
    SelenideElement searchAddressList1Button = $("[class='mx-listview mx-listview-selectable mx-name-listView3'] [class='mx-listview-item mx-name-index-0'] [class='btn btn-default']");
    SelenideElement searchAddressList2Button = $("[class='mx-listview mx-listview-selectable mx-name-listView3'] [class='mx-listview-item mx-name-index-1'] [class='btn btn-default']");
    SelenideElement firstItemAddress = $("[class='table table-striped table-bordered mx-datagrid-body-table'] [class*='mx-name-index-0']");
    SelenideElement secondItemAddress = $("[class='table table-striped table-bordered mx-datagrid-body-table'] [class*='mx-name-index-1']");
    SelenideElement selectButton = $("[class='mx-layoutgrid mx-layoutgrid-fluid container-fluid mx-name-layoutGrid1'] [class='btn mx-button mx-name-actionButton1 btn-default']");
    SelenideElement fromInputList1Field = $(" [class*='mx-listview mx-listview-selectable mx-name-listView3'] [class*='mx-listview-item mx-name-index-0'] [class*='mx-name-textBox23'] [class*='form-control']");
    SelenideElement fromInputList2Field = $(" [class='mx-listview mx-listview-selectable mx-name-listView3'] [class='mx-listview-item mx-name-index-1'] [class='mx-name-textBox23'] [class*='form-control']");
    SelenideElement untilInputList1Field = $(" [class='mx-listview mx-listview-selectable mx-name-listView3'] [class='mx-listview-item mx-name-index-0'] [class='mx-name-textBox24'] [class*='form-control']");
    SelenideElement untilInputList2Field = $(" [class='mx-listview mx-listview-selectable mx-name-listView3'] [class='mx-listview-item mx-name-index-1'] [class='mx-name-textBox24'] [class*='form-control']");
    SelenideElement transportTypeSelectorField = $("[class*='form-group mx-name-referenceSelector13 align-label-left'] [class='form-control']");
    SelenideElement transportTypeSelect = $("[class*='form-group mx-name-referenceSelector13 align-label-left'] [class*='form-control'] [value='26458647810802267']");
    SelenideElement saveButton = $("[class='btn mx-button mx-name-actionButton4 btn-success']");
    SelenideElement customerValidationMessage = $("[class='form-group mx-name-referenceSelector1 align-label-left has-error'] [class='alert alert-danger mx-validation-message']");
    SelenideElement newOrderModalWindow = $("[class='modal-body mx-window-body']");
    SelenideElement planGroupEditSelectorField = $("[class='tab-pane mx-tabcontainer-pane active'] [class='form-group mx-name-referenceSelector9 align-label-left'] [class*='form-control']");
    SelenideElement planGroupEditSelectorItem = $("[class='tab-pane mx-tabcontainer-pane active'] [class='form-group mx-name-referenceSelector9 align-label-left'] [class*='form-control'] [value='27021597764223589']");
    SelenideElement saveButtonOnEditOrderModalWindow = $("[class='modal-content mx-window-content'] [class='btn mx-button mx-name-actionButton3 btn-success']");

    SelenideElement customersValidationError = $("[class*='form-group mx-name-referenceSelector1 align-label-left has-error'] [class='alert alert-danger mx-validation-message']");

    public NewOrderPage clickCustomerSelectorField(){
        customerSelectorField.click();
        return this;
    }
    public NewOrderPage clickFirstCustomerSelect(){
        firstCustomerSelect.click();
        return this;
    }

    public NewOrderPage clickСargoSelectorField(){
        cargoSelectorField.click();
        return this;
    }
    public NewOrderPage clickFirstCargoItemSelect(){
        cargoFirstItemSelect.click();
        return this;
    }
    public NewOrderPage clickCarrierSelectorField(){
        carrierSelectorField.click();
        return this;
    }
    public NewOrderPage clickCarrierFirstItemSelect(){
        carrierFirstItemSelect.click();
        return this;
    }
    public NewOrderPage inputDataToUnitsInputFields(){
        unitsInputFields.setValue("1");
        return this;
    }
    public NewOrderPage clickPlangroupSelectorField(){
        plangroupSelectorField.click();
        return this;
    }
    public NewOrderPage clickPlangroupItemSelect(){
        plangroupItemSelect.click();
        return this;
    }
    public NewOrderPage clickOrderTypeSelectorField(){
        orderTypeSelectorField.click();
        return this;
    }
    public NewOrderPage clickOrderItemSelect(){
        orderItemSelect.click();
        return this;
    }
    public NewOrderPage clickNextButton(){
        nextButton.click();
        sleep(5000);
        return this;
    }
    public NewOrderPage clickSearchAddressList1Button(){
        searchAddressList1Button.click();
        return this;
    }
    public NewOrderPage clickSearchAddressList2Button(){
        searchAddressList2Button.click();
        return this;
    }
    public NewOrderPage clickFirstItemAddress(){
        firstItemAddress.click();
        return this;
    }
    public NewOrderPage clickSecondItemAddress(){
        secondItemAddress.click();
        return this;
    }
    public NewOrderPage clickSelectButton(){
        selectButton.click();
        return this;
    }
     public NewOrderPage inputDataToTheFromInputList1Field(String time){
        fromInputList1Field.clear();
        fromInputList1Field.setValue(time);
        return this;
    }
    public NewOrderPage inputDataToTheFromInputList2Field(String time){
        fromInputList2Field.setValue(time);
        return this;
    }

    public NewOrderPage inputDataToTheUntilInputList1Field(){
        untilInputList1Field.setValue("11:00");
        return this;
    }
    public NewOrderPage inputDataToTheUntilInputList2Field(){
        untilInputList2Field.setValue("20:00");
        return this;
    }
    public NewOrderPage clickTransportTypeSelectorField(){
        transportTypeSelectorField.click();
        return this;
    }
    public NewOrderPage clickTransportTypeSelect(){
        transportTypeSelect.click();
        return this;
    }
    public NewOrderPage clickSaveButton(){
        saveButton.click();
        return this;
    }
    public NewOrderPage checkCustomerValidation(){
//        newOrderModalWindow.shouldHave(Condition.cssClass("[class*='form-group mx-name-referenceSelector1 align-label-left has-error'] [class='alert alert-danger mx-validation-message']"));
        customersValidationError.shouldHave(Condition.visible);
        System.out.println("Customer validation passed");
        sleep(5000);
        return this;
    }
    public NewOrderPage checkCargoValidation(){
        newOrderModalWindow.shouldHave(Condition.text("Please choose Customer."));
        // newOrderModalWindow.shouldHave(Condition.cssClass("[class*='form-group mx-name-referenceSelector8 align-label-left has-error'] [class='alert alert-danger mx-validation-message']"));
        System.out.println("Cargo validation passed");
        sleep(5000);
        return this;
    }
    public NewOrderPage checkPlanGroupValidation(){
        newOrderModalWindow.shouldHave(Condition.cssClass("[class*='form-group mx-name-referenceSelector10 align-label-left has-error'] [class='alert alert-danger mx-validation-message']"));
        System.out.println("PlanGroup validation passed");
        sleep(5000);
        return this;
    }
    public NewOrderPage checkOrderTypeValidation(){
        newOrderModalWindow.shouldHave(Condition.cssClass("[class*='form-group mx-name-referenceSelector9 align-label-left has-error'] [class='alert alert-danger mx-validation-message']"));
        System.out.println("Order type validation passed");
        sleep(5000);
        return this;
    }
    public NewOrderPage clickPlanGroupEditSelectorField(){
        planGroupEditSelectorField.click();
        return  this;
    }
    public NewOrderPage clickPlanGroupEditSelectorItem(){
        planGroupEditSelectorItem.click();
        return  this;
    }
    public NewOrderPage clickSaveButtonOnEditOrderModalWindow (){
        saveButtonOnEditOrderModalWindow.click();
        return this;
    }
}
