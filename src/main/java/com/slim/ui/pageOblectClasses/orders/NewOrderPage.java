package com.slim.ui.pageOblectClasses.orders;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

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



    public NewOrderPage clickOnCustomerSelectorField(){
        customerSelectorField.click();
        return this;
    }
    public NewOrderPage clickOnFirstCustomerSelect(){
        firstCustomerSelect.click();
        return this;
    }

    public NewOrderPage clickOnСargoSelectorField(){
        cargoSelectorField.click();
        return this;
    }
    public NewOrderPage clickOnFirstCargoItemSelect(){
        cargoFirstItemSelect.click();
        return this;
    }
    public NewOrderPage clickOnCarrierSelectorField(){
        carrierSelectorField.click();
        return this;
    }
    public NewOrderPage clickOnCarrierFirstItemSelect(){
        carrierFirstItemSelect.click();
        return this;
    }
    public NewOrderPage inputDataToUnitsInputFields(){
        unitsInputFields.setValue("1");
        return this;
    }
    public NewOrderPage clickOnPlangroupSelectorField(){
        plangroupSelectorField.click();
        return this;
    }
    public NewOrderPage clickOnPlangroupItemSelect(){
        plangroupItemSelect.click();
        return this;
    }
    public NewOrderPage clickOnOrderTypeSelectorField(){
        orderTypeSelectorField.click();
        return this;
    }
    public NewOrderPage clickOnOrderItemSelect(){
        orderItemSelect.click();
        return this;
    }
    public NewOrderPage clickNextButton(){
        nextButton.click();
        return this;
    }
    public NewOrderPage clickSearchAddressLsit1Button(){
        searchAddressList1Button.click();
        return this;
    }
    public NewOrderPage clickSearchAddressLsit2Button(){
        searchAddressList2Button.click();
        return this;
    }
    public NewOrderPage clickOnFirstItemAddress(){
        firstItemAddress.click();
        return this;
    }
    public NewOrderPage clickOnSecondItemAddress(){
        secondItemAddress.click();
        return this;
    }
    public NewOrderPage clickOnSelectButton(){
        selectButton.click();
        return this;
    }
     public NewOrderPage inputDataToTheFromInputList1Field(){
         fromInputList1Field.setValue("10000");
        return this;
    }
    public NewOrderPage inputDataToThefromInputList2Field(){
        fromInputList2Field.setValue("15000");
        return this;
    }

    public NewOrderPage inputDataToTheUntilInputList1Field(){
        untilInputList1Field.setValue("11000");
        return this;
    }
    public NewOrderPage inputDataToTheUntilInputList2Field(){
        untilInputList2Field.setValue("20000");
        return this;
    }
    public NewOrderPage clickOnTransportTypeSelectorField(){
        transportTypeSelectorField.click();
        return this;
    }
    public NewOrderPage clickOnTransportTypeSelect(){
        transportTypeSelect.click();
        return this;
    }
    public NewOrderPage clickSaveButton(){
        saveButton.click();
        return this;
    }
}
