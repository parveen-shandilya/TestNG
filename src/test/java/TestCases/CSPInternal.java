package TestCases;



import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BrowsersBase.BrowsersInvoked;
import POM.CCPUtility;
import POM.CSPInternalUtility;
import POM.CategoryUtility;

public class CSPInternal extends BrowsersInvoked{
	
	public WebDriver driver;
	ITestResult result;
	CCPUtility ccp;
	CategoryUtility category;
	CSPInternalUtility CSPInternalUtils;
	
	@BeforeClass
	public void setUp() {
		driver = BrowsersInvoked.Setup();
		//extentClass = new ExtentReportClass(driver);
		//ccp = new CCPUtility(driver);
		CSPInternalUtils=new CSPInternalUtility(driver);
	}

	@AfterClass
	public void closeDriver() {
		BrowsersInvoked.tearDown(driver);
	}
	
	@Test(priority = 0)
	public void LoginAgency() throws InterruptedException {
		CSPInternalUtils.LoginAgency();

	}
	
	@Test(priority = 1)
	public void CSPInternal_Prerequisites() throws InterruptedException {
		
		CSPInternalUtils.CSPInternal_Prerequisites();
		
	}

	@Test(priority = 2)
	public void CSPInternal_VerifyCSPOpensUp() throws InterruptedException {
		CSPInternalUtils.CSPInternal_VerifyCSPOpensUp();
		
	}

	@Test(priority = 3)
	public void CSPInternal_VerifyPostAnonymouslycheckbox() throws InterruptedException {
		CSPInternalUtils.CSPInternal_VerifyPostAnonymouslycheckbox();
		
	}

	@Test(priority = 4)
	public void CSPInternal_VerifyCustomerInformationTile() throws InterruptedException {
		CSPInternalUtils.CSPInternal_VerifyCustomerInformationTile();
		
	}

	@Test(priority = 5)
	public void CSPInternal_AddExistingCustomer() throws InterruptedException {
		CSPInternalUtils.CSPInternal_AddExistingCustomer();
		
	}

	@Test(priority = 6)
	public void CSPInternal_VerifyCategoriesList() throws InterruptedException {
		CSPInternalUtils.CSPInternal_VerifyCategoriesList();
		
	}

	@Test(priority = 7)
	public void CSPInternal_SearchAndAddCategory() throws InterruptedException {
		
		CSPInternalUtils.CSPInternal_SearchAndAddCategory();
		
	}

	@Test(priority = 8)
	public void CSPInternal_LocationRequiredValCategory() throws InterruptedException {
		
		CSPInternalUtils.CSPInternal_LocationRequiredValCategory();
		
	}

	@Test(priority = 9)
	public void CSPInternal_AddLocation() throws InterruptedException {
		CSPInternalUtils.CSPInternal_AddLocation();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertAll();
	}

	@Test(priority = 10)
	public void CSPInternal_CategoryWithLocationIncluded() throws InterruptedException {
		CSPInternalUtils.CSPInternal_CategoryWithLocationIncluded();
		
	}

	@Test(priority = 11)
	public void CSPInternal_VerifyIssueDescription() throws InterruptedException {
		CSPInternalUtils.CSPInternal_VerifyIssueDescription();
		
	}

	@Test(priority = 12)
	public void CSPInternal_AddMultipleTags() throws InterruptedException {
		CSPInternalUtils.CSPInternal_AddMultipleTags();
		
	}

	@Test(priority = 13)
	public void CSPInternal_AddAttachments() throws InterruptedException {
		CSPInternalUtils.CSPInternal_AddAttachments();
		
	}

	@Test(priority = 14)
	public void CSPInternal_VerifySubmissionCreation() throws InterruptedException {
		CSPInternalUtils.CSPInternal_VerifySubmissionCreation();
		
	}

	@Test(priority = 15)
	public void CSPInternal_SubmissionDoesNotGetCreatedOnCancel() throws InterruptedException {
		CSPInternalUtils.CSPInternal_SubmissionDoesNotGetCreatedOnCancel();
		
	}

}
