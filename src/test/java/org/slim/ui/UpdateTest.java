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
    @Test
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
                .clickresultsTab()
                .clickCloseButtonSecondWindow()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickOKButton();
        sleep(10000);
    }
    @Test
    public void updateTripCheckTripDetails() {
        dashboardPage
                .openDashBoard()
                .clickOverviewButton();
        overviewPage
                .clickTrip()
                .clickTripDetails()
                .clickresultsTab()
                .clickCloseButtonFirstWindow();
        sleep(10000);
    }
    @Test
    public void updateFindTrip() {
        dashboardPage
                .openDashBoard()
                .clickOverviewButton();
        overviewPage
                .clickPlannedTripTN()
                .clickTripDetails()
                .clickCloseButtonFirstWindow();
        sleep(10000);
    }
    @Test
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
                .clickresultsTab()
                .clickCloseButtonSecondWindow()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickOKButton();
        sleep(10000);
    }
    @Test
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
                .clickresultsTab()
                .clickCloseButtonSecondWindow()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickOKButton();
        sleep(10000);
    }
    @Test
    public void updateCompleteTrip() {
        dashboardPage
                .openDashBoard()
                .clickOverviewButton();
        overviewPage
                .clickCompleteTrip();
        sleep(10000);
    }
}
