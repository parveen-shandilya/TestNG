package TestCases;

import BrowsersBase.BrowsersInvoked;
import ExtentReport.ExtentReportClass;
import POM.CaseAssignmentUtility;
import POM.SubmissionAssignmentUtility;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SubmissionAssignment extends BrowsersInvoked{

    public WebDriver driver;
    CaseAssignmentUtility obj ;
    ExtentReportClass extentClass;
    ITestResult result;
    SubmissionAssignmentUtility  subAss;

    @BeforeClass
    public void setUp() throws InterruptedException {
        driver = BrowsersInvoked.Setup();
        subAss = new SubmissionAssignmentUtility(driver);
    }

    @AfterClass
    public void closeDriver() {
        BrowsersInvoked.tearDown(driver);
    }
    
    @Test(priority =-1)
	public void LoginAgency() throws InterruptedException {
    	subAss.LoginAgency();

	}

    @Test(priority = 0)
    public void SubmissionAssignment_OpenEditAssignmentPopup() throws InterruptedException {
        subAss.SubmissionAssignment_OpenEditAssignmentPopup();
    }

    @Test(priority = 1)
    public void SubmissionAssignment_VerifyNoUpdationWithoutARule() throws InterruptedException {
        subAss.SubmissionAssignment_VerifyNoUpdationWithoutARule();
    }

    @Test(priority = 2)
    public void SubmissionAssignment_OpenCreateRulePopup() throws InterruptedException {
        subAss.SubmissionAssignment_OpenCreateRulePopup();
    }

    @Test(priority = 3)
    public void SubmissionAssignment_AddMultipleCriterias() throws InterruptedException {
        subAss.SubmissionAssignment_AddMultipleCriterias();
    }

    @Test(priority = 4)
    public void SubmissionAssignment_VerifyAddedRule() throws InterruptedException {
        subAss.SubmissionAssignment_VerifyAddedRule();
    }

    @Test(priority = 5)
    public void SubmissionAssignment_EditAddedRule() throws InterruptedException {
        subAss.SubmissionAssignment_EditAddedRule();
    }

    @Test(priority = 6)
    public void SubmissionAssignment_DeleteAddedRule() throws InterruptedException {
        subAss.SubmissionAssignment_DeleteAddedRule();
    }

    @Test(priority = 7)
    public void SubmissionAssignment_AssignmentRuleUnderInactiveSection() throws InterruptedException {
        subAss.SubmissionAssignment_AssignmentRuleUnderInactiveSection();
    }

    @Test(priority = 8)
    public void SubmissionAssignmentBaseOnAddedRule() throws InterruptedException {
        subAss.SubmissionAssignmentBaseOnAddedRule();
    }

    @Test(priority = 9)
    public void CaseAssignmentBaseOnAddedRule() throws InterruptedException {
        subAss.CaseAssignmentBaseOnAddedRule();
    }
}
