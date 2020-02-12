package org.slim.ui;

import com.slim.ui.pageOblectClasses.DashboardPage;
import com.slim.ui.pageOblectClasses.LoginPage;
import com.slim.ui.pageOblectClasses.Overview.OverviewPage;
import com.slim.ui.pageOblectClasses.office.OfficePage;
import com.slim.ui.pageOblectClasses.planning.PlanningPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.sleep;
import static com.slim.ui.dataGenerator.DataGenerator.getTime;

public class CalculationTest extends BaseTest {

    DashboardPage dashboardPage = new DashboardPage();
    LoginPage loginPage = new LoginPage();
    OfficePage officePage = new OfficePage();
    PlanningPage planningPage = new PlanningPage();
    OverviewPage overviewPage = new OverviewPage();

   @BeforeClass
    private void preClass() {
        loginPage
                .loginToDashboard("anastasia@fitsoft.nl", "QWEqwe123!@#");
    }
    @Test
    private void open() {
        dashboardPage
                .openDashBoard()
                .clickPlanningButton();
    }

    @Test(enabled = false)
    private void checkAddress2() {
        dashboardPage
                .openDashBoard()
                .clickPlanningButton();
        planningPage
                .chooseDateofPlansheet()
                .clickEditPlansheetButton()
                .deleteNewTrips()
                .clickRandomNewTripButton()
                .checkLicenses()
                .clickGoToPlanningButton()
                .clickDeleteAttachingTrailerButton()
                .clickDeleteDetachingTrailerButton()
                .changeAddresses()
                .dragShipment()
                .clickCalculateTripButton()
                .clickOKButtonOnWarningPopUp()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickIUnderstandButtonOnAddressWarningPopUp();
    }
    @Test(enabled = false)
    private void checkAddress() {
        dashboardPage
                .openDashBoard()
                .clickPlanningButton();
        planningPage
                .chooseDateofPlansheet()
                .clickEditPlansheetButton()
                .deleteNewTrips()
                .clickRandomNewTripButton()
                .checkLicenses()
                .clickGoToPlanningButton()
                .clickDeleteAttachingTrailerButton()
                .clickDeleteDetachingTrailerButton()
                .changeAddresses()
                .dragShipment();
                //.inputTimeToFirstFromUntilTime(getTime(10,11), getTime(14,15))
                checkTimeEntries();
        planningPage
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
                .dragShipment();
        checkTimeEntries();
        planningPage
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
    }
    public void checkTimeEntries() {
        for (int i = 0; i <= 100; i++){
            planningPage
                .inputTime()
                /*    .inputTimeToFirstFromUntilTime(getTime(10,11), getTime(14,15))*/
                .clickCalculateTripButton()
                .clickOKButtonOnWarningPopUp()
                .clickIUnderstandButtonOnWarningPopUp();

            if (!planningPage.isInformationErrorPopUpPresent()) {
                break;
            }
        }
    }
    @Test(enabled = false)
    private void Test0() {
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
                .dragShipment()
                .inputTimeToFirstFromUntilTime(getTime(10,11), getTime(14,15))
                .clickCalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickBackToEditingButton()
                .clickCalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickTripDetailsButton()
                .clickResultsTab()
                .clickCloseButton()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickYesButton();
    }
    @Test(enabled = false)
    private void Test1() {
        dashboardPage
                .openDashBoard()
                .clickPlanningButton();
        planningPage
                .chooseDateofPlansheet()
                .clickEditPlansheetButton()
                .clickRandomNewTripButton()
                .checkLicenses()
                .clickGoToPlanningButton()
                .changeAddresses()
                .clickDeleteAttachingTrailerButton()
                .clickDeleteDetachingTrailerButton()
                .dragShipment()
                .inputTimeToFirstFromUntilTime(getTime(10,11), getTime(14,15))
                .clickEditPlansheetButton()
                .clickRandomNewTripButton()
                .checkLicenses()
                .clickGoToPlanningButton()
                .changeAddresses()
                .clickDeleteAttachingTrailerButton()
                .clickDeleteDetachingTrailerButton()
                .dragShipment()
                .inputTimeToFirstFromUntilTime(getTime(10,11), getTime(14,15))
                .clickCalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickBackToEditingButton()
                .clickCalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickYesButton();
    }

