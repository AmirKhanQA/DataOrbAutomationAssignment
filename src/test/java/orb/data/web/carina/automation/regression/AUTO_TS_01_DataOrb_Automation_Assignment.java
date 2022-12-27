package orb.data.web.carina.automation.regression;

import com.qaprosoft.carina.core.foundation.dataprovider.annotations.CsvDataSourceParameters;
import orb.data.web.carina.automation.gui.pages.HomePage;
import orb.data.web.carina.automation.testUtils.Groups;
import orb.data.web.carina.automation.testUtils.TestSetup;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.logging.Logger;

public class AUTO_TS_01_DataOrb_Automation_Assignment extends TestSetup {

    @Test(testName = "Print Electronics menu and its sub-menu", dataProvider = "DataProvider", groups = {Groups.Regression},invocationCount = 1,description = "JIRA#AUTO-TC-001" )
    @CsvDataSourceParameters(path = "xls/DataOrb_App_Data.csv", dsUid = "TestCaseID", executeColumn = "TestCaseID", executeValue = "AUTO-TC-001")
    public void testPrintElectronicsMenuAndItsSubMenu_AUTO_TC_001(HashMap<String, String> testData) {
        Reporter.log("TC_AUTO_TC_01 -Print Electronics menu and its sub-menu", true);
        HomePage homePage = new HomePage(driver);
        homePage.closeLoginPopup();
        homePage.clickOnBanner();
        homePage.hoverOnElectronicsDropDown();
        System.out.println(homePage.getAllMobileList());
        Assert.assertEquals(homePage.getAllMobileListSize(),18);
        System.out.println("==============================================================");
        System.out.println(homePage.getAllMobileAccessoriesList());
        homePage.hoverOnElectronicsDropDown();
        Assert.assertEquals(homePage.getAllMobileAccessoriesListSize(),17);
    }

}