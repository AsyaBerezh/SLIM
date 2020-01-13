package org.slim.ui.orders;

import com.slim.ui.pageOblectClasses.DashboardPageLocal;
import com.slim.ui.pageOblectClasses.LoginPageLocal;
import com.slim.ui.pageOblectClasses.orders.NewOrderFromTemplatePage;
import com.slim.ui.pageOblectClasses.orders.NewOrderPage;
import com.slim.ui.pageOblectClasses.orders.NewWorkOrderPage;
import com.slim.ui.pageOblectClasses.orders.OrdersPage;
import org.slim.ui.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static com.slim.ui.dataGenerator.DataGenerator.*;

public class OrdersTestsLocal extends BaseTest {
    DashboardPageLocal dashboardPageLocal = new DashboardPageLocal();
    LoginPageLocal loginPageLocal = new LoginPageLocal();
    NewOrderPage newOrderPage = new NewOrderPage();
    OrdersPage ordersPage = new OrdersPage();
    NewOrderFromTemplatePage newOrderFromTemplatePage = new NewOrderFromTemplatePage();
    NewWorkOrderPage newWorkOrderPage = new NewWorkOrderPage();


    @BeforeClass

    private void preClass (){
        loginPageLocal
                .loginToDashboard("Anastasia", "26018As");
    }
    @Test(enabled = false)
    public void check() {
        dashboardPageLocal
                .clickOrdersButton();
        ordersPage
                .clickNewOrderButton();
        newOrderPage
                .clickCustomerSelectorField();
        sleep(2000);
    }

    @Test(enabled = false)//work
    public void createNewOrder(){
        dashboardPageLocal
                .clickOrdersButton();
        ordersPage
                .clickNewOrderButton();
        newOrderPage
                .clickCustomerSelectorField()
                .clickAbbinkVriezenveenCustomerSelect()
                .clickСargoSelectorField()
                .clickBakkerijproductenCargoItemSelect()
                .clickCarrierSelectorField()
                .clickCarrierBlockPalletItemSelect()
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
    }

    @Test(enabled = false)//work
    public void checkingFieldValidationOnTheOrdersDetailsStep(){
        dashboardPageLocal
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
    public void edit1Order() {
        dashboardPageLocal
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
                //.inputDataToTheFromInputList1Field(getTime(10,11), getTime(14,15))
               // .inputDataToTheUntilInputList1Field(getTime(11,12), getTime(15,16))
                .clickNextButton()
                .clickSaveButton();
    }
    @Test(enabled = false)//work
    public void createOrderFromTemplate(){
        dashboardPageLocal
                .clickOrdersButton();
        for(int i=0; i < 5; i++) {
            createPlannedOrderFromTemplate();
        }
    }
    @Test(enabled = false)//work
    public void changeDateOrders(){
        dashboardPageLocal
                .clickOrdersButton();
        ordersPage
                .clickEveryChangeButton();
    }

    @Test(enabled = false)//work
    public void deleteOrders(){
        dashboardPageLocal
                .clickOrdersButton();
        ordersPage
                .clickEveryDeleteOrderButton();
    }

    @Test(enabled = false)//work
    public void createNewWorkOrder(){
        dashboardPageLocal
                .clickOrdersButton();
        for (int i = 0; i<5; i++) {
            ordersPage
                    .clickNewWorkOrderButton();
            newWorkOrderPage
                    .clickCustomerField()
                    .clickAbbinkVriezenveenCustomerSelect()
                    //.setPlanedStartAndEndDate()
                    .inputDataToPlannedStartTime(getTime(10, 11))
                    .inputDataToPlannedEndTime(getTime(12, 13))
                    .clickNextButton()
                    .clickAddDriverButton()
                    .clickRandomClaimButton()
                    .clickNextButton()
                    .clickIUnderstandButtonOnWarningPopUp()
                    // .clickDeleteTrailerButton()
                    .changeAddresses()
                    .clickIUnderstandButtonOnWarningPopUp()
                    .clickNextButton()
                    .clickPublishTripButton()
                    .clickOKButton();
        }
    }

}

