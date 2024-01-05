package TestCases;



import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BrowsersBase.BrowsersInvoked;
import ExtentReport.ExtentReportClass;
import POM.CCPUtility;
import POM.SubmissionSettingsUtility;

public class SubmissionSettings extends BrowsersInvoked {
	
	public WebDriver driver;
	ExtentReportClass extentClass;
	ITestResult result;
	CCPUtility ccp;
	SubmissionSettingsUtility submissionSetting;

	@BeforeClass
	public void setUp() {
		driver = BrowsersInvoked.Setup();
		//extentClass = new ExtentReportClass(driver);
		submissionSetting = new SubmissionSettingsUtility(driver);
	}

	@AfterClass
	public void closeDriver() {
		BrowsersInvoked.tearDown(driver);
	}



	@Test(priority = 0)
	public void LoginAgency() throws InterruptedException {
		submissionSetting.LoginAgency();

	}

	
	
	
	
	
	
	@Test(priority = 1)
	public void SubmissionSettings_VerifyToggleButtonsState() throws InterruptedException {
		submissionSetting.SubmissionSettings_VerifyToggleButtonsState();
		
	}

	@Test(priority = 2)
	public void SubmissionSettings_VerifyDiscardButtonFunctionality() throws InterruptedException {
		submissionSetting.SubmissionSettings_VerifyDiscardButtonFunctionality();
		
	}

	@Test(priority = 3)
	public void SubmissionSettings_VerifyChangesGetSaved() throws InterruptedException {
		submissionSetting.SubmissionSettings_VerifyChangesGetSaved();
		
	}

	@Test(priority = 4)
	public void SubmissionSettings_VerifyAutomaticClosingOfLinkedSubmission() throws InterruptedException {
		submissionSetting.SubmissionSettings_VerifyAutomaticClosingOfLinkedSubmission();
		
	}

	@Test(priority = 5)
	public void SubmissionSettings_VerifyCaseDoesntCloseForNoToggle() throws InterruptedException {
		submissionSetting.SubmissionSettings_VerifyCaseDoesntCloseForNoToggle();
		
	}

	@Test(priority = 6)
	public void SubmissionSettings_VerifyselectionOfAnonymousToggles() throws InterruptedException {
		submissionSetting.SubmissionSettings_VerifyselectionOfAnonymousToggles();
		
	}

	@Test(priority = 7)
	public void SubmissionSettings_VerifyPostAnonymouslyForYesToggle() throws InterruptedException {
		submissionSetting.SubmissionSettings_VerifyPostAnonymouslyForYesToggle();
		
	}

	@Test(priority = 8)
	public void SubmissionSettings_VerifyPostAnonymouslyForNoToggle() throws InterruptedException {
		submissionSetting.SubmissionSettings_VerifyPostAnonymouslyForNoToggle();
		
	}

}
