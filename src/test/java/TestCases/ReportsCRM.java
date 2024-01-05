package TestCases;

import BrowsersBase.BrowsersInvoked;
import BrowsersBase.BrowsersInvoked;
import ExtentReport.ExtentReportClass;
import POM.CaseAssignmentUtility;
import POM.DashBoardCRMUtility;
import POM.ReportCRMUtility;
import POM.SubmissionAssignmentUtility;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ReportsCRM extends BrowsersInvoked {

	public WebDriver driver;
	CaseAssignmentUtility obj;
	ExtentReportClass extentClass;
	ITestResult result;
	ReportCRMUtility repCRM;

	@BeforeClass
	public void setUp() throws InterruptedException {
		driver = BrowsersInvoked.Setup();
		repCRM = new ReportCRMUtility(driver);
	}

	@AfterClass
	public void closeDriver() {
		BrowsersInvoked.tearDown(driver);
	}

	@Test(priority = -1, description = "Login Test Case")
	public void LoginTest() throws InterruptedException {
		repCRM.LoginAgency();
	}

	@Test(priority = 0)
	public void Reports_PreRequisite() throws InterruptedException {
		repCRM.Reports_PreRequisite();
	}

	@Test(priority = 1)
	public void Reports_VerifyAdditionOfNewReports() throws InterruptedException {
		repCRM.Reports_VerifyAdditionOfNewReports();

	}

	@Test(priority = 2)
	public void Reports_VerifyEditedQSReport() throws InterruptedException {
		repCRM.Reports_VerifyEditedQSReport();

	}

	@Test(priority = 3)
	public void Reports_VerifyCRMToggleForReports() throws InterruptedException {
		repCRM.Reports_VerifyCRMToggleForReports();

	}

	@Test(priority = 4)
	public void Reports_VerifyAllCRMReports() throws InterruptedException {
		repCRM.Reports_VerifyAllCRMReports();

	}

}
