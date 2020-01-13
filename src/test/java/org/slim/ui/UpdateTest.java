package org.slim.ui;

import com.slim.ui.pageOblectClasses.DashboardPage;
import com.slim.ui.pageOblectClasses.LoginPage;
import com.slim.ui.pageOblectClasses.Overview.OverviewPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class UpdateTest extends BaseTest {
    DashboardPage dashboardPage = new DashboardPage();
    LoginPage loginPage = new LoginPage();
    OverviewPage overviewPage = new OverviewPage();

    @BeforeClass
    private void preClass (){
        loginPage
                .loginToDashboard("anastasia@fitsoft.nl", "QWEqwe123!@#");
    }
    @Test(enabled = false)
    public void updateTest() {
        dashboardPage
                .openDashBoard()
                .clickOverviewButton();
        overviewPage
                .clickTrip()
                .clickTripUpdate()
                .clickRecalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickTripDetailsButton()
                .clickResultsTab()
                .clickCloseButtonSecondWindow()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickOKButton();
    }
    @Test(enabled = false)
    public void updateTripOneShipment() {
        dashboardPage
                .openDashBoard()
                .clickOverviewButton();
        overviewPage
                .clickTrip()
                .clickTripUpdate()
                .dragableUpdate()
                .clickRecalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickTripDetailsButton()
                .clickResultsTab()
                .clickCloseButtonSecondWindow()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickOKButton();
    }
    @Test(enabled = false)
    public void updateTripCheckTripDetails() {
        dashboardPage
                .openDashBoard()
                .clickOverviewButton();
        overviewPage
                .clickTrip()
                .clickTripDetails()
                .clickResultsTab()
                .clickCloseButtonFirstWindow();
    }
    @Test(enabled = false)
    public void updateFindPlannedTrip() {
        dashboardPage
                .openDashBoard()
                .clickOverviewButton();
        overviewPage
                .clickPlannedTripTN()
                .clickTripDetails()
                .clickCloseButtonFirstWindow();
    }
    @Test(enabled = false)
    public void updateDeleteShipmentFromTrip() {
        dashboardPage
                .openDashBoard()
                .clickOverviewButton();
        overviewPage
                .clickTrip()
                .clickTripUpdate()
                .clickRemoveFirstShipmentFromTrip()
                .clickRecalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickTripDetailsButton()
                .clickResultsTab()
                .clickCloseButtonSecondWindow()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickOKButton();
    }
    @Test(enabled = false)
    public void updateDeleteFirstShipmentFromTripAddShipment() {
        dashboardPage
                .openDashBoard()
                .clickOverviewButton();
        overviewPage
                .clickTrip()
                .clickTripUpdate()
                .clickRemoveFirstShipmentFromTrip()
                .dragableUpdate()
                .clickRecalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickTripDetailsButton()
                .clickResultsTab()
                .clickCloseButtonSecondWindow()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickOKButton();
    }
    @Test(enabled = false)
    public void Script_1_A1A_BAB() {
        dashboardPage
                .openDashBoard()
                .clickOverviewButton();
        overviewPage
                .clickCompleteTrip();
    }
}
