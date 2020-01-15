package org.slim.ui;

import com.slim.ui.pageOblectClasses.DashboardPage;
import com.slim.ui.pageOblectClasses.LoginPage;
import com.slim.ui.pageOblectClasses.Overview.OverviewPage;
import com.slim.ui.pageOblectClasses.office.OfficePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.sleep;

public class OfficeTest extends BaseTest {
    DashboardPage dashboardPage = new DashboardPage();
    LoginPage loginPage = new LoginPage();
    OfficePage officePage = new OfficePage();

    @BeforeClass
    private void preClass (){
        loginPage
                .loginToDashboard("anastasia@fitsoft.nl", "QWEqwe123!@#");
    }
    @Test(enabled = false)
    public void open() {
        dashboardPage
                .openDashBoard()
                .clickOfficeButton();
        officePage
                .clickAdministrationButton()
                .clickLastTripLogButton()
                .findPositionOfStartTimePlanned()
                .findPositionOfFieldForStartTime()
                .findPositionOfEndTimePlanned()
                .findPositionOfFieldForEndTime()
                .checkSimCoordinates();
        sleep(10000);
    }

}
