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
                .loginToDashboard("marharyta@fitsoft.nl", "QWEqwe123!@#");
    }
    @Test
    public void updateTrip() {
        dashboardPage
                .openDashBoard()
                .clickOverviewButton();
        overviewPage
                .clickTrip()
                .clickTripUpdate()
                .dragableUpdate()
/*                .clickCancelUpdateButton()
                .clickProceedButton();*/
                .clickRecalculateTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickPublishTripButton()
                .clickIUnderstandButtonOnWarningPopUp()
                .clickOKButton();
        sleep(10000);
    }

}
