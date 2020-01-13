package org.slim.ui.orders;

import com.slim.ui.pageOblectClasses.DashboardPage;
import com.slim.ui.pageOblectClasses.LoginPage;
import com.slim.ui.pageOblectClasses.office.OfficePage;
import com.slim.ui.pageOblectClasses.orders.NewOrderFromTemplatePage;
import com.slim.ui.pageOblectClasses.orders.NewOrderPage;
import com.slim.ui.pageOblectClasses.orders.NewWorkOrderPage;
import com.slim.ui.pageOblectClasses.orders.OrdersPage;
import org.slim.ui.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static com.slim.ui.dataGenerator.DataGenerator.*;

public class AutomaticDataInputTest extends BaseTest {
    DashboardPage dashboardPage = new DashboardPage();
    LoginPage loginPage = new LoginPage();
    NewOrderPage newOrderPage = new NewOrderPage();
    OrdersPage ordersPage = new OrdersPage();
    NewOrderFromTemplatePage newOrderFromTemplatePage = new NewOrderFromTemplatePage();
    NewWorkOrderPage newWorkOrderPage = new NewWorkOrderPage();
    OfficePage officePage = new OfficePage();

    @BeforeClass

    private void preClass (){
        loginPage
                .loginToDashboard("marharyta@fitsoft.nl", "QWEqwe123!@#");
    }
    @Test(enabled = false)
    public void generatingNewOrderWithAbbinkVriezenveenCustomerAndBakkerijproductenCargo(){
        dashboardPage
                .openDashBoard()
                .clickOrdersButton();
        ordersPage
                .clickNewOrderButton();
        newOrderPage
                .clickCustomerSelectorField()
                .clickAbbinkVriezenveenCustomerSelect()
                .clickСargoSelectorField()
                .clickBakkerijproductenCargoItemSelect()
                //.clickCarrierSelectorField()
                //.clickCarrierBlockPalletItemSelect()
                .inputDataToUnitsInputFields()
                .clickPlangroupSelectorField()
                .clickStandaardPlangroupItemSelect()
                .clickOrderTypeSelectorField()
                .clickEnkelLosAdresOrderTypeSelectOrderTypeSelect()
                .clickNextButton()
                .clickSearchAddressList1Button()
                .clickFirstItemAddress()
                .clickSelectButton()
                .clickSearchAddressList2Button()
                .clickSecondItemAddress()
                .clickSelectButton()
                .inputDataToTheFromInputListField(getTime(10,11), getTime(14,15))
                .inputDataToTheUntilInputList2Field(getTime(10,11), getTime(14,15))
                .clickNextButton()
                .clickTransportTypeSelectorField()
                .clickTransportPalletprijsGekoeldPerUurTypeSelect()
                .clickSaveButton();
        sleep(2000);
    }
    @Test(enabled = false)
    public void generatingNewOrderWithAbbinkVriezenveenCustomerAndBuffelmelkCargo(){
        dashboardPage
                .openDashBoard()
                .clickOrdersButton();
        ordersPage
                .clickNewOrderButton();
        newOrderPage
                .clickCustomerSelectorField()
                .clickAbbinkVriezenveenCustomerSelect()
                .clickСargoSelectorField()
                .clickBuffelmelkCargoItemSelect()
                .clickCarrierSelectorField()
                .clickCarrierPalletBoxItemSelect()
                .inputDataToUnitsInputFields()
                .clickPlangroupSelectorField()
                .clickStandaardPlangroupItemSelect()
                .clickOrderTypeSelectorField()
                .clickEnkelLosAdresOrderTypeSelectOrderTypeSelect()
                .clickNextButton()
                .clickSearchAddressList1Button()
                .clickThirdItemAddress()
                .clickSelectButton()
                .clickSearchAddressList2Button()
                .clickFourthItemAddress()
                .clickSelectButton()
                .inputDataToTheFromInputListField(getTime(10,11), getTime(14,15))
                .inputDataToTheUntilInputList2Field(getTime(10,11), getTime(14,15))
                .clickNextButton()
                .clickTransportTypeSelectorField()
                .clickTransportPalletprijsOngekoeldPerUurTypeSelect()
                .clickSaveButton();
        sleep(2000);
    }
    @Test(enabled = false)
    public void generatingNewOrderWithGebrCustomerAndTetjuCargo(){
        dashboardPage
                .openDashBoard()
                .clickOrdersButton();
        ordersPage
                .clickNewOrderButton();
        newOrderPage
                .clickCustomerSelectorField()
                .clickAbbinkVriezenveenCustomerSelect()
                .clickСargoSelectorField()
                .clickLeliesCargoItemSelect()
                .clickCarrierSelectorField()
                .clickCarrierLeliekistItemSelect()
                .inputDataToUnitsInputFields()
                .clickPlangroupSelectorField()
                .clickStandaardPlangroupItemSelect()
                .clickOrderTypeSelectorField()
                .clickEnkelLosAdresOrderTypeSelectOrderTypeSelect()
                .clickNextButton()
                .clickSearchAddressList1Button()
                .clickFifthItemAddress()
                .clickSelectButton()
                .clickSearchAddressList2Button()
                .clickSixthItemAddress()
                .clickSelectButton()
                .inputDataToTheFromInputListField(getTime(10,11), getTime(14,15))
                .inputDataToTheUntilInputList2Field(getTime(10,11), getTime(14,15))
                .clickNextButton()
                .clickTransportTypeSelectorField()
                .clickTransportPalletprijsVriesPerUurTypeSelect()
                .clickSaveButton();
        sleep(2000);
    }
    @Test(enabled = false)
    public void generatingNewOrderWithGebrCustomerAndVersproductenCargoAndSavingAsTemplate(){
        dashboardPage
                .openDashBoard()
                .clickOrdersButton();
        ordersPage
                .clickNewOrderButton();
        newOrderPage
                .clickCustomerSelectorField()
                .clickAbbinkVriezenveenCustomerSelect()
                .clickСargoSelectorField()
                .clickGekoeldCargoItemSelect()
                .clickCarrierSelectorField()
                .clickCarrierH1PalletPlasticEuroItemSelect()
                .inputDataToUnitsInputFields()
                .clickPlangroupSelectorField()
                .clickStandaardPlangroupItemSelect()
                .clickOrderTypeSelectorField()
                .clickEnkelLosAdresOrderTypeSelectOrderTypeSelect()
                .clickNextButton()
                .clickSearchAddressList1Button()
                .clickFifthItemAddress()
                .clickSelectButton()
                .clickSearchAddressList2Button()
                .clickSixthItemAddress()
                .clickSelectButton()
                .inputDataToTheFromInputListField(getTime(10,11), getTime(14,15))
                .inputDataToTheUntilInputList2Field(getTime(10,11), getTime(14,15))
                .clickNextButton()
                .clickTransportTypeSelectorField()
                .clickTransportPalletprijsVriesPerUurTypeSelect()
                .clickSaveAsTemplateButton()
                .inputTemplateNameOnTheNewOrderTemplateModalWindow(getText("test"))
                .clickSaveButtonOnTheNewOrderTemplateModalWindow()
                .clickSaveButton();
        sleep(2000);
    }
    @Test(enabled = false)
    public void generatingNewOrderWithActifoodCustomerAndBakkerijproductenCargo(){
        dashboardPage
                .openDashBoard()
                .clickOrdersButton();
        ordersPage
                .clickNewOrderButton();
        newOrderPage
                .clickCustomerSelectorField()
                .clickActifoodCustomerSelectCustomerSelect()
                .clickСargoSelectorField()
                .clickBakkerijproductenCargoItemSelect()
                //.clickCarrierSelectorField()
                //.clickCarrierBlockPalletItemSelect()
                .inputDataToUnitsInputFields()
                .clickPlangroupSelectorField()
                .clickStandaardPlangroupItemSelect()
                .clickOrderTypeSelectorField()
                .clickEnkelLosAdresOrderTypeSelectOrderTypeSelect()
                .clickNextButton()
                .clickSearchAddressList1Button()
                .clickFirstItemAddress()
                .clickSelectButton()
                .clickSearchAddressList2Button()
                .clickSecondItemAddress()
                .clickSelectButton()
                .inputDataToTheFromInputListField(getTime(10,11), getTime(14,15))
                .inputDataToTheUntilInputList2Field(getTime(10,11), getTime(14,15))
                .clickNextButton()
                .clickTransportTypeSelectorField()
                .clickTransportPalletprijsGekoeldPerUurTypeSelect()
                .clickSaveButton();
        sleep(2000);
    }
    @Test(enabled = false)
    public void generatingNewOrderWithBoonstraTransportCustomerAndBuffelmelkCargo(){
        dashboardPage
                .openDashBoard()
                .clickOrdersButton();
        ordersPage
                .clickNewOrderButton();
        newOrderPage
                .clickCustomerSelectorField()
                .clickBoonstraTransportCustomerSelect()
                .clickСargoSelectorField()
                .clickBuffelmelkCargoItemSelect()
                .clickCarrierSelectorField()
                .clickCarrierPalletBoxItemSelect()
                .inputDataToUnitsInputFields()
                .clickPlangroupSelectorField()
                .clickStandaardPlangroupItemSelect()
                .clickOrderTypeSelectorField()
                .clickEnkelLosAdresOrderTypeSelectOrderTypeSelect()
                .clickNextButton()
                .clickSearchAddressList1Button()
                .clickThirdItemAddress()
                .clickSelectButton()
                .clickSearchAddressList2Button()
                .clickFourthItemAddress()
                .clickSelectButton()
                .inputDataToTheFromInputListField(getTime(10,11), getTime(14,15))
                .inputDataToTheUntilInputList2Field(getTime(10,11), getTime(14,15))
                .clickNextButton()
                .clickTransportTypeSelectorField()
                .clickTransportPalletprijsOngekoeldPerUurTypeSelect()
                .clickSaveButton();
        sleep(2000);
    }
    @Test(enabled = false)
    public void generatingNewOrderWithAbbinkVriezenveenCustomerAndLeliesCargo(){
        dashboardPage
                .openDashBoard()
                .clickOrdersButton();
        ordersPage
                .clickNewOrderButton();
        newOrderPage
                .clickCustomerSelectorField()
                .clickAbbinkVriezenveenCustomerSelect()
                .clickСargoSelectorField()
                .clickLeliesCargoItemSelect()
                .clickCarrierSelectorField()
                .clickCarrierLeliekistItemSelect()
                .inputDataToUnitsInputFields()
                .clickPlangroupSelectorField()
                .clickStandaardPlangroupItemSelect()
                .clickOrderTypeSelectorField()
                .clickEnkelLosAdresOrderTypeSelectOrderTypeSelect()
                .clickNextButton()
                .clickSearchAddressList1Button()
                .clickFifthItemAddress()
                .clickSelectButton()
                .clickSearchAddressList2Button()
                .clickSixthItemAddress()
                .clickSelectButton()
                .inputDataToTheFromInputListField(getTime(10,11), getTime(14,15))
                .inputDataToTheUntilInputList2Field(getTime(10,11), getTime(14,15))
                .clickNextButton()
                .clickTransportTypeSelectorField()
                .clickTransportPalletprijsVriesPerUurTypeSelect()
                .clickSaveButton();
        sleep(2000);
    }
    @Test(enabled = false)
    public void generatingNewOrderWithAbbinkVriezenveenCustomerAndGekoeldCargoAndSavingAsTemplate(){
        dashboardPage
                .openDashBoard()
                .clickOrdersButton();
        ordersPage
                .clickNewOrderButton();
        newOrderPage
                .clickCustomerSelectorField()
                .clickAbbinkVriezenveenCustomerSelect()
                .clickСargoSelectorField()
                .clickGekoeldCargoItemSelect()
                .clickCarrierSelectorField()
                .clickCarrierH1PalletPlasticEuroItemSelect()
                .inputDataToUnitsInputFields()
                .clickPlangroupSelectorField()
                .clickStandaardPlangroupItemSelect()
                .clickOrderTypeSelectorField()
                .clickEnkelLosAdresOrderTypeSelectOrderTypeSelect()
                .clickNextButton()
                .clickSearchAddressList1Button()
                .clickFifthItemAddress()
                .clickSelectButton()
                .clickSearchAddressList2Button()
                .clickSixthItemAddress()
                .clickSelectButton()
                .inputDataToTheFromInputListField(getTime(10,11), getTime(14,15))
                .inputDataToTheUntilInputList2Field(getTime(10,11), getTime(14,15))
                .clickNextButton()
                .clickTransportTypeSelectorField()
                .clickTransportPalletprijsVriesPerUurTypeSelect()
                .clickSaveAsTemplateButton()
                .inputTemplateNameOnTheNewOrderTemplateModalWindow(getText("text"))
                .clickSaveButtonOnTheNewOrderTemplateModalWindow()
                .clickSaveButton();
        sleep(2000);
    }
    @Test(enabled = false)
    public void generatingOrderFromTemplate(){
        dashboardPage
                .openDashBoard()
                .clickOrdersButton();
        ordersPage
                .clickOrderFromTemplateButton()
                .clickTemplateSelector()
                .clickTemplateItem()
                .clickNewOrderButtonOnChooseTemplatePopUp();
        newOrderFromTemplatePage
                .clickNextButton()
                .setFromDate(getFutureDate(2))
                .setUntilDate(getFutureDate(5))
                .inputDataToTheFromInputList1Field(getTime(10,11), getTime(14,15))
                .inputDataToTheUntilInputList1Field(getTime(11,12), getTime(15,16))
                .clickNextButton()
                .clickSaveButton();
    }
    @Test(enabled = false)
    public void generatingNewWorkOrderWithAbbinkVriezenveenCustomer(){
        dashboardPage
                .openDashBoard()
                .clickOrdersButton();
        ordersPage
                .clickNewWorkOrderButton();
        newWorkOrderPage
                .clickCustomerField()
                .clickAbbinkVriezenveenCustomerSelect()
                .setPlanedStartAndEndDate()
                .inputDataToPlannedStartTime(getTime(10, 11))
                .inputDataToPlannedEndTime(getTime(12, 13))
                .clickPlanGroupField()
                .clickStandaardPlangroupItemSelect()
                .clickNextButton()
                .clickAddDriverButton()
                .clickSecondItemClaimButton()
                .clickNextButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickNextButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickNextButton()
                .clickPublishTripButton();
        sleep(1000);
    }
    @Test(enabled = false)
    public void generatingNewWorkOrderWithActifoodCustomer(){
        dashboardPage
                .openDashBoard()
                .clickOrdersButton();
        ordersPage
                .clickNewWorkOrderButton();
        newWorkOrderPage
                .clickCustomerField()
                .clickActifoodCustomerSelect()
                .setPlanedStartAndEndDate()
                .inputDataToPlannedStartTime(getTime(10, 11))
                .inputDataToPlannedEndTime(getTime(12, 13))
                .clickPlanGroupField()
                .clickStandaardPlangroupItemSelect()
                .clickNextButton()
                .clickAddDriverButton()
                .clickSecondItemClaimButton()
                .clickNextButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickNextButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickPublishTripButton();
        sleep(1000);
    }




}
