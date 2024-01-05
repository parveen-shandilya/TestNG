package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BrowsersBase.BrowsersInvoked;
import ExtentReport.ExtentReportClass;
import POM.CCPUtility;
import POM.CSLPUtility;

public class CSLP extends BrowsersInvoked {

	public WebDriver driver;
	//ExtentReportClass extentClass;
	ITestResult result;
	CCPUtility ccp;
	CSLPUtility cslp;

	@BeforeClass
	public void setUp() {
		driver = BrowsersInvoked.Setup();
		// extentClass = new ExtentReportClass(driver);
		//ccp = new CCPUtility(driver);
		cslp = new CSLPUtility(driver);
	}

	@AfterClass
	public void closeDriver() {
		BrowsersInvoked.tearDown(driver);
	}

	@Test(priority = 0)
	public void LoginAgency() throws InterruptedException {
		cslp.LoginAgency();

	}

	@Test(priority = 1)
	public void CSLP_VerifyCSLPOpensUP() throws InterruptedException {
		cslp.CSLP_VerifyCSLPOpensUP();

	}

	@Test(priority = 2)
	public void CSLP_VerifyPrimaryFilters() throws InterruptedException {
		cslp.CSLP_VerifyPrimaryFilters();

	}

	@Test(priority = 3)
	public void CSLP_VerifyTagFilter() throws InterruptedException {
		cslp.CSLP_VerifyTagFilter();

	}

	@Test(priority = 4)
	public void CSLP_VerifyNavigationFromPagination() throws InterruptedException {
		cslp.CSLP_VerifyNavigationFromPagination();

	}

	@Test(priority = 5)
	public void CSLP_VerifyDescendingOrderOfSubmissions() throws InterruptedException {
		cslp.CSLP_VerifyDescendingOrderOfSubmissions();

	}

	@Test(priority = 6)
	public void CSLP_VerifyAscendingOrderOfCases() throws InterruptedException {
		cslp.CSLP_VerifyAscendingOrderOfCases();

	}

	@Test(priority = 7)
	public void CSLP_VerifyDeletedSubmission() throws InterruptedException {
		cslp.CSLP_VerifyDeletedSubmission();

	}

	@Test(priority = 8)
	public void CSLP_VerifyTotalCountOfSubmissions() throws InterruptedException {
		cslp.CSLP_VerifyTotalCountOfSubmissions();

	}

	@Test(priority = 9)
	public void CSLP_VerifyClearAllFiltersLinkText() throws InterruptedException {
		cslp.CSLP_VerifyClearAllFiltersLinkText();

	}

	@Test(priority = 10)
	public void CSLP_VerifyClearAllFiltersAfterClicking() throws InterruptedException {
		cslp.CSLP_VerifyClearAllFiltersAfterClicking();

	}

	@Test(priority = 11)
	public void CSLP_VerifyApplicationOfsecondaryFilters() throws InterruptedException {
		cslp.CSLP_VerifyApplicationOfsecondaryFilters();

	}

	@Test(priority = 12)
	public void CSLP_VerifyFilterGetsRemoved() throws InterruptedException {
		cslp.CSLP_VerifyFilterGetsRemoved();

	}

	@Test(priority = 13)
	public void CSLP_VerifyFilterAndSearch() throws InterruptedException {
		cslp.CSLP_VerifyFilterAndSearch();

	}

	@Test(priority = 14)
	public void CSLP_VerifyRemovalOfColumns() throws InterruptedException {
		cslp.CSLP_VerifyRemovalOfColumns();

	}

	@Test(priority = 15)
	public void CSLP_VerifyRestorationOfColumns() throws InterruptedException {
		cslp.CSLP_VerifyRestorationOfColumns();

	}

	@Test(priority = 16)
	public void CSLP_VerifySavedFilter() throws InterruptedException {
		cslp.CSLP_VerifySavedFilter();

	}

	@Test(priority = 17)
	public void CSLP_VerifyDeletedFilter() throws InterruptedException {
		cslp.CSLP_VerifyDeletedFilter();

	}

	@Test(priority = 18)
	public void CSLP_VerifyCSVFile() throws InterruptedException {
		cslp.CSLP_VerifyCSVFile();

	}

	@Test(priority = 19)
	public void CSLP_VerifyDirectionToRespectiveSubmission() throws InterruptedException {
		cslp.CSLP_VerifyDirectionToRespectiveSubmission();

	}

	@Test(priority = 20)
	public void CSLP_VerifySubmissionsForMineButton() throws InterruptedException {
		cslp.CSLP_VerifySubmissionsForMineButton();

	}

	@Test(priority = 21)
	public void CSLP_VerifyDescendingSubmission() throws InterruptedException {
		cslp.CSLP_VerifyDescendingSubmission();

	}

	@Test(priority = 22)
	public void CSLP_VerifyNoExistingSubmissionSearch() throws InterruptedException {
		cslp.CSLP_VerifyNoExistingSubmissionSearch();

	}

	@Test(priority = 23)
	public void CSLP_VerifyNoExistingCategorySubmission() throws InterruptedException {
		cslp.CSLP_VerifyNoExistingCategorySubmission();

	}

	@Test(priority = 24)
	public void VerifyMapViewPresent() throws InterruptedException {
		cslp.VerifyMapViewPresent();

	}

}
