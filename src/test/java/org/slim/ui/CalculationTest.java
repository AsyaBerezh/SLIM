package org.slim.ui;

import com.slim.ui.pageOblectClasses.DashboardPage;
import com.slim.ui.pageOblectClasses.LoginPage;
import com.slim.ui.pageOblectClasses.office.OfficePage;
import com.slim.ui.pageOblectClasses.planning.PlanningPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class CalculationTest extends BaseTest {

    DashboardPage dashboardPage = new DashboardPage();
    LoginPage loginPage = new LoginPage();
    OfficePage officePage = new OfficePage();
    PlanningPage planningPage = new PlanningPage();

    @BeforeClass

    private void preClass() {
        loginPage
                .loginToDashboard("marharyta@fitsoft.nl", "QWEqwe123!@#");
    }

    @Test
    public void creatingOrderInPlanning() {
        dashboardPage
                .openDashBoard()
                .clickMenuButton()
                .clickPlanningButton();
        planningPage
                .clickPlansheetSelector()
                .clickPlansheetItem()
                .clickBackToEditingButton()
                .clickDeleteFirstActivityButton()
                .clickDeleteFirstActivityButton();


    }
    @Test
    public void calculateOneShipmentOpenInfo(){
        dashboardPage
                .openDashBoard()
                .clickMenuButton()
                .clickPlanningButton();
        planningPage
                .clickPlansheetSelector()
                .clickPlansheetItem()
                .clickEditPlansheetButton()
                .clickFirstNewTripButton()
                .clickChangelastTractorbutton()
                .clickTractorClaimButton()
                .clickChangelastTrailerbutton()
                .clickTrailerClaimButton()
                .clickGoToPlanningButton()
                .clickStartAddress()
                .clickChooseStartAddress()
                .clickAttachingTrailerAddress()
                .clickChooseAttachingTrailerAddress()
                .clickDetachingTrailerAddress()
                .clickChooseDetachingTrailerAddress()
                .clickEndAddress()
                .clickChooseEndAddress()
/*                .clickDeleteAttachingTrailerButton()
                .clickYesButton()
                .clickDeleteDetachingTrailerButton()
                .clickYesButton()*/
                .dragable()
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
    public void calculateOneShipment(){
        dashboardPage
                .openDashBoard()
                .clickMenuButton()
                .clickPlanningButton();
        planningPage
                .clickPlansheetSelector()
                .clickPlansheetItem()
                .clickEditPlansheetButton()
                .clickFirstNewTripButton()
                .clickChangelastTractorbutton()
                .clickTractorClaimButton()
                .clickChangelastTrailerbutton()
                .clickTrailerClaimButton()
                .clickGoToPlanningButton()
                .clickStartAddress()
                .clickChooseStartAddress()
                .clickAttachingTrailerAddress()
                .clickChooseAttachingTrailerAddress()
                .clickDetachingTrailerAddress()
                .clickChooseDetachingTrailerAddress()
                .clickEndAddress()
                .clickChooseEndAddress()
/*                .clickDeleteAttachingTrailerButton()
                .clickYesButton()
                .clickDeleteDetachingTrailerButton()
                .clickYesButton()*/
                .dragable()
                //           .clickRemoveFirstShipmentFromTripButton()
                .clickCalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickYesButton();
        sleep(2000);
    }
    @Test
    public void calculateTwoShipments(){
        dashboardPage
                .openDashBoard()
                .clickMenuButton()
                .clickPlanningButton();
        planningPage
                .clickPlansheetSelector()
                .clickPlansheetItem()
                .clickEditPlansheetButton()
                .clickFirstNewTripButton()
                .clickChangelastTractorbutton()
                .clickTractorClaimButton()
                .clickChangelastTrailerbutton()
                .clickTrailerClaimButton()
                .clickGoToPlanningButton()
                .clickStartAddress()
                .clickChooseStartAddress()
                .clickAttachingTrailerAddress()
                .clickChooseAttachingTrailerAddress()
                .clickDetachingTrailerAddress()
                .clickChooseDetachingTrailerAddress()
                .clickEndAddress()
                .clickChooseEndAddress()
/*                .clickDeleteAttachingTrailerButton()
                .clickYesButton()
                .clickDeleteDetachingTrailerButton()
                .clickYesButton()*/
                .dragable()
                .dragable()
                //           .clickRemoveFirstShipmentFromTripButton()
                .clickCalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickYesButton();
        sleep(2000);
    }
    @Test
    public void calculateAddTwoShipmentsDeleteFirst(){
        dashboardPage
                .openDashBoard()
                .clickMenuButton()
                .clickPlanningButton();
        planningPage
                .clickPlansheetSelector()
                .clickPlansheetItem()
                .clickEditPlansheetButton()
                .clickFirstNewTripButton()
                .clickChangelastTractorbutton()
                .clickTractorClaimButton()
                .clickChangelastTrailerbutton()
                .clickTrailerClaimButton()
                .clickGoToPlanningButton()
                .clickStartAddress()
                .clickChooseStartAddress()
                .clickAttachingTrailerAddress()
                .clickChooseAttachingTrailerAddress()
                .clickDetachingTrailerAddress()
                .clickChooseDetachingTrailerAddress()
                .clickEndAddress()
                .clickChooseEndAddress()
/*                .clickDeleteAttachingTrailerButton()
                .clickYesButton()
                .clickDeleteDetachingTrailerButton()
                .clickYesButton()*/
                .dragable()
                .dragable()
                .clickRemoveFirstShipmentFromTripButton()
                .clickCalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickYesButton();
        sleep(2000);
    }
    @Test
    public void calculateOneShipmentDeleteTrailerActivities(){
        dashboardPage
                .openDashBoard()
                .clickMenuButton()
                .clickPlanningButton();
        planningPage
                .clickPlansheetSelector()
                .clickPlansheetItem()
                .clickEditPlansheetButton()
                .clickFirstNewTripButton()
                .clickChangelastTractorbutton()
                .clickTractorClaimButton()
                .clickChangelastTrailerbutton()
                .clickTrailerClaimButton()
                .clickGoToPlanningButton()
                .clickStartAddress()
                .clickChooseStartAddress()
                .clickAttachingTrailerAddress()
                .clickChooseAttachingTrailerAddress()
                .clickDetachingTrailerAddress()
                .clickChooseDetachingTrailerAddress()
                .clickEndAddress()
                .clickChooseEndAddress()
                .clickDeleteAttachingTrailerButton()
                .clickYesButton()
                .clickDeleteDetachingTrailerButton()
                .clickYesButton()
                .dragable()
                //           .clickRemoveFirstShipmentFromTripButton()
                .clickCalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickYesButton();
        sleep(2000);
    }
}

