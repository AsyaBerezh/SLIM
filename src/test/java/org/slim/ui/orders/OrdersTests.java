package org.slim.ui.orders;

import com.slim.ui.pageOblectClasses.DashboardPage;
import com.slim.ui.pageOblectClasses.LoginPage;
import com.slim.ui.pageOblectClasses.orders.NewOrderPage;
import com.slim.ui.pageOblectClasses.orders.OrdersPage;
import org.slim.ui.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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
                .clickOnNewOrderButton();
        newOrderPage
                .clickOnCustomerSelectorField()
                .clickOnFirstCustomerSelect()
                .clickOnСargoSelectorField()
                .clickOnFirstCargoItemSelect()
                .clickOnCarrierSelectorField()
                .clickOnCarrierFirstItemSelect()
                .inputDataToUnitsInputFields()
                .clickOnPlangroupSelectorField()
                .clickOnPlangroupItemSelect()
                .clickOnOrderTypeSelectorField()
                .clickOnOrderItemSelect()
                .clickNextButton()
                .clickSearchAddressLsit1Button()
                .clickOnFirstItemAddress()
                .clickOnSelectButton()
                .clickSearchAddressLsit2Button()
                .clickOnSecondItemAddress()
                .clickOnSelectButton()
                .inputDataToTheFromInputList1Field()
                .inputDataToThefromInputList2Field()
                .inputDataToTheUntilInputList1Field()
                .inputDataToTheUntilInputList2Field()
                .clickNextButton()
                .clickOnTransportTypeSelectorField()
                .clickOnTransportTypeSelect()
                .clickSaveButton();
    }

}