    @Test(enabled = false)
    public void CreateTripTwoShipmentsUpdateTripOneShipmentFinanceCheck() {
        dashboardPage
                .openDashBoard()
                .clickPlanningButton();
        planningPage
                .chooseDateofPlansheet()
//                .clickPlansheetItem()
                .clickEditPlansheetButton()
                .clickRandomNewTripButton()
                .checkLicenses()
                .clickGoToPlanningButton()
                .changeAddresses()
                .dragShipment()
                .dragShipment()
                .clickCalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickTripDetailsButton()
                .clickResultsTab()
                .clickCloseButton()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickYesButton();
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
    public void CreateTripTwoShipmentsFinanceCheck(){
        dashboardPage
                .openDashBoard()
                .clickPlanningButton();
        planningPage
                .chooseDateofPlansheet()
//                .clickPlansheetItem()
                .clickEditPlansheetButton()
                .clickRandomNewTripButton()
                .checkLicenses()
                .clickGoToPlanningButton()
                .changeAddresses()
                .dragShipment()
                .dragShipment()
     //           .clickRemoveFirstShipmentFromTripButton()
                .clickCalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickTripDetailsButton()
                .clickResultsTab()
                .clickCloseButton()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickYesButton();
    }

    @Test(enabled = false)
    public void calculateOneShipment(){
        dashboardPage
                .openDashBoard()
                .clickPlanningButton();
        planningPage
                .chooseDateofPlansheet()
//                .clickPlansheetItem()
                .clickEditPlansheetButton()
                .clickRandomNewTripButton()
                .checkLicenses()
                .clickGoToPlanningButton()
                .changeAddresses()
/*                .clickDeleteAttachingTrailerButton()
                .clickYesButton()
                .clickDeleteDetachingTrailerButton()
                .clickYesButton()*/
                .dragShipment()
                .inputTimeToFirstFromUntilTime(getTime(10,11), getTime(14,15))
                .clickCalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickYesButton();
    }
    @Test(enabled = false)
    public void calculateOneShipmentUpdate(){
        dashboardPage
                .openDashBoard()
                .clickPlanningButton();
        planningPage
                .chooseDateofPlansheet()
//                .clickPlansheetItem()
                .clickEditPlansheetButton()
                .clickRandomNewTripButton()
                .checkLicenses()
                .clickGoToPlanningButton()
                .changeAddresses()
                .dragShipment()
                .inputTimeToFirstFromUntilTime(getTime(10,11), getTime(14,15))
                .clickCalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickYesButton()
                .clickOverviewButton();
        overviewPage
                .clickPlannedTripTN()
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
    public void createTripTwoShipments(){
        dashboardPage
                .openDashBoard()
                .clickPlanningButton();
        planningPage
                .chooseDateofPlansheet()
//                .clickPlansheetItem()
                .clickEditPlansheetButton()
                .clickRandomNewTripButton()
                .checkLicenses()
                .clickGoToPlanningButton()
                .changeAddresses()
/*                .clickDeleteAttachingTrailerButton()
                .clickYesButton()
                .clickDeleteDetachingTrailerButton()
                .clickYesButton()*/
                .dragShipment()
                .dragShipment()
                //           .clickRemoveFirstShipmentFromTripButton()
                .clickCalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickYesButton();
    }
    @Test(enabled = false)
    public void CreateTripAddTwoShipmentsDeleteFirstShipment(){
        dashboardPage
                .openDashBoard()
                .clickPlanningButton();
        planningPage
                .chooseDateofPlansheet()
//                .clickPlansheetItem()
                .clickEditPlansheetButton()
                .clickRandomNewTripButton()
                .checkLicenses()
                .clickGoToPlanningButton()
                .changeAddresses()
/*                .clickDeleteAttachingTrailerButton()
                .clickYesButton()
                .clickDeleteDetachingTrailerButton()
                .clickYesButton()*/
                .dragShipment()
                .dragShipment()
                .clickRemoveFirstShipmentFromTripButton()
                .clickCalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickYesButton();
    }
    @Test(enabled = false)
    public void CreateTripOneShipmentDeleteTrailerActivities(){
        dashboardPage
                .openDashBoard()
                .clickPlanningButton();
        planningPage
                .chooseDateofPlansheet()
//                .clickPlansheetItem()
                .clickEditPlansheetButton()
                .clickRandomNewTripButton()
                .checkLicenses()
                .clickGoToPlanningButton()
                .changeAddresses()
                .clickDeleteAttachingTrailerButton()
                .clickYesButton()
                .clickDeleteDetachingTrailerButton()
                .clickYesButton()
                .dragShipment()
                //           .clickRemoveFirstShipmentFromTripButton()
                .clickCalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickYesButton();
    }
}

