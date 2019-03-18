package com.slim.ui.pageOblectClasses.orders;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class NewOrderPage {

    SelenideElement customerSelectorField = $("[class='form-group mx-name-referenceSelector1 align-label-left'] [class*='mx-referenceselector-input-wrapper']");
    SelenideElement abbinkVriezenveenCustomerSelect = $("[class='form-group mx-name-referenceSelector1 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='7036874417766605']");
    SelenideElement actifoodCustomerSelect = $("[class='form-group mx-name-referenceSelector1 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='7036874417766606']");
    SelenideElement anoeshGroningenCustomerSelect = $("[class='form-group mx-name-referenceSelector1 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='7036874417767504']");
    SelenideElement basLogisticsEttenLeurCustomerSelect = $("[class='form-group mx-name-referenceSelector1 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='7036874417767505']");
    SelenideElement boonstraTransportCustomerSelect = $("[class='form-group mx-name-referenceSelector1 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='7036874417766607']");
    SelenideElement dickSchoonCallantsoogCustomerSelect = $("[class='form-group mx-name-referenceSelector1 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='7036874417766901']");
    SelenideElement faDeNekkerZnCustomerSelect = $("[class='form-group mx-name-referenceSelector1 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='7036874417766603']");
    SelenideElement hartmanTransportVeenoordCustomerSelect = $("[class='form-group mx-name-referenceSelector1 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='7036874417767503']");
    SelenideElement hatzmannBettenCustomerSelect = $("[class='form-group mx-name-referenceSelector1 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='7036874417767503']");
    SelenideElement kelderCoevordenCustomerSelect = $("[class='form-group mx-name-referenceSelector1 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='7036874417766904']");
    SelenideElement kivitsDrunenCustomerSelect = $("[class='form-group mx-name-referenceSelector1 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='7036874417766701']");
    SelenideElement koningTransportbemiddelingCustomerSelect = $("[class='form-group mx-name-referenceSelector1 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='7036874417767509']");
    SelenideElement kosterEurotransportWolvegaCustomerSelect = $("[class='form-group mx-name-referenceSelector1 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='7036874417767502']");
    SelenideElement landHarkemaCustomerSelect = $("[class='form-group mx-name-referenceSelector1 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='7036874417767501']");
    SelenideElement netkoRaalteCustomerSelect = $("[class='form-group mx-name-referenceSelector1 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='7036874417766801']");
    SelenideElement simonLoosCustomerSelect = $("[class='form-group mx-name-referenceSelector1 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='7036874417766604']");
    SelenideElement smildeFoodsCustomerSelect = $("[class='form-group mx-name-referenceSelector1 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='7036874417766501']");
    SelenideElement spiltrapcentrumCustomerSelect = $("[class='form-group mx-name-referenceSelector1 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='7036874417766903']");
    SelenideElement thomMulderZnCustomerSelect = $("[class='form-group mx-name-referenceSelector1 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='7036874417767702']");
    SelenideElement vanOersUnitedCustomerSelect = $("[class='form-group mx-name-referenceSelector1 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='7036874417767301']");
    SelenideElement visserZoutkampCustomerSelect = $("[class='form-group mx-name-referenceSelector1 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='7036874417766802']");
    SelenideElement cargoSelectorField = $("[class='form-group mx-name-referenceSelector8 align-label-left'] [class*='mx-referenceselector-input-wrapper']");
    SelenideElement cargoAardappelenSelect = $("[class='form-group mx-name-referenceSelector8 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='13792273858822549']");
    SelenideElement cargoBuffelmelkSelect = $("[class='form-group mx-name-referenceSelector8 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='13792273858822547']");
    SelenideElement cargoGekoeldSelect = $("[class='form-group mx-name-referenceSelector8 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='13792273858822245']");
    SelenideElement cargoLeliesSelect = $("[class='form-group mx-name-referenceSelector8 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='13792273858822545']");
    SelenideElement cargoOngekoeldSelect = $("[class='form-group mx-name-referenceSelector8 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='13792273858822446']");
    SelenideElement cargoTrappenSelect = $("[class='form-group mx-name-referenceSelector8 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='13792273858822546']");
    SelenideElement cargoVerwarmenSelect = $("[class='form-group mx-name-referenceSelector8 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='13792273858822748']");
    SelenideElement carrierSelectorField = $("[class='form-group mx-name-referenceSelector2 align-label-left'] [class*='mx-referenceselector-input-wrapper']");
    SelenideElement carrierGekoeldEuroCHEPItemSelect = $("[class='form-group mx-name-referenceSelector2 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='20266198323167235']");
    SelenideElement carrierEuropalletItemSelect = $("[class='form-group mx-name-referenceSelector2 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='20266198323167236']");
    SelenideElement carrierH1PalletPlasticEuroItemSelect = $("[class='form-group mx-name-referenceSelector2 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='20266198323167237']");
    SelenideElement carrierBlokCHEPItemSelect = $("[class='form-group mx-name-referenceSelector2 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='20266198323167239']");
    SelenideElement carrierLeliekistItemSelect = $("[class='form-group mx-name-referenceSelector2 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='20266198323167333']");

    SelenideElement carrierPalletboxItemSelect = $("[class='form-group mx-name-referenceSelector2 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='20266198323167335']");
    SelenideElement carrierRolcontainerItemSelect = $("[class='form-group mx-name-referenceSelector2 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [value='20266198323167334']");
    SelenideElement unitsInputFields = $("[class='form-group mx-name-textBox4 align-label-left'] [class='form-control'] ");
    SelenideElement plangroupSelectorField = $("[class='form-group mx-name-referenceSelector10 align-label-left'] [class*='form-control'] ");
    SelenideElement standaardPlangroupItemSelect = $("[class='form-group mx-name-referenceSelector10 align-label-left'] [class*='form-control'] [value='27021597764223177']");
    SelenideElement сontainersPlangroupItemSelect = $("[class='form-group mx-name-referenceSelector10 align-label-left'] [class*='form-control'] [value='27021597764223589']");
    SelenideElement koeltransportPlangroupItemSelect = $("[class='form-group mx-name-referenceSelector10 align-label-left'] [class*='form-control'] [value='27021597764223578']");
    SelenideElement orderTypeSelectorField = $("[class='form-group mx-name-referenceSelector9 align-label-left'] [class*='form-control']");
    SelenideElement enkelLosAdresOrderTypeSelect = $("[class='form-group mx-name-referenceSelector9 align-label-left'] [class*='form-control'] [value='2533274790396305']");
    SelenideElement voorgeplandeRitMet2LosadressenOrderTypeSelect = $("[class='form-group mx-name-referenceSelector9 align-label-left'] [class*='form-control'] [value='2533274790396006']");
    SelenideElement voorgeplandeRitMet3LosadressenOrderTypeSelect = $("[class='form-group mx-name-referenceSelector9 align-label-left'] [class*='form-control'] [value='2533274790396105']");
    SelenideElement voorgeplandeRitMet4LosadressenOrderTypeSelect = $("[class='form-group mx-name-referenceSelector9 align-label-left'] [class*='form-control'] [value='2533274790396106']");
    SelenideElement voorlaadRitOrderTypeSelect = $("[class='form-group mx-name-referenceSelector9 align-label-left'] [class*='form-control'] [value='2533274790396209']");
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


    SelenideElement transportTypeSelectorField = $("[class*='form-group mx-name-referenceSelector13 align-label-left'] [class='form-control']");
    SelenideElement transportPalletprijsGekoeldPerUurTypeSelect = $("[class*='form-group mx-name-referenceSelector13 align-label-left'] [class*='form-control'] [value='26458647810801866']");
    SelenideElement transportPalletprijsOngekoeldPerUurTypeSelect = $("[class*='form-group mx-name-referenceSelector13 align-label-left'] [class*='form-control'] [value='26458647810801765']");
    SelenideElement transportPalletprijsVriesPerUurTypeSelect = $("[class*='form-group mx-name-referenceSelector13 align-label-left'] [class*='form-control'] [value='26458647810801867']");
    SelenideElement transportPrijsGekoeldPerKmUurTypeSelect = $("[class*='form-group mx-name-referenceSelector13 align-label-left'] [class*='form-control'] [value='26458647810801869']");
    SelenideElement transportPrijsGekoeldPerUurTypeSelect = $("[class*='form-group mx-name-referenceSelector13 align-label-left'] [class*='form-control'] [value='26458647810801865']");
    SelenideElement transportPrijsOngekoeldPerUurTypeSelect = $("[class*='form-group mx-name-referenceSelector13 align-label-left'] [class*='form-control'] [value='26458647810801766']");
    SelenideElement transportPrijsVriesPerUurTypeSelect = $("[class*='form-group mx-name-referenceSelector13 align-label-left'] [class*='form-control'] [value='26458647810801868']");

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
    public NewOrderPage clickAbbinkVriezenveenCustomerSelect(){
        abbinkVriezenveenCustomerSelect.click();
        return this;
    }

    public NewOrderPage clickActifoodCustomerSelectCustomerSelect(){
        actifoodCustomerSelect.click();
        return this;
    }
    public NewOrderPage clickAnoeshGroningenCustomerSelect(){
        anoeshGroningenCustomerSelect.click();
        return this;
    }
    public NewOrderPage clickBasLogisticsEttenLeurCustomerSelect(){
        basLogisticsEttenLeurCustomerSelect.click();
        return this;
    }
    public NewOrderPage clickBoonstraTransportCustomerSelect(){
        boonstraTransportCustomerSelect.click();
        return this;
    }
    public NewOrderPage clickDickSchoonCallantsoogCustomerSelect(){
        dickSchoonCallantsoogCustomerSelect.click();
        return this;
    }
    public NewOrderPage clickFaDeNekkerZnCustomerSelect(){
        faDeNekkerZnCustomerSelect.click();
        return this;
    }
    public NewOrderPage clickHartmanTransportVeenoordCustomerSelect(){
        hartmanTransportVeenoordCustomerSelect.click();
        return this;
    }
    public NewOrderPage clickHatzmannBettenCustomerSelect(){
        hatzmannBettenCustomerSelect.click();
        return this;
    }
    public NewOrderPage clickKelderCoevordenCustomerSelect(){
        kelderCoevordenCustomerSelect.click();
        return this;
    }
    public NewOrderPage clickKivitsDrunenCustomerSelect(){
        kivitsDrunenCustomerSelect.click();
        return this;
    }
    public NewOrderPage clickKoningTransportbemiddelingCustomerSelect(){
        koningTransportbemiddelingCustomerSelect.click();
        return this;
    }
    public NewOrderPage clickKosterEurotransportWolvegaCustomerSelect(){
        kosterEurotransportWolvegaCustomerSelect.click();
        return this;
    }
    public NewOrderPage clickLandHarkemaCustomerSelect(){
        landHarkemaCustomerSelect.click();
        return this;
    }
    public NewOrderPage clickNetkoRaalteCustomerSelect(){
        netkoRaalteCustomerSelect.click();
        return this;
    }
    public NewOrderPage clickSimonLoosCustomerSelect(){
        simonLoosCustomerSelect.click();
        return this;
    }
    public NewOrderPage clickSmildeFoodsCustomerSelect(){
        smildeFoodsCustomerSelect.click();
        return this;
    }
    public NewOrderPage clickSpiltrapcentrumCustomerSelect(){
        spiltrapcentrumCustomerSelect.click();
        return this;
    }
    public NewOrderPage clickThomMulderZnCustomerSelect(){
        thomMulderZnCustomerSelect.click();
        return this;
    }
    public NewOrderPage clickVanOersUnitedCustomerSelect(){
        vanOersUnitedCustomerSelect.click();
        return this;
    }
    public NewOrderPage clickVisserZoutkampCustomerSelect(){
        visserZoutkampCustomerSelect.click();
        return this;
    }

    public NewOrderPage clickСargoSelectorField(){
        cargoSelectorField.click();
        return this;
    }
    public NewOrderPage clickBakkerijproductenCargoItemSelect(){
        cargoAardappelenSelect.click();
        return this;
    }
    public NewOrderPage clickBuffelmelkCargoItemSelect(){
        cargoBuffelmelkSelect.click();
        return this;
    }
    public NewOrderPage clickLeliesCargoItemSelect(){
        cargoLeliesSelect.click();
        return this;
    }
    public NewOrderPage clickGekoeldCargoItemSelect(){
        cargoGekoeldSelect.click();
        return this;
    }
    public NewOrderPage clickCargoOngekoeldSelect(){
        cargoOngekoeldSelect.click();
        return this;
    }
    public NewOrderPage clickCargoTrappenSelect(){
        cargoTrappenSelect.click();
        return this;
    }
    public NewOrderPage clickCargoVerwarmenSelect(){
        cargoVerwarmenSelect.click();
        return this;
    }
    public NewOrderPage clickCarrierSelectorField(){
        carrierSelectorField.click();
        return this;
    }
    public NewOrderPage clickCarrierLeliekistItemSelect(){
        carrierLeliekistItemSelect.click();
        return this;
    }
    public NewOrderPage clickCarrierBlockPalletItemSelect(){
        carrierGekoeldEuroCHEPItemSelect.click();
        return this;
    }

    public NewOrderPage clickCarrierPalletBoxItemSelect(){
        carrierPalletboxItemSelect.click();
        return this;
    }
    public NewOrderPage clickCarrierEuropalletItemSelect(){
        carrierEuropalletItemSelect.click();
        return this;
    }
    public NewOrderPage clickCarrierH1PalletPlasticEuroItemSelect(){
        carrierH1PalletPlasticEuroItemSelect.click();
        return this;
    }
    public NewOrderPage clickcarrierBlokCHEPItemSelect(){
        carrierBlokCHEPItemSelect.click();
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
    public NewOrderPage clickStandaardPlangroupItemSelect(){
        standaardPlangroupItemSelect.click();
        return this;
    }
//    public NewOrderPage clickContainersPlangroupItemSelect(){
//        сontainersPlangroupItemSelect.click();
//        return this;
//    }
//    public NewOrderPage clickKoeltransportPlangroupItemSelect(){
//        koeltransportPlangroupItemSelect.click();
//        return this;
//    }
    public NewOrderPage clickOrderTypeSelectorField(){
        orderTypeSelectorField.click();
        return this;
    }
    public NewOrderPage clickEnkelLosAdresOrderTypeSelectOrderTypeSelect(){
        enkelLosAdresOrderTypeSelect.click();
        return this;
    }
    public NewOrderPage clickVoorgeplandeRitMet2LosadressenOrderTypeSelecteOrderTypeSelectSelect(){
        voorgeplandeRitMet2LosadressenOrderTypeSelect.click();
        return this;
    }
    public NewOrderPage clickVoorgeplandeRitMet3LosadressenOrderTypeSelect(){
        voorgeplandeRitMet3LosadressenOrderTypeSelect.click();
        return this;
    }
    public NewOrderPage clickVoorgeplandeRitMet4LosadressenOrderTypeSelect(){
        voorgeplandeRitMet4LosadressenOrderTypeSelect.click();
        return this;
    }
    public NewOrderPage clickVoorlaadRitOrderTypeSelect(){
        voorlaadRitOrderTypeSelect.click();
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

    public NewOrderPage clickTransportPalletprijsGekoeldPerUurTypeSelect(){
        transportPalletprijsGekoeldPerUurTypeSelect.click();
        return this;
    }

    public NewOrderPage clickTransportPalletprijsOngekoeldPerUurTypeSelect(){
        transportPalletprijsOngekoeldPerUurTypeSelect.click();
        return this;
    }

    public NewOrderPage clickTransportPalletprijsVriesPerUurTypeSelect(){
        transportPalletprijsVriesPerUurTypeSelect.click();
        return this;
    }

    public NewOrderPage clickTransportPrijsGekoeldPerKmUurTypeSelect(){
        transportPrijsGekoeldPerKmUurTypeSelect.click();
        return this;
    }
    public NewOrderPage clickTransportPrijsGekoeldPerUurTypeSelect(){
        transportPrijsGekoeldPerUurTypeSelect.click();
        return this;
    }
    public NewOrderPage clickTransportPrijsOngekoeldPerUurTypeSelect(){
        transportPrijsOngekoeldPerUurTypeSelect.click();
        return this;
    }
    public NewOrderPage clickTransportPrijsVriesPerUurTypeSelect(){
        transportPrijsVriesPerUurTypeSelect.click();
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
