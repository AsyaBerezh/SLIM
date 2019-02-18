package org.slim.ui.orders;

import com.slim.ui.pageOblectClasses.DashboardPage;
import com.slim.ui.pageOblectClasses.LoginPage;
import com.slim.ui.pageOblectClasses.orders.NewOrderPage;
import com.slim.ui.pageOblectClasses.orders.OrdersPage;
import org.slim.ui.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class OrdersTests extends BaseTest {
    DashboardPage dashboardPage = new DashboardPage();
    LoginPage loginPage = new LoginPage();
    NewOrderPage newOrderPage = new NewOrderPage();
    OrdersPage ordersPage = new OrdersPage();

    @BeforeClass

    private void preClass (){
        loginPage
                .loginToDashboard("marharyta@fitsoft.nl", "QWEqwe123!@#");
    }

    @Test
    public void createNewOrder(){
        dashboardPage
                .openDashBoard()
                .clickOrdersButton();
        ordersPage
                .clickNewOrderButton();
        newOrderPage
                .clickCustomerSelectorField()
                .clickFirstCustomerSelect()
                .clickСargoSelectorField()
                .clickFirstCargoItemSelect()
                .clickCarrierSelectorField()
                .clickCarrierFirstItemSelect()
                .inputDataToUnitsInputFields()
                .clickPlangroupSelectorField()
                .clickPlangroupItemSelect()
                .clickOrderTypeSelectorField()
                .clickOrderItemSelect()
                .clickNextButton()
                .clickSearchAddressList1Button()
                .clickFirstItemAddress()
                .clickSelectButton()
                .clickSearchAddressList2Button()
                .clickSecondItemAddress()
                .clickSelectButton()
                .inputDataToTheFromInputList1Field()
                .inputDataToTheFromInputList2Field()
                .inputDataToTheUntilInputList1Field()
                .inputDataToTheUntilInputList2Field()
                .clickNextButton()
                .clickTransportTypeSelectorField()
                .clickTransportTypeSelect()
                .clickSaveButton();
    }

    @Test
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
    @Test
    public void editOrder() {
        dashboardPage
                .openDashBoard()
                .clickOrdersButton();
        ordersPage
                .clickEditItem1Button();
        newOrderPage
                .clickPlanGroupEditSelectorField()
                .clickPlanGroupEditSelectorItem()
                .clickSaveButtonOnEditOrderModalWindow();
        sleep(3000);
    }

}

