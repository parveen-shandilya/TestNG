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
import POM.CreateAndLinkCaseUtility;

public class CreateAndLinkCase extends BrowsersInvoked{
	public WebDriver driver;
	ExtentReportClass extentClass;
	ITestResult result;
	CreateAndLinkCaseUtility createLinkCase;

	@BeforeClass
	public void setUp() {
		driver = BrowsersInvoked.Setup();
		//extentClass = new ExtentReportClass(driver);
		createLinkCase = new CreateAndLinkCaseUtility(driver);
	}

	@AfterClass
	public void closeDriver() {
		BrowsersInvoked.tearDown(driver);
	}



	@Test(priority = 0)
	public void LoginAgency() throws InterruptedException {
		createLinkCase.LoginAgency();

	}

	@Test(priority = 1)
	public void CreateAndLinkCase_PreRequisite() throws InterruptedException {
		createLinkCase.CreateAndLinkCase_PreRequisite();
		
	}

	@Test(priority = 2)
	public void CreateAndLinkCase_OpenCCPToLinkTheCase() throws InterruptedException {
		createLinkCase.CreateAndLinkCase_OpenCCPToLinkTheCase();
		
	}

	@Test(priority = 3)
	public void CreateAndLinkCase_VerifyAutopopulatedData() throws InterruptedException {
		createLinkCase.CreateAndLinkCase_VerifyAutopopulatedData();
		
	}

	@Test(priority = 4)
	public void CreateAndLinkCase_VerifyLinkedCase() throws InterruptedException {
		createLinkCase.CreateAndLinkCase_VerifyLinkedCase();
		
	}

	@Test(priority = 5)
	public void CreateAndLinkCase_VerifyDirectionToAssociatedSubmission() throws InterruptedException {
		createLinkCase.CreateAndLinkCase_VerifyDirectionToAssociatedSubmission();
		
	}

	@Test(priority = 6)
	public void CreateAndLinkCase_VerifyDirectionToAssociatedCase() throws InterruptedException {
		createLinkCase.CreateAndLinkCase_VerifyDirectionToAssociatedCase();
		
	}
}
