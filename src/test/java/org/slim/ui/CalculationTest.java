package org.slim.ui;

import com.slim.ui.pageOblectClasses.DashboardPage;
import com.slim.ui.pageOblectClasses.LoginPage;
import com.slim.ui.pageOblectClasses.Overview.OverviewPage;
import com.slim.ui.pageOblectClasses.office.OfficePage;
import com.slim.ui.pageOblectClasses.planning.PlanningPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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
    private void ChooseResources() {
        dashboardPage
                .openDashBoard()
                .clickPlanningButton();
        planningPage
                .clickPlansheetSelector()
                .clickPlansheetItem()
                //.clickEditPlansheetButton()
                //.clickRandomNewTripButton()
                //.checkLicenses()
                //.clickGoToPlanningButton()
                .changeAddresses();
                sleep(1000);
    }

    @Test
    public void CreateTripTwoShipmentsUpdateTripOneShipmentFinanceCheck() {
        dashboardPage
                .openDashBoard()
                .clickPlanningButton();
        planningPage
                .clickPlansheetSelector()
                .clickPlansheetItem()
                .clickEditPlansheetButton()
                .clickRandomNewTripButton()
                .checkLicenses()
                .clickGoToPlanningButton()
                .changeAddresses()
                .dragLastShipment()
                .dragLastShipment()
                .clickCalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickTripDetailsButton()
                .clickresultsTab()
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
                .clickresultsTab()
                .clickCloseButtonSecondWindow()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickOKButton();
    }
    @Test
    public void CreateTripTwoShipmentsFinanceCheck(){
        dashboardPage
                .openDashBoard()
                .clickPlanningButton();
        planningPage
                .clickPlansheetSelector()
                .clickPlansheetItem()
                .clickEditPlansheetButton()
                .clickRandomNewTripButton()
                .checkLicenses()
                .clickGoToPlanningButton()
                .changeAddresses()
                .dragLastShipment()
                .dragLastShipment()
     //           .clickRemoveFirstShipmentFromTripButton()
                .clickCalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickTripDetailsButton()
                .clickresultsTab()
                .clickCloseButton()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickYesButton();
        sleep(2000);
    }
    @Test
    public void setTime(){
        dashboardPage
                .openDashBoard()
                .clickPlanningButton();
        planningPage
                .clickPlansheetSelector()
                .clickPlansheetItem()
                .inputTimeToEveryField(getTime(10,11), getTime(14,15));
        sleep(2000);
    }

    @Test
    public void calculateOneShipment(){
        dashboardPage
                .openDashBoard()
                .clickPlanningButton();
        planningPage
                .clickPlansheetSelector()
                .clickPlansheetItem()
                .clickEditPlansheetButton()
                .clickRandomNewTripButton()
                .checkLicenses()
                .clickGoToPlanningButton()
                .changeAddresses()
/*                .clickDeleteAttachingTrailerButton()
                .clickYesButton()
                .clickDeleteDetachingTrailerButton()
                .clickYesButton()*/
                .dragLastShipment()
                .inputTimeToFirstFromUntilTime(getTime(10,11), getTime(14,15))
                .clickCalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickYesButton();
        sleep(2000);
    }
    @Test
    public void calculateOneShipmentUpdate(){
        dashboardPage
                .openDashBoard()
                .clickPlanningButton();
        planningPage
                .clickPlansheetSelector()
                .clickPlansheetItem()
                .clickEditPlansheetButton()
                .clickRandomNewTripButton()
                .checkLicenses()
                .clickGoToPlanningButton()
                .changeAddresses()
                .dragLastShipment()
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
                .clickresultsTab()
                .clickCloseButtonSecondWindow()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickOKButton();
    }
    @Test
    public void createTripTwoShipments(){
        dashboardPage
                .openDashBoard()
                .clickPlanningButton();
        planningPage
                .clickPlansheetSelector()
                .clickPlansheetItem()
                .clickEditPlansheetButton()
                .clickRandomNewTripButton()
                .checkLicenses()
                .clickGoToPlanningButton()
                .changeAddresses()
/*                .clickDeleteAttachingTrailerButton()
                .clickYesButton()
                .clickDeleteDetachingTrailerButton()
                .clickYesButton()*/
                .dragLastShipment()
                .dragLastShipment()
                //           .clickRemoveFirstShipmentFromTripButton()
                .clickCalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickYesButton();
        sleep(2000);
    }
    @Test
    public void CreateTripAddTwoShipmentsDeleteFirstShipment(){
        dashboardPage
                .openDashBoard()
                .clickPlanningButton();
        planningPage
                .clickPlansheetSelector()
                .clickPlansheetItem()
                .clickEditPlansheetButton()
                .clickRandomNewTripButton()
                .checkLicenses()
                .clickGoToPlanningButton()
                .changeAddresses()
/*                .clickDeleteAttachingTrailerButton()
                .clickYesButton()
                .clickDeleteDetachingTrailerButton()
                .clickYesButton()*/
                .dragLastShipment()
                .dragLastShipment()
                .clickRemoveFirstShipmentFromTripButton()
                .clickCalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickYesButton();
        sleep(2000);
    }
    @Test
    public void CreateTripOneShipmentDeleteTrailerActivities(){
        dashboardPage
                .openDashBoard()
                .clickPlanningButton();
        planningPage
                .clickPlansheetSelector()
                .clickPlansheetItem()
                .clickEditPlansheetButton()
                .clickRandomNewTripButton()
                .checkLicenses()
                .clickGoToPlanningButton()
                .changeAddresses()
                .clickDeleteAttachingTrailerButton()
                .clickYesButton()
                .clickDeleteDetachingTrailerButton()
                .clickYesButton()
                .dragLastShipment()
                //           .clickRemoveFirstShipmentFromTripButton()
                .clickCalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickYesButton();
        sleep(2000);
    }
}

