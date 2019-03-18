package com.slim.ui.pageOblectClasses.orders;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class NewWorkOrderPage {
    SelenideElement customerField = $("[class='form-group mx-name-referenceSelector1 align-label-left'] [class*='mx-referenceselector-input-wrapper'] [class*='form-control']");
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
    SelenideElement plannedStartTime = $("[class='mx-name-textBox1'] [class*='form-control']");
    SelenideElement plannedEndTime = $("[class='mx-name-textBox2'] [class*='form-control']");
    SelenideElement planGroupField = $("[class='form-group mx-name-referenceSelector10 align-label-left'] [class='mx-referenceselector-input-wrapper'] [class*='form-control']");
    SelenideElement standaardPlangroupItemSelect = $("[class='form-group mx-name-referenceSelector10 align-label-left'] [class*='form-control'] [value='27021597764223177']");
    SelenideElement сontainersPlangroupItemSelect = $("[class='form-group mx-name-referenceSelector10 align-label-left'] [class*='form-control'] [value='27021597764223589']");
    SelenideElement koeltransportPlangroupItemSelect = $("[class='form-group mx-name-referenceSelector10 align-label-left'] [class*='form-control'] [value='27021597764223578']");
    SelenideElement nextButton = $("[class='btn mx-button mx-name-actionButton2 btnRight > img btn-default']");
    SelenideElement addDriverButton = $("[class*='btn mx-button mx-name-actionButton3 buttonnonbordergreen-image fa fa-plus-square btn-success']");
    SelenideElement addTractorLiceseButton = $("[class*='btn mx-button mx-name-actionButton6 buttonnonbordergreen-image fa fa-plus-square btn-success']");
    SelenideElement addTrailerLiceseButton = $("[class*='btn mx-button mx-name-actionButton7 buttonnonbordergreen-image fa fa-plus-square btn-success']");
    SelenideElement firstItemClaimButton = $("[class='mx-dataview mx-name-dataView2 form-horizontal'] [class='mx-listview-item mx-name-index-0'] [class='btn mx-button mx-name-actionButton17 btn-success']");
    SelenideElement secondItemClaimButton = $("[class='mx-dataview mx-name-dataView2 form-horizontal'] [class='mx-listview-item mx-name-index-1'] [class='btn mx-button mx-name-actionButton17 btn-success']");
    SelenideElement thirdItemClaimButton = $("[class='mx-dataview mx-name-dataView2 form-horizontal'] [class='mx-listview-item mx-name-index-2'] [class='btn mx-button mx-name-actionButton17 btn-success']");
    SelenideElement fourthItemClaimButton = $("[class='mx-dataview mx-name-dataView2 form-horizontal'] [class='mx-listview-item mx-name-index-3'] [class='btn mx-button mx-name-actionButton17 btn-success']");
    SelenideElement fifthItemClaimButton = $("[class='mx-dataview mx-name-dataView2 form-horizontal'] [class='mx-listview-item mx-name-index-4'] [class='btn mx-button mx-name-actionButton17 btn-success']");
    SelenideElement publishTripButton = $("[class='btn mx-button mx-name-actionButton4 btn-success'] ");
    ElementsCollection startAndEndDate = $$("[data-mendix-id=\"55_37\"] [class=\"mx-dateinput\"] input");
    SelenideElement iUnderstandButtonOnWarningPopUp = $("[class*='btn mx-button mx-name-actionButton1 btn-success']");

    SelenideElement okButtonInModalWindow = $("[class='modal-dialog mx-dialog mx-dialog-error'] button");

    SelenideElement startAddressSelector = $("[class='mx-listview-item mx-name-index-0'] [class='mx-listview-item mx-name-index-0'] [class='col-md-5']");
    SelenideElement absTransUtrechtItemInStartAddressSelector = $("[class='mx-listview-item mx-name-index-0'] [class='mx-listview-item mx-name-index-0'] [class='col-md-5'] [value='21673573206724637']");
    SelenideElement visserijstraatAmmestolItemInStartAddressSelector = $("[class='mx-listview-item mx-name-index-0'] [class='mx-listview-item mx-name-index-0'] [class='col-md-5'] [value='21673573206725016']");
    SelenideElement visserijstraatAmmestolItemInFirstStopSelector = $("[class='mx-listview-item mx-name-index-0'] [class='mx-listview-item mx-name-index-0'] [class='col-md-5'] [value='21673573206725016']");
    SelenideElement attachingTrailerAddressSelector = $("[class='mx-listview-item mx-name-index-0'] [class='mx-listview-item mx-name-index-1'] [class='col-md-5']");
    SelenideElement absTransUtrechtItemInAttachingTrailerAddressSelector = $("[class='mx-listview-item mx-name-index-0'] [class='mx-listview-item mx-name-index-1'] [class='col-md-5'] [value='21673573206724637']");
    SelenideElement visserijstraatAmmestolItemInAttachingTrailerAddressSelector = $("[class='mx-listview-item mx-name-index-0'] [class='mx-listview-item mx-name-index-1'] [class='col-md-5'] [value='21673573206725016']");
    SelenideElement firstStopAddressSelector = $("[class='mx-listview-item mx-name-index-0'] [class='mx-listview-item mx-name-index-2'] [class='col-md-5']");
    //SelenideElement absTransUtrechtItemInFirstStopAddressSelector = $("[class='mx-listview-item mx-name-index-2'] [class='mx-referenceselector mx-name-referenceSelector8 h6'] [class*='form-control'] [value='21673573206724637']");
    SelenideElement absTransUtrechtItemInFirstStopAddressSelector = $("[class='mx-listview-item mx-name-index-0'] [class='mx-listview-item mx-name-index-2'] [class='col-md-5'] [value='21673573206724637']");
    SelenideElement visserijstraatAmmestolItemInFirstStopAddressSelector = $("[class='mx-listview-item mx-name-index-0'] [class='mx-listview-item mx-name-index-2'] [class='col-md-5'] [value='21673573206725016']");
    SelenideElement lastStopAddressSelector = $("[class='mx-listview-item mx-name-index-0'] [class='mx-listview-item mx-name-index-3'] [class='col-md-5']");
    SelenideElement absTransUtrechtItemInLastStopAddressSelector = $("[class='mx-listview-item mx-name-index-0'] [class='mx-listview-item mx-name-index-3'] [class='col-md-5'] [value='21673573206724637']");
    SelenideElement visserijstraatAmmestolItemInLastStopAddressSelector = $("[class='mx-listview-item mx-name-index-0'] [class='mx-listview-item mx-name-index-3'] [class='col-md-5'] [value='21673573206725016']");
    SelenideElement detachingTrailerAddressSelector = $("[class='mx-listview-item mx-name-index-0'] [class='mx-listview-item mx-name-index-4'] [class='col-md-5']");
    SelenideElement absTransUtrechtItemInDetachingTrailerAddressSelector = $("[class='mx-listview-item mx-name-index-0'] [class='mx-listview-item mx-name-index-4'] [class='col-md-5'] [value='21673573206724637']");
    SelenideElement visserijstraatAmmestolItemInDetachingTrailerAddressSelector = $("[class='mx-listview-item mx-name-index-0'] [class='mx-listview-item mx-name-index-4'] [class='col-md-5'] [value='21673573206725016']");
    SelenideElement endAddressSelector = $("[class='mx-listview-item mx-name-index-0'] [class='mx-listview-item mx-name-index-5'] [class='col-md-5']");
    SelenideElement absTransUtrechtItemInEndAddressSelector = $("[class='mx-listview-item mx-name-index-0'] [class='mx-listview-item mx-name-index-5'] [class='col-md-5'] [value='21673573206724637']");
    SelenideElement visserijstraatAmmestolItemInEndAddressSelector = $("[class='mx-listview-item mx-name-index-0'] [class='mx-listview-item mx-name-index-5'] [class='col-md-5'] [value='21673573206725016']");

    public NewWorkOrderPage clickCustomerField() {
        customerField.click();
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
    public NewWorkOrderPage clickAnoeshGroningenCustomerSelect(){
        anoeshGroningenCustomerSelect.click();
        return this;
    }
    public NewWorkOrderPage clickBasLogisticsEttenLeurCustomerSelect(){
        basLogisticsEttenLeurCustomerSelect.click();
        return this;
    }
    public NewWorkOrderPage clickBoonstraTransportCustomerSelect(){
        boonstraTransportCustomerSelect.click();
        return this;
    }
    public NewWorkOrderPage clickDickSchoonCallantsoogCustomerSelect(){
        dickSchoonCallantsoogCustomerSelect.click();
        return this;
    }
    public NewWorkOrderPage clickFaDeNekkerZnCustomerSelect(){
        faDeNekkerZnCustomerSelect.click();
        return this;
    }
    public NewWorkOrderPage clickHartmanTransportVeenoordCustomerSelect(){
        hartmanTransportVeenoordCustomerSelect.click();
        return this;
    }
    public NewWorkOrderPage clickHatzmannBettenCustomerSelect(){
        hatzmannBettenCustomerSelect.click();
        return this;
    }
    public NewWorkOrderPage clickKelderCoevordenCustomerSelect(){
        kelderCoevordenCustomerSelect.click();
        return this;
    }
    public NewWorkOrderPage clickKivitsDrunenCustomerSelect(){
        kivitsDrunenCustomerSelect.click();
        return this;
    }
    public NewWorkOrderPage clickKoningTransportbemiddelingCustomerSelect(){
        koningTransportbemiddelingCustomerSelect.click();
        return this;
    }
    public NewWorkOrderPage clickKosterEurotransportWolvegaCustomerSelect(){
        kosterEurotransportWolvegaCustomerSelect.click();
        return this;
    }
    public NewWorkOrderPage clickLandHarkemaCustomerSelect(){
        landHarkemaCustomerSelect.click();
        return this;
    }
    public NewWorkOrderPage clickNetkoRaalteCustomerSelect(){
        netkoRaalteCustomerSelect.click();
        return this;
    }
    public NewWorkOrderPage clickSimonLoosCustomerSelect(){
        simonLoosCustomerSelect.click();
        return this;
    }
    public NewWorkOrderPage clickSmildeFoodsCustomerSelect(){
        smildeFoodsCustomerSelect.click();
        return this;
    }
    public NewWorkOrderPage clickSpiltrapcentrumCustomerSelect(){
        spiltrapcentrumCustomerSelect.click();
        return this;
    }
    public NewWorkOrderPage clickThomMulderZnCustomerSelect(){
        thomMulderZnCustomerSelect.click();
        return this;
    }
    public NewWorkOrderPage clickVanOersUnitedCustomerSelect(){
        vanOersUnitedCustomerSelect.click();
        return this;
    }
    public NewWorkOrderPage clickVisserZoutkampCustomerSelect(){
        visserZoutkampCustomerSelect.click();
        return this;
    }

    public NewWorkOrderPage setPlanedStartAndEndDate(String startDate, String endDate) {
        startAndEndDate.get(0).clear();
        okButtonInModalWindow.click();
        sleep(300);
        startAndEndDate.get(0).setValue(startDate);

        startAndEndDate.get(1).clear();
        okButtonInModalWindow.click();
        sleep(300);
        startAndEndDate.get(1).setValue(endDate);
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
    public NewWorkOrderPage clickContainersPlangroupItemSelect() {
        сontainersPlangroupItemSelect.click();
        return this;
    }
    public NewWorkOrderPage clickKoeltransportPlangroupItemSelect() {
        koeltransportPlangroupItemSelect.click();
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

    public NewWorkOrderPage clickFirstItemClaimButton() {
        sleep(2000);
        firstItemClaimButton.click();
        sleep(2000);
        return this;
    }
    public NewWorkOrderPage clickSecondItemClaimButton() {
        sleep(2000);
        secondItemClaimButton.click();
        sleep(2000);
        return this;
    }
    public NewWorkOrderPage clickThirdItemClaimButton() {
        sleep(2000);
        thirdItemClaimButton.click();
        sleep(2000);
        return this;
    }
    public NewWorkOrderPage clickFourthItemClaimButton() {
        sleep(2000);
        fourthItemClaimButton.click();
        sleep(2000);
        return this;
    }
    public NewWorkOrderPage clickFifthItemClaimButton() {
        sleep(2000);
        fifthItemClaimButton.click();
        sleep(2000);
        return this;
    }
    public NewWorkOrderPage clickStartAddressSelector() {
        startAddressSelector.click();
        return this;
    }

    public NewWorkOrderPage clickAbsTransUtrechtItemInStartAddressSelector() {
        absTransUtrechtItemInStartAddressSelector.click();
        return this;
    }
    public NewWorkOrderPage clickVisserijstraatAmmestolItemInStartAddressSelector(){
        visserijstraatAmmestolItemInStartAddressSelector.click();
        return this;
    }

    public NewWorkOrderPage clickVisserijstraatAmmestolItemInFirstStopSelector() {
        visserijstraatAmmestolItemInFirstStopSelector.click();
        return this;
    }

    public NewWorkOrderPage clickAttachingTrailerAddressSelector() {
        attachingTrailerAddressSelector.click();
        return this;
    }
    public NewWorkOrderPage clickAbsTransUtrechtItemInAttachingTrailerAddressSelector() {
        absTransUtrechtItemInAttachingTrailerAddressSelector.click();
        return this;
    }
    public NewWorkOrderPage clickVisserijstraatAmmestolItemInAttachingTrailerAddressSelector() {
        visserijstraatAmmestolItemInAttachingTrailerAddressSelector.click();
        return this;
    }
    public NewWorkOrderPage clickFirstStopSelector() {
        firstStopAddressSelector.click();
        return this;
    }

    public NewWorkOrderPage clickAbsTransUtrechtItemInFirstStopSelector() {
        absTransUtrechtItemInFirstStopAddressSelector.click();
        return this;
    }
    public NewWorkOrderPage clickVisserijstraatAmmestolItemInFirstStopAddressSelector() {
        visserijstraatAmmestolItemInFirstStopAddressSelector.click();
        return this;
    }
    public NewWorkOrderPage clickLastStopAddressSelector() {
        lastStopAddressSelector.click();
        return this;
    }
    public NewWorkOrderPage clickAbsTransUtrechtItemInLastStopAddressSelector() {
        absTransUtrechtItemInLastStopAddressSelector.click();
        return this;
    }

    public NewWorkOrderPage clickVisserijstraatAmmestolItemInLastStopSelector() {
        visserijstraatAmmestolItemInLastStopAddressSelector.click();
        return this;
    }
    public NewWorkOrderPage clickDetachingTrailerAddressSelector() {
        detachingTrailerAddressSelector.click();
        return this;
    }
    public NewWorkOrderPage clickAbsTransUtrechtItemInDetachingTrailerAddressSelector() {
        absTransUtrechtItemInDetachingTrailerAddressSelector.click();
        return this;
    }
    public NewWorkOrderPage clickVisserijstraatAmmestolItemInDetachingTrailerAddressSelector() {
        visserijstraatAmmestolItemInDetachingTrailerAddressSelector.click();
        return this;
    }

    public NewWorkOrderPage clickEndAddressSelector() {
        endAddressSelector.click();
        return this;
    }
    public NewWorkOrderPage clickAbsTransUtrechtItemInEndAddressSelector() {
        absTransUtrechtItemInEndAddressSelector.click();
        return this;
    }
    public NewWorkOrderPage clickVisserijstraatAmmestolItemInEndAddressSelector() {
        visserijstraatAmmestolItemInEndAddressSelector.click();
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
            return WebDriverRunner.getWebDriver().findElement(By.cssSelector("[class*='btn mx-button mx-name-actionButton1 btn-success']")).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
}

