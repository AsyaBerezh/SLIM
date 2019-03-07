package org.slim.ui.orders;

import com.slim.ui.pageOblectClasses.DashboardPage;
import com.slim.ui.pageOblectClasses.LoginPage;
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

    @BeforeClass

    private void preClass (){
        loginPage
                .loginToDashboard("marharyta@fitsoft.nl", "QWEqwe123!@#");
    }
    @Test
    public void generatingNewOrderWithGebrCustomerAndBakkerijproductenCargo(){
        dashboardPage
                .openDashBoard()
                .clickOrdersButton();
        ordersPage
                .clickNewOrderButton();
        newOrderPage
                .clickCustomerSelectorField()
                .clickGebrCustomerSelect()
                .clickСargoSelectorField()
                .clickBakkerijproductenCargoItemSelect()
                .clickCarrierSelectorField()
                .clickCarrierBlockPalletItemSelect()
                .inputDataToUnitsInputFields()
                .clickPlangroupSelectorField()
                .clickBinnenlandPlangroupItemSelect()
                .clickOrderTypeSelectorField()
                .clickAbRitOrderTypeSelect()
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
                .clickTransportKmTarifTypeSelect()
                .clickSaveButton();
        sleep(2000);
    }
    @Test
    public void generatingNewOrderWithGebrCustomerAndFruitCargo(){
        dashboardPage
                .openDashBoard()
                .clickOrdersButton();
        ordersPage
                .clickNewOrderButton();
        newOrderPage
                .clickCustomerSelectorField()
                .clickGebrCustomerSelect()
                .clickСargoSelectorField()
                .clickFruitItemCargoItemSelect()
                .clickCarrierSelectorField()
                .clickCarrierEuroPalletItemSelect()
                .inputDataToUnitsInputFields()
                .clickPlangroupSelectorField()
                .clickContainersPlangroupItemSelect()
                .clickOrderTypeSelectorField()
                .clickAbRitOrderTypeSelect()
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
                .clickTransportKmUurTarifTypeSelect()
                .clickSaveButton();
        sleep(2000);
    }
    @Test
    public void generatingNewOrderWithGebrCustomerAndTetjuCargo(){
        dashboardPage
                .openDashBoard()
                .clickOrdersButton();
        ordersPage
                .clickNewOrderButton();
        newOrderPage
                .clickCustomerSelectorField()
                .clickGebrCustomerSelect()
                .clickСargoSelectorField()
                .clickTestjuCargoItemSelect()
                .clickCarrierSelectorField()
                .clickCarrierRolcontainerItemSelect()
                .inputDataToUnitsInputFields()
                .clickPlangroupSelectorField()
                .clickKoeltransportPlangroupItemSelect()
                .clickOrderTypeSelectorField()
                .clickAbRitOrderTypeSelect()
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
                .clickTransportUurTarifTypeSelect()
                .clickSaveButton();
        sleep(2000);
    }
    @Test
    public void generatingNewOrderWithGebrCustomerAndVersproductenCargoAndSavingAsTemplate(){
        dashboardPage
                .openDashBoard()
                .clickOrdersButton();
        ordersPage
                .clickNewOrderButton();
        newOrderPage
                .clickCustomerSelectorField()
                .clickGebrCustomerSelect()
                .clickСargoSelectorField()
                .clickVersproductenCargoItemSelect()
                .clickCarrierSelectorField()
                .clickCarrierRolcontainerItemSelect()
                .inputDataToUnitsInputFields()
                .clickPlangroupSelectorField()
                .clickKoeltransportPlangroupItemSelect()
                .clickOrderTypeSelectorField()
                .clickAbRitOrderTypeSelect()
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
                .clickTransportUurTarifTypeSelect()
                .clickSaveAsTemplateButton()
                .inputTemplateNameOnTheNewOrderTemplateModalWindow(getText())
                .clickSaveButtonOnTheNewOrderTemplateModalWindow()
                .clickSaveButton();
        sleep(2000);
    }
    @Test
    public void generatingNewOrderWithJansenCustomerAndBakkerijproductenCargo(){
        dashboardPage
                .openDashBoard()
                .clickOrdersButton();
        ordersPage
                .clickNewOrderButton();
        newOrderPage
                .clickCustomerSelectorField()
                .clickJansenCustomerSelect()
                .clickСargoSelectorField()
                .clickBakkerijproductenCargoItemSelect()
                .clickCarrierSelectorField()
                .clickCarrierBlockPalletItemSelect()
                .inputDataToUnitsInputFields()
                .clickPlangroupSelectorField()
                .clickBinnenlandPlangroupItemSelect()
                .clickOrderTypeSelectorField()
                .clickAbRitOrderTypeSelect()
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
                .clickTransportKmTarifTypeSelect()
                .clickSaveButton();
        sleep(2000);
    }
    @Test
    public void generatingNewOrderWithJansenCustomerAndFruitCargo(){
        dashboardPage
                .openDashBoard()
                .clickOrdersButton();
        ordersPage
                .clickNewOrderButton();
        newOrderPage
                .clickCustomerSelectorField()
                .clickGebrCustomerSelect()
                .clickСargoSelectorField()
                .clickFruitItemCargoItemSelect()
                .clickCarrierSelectorField()
                .clickCarrierEuroPalletItemSelect()
                .inputDataToUnitsInputFields()
                .clickPlangroupSelectorField()
                .clickContainersPlangroupItemSelect()
                .clickOrderTypeSelectorField()
                .clickAbRitOrderTypeSelect()
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
                .clickTransportKmUurTarifTypeSelect()
                .clickSaveButton();
        sleep(2000);
    }
    @Test
    public void generatingNewOrderWithJansenCustomerAndTetjuCargo(){
        dashboardPage
                .openDashBoard()
                .clickOrdersButton();
        ordersPage
                .clickNewOrderButton();
        newOrderPage
                .clickCustomerSelectorField()
                .clickGebrCustomerSelect()
                .clickСargoSelectorField()
                .clickTestjuCargoItemSelect()
                .clickCarrierSelectorField()
                .clickCarrierRolcontainerItemSelect()
                .inputDataToUnitsInputFields()
                .clickPlangroupSelectorField()
                .clickKoeltransportPlangroupItemSelect()
                .clickOrderTypeSelectorField()
                .clickAbRitOrderTypeSelect()
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
                .clickTransportUurTarifTypeSelect()
                .clickSaveButton();
        sleep(2000);
    }
    @Test
    public void generatingNewOrderWithJansenCustomerAndVersproductenCargoAndSavingAsTemplate(){
        dashboardPage
                .openDashBoard()
                .clickOrdersButton();
        ordersPage
                .clickNewOrderButton();
        newOrderPage
                .clickCustomerSelectorField()
                .clickGebrCustomerSelect()
                .clickСargoSelectorField()
                .clickVersproductenCargoItemSelect()
                .clickCarrierSelectorField()
                .clickCarrierRolcontainerItemSelect()
                .inputDataToUnitsInputFields()
                .clickPlangroupSelectorField()
                .clickKoeltransportPlangroupItemSelect()
                .clickOrderTypeSelectorField()
                .clickAbRitOrderTypeSelect()
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
                .clickTransportUurTarifTypeSelect()
                .clickSaveAsTemplateButton()
                .inputTemplateNameOnTheNewOrderTemplateModalWindow(getText())
                .clickSaveButtonOnTheNewOrderTemplateModalWindow()
                .clickSaveButton();
        sleep(2000);
    }
    @Test
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
    @Test
    public void generatingNewWorkOrderWithGebrCustomer(){
        dashboardPage
                .openDashBoard()
                .clickOrdersButton();
        ordersPage
                .clickNewWorkOrderButton();
        newWorkOrderPage
                .clickCustomerField()
                .clickGebrCustomerSelect()
                .setPlanedStartAndEndDate(getCurrentDate(), getFutureDate(7))
                .inputDataToPlannedStartTime(getTime(10, 11))
                .inputDataToPlannedEndTime(getTime(12, 13))
                .clickPlanGroupField()
                .clickBinnenlandPlangroupItemSelect()
                .clickNextButton()
                .clickAddDriverButton()
                .clickFirstItemClaimButton()
                .clickNextButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickStartAddressSelector()
                .clickAbsTransUtrechtItemInStartAddressSelector()
                .clickAttachingTrailerAddressSelector()
                .clickVisserijstraatAmmestolItemInAttachingTrailerAddressSelector()
                .clickFirstStopSelector()
                .clickAbsTransUtrechtItemInFirstStopSelector()
                .clickLastStopAddressSelector()
                .clickVisserijstraatAmmestolItemInLastStopSelector()
                .clickDetachingTrailerAddressSelector()
                .clickVisserijstraatAmmestolItemInDetachingTrailerAddressSelector()
                .clickEndAddressSelector()
                .clickAbsTransUtrechtItemInEndAddressSelector()
                .clickNextButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickNextButton()
                .clickPublishTripButton();
        sleep(1000);
    }
    @Test
    public void generatingNewWorkOrderWithJansenCustomer(){
        dashboardPage
                .openDashBoard()
                .clickOrdersButton();
        ordersPage
                .clickNewWorkOrderButton();
        newWorkOrderPage
                .clickCustomerField()
                .clickJansenCustomerSelect()
                .setPlanedStartAndEndDate(getCurrentDate(), getFutureDate(7))
                .inputDataToPlannedStartTime(getTime(10, 11))
                .inputDataToPlannedEndTime(getTime(12, 13))
                .clickPlanGroupField()
                .clickContainersPlangroupItemSelect()
                .clickNextButton()
                .clickAddDriverButton()
                .clickFirstItemClaimButton()
                .clickNextButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickStartAddressSelector()
                .clickAbsTransUtrechtItemInStartAddressSelector()
                .clickAttachingTrailerAddressSelector()
                .clickVisserijstraatAmmestolItemInAttachingTrailerAddressSelector()
                .clickFirstStopSelector()
                .clickAbsTransUtrechtItemInFirstStopSelector()
                .clickLastStopAddressSelector()
                .clickVisserijstraatAmmestolItemInLastStopSelector()
                .clickDetachingTrailerAddressSelector()
                .clickVisserijstraatAmmestolItemInDetachingTrailerAddressSelector()
                .clickEndAddressSelector()
                .clickAbsTransUtrechtItemInEndAddressSelector()
                .clickNextButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickPublishTripButton();
        sleep(1000);
    }



}
