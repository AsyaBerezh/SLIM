package org.slim.ui;

import com.slim.ui.pageOblectClasses.DashboardPage;
import com.slim.ui.pageOblectClasses.LoginPage;
import com.slim.ui.pageOblectClasses.Overview.OverviewPage;
import com.slim.ui.pageOblectClasses.planning.PlanningPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static com.slim.ui.dataGenerator.DataGenerator.getTime;

public class BothPlanning extends BaseTest {

    DashboardPage dashboardPage = new DashboardPage();
    LoginPage loginPage = new LoginPage();
    PlanningPage planningPage = new PlanningPage();

    @BeforeClass
    private void preClass() {
        loginPage
                .loginToDashboard("anastasia@fitsoft.nl", "QWEqwe123!@#");
    }

    @Test
    private void Script_1_A1A_BAB() {
        dashboardPage
                .openDashBoard()
                .clickPlanningButton();
        planningPage
                .chooseDateofPlansheet()
                .clickEditPlansheetButton()
                .clickRandomNewTripButton()
                .checkLicenses()
                .clickGoToPlanningButton()
                .clickDeleteAttachingTrailerButton()
                .clickDeleteDetachingTrailerButton()
                .changeAddresses()
                .dragLastShipment()
                .inputTimeToFirstFromUntilTime(getTime(10,11), getTime(14,15))
                .clickCalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickTripDetailsButton()
                .clickResultsTab()
                .clickCloseButton()
                .clickBackToEditingButton()
                .clickCalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickTripDetailsButton()
                .clickResultsTab()
                .clickCloseButton()
                .clickEditPlansheetButton()
                .clickRandomNewTripButton()
                .checkLicenses()
                .clickGoToPlanningButton()
                .clickDeleteAttachingTrailerButton()
                .clickDeleteDetachingTrailerButton()
                .changeAddresses()
                .dragLastShipment()
                .inputTimeToFirstFromUntilTime(getTime(10,11), getTime(14,15))
                .clickCalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickTripDetailsButton()
                .clickResultsTab()
                .clickCloseButton()
                .clickLastTripOnTripToPlan()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickYesButton()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickYesButton();
        sleep(1000);
    }
    @Test
    private void Script_1_A1A_BBA() {
        dashboardPage
                .openDashBoard()
                .clickPlanningButton();
        planningPage
                .chooseDateofPlansheet()
                .clickEditPlansheetButton()
                .clickRandomNewTripButton()
                .checkLicenses()
                .clickGoToPlanningButton()
                .clickDeleteAttachingTrailerButton()
                .clickDeleteDetachingTrailerButton()
                .changeAddresses()
                .dragLastShipment()
                .inputTimeToFirstFromUntilTime(getTime(10,11), getTime(14,15))
                .clickCalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickTripDetailsButton()
                .clickResultsTab()
                .clickCloseButton()
                .clickBackToEditingButton()
                .clickCalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickTripDetailsButton()
                .clickResultsTab()
                .clickCloseButton()
                .clickEditPlansheetButton()
                .clickRandomNewTripButton()
                .checkLicenses()
                .clickGoToPlanningButton()
                .clickDeleteAttachingTrailerButton()
                .clickDeleteDetachingTrailerButton()
                .changeAddresses()
                .dragLastShipment()
                .inputTimeToFirstFromUntilTime(getTime(10,11), getTime(14,15))
                .clickCalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickTripDetailsButton()
                .clickResultsTab()
                .clickCloseButton()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickYesButton()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickYesButton();
        sleep(1000);
    }
    @Test
    private void Script_1_A1A_ABB() {
        dashboardPage
                .openDashBoard()
                .clickPlanningButton();
        planningPage
                .chooseDateofPlansheet()
                .clickEditPlansheetButton()
                .clickRandomNewTripButton()
                .checkLicenses()
                .clickGoToPlanningButton()
                .clickDeleteAttachingTrailerButton()
                .clickDeleteDetachingTrailerButton()
                .changeAddresses()
                .dragLastShipment()
                .inputTimeToFirstFromUntilTime(getTime(10,11), getTime(14,15))
                .clickCalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickTripDetailsButton()
                .clickResultsTab()
                .clickCloseButton()
                .clickBackToEditingButton()
                .clickCalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickTripDetailsButton()
                .clickResultsTab()
                .clickCloseButton()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickYesButton()
                .clickEditPlansheetButton()
                .clickRandomNewTripButton()
                .checkLicenses()
                .clickGoToPlanningButton()
                .clickDeleteAttachingTrailerButton()
                .clickDeleteDetachingTrailerButton()
                .changeAddresses()
                .dragLastShipment()
                .inputTimeToFirstFromUntilTime(getTime(10,11), getTime(14,15))
                .clickCalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickTripDetailsButton()
                .clickResultsTab()
                .clickCloseButton()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickYesButton();
        sleep(1000);
    }
    @Test
    private void Script_1_A1B_AAB() {
        dashboardPage
                .openDashBoard()
                .clickPlanningButton();
        planningPage
                .chooseDateofPlansheet()
                .clickEditPlansheetButton()
                .clickRandomNewTripButton()
                .checkLicenses()
                .clickGoToPlanningButton()
                .clickDeleteAttachingTrailerButton()
                .clickDeleteDetachingTrailerButton()
                .changeAddresses()
                .dragLastShipment()
                .inputTimeToFirstFromUntilTime(getTime(10,11), getTime(14,15))
                .clickCalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickTripDetailsButton()
                .clickResultsTab()
                .clickCloseButton()
                .clickBackToEditingButton()
                .clickEditPlansheetButton()
                .clickRandomNewTripButton()
                .checkLicenses()
                .clickGoToPlanningButton()
                .clickDeleteAttachingTrailerButton()
                .clickDeleteDetachingTrailerButton()
                .changeAddresses()
                .dragLastShipment()
                .inputTimeToFirstFromUntilTime(getTime(10,11), getTime(14,15))
                .clickCalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickTripDetailsButton()
                .clickResultsTab()
                .clickCloseButton()
                .clickLastTripOnTripToPlan()
                .clickCalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickTripDetailsButton()
                .clickResultsTab()
                .clickCloseButton()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickYesButton()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickYesButton();
        sleep(1000);
    }
    @Test
    private void Script_1_A1B_ABA() {
        dashboardPage
                .openDashBoard()
                .clickPlanningButton();
        planningPage
                .chooseDateofPlansheet()
                .clickEditPlansheetButton()
                .clickRandomNewTripButton()
                .checkLicenses()
                .clickGoToPlanningButton()
                .clickDeleteAttachingTrailerButton()
                .clickDeleteDetachingTrailerButton()
                .changeAddresses()
                .dragLastShipment()
                .inputTimeToFirstFromUntilTime(getTime(10,11), getTime(14,15))
                .clickCalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickTripDetailsButton()
                .clickResultsTab()
                .clickCloseButton()
                .clickBackToEditingButton()
                .clickEditPlansheetButton()
                .clickRandomNewTripButton()
                .checkLicenses()
                .clickGoToPlanningButton()
                .clickDeleteAttachingTrailerButton()
                .clickDeleteDetachingTrailerButton()
                .changeAddresses()
                .dragLastShipment()
                .inputTimeToFirstFromUntilTime(getTime(10,11), getTime(14,15))
                .clickCalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickTripDetailsButton()
                .clickResultsTab()
                .clickCloseButton()
                .clickLastTripOnTripToPlan()
                .clickCalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickTripDetailsButton()
                .clickResultsTab()
                .clickCloseButton()
                .clickFirstTripOnTripToPlan()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickYesButton()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickYesButton();
        sleep(1000);
    }
    @Test
    private void Script_1_A1B_BAA() {
        dashboardPage
                .openDashBoard()
                .clickPlanningButton();
        planningPage
                .chooseDateofPlansheet()
                .clickEditPlansheetButton()
                .clickRandomNewTripButton()
                .checkLicenses()
                .clickGoToPlanningButton()
                .clickDeleteAttachingTrailerButton()
                .clickDeleteDetachingTrailerButton()
                .changeAddresses()
                .dragLastShipment()
                .inputTimeToFirstFromUntilTime(getTime(10,11), getTime(14,15))
                .clickCalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickTripDetailsButton()
                .clickResultsTab()
                .clickCloseButton()
                .clickBackToEditingButton()
                .clickEditPlansheetButton()
                .clickRandomNewTripButton()
                .checkLicenses()
                .clickGoToPlanningButton()
                .clickDeleteAttachingTrailerButton()
                .clickDeleteDetachingTrailerButton()
                .changeAddresses()
                .dragLastShipment()
                .inputTimeToFirstFromUntilTime(getTime(10,11), getTime(14,15))
                .clickCalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickTripDetailsButton()
                .clickResultsTab()
                .clickCloseButton()
                .clickLastTripOnTripToPlan()
                .clickCalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickTripDetailsButton()
                .clickResultsTab()
                .clickCloseButton()
                .clickFirstTripOnTripToPlan()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickYesButton()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickYesButton();
        sleep(1000);
    }
}

