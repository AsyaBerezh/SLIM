package com.slim.ui.pageOblectClasses.orders;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class NewOrderPage {

    SelenideElement customerSelectorField = $("[class='form-group mx-name-referenceSelector1 align-label-left'] [class*='mx-referenceselector-input-wrapper']");
    SelenideElement gebrCustomerSelect = $("[class='form-group mx-name-referenceSelector1 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='7036874417767002']");
    SelenideElement jansenCustomerSelect = $("[class='form-group mx-name-referenceSelector1 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='7036874417767001']");
    SelenideElement cargoSelectorField = $("[class='form-group mx-name-referenceSelector8 align-label-left'] [class*='mx-referenceselector-input-wrapper']");
    SelenideElement cargoBakkerijproductenItemSelect = $("[class='form-group mx-name-referenceSelector8 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='13792273858822745']");
    SelenideElement cargoGroenteFruitItemSelect = $("[class='form-group mx-name-referenceSelector8 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='13792273858822850']");
    SelenideElement cargoVersproductenItemSelect = $("[class='form-group mx-name-referenceSelector8 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='13792273858822847']");
    SelenideElement cargoTestjuItemSelect = $("[class='form-group mx-name-referenceSelector8 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='13792273858822945']");
    SelenideElement carrierSelectorField = $("[class='form-group mx-name-referenceSelector2 align-label-left'] [class*='mx-referenceselector-input-wrapper']");
    SelenideElement carrierBlockPalletItemSelect = $("[class='form-group mx-name-referenceSelector2 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='20266198323167333']");
    SelenideElement carrierEuroPalletItemSelect = $("[class='form-group mx-name-referenceSelector2 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='20266198323167335']");
    SelenideElement carrierRolcontainerItemSelect = $("[class='form-group mx-name-referenceSelector2 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='20266198323167334']");
    SelenideElement unitsInputFields = $("[class='form-group mx-name-textBox4 align-label-left'] [class='form-control'] ");
    SelenideElement plangroupSelectorField = $("[class='form-group mx-name-referenceSelector10 align-label-left'] [class*='form-control'] ");
    SelenideElement binnenlandPlangroupItemSelect = $("[class='form-group mx-name-referenceSelector10 align-label-left'] [class*='form-control'] [value='27021597764223580']");
    SelenideElement сontainersPlangroupItemSelect = $("[class='form-group mx-name-referenceSelector10 align-label-left'] [class*='form-control'] [value='27021597764223589']");
    SelenideElement koeltransportPlangroupItemSelect = $("[class='form-group mx-name-referenceSelector10 align-label-left'] [class*='form-control'] [value='27021597764223578']");
    SelenideElement orderTypeSelectorField = $("[class='form-group mx-name-referenceSelector9 align-label-left'] [class*='form-control']");
    SelenideElement abRitOrderTypeSelect = $("[class='form-group mx-name-referenceSelector9 align-label-left'] [class*='form-control'] [value='2533274790396405']");
    SelenideElement distributieOrderTypeSelect = $("[class='form-group mx-name-referenceSelector9 align-label-left'] [class*='form-control'] [value='2533274790396606']");
    SelenideElement nextButton = $("[class*='btn mx-button mx-name-actionButton2 btnRight > img btn-default']");
    SelenideElement searchAddressList1Button = $("[class='mx-listview mx-listview-selectable mx-name-listView3'] [class='mx-listview-item mx-name-index-0'] [class='btn btn-default']");
    SelenideElement searchAddressList2Button = $("[class='mx-listview mx-listview-selectable mx-name-listView3'] [class='mx-listview-item mx-name-index-1'] [class='btn btn-default']");
    SelenideElement firstItemAddress = $("[class='table table-striped table-bordered mx-datagrid-body-table'] [class*='mx-name-index-0']");
    SelenideElement secondItemAddress = $("[class='table table-striped table-bordered mx-datagrid-body-table'] [class*='mx-name-index-1']");
    SelenideElement thirdItemAddress = $("[class='table table-striped table-bordered mx-datagrid-body-table'] [class*='mx-name-index-2']");
    SelenideElement fourthItemAddress = $("[class='table table-striped table-bordered mx-datagrid-body-table'] [class*='mx-name-index-3']");
    SelenideElement fifthItemAddress = $("[class='table table-striped table-bordered mx-datagrid-body-table'] [class*='mx-name-index-4']");
    SelenideElement sixthItemAddress = $("[class='table table-striped table-bordered mx-datagrid-body-table'] [class*='mx-name-index-5']");
    SelenideElement seventhItemAddress = $("[class='table table-striped table-bordered mx-datagrid-body-table'] [class*='mx-name-index-6']");
    SelenideElement ninthItemAddress = $("[class='table table-striped table-bordered mx-datagrid-body-table'] [class*='mx-name-index-7']");
    SelenideElement tenthItemAddress = $("[class='table table-striped table-bordered mx-datagrid-body-table'] [class*='mx-name-index-8']");
    SelenideElement selectButton = $("[class='mx-layoutgrid mx-layoutgrid-fluid container-fluid mx-name-layoutGrid1'] [class='btn mx-button mx-name-actionButton1 btn-default']");

    ElementsCollection fromInputListField = $$("[class*='mx-name-textBox23'] input");
    ElementsCollection untilInputListField = $$("[class*='mx-name-textBox24'] input");

    SelenideElement fromInputList1Field = $(" [class*='mx-listview mx-listview-selectable mx-name-listView3'] [class*='mx-listview-item mx-name-index-0'] [class*='mx-name-textBox23'] [class*='form-control']");
    SelenideElement fromInputList2Field = $(" [class*='mx-listview mx-listview-selectable mx-name-listView3'] [class*='mx-listview-item mx-name-index-1'] [class*='mx-name-textBox23'] [class*='form-control']");
    SelenideElement untilInputList1Field = $(" [class*='mx-listview mx-listview-selectable mx-name-listView3'] [class*='mx-listview-item mx-name-index-0'] [class*='mx-name-textBox24'] [class*='form-control']");
    SelenideElement untilInputList2Field = $(" [class*='mx-listview mx-listview-selectable mx-name-listView3'] [class*='mx-listview-item mx-name-index-1'] [class*='mx-name-textBox24'] [class*='form-control']");
    SelenideElement transportTypeSelectorField = $("[class*='form-group mx-name-referenceSelector13 align-label-left'] [class='form-control']");
    SelenideElement transportKmTarifTypeSelect = $("[class*='form-group mx-name-referenceSelector13 align-label-left'] [class*='form-control'] [value='26458647810802267']");
    SelenideElement transportKmUurTarifTypeSelect = $("[class*='form-group mx-name-referenceSelector13 align-label-left'] [class*='form-control'] [value='26458647810802268']");
    SelenideElement transportUurTarifTypeSelect = $("[class*='form-group mx-name-referenceSelector13 align-label-left'] [class*='form-control'] [value='26458647810802266']");
    SelenideElement saveButton = $("[class='btn mx-button mx-name-actionButton4 btn-success']");
    SelenideElement saveAsTemplate = $("[class*='btn mx-button mx-name-actionButton7 btn-success']");
    SelenideElement saveButtonOnTheNewOrderTemplateModalWindow = $("[class='mx-dataview mx-name-dataView1'] [class*='btn mx-button mx-name-actionButton2 btn-success']");
    SelenideElement templateNameOnTheNewOrderTemplateModalWindow = $("[class='form-group mx-name-textBox1'] [class*='form-control']");
    SelenideElement planGroupEditSelectorField = $("[class='tab-pane mx-tabcontainer-pane active'] [class='form-group mx-name-referenceSelector9 align-label-left'] [class*='form-control']");
    SelenideElement planGroupEditSelectorItem = $("[class='tab-pane mx-tabcontainer-pane active'] [class='form-group mx-name-referenceSelector9 align-label-left'] [class*='form-control'] [value='27021597764223589']");
    SelenideElement saveButtonOnEditOrderModalWindow = $("[class='modal-content mx-window-content'] [class='btn mx-button mx-name-actionButton3 btn-success']");

    SelenideElement customersValidationError = $("[class*='form-group mx-name-referenceSelector1 align-label-left has-error'] [class='alert alert-danger mx-validation-message']");
    SelenideElement cargoValidationError = $("[class*='form-group mx-name-referenceSelector8 align-label-left has-error'] [class='alert alert-danger mx-validation-message']");
    SelenideElement planGroupValidationError = $("[class*='form-group mx-name-referenceSelector10 align-label-left has-error'] [class='alert alert-danger mx-validation-message']");
    SelenideElement orderTypeValidationError = $("[class*='form-group mx-name-referenceSelector9 align-label-left has-error'] [class='alert alert-danger mx-validation-message']");

    public NewOrderPage clickCustomerSelectorField(){
        customerSelectorField.click();
        return this;
    }
    public NewOrderPage clickGebrCustomerSelect(){
        gebrCustomerSelect.click();
        return this;
    }

    public NewOrderPage clickJansenCustomerSelect(){
        jansenCustomerSelect.click();
        return this;
    }

    public NewOrderPage clickСargoSelectorField(){
        cargoSelectorField.click();
        return this;
    }
    public NewOrderPage clickBakkerijproductenCargoItemSelect(){
        cargoBakkerijproductenItemSelect.click();
        return this;
    }
    public NewOrderPage clickFruitItemCargoItemSelect(){
        cargoGroenteFruitItemSelect.click();
        return this;
    }
    public NewOrderPage clickTestjuCargoItemSelect(){
        cargoTestjuItemSelect.click();
        return this;
    }
    public NewOrderPage clickVersproductenCargoItemSelect(){
        cargoVersproductenItemSelect.click();
        return this;
    }




    public NewOrderPage clickCarrierSelectorField(){
        carrierSelectorField.click();
        return this;
    }
    public NewOrderPage clickCarrierBlockPalletItemSelect(){
        carrierBlockPalletItemSelect.click();
        return this;
    }

    public NewOrderPage clickCarrierEuroPalletItemSelect(){
        carrierEuroPalletItemSelect.click();
        return this;
    }
    public NewOrderPage clickCarrierRolcontainerItemSelect(){
        carrierRolcontainerItemSelect.click();
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
    public NewOrderPage clickBinnenlandPlangroupItemSelect(){
        binnenlandPlangroupItemSelect.click();
        return this;
    }
    public NewOrderPage clickContainersPlangroupItemSelect(){
        сontainersPlangroupItemSelect.click();
        return this;
    }
    public NewOrderPage clickKoeltransportPlangroupItemSelect(){
        koeltransportPlangroupItemSelect.click();
        return this;
    }
    public NewOrderPage clickOrderTypeSelectorField(){
        orderTypeSelectorField.click();
        return this;
    }
    public NewOrderPage clickAbRitOrderTypeSelect(){
        abRitOrderTypeSelect.click();
        return this;
    }
    public NewOrderPage clickDistributieOrderTypeSelectSelect(){
        distributieOrderTypeSelect.click();
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

    public NewOrderPage clickThirdItemAddress(){
        thirdItemAddress.click();
        return this;
    }
    public NewOrderPage clickFourthItemAddress(){
        fourthItemAddress.click();
        return this;
    }
    public NewOrderPage clickFifthItemAddress(){
        fifthItemAddress.click();
        return this;
    }
    public NewOrderPage clickSixthItemAddress(){
        sixthItemAddress.click();
        return this;
    }
    public NewOrderPage clickSeventhItemAddress(){
        seventhItemAddress.click();
        return this;
    }
    public NewOrderPage clickNinthItemAddress(){
        ninthItemAddress.click();
        return this;
    }
    public NewOrderPage clickTenthItemAddress(){
        tenthItemAddress.click();
        return this;
    }

    public NewOrderPage clickSelectButton(){
        selectButton.click();
        return this;
    }

    public NewOrderPage inputDataToTheFromInputListField(String fromTime, String untilTime) {
        fromInputListField.get(0).click();
        sleep(250);
        String timeWithoutDot = fromTime.replace(":", "");
        for (int i = 0; i < timeWithoutDot.length(); i++) {
            fromInputListField.get(0).sendKeys(String.valueOf(timeWithoutDot.charAt(i)));
            sleep(150);
        }

        timeWithoutDot = untilTime.replace(":", "");
        untilInputListField.get(0).click();
        sleep(250);
        untilInputListField.get(0).clear();
        for (int i = 0; i < timeWithoutDot.length(); i++) {
            untilInputListField.get(0).sendKeys(String.valueOf(timeWithoutDot.charAt(i)));
            sleep(150);
        }
        untilInputListField.get(0).pressEnter();
        return this;
    }

    public NewOrderPage inputDataToTheUntilInputList2Field(String fromTime, String untilTime) {
        fromInputListField.get(1).click();
        sleep(250);
        String timeWithoutDot = fromTime.replace(":", "");
        for (int i = 0; i < timeWithoutDot.length(); i++) {
            fromInputListField.get(1).sendKeys(String.valueOf(timeWithoutDot.charAt(i)));
            sleep(150);
        }

        timeWithoutDot = untilTime.replace(":", "");
        untilInputListField.get(1).click();
        sleep(250);
        untilInputListField.get(1).clear();
        for (int i = 0; i < timeWithoutDot.length(); i++) {
            untilInputListField.get(1).sendKeys(String.valueOf(timeWithoutDot.charAt(i)));
            sleep(150);
        }
        untilInputListField.get(1).pressEnter();
        return this;
    }

     public NewOrderPage clickTransportTypeSelectorField(){
        transportTypeSelectorField.click();
        return this;
    }

    public NewOrderPage clickTransportKmTarifTypeSelect(){
        transportKmTarifTypeSelect.click();
        return this;
    }

    public NewOrderPage clickTransportKmUurTarifTypeSelect(){
        transportKmUurTarifTypeSelect.click();
        return this;
    }

    public NewOrderPage clickTransportUurTarifTypeSelect(){
        transportUurTarifTypeSelect.click();
        return this;
    }

    public NewOrderPage clickSaveButton(){
        saveButton.click();
        return this;
    }
    public NewOrderPage clickSaveAsTemplateButton(){
        saveAsTemplate.click();
        return this;
    }
    public NewOrderPage inputTemplateNameOnTheNewOrderTemplateModalWindow(String text){
        templateNameOnTheNewOrderTemplateModalWindow.click();
        sleep(1000);
        templateNameOnTheNewOrderTemplateModalWindow.clear();
        sleep(2000);
        templateNameOnTheNewOrderTemplateModalWindow.sendKeys(text);
        return this;
    }

public NewOrderPage clickSaveButtonOnTheNewOrderTemplateModalWindow(){
        saveButtonOnTheNewOrderTemplateModalWindow.click();
        return this;
    }

    public NewOrderPage checkCustomerValidation(){
        customersValidationError.shouldHave(Condition.visible);
        System.out.println("Customer validation passed");
        sleep(2000);
        return this;
    }
    public NewOrderPage checkCargoValidation(){
        //newOrderModalWindow.shouldHave(Condition.text("Please choose Customer."));
        // newOrderModalWindow.shouldHave(Condition.cssClass("[class*='form-group mx-name-referenceSelector8 align-label-left has-error'] [class='alert alert-danger mx-validation-message']"));
        cargoValidationError.shouldHave(Condition.visible);
        System.out.println("Cargo validation passed");
        sleep(2000);
        return this;
    }
    public NewOrderPage checkPlanGroupValidation(){
        planGroupValidationError.shouldHave(Condition.visible);
        System.out.println("PlanGroup validation passed");
        sleep(2000);
        return this;
    }
    public NewOrderPage checkOrderTypeValidation(){
        orderTypeValidationError.shouldHave(Condition.visible);
        System.out.println("Order type validation passed");
        sleep(2000);
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
