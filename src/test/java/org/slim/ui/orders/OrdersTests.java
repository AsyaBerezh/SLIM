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
                .loginToDashboard("anastasia@fitsoft.nl", "QWEqwe123!@#");
    }
    @Test(enabled = false)
    public void check() {
        dashboardPage
                .openDashBoard()
                .clickOrdersButton();
        ordersPage
                .clickNewOrderButton();
        newOrderPage
                .clickCustomerSelectorField();
        sleep(2000);
    }

    @Test(enabled = false)//work
    public void createNewOrder(){
        dashboardPage
                .openDashBoard()
                .clickOrdersButton();
        for (int i = 0; i < 30; i++) {
            ordersPage
                    .clickNewOrderButton();
            newOrderPage
                    .clickCustomerSelectorField()
                    .clickCustomerMaxfurn()
                    .clickСargoSelectorField()
                    .clickCargoPTS()
/*                .clickCarrierSelectorField()
                .clickCarrierBlockPalletItemSelect()*/
                    //   .inputDataToUnitsInputFields()
                    //    .clickPlangroupSelectorField()
                    //   .clickStandaardPlangroupItemSelect()
                    .clickOrderTypeSelectorField()
                    .clickOrderTypeABRit()
                    .clickNextButton()
                    .clickSearchAddressList1Button()
                    .clickRandomAddress()
                    .clickSelectButton()
                    .clickSearchAddressList2Button()
                    .clickRandomAddress()
                    .clickSelectButton()
                    .inputDataToTheFromInputListField(getTime(10, 11), getTime(14, 15))
//                .inputDataToTheUntilInputList2Field(getTime(10,11), getTime(14,15))
                    .clickNextButton()
                    .clickOKButtonErrorPopUp()
                    .clickTransportTypeSelectorField()
                    .clickTransportTrekkerTrailerKm()
                    .clickSaveButton();
        }
    }

    @Test(enabled = false)//work
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

    @Test(enabled = false)//work
    public void editOrder() {
        dashboardPage
                .openDashBoard()
                .clickOrdersButton();
        ordersPage
                .clickEdit1ItemButton();
        newOrderPage
                .clickPlanGroupEditSelectorField()
                .clickPlanGroupEditSelectorItem()
                .clickSaveButtonOnEditOrderModalWindow();
    }
    public void createPlannedOrderFromTemplate(){
        ordersPage
                .clickOrderFromTemplateButton()
                .clickTemplateSelector()
                .clickTemplateItem()
                .clickCreateNewOrderButton();
        newOrderFromTemplatePage
                .clickNextButton()
                //  .setFromDate(getFutureDate(2))
                //   .setUntilDate(getFutureDate(5))
                .inputDataToTheFromInputList1Field(getTime(10,11), getTime(14,15))
               // .inputDataToTheUntilInputList1Field(getTime(11,12), getTime(15,16))
                .clickNextButton()
                .clickSaveButton();
    }
    @Test(enabled = false)//work
    public void createOrderFromTemplate(){
        dashboardPage
                .openDashBoard()
                .clickOrdersButton();
        for(int i=0; i < 5; i++) {
            createPlannedOrderFromTemplate();
        }
    }
    @Test(enabled = false)//work
    public void changeDateOrders(){
        dashboardPage
                .openDashBoard()
                .clickOrdersButton();
        ordersPage
                .clickEveryChangeButton();
    }
    @Test(enabled = false)//work
    public void createNewWorkOrder(){
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
                .clickRandomClaimButton()
                .clickNextButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickNextButton()
                .clickPublishTripButton();
    }

}

