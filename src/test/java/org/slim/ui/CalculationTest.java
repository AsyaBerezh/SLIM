package org.slim.ui;

import com.slim.ui.pageOblectClasses.DashboardPage;
import com.slim.ui.pageOblectClasses.LoginPage;
import com.slim.ui.pageOblectClasses.office.OfficePage;
import com.slim.ui.pageOblectClasses.planning.PlanningPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculationTest extends BaseTest{

    DashboardPage dashboardPage = new DashboardPage();
    LoginPage loginPage = new LoginPage();
    OfficePage officePage = new OfficePage();
    PlanningPage planningPage = new PlanningPage();

    @BeforeClass

    private void preClass (){
        loginPage
                .loginToDashboard("marharyta@fitsoft.nl", "QWEqwe123!@#");
    }
    @Test
    public void creatingOrderInPlanning(){
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
}
