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

import static com.slim.ui.dataGenerator.DataGenerator.*;

public class OrdersTests extends BaseTest {
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

    @Test//work
    public void createNewOrder(){
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
    }

    @Test//work
    public void checkingFieldValidationOnTheOrdersDetailsStep(){
        dashboardPage
                .openDashBoard()
                .clickOrdersButton();
        ordersPage
                .clickNewOrderButton();
        newOrderPage
                .clickNextButton()
                .checkCustomerValidation()
                .checkCargoValidation()
                .checkOrderTypeValidation()
                .checkPlanGroupValidation();
    }

    @Test//work
    public void editOrder() {
        dashboardPage
                .openDashBoard()
                .clickOrdersButton();
        ordersPage
                .clickEditItem2Button();
        newOrderPage
                .clickPlanGroupEditSelectorField()
                .clickPlanGroupEditSelectorItem()
                .clickSaveButtonOnEditOrderModalWindow();
    }

    @Test//work
    public void createOrderFromTemplate(){
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

    @Test//work
    public void createNewWorkOrder(){
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
                .clickFirstStopSelector()
                .clickAbsTransUtrechtItemInFirstStopSelector()
                .clickLastStopAddressSelector()
                .clickVisserijstraatAmmestolItemInLastStopSelector()
                .clickNextButton()
                .clickPublishTripButton();
    }

    @Test//work
    public void deleteOrder(){
        dashboardPage
                .openDashBoard()
                .clickOrdersButton();
        ordersPage
                .clickEditItem1Button()
                .clickDeleteOrderButton()
                .clickProceedButton();
    }

}

