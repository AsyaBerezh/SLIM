package org.slim.ui;

import com.slim.ui.pageOblectClasses.DashboardPage;
import com.slim.ui.pageOblectClasses.LoginPage;
import com.slim.ui.pageOblectClasses.planning.PlanningPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;
import static com.slim.ui.dataGenerator.DataGenerator.getTime;

public class ForMaven extends BaseTest {

    DashboardPage dashboardPage = new DashboardPage();
    LoginPage loginPage = new LoginPage();
    PlanningPage planningPage = new PlanningPage();

    @BeforeClass
    private void preClass() {
        loginPage
                .loginToDashboard("anastasia@fitsoft.nl", "QWEqwe123!@#");
    }

    /* Without BackToEditing one */

    @Test
    private void Script_1_AABB() {
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
               // .inputTimeToFirstFromUntilTime(getTime(10,11), getTime(14,15))
                .clickCalculateTripButton()
                .clickOKButtonOnWarningPopUp()
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
                .dragShipment()
            //    .inputTimeToFirstFromUntilTime(getTime(10,11), getTime(14,15))
                .clickCalculateTripButton()
                .clickOKButtonOnWarningPopUp()
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
    private void Script_1_ABBA() {
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
               // .inputTimeToFirstFromUntilTime(getTime(10,11), getTime(14,15))
                .clickCalculateTripButton()
/*                .clickOKButtonOnWarningPopUp()*/
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
                .dragShipment()
             //   .inputTimeToFirstFromUntilTime(getTime(10,11), getTime(14,15))
                .clickCalculateTripButton()
/*                .clickOKButtonOnWarningPopUp()*/
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
    private void Script_1_ABAB() {
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
            //    .inputTimeToFirstFromUntilTime(getTime(10,11), getTime(14,15))
                .clickCalculateTripButton()
/*                .clickOKButtonOnWarningPopUp()*/
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
                .dragShipment()
    //            .inputTimeToFirstFromUntilTime(getTime(10,11), getTime(14,15))
                .clickCalculateTripButton()
  //              .clickOKButtonOnWarningPopUp()
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

    /* BackToEditing one */

    //A1A
    @Test
    private void Script_1_A1A_BAB() {
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
       //         .inputTimeToFirstFromUntilTime(getTime(10,11), getTime(14,15))
                .clickCalculateTripButton()
/*                .clickOKButtonOnWarningPopUp()*/
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
                .dragShipment()
         //       .inputTimeToFirstFromUntilTime(getTime(10,11), getTime(14,15))
                .clickCalculateTripButton()
/*                .clickOKButtonOnWarningPopUp()*/
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
                .deleteNewTrips()
                .clickRandomNewTripButton()
                .checkLicenses()
                .clickGoToPlanningButton()
                .clickDeleteAttachingTrailerButton()
                .clickDeleteDetachingTrailerButton()
                .changeAddresses()
                .dragShipment()
            /*    .inputTimeToFirstFromUntilTime(getTime(10,11), getTime(14,15))*/
                .clickCalculateTripButton()
               /* .clickOKButtonOnWarningPopUp()*/
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
                .dragShipment()
/*                .inputTimeToFirstFromUntilTime(getTime(10,11), getTime(14,15))*/
                .clickCalculateTripButton()
                /*.clickOKButtonOnWarningPopUp()*/
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
                .deleteNewTrips()
                .clickRandomNewTripButton()
                .checkLicenses()
                .clickGoToPlanningButton()
                .clickDeleteAttachingTrailerButton()
                .clickDeleteDetachingTrailerButton()
                .changeAddresses()
                .dragShipment()
/*                .inputTimeToFirstFromUntilTime(getTime(10,11), getTime(14,15))*/
                .clickCalculateTripButton()
                /*.clickOKButtonOnWarningPopUp()*/
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
                .dragShipment()
/*                .inputTimeToFirstFromUntilTime(getTime(10,11), getTime(14,15))*/
                .clickCalculateTripButton()
/*                .clickOKButtonOnWarningPopUp()*/
                .clickIUnderstandButtonOnWarningPopUp()
                .clickTripDetailsButton()
                .clickResultsTab()
                .clickCloseButton()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickYesButton();
        sleep(1000);
    }
    //A1B
    @Test
    private void Script_1_A1B_AAB() {
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
     //           .inputTimeToFirstFromUntilTime(getTime(10,11), getTime(14,15))
                .clickCalculateTripButton()
     //           .clickOKButtonOnWarningPopUp()
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
                .dragShipment()
          //      .inputTimeToFirstFromUntilTime(getTime(10,11), getTime(14,15))
                .clickCalculateTripButton()
         //       .clickOKButtonOnWarningPopUp()
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
}

