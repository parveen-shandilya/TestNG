package TestCases;
import BrowsersBase.BrowsersInvoked;

import java.awt.AWTException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebElement;
import BrowsersBase.BrowsersInvoked;
import CommonMethods.Helper;
import CommonMethods.RandomStrings;
import ExtentReport.ExtentReportClass;
import POM.CCPUtility;
import POM.CLPUtility;
import POM.CSPExternalUtility;
import POM.CaseAssignmentUtility;
import POM.CloseCaseUtility;
import POM.ForcedAbatementUtility;
import POM.PerformInspectionUtility;
import POM.ReopenCasesUtility;

public class CSPExternal extends BrowsersInvoked{
	
	public WebDriver driver;
	CSPExternalUtility cspExternal ;
	ExtentReportClass extentClass;
	ITestResult result;
	
	@BeforeClass
	public void setUp() {
		System.gc();
		driver = BrowsersInvoked.Setup();
		cspExternal = new CSPExternalUtility(driver);
		
		
		
	}
	
	@AfterClass
	public void closeDriver() {
		BrowsersInvoked.tearDown(driver);
	}
	
	
	
	@Test(priority =0)
	public void LoginAgency() throws InterruptedException {
		cspExternal.LoginAgency();

	}
	
	
	
	@Test(priority = 1)
	public void CSPExternal_PreRequisite_OpenReportAnIssuePage() throws InterruptedException {
		
		cspExternal.CSPExternal_PreRequisite_OpenReportAnIssuePage();
		
		
	}

	@Test(priority = 2)
	public void CSPExternal_VerifyIssueDescription() throws InterruptedException {
		
		cspExternal.CSPExternal_VerifyIssueDescription();
		
		
		
	}

	@Test(priority = 3)
	public void CSPExternal_VerifyAddedAttachments() throws InterruptedException {
		
		cspExternal.CSPExternal_VerifyAddedAttachments();
		
		
	}

	@Test(priority = 4,enabled=false)
	public void CSPExternal_VerifyCorrespondingCategoryToKeyword() throws InterruptedException {
		
		
		cspExternal.CSPExternal_VerifyCorrespondingCategoryToKeyword();
		
		
		}

	@Test(priority = 5)
	public void CSPExternal_VerifyNoLocationSection() throws InterruptedException {
		
		cspExternal.CSPExternal_VerifyNoLocationSection();
		
	}

	@Test(priority = 6)
	public void CSPExternal_VerifyRequiredLocationSection() throws InterruptedException {
		
		cspExternal.CSPExternal_VerifyRequiredLocationSection();
		
		}

	@Test(priority = 7)
	public void CSPExternal_VerifyNonMandatoryLocationSection() throws InterruptedException {
		
		cspExternal.CSPExternal_VerifyNonMandatoryLocationSection();
		
		}

	@Test(priority = 8)
	public void CSPExternal_VerifyMandatoryFieldsForNonAnonymous() throws InterruptedException {
		
		cspExternal.CSPExternal_VerifyMandatoryFieldsForNonAnonymous();
		
	}

	@Test(priority = 9)
	public void CSPExternal_VerifyEmailFieldPreference() throws InterruptedException {
		
		cspExternal.CSPExternal_VerifyEmailFieldPreference();
		
	}

	@Test(priority = 10)
	public void CSPExternal_VerifyAnonymousSubmission() throws InterruptedException {
		
		cspExternal.CSPExternal_VerifyAnonymousSubmission();
		
	}

	@Test(priority = 11)
	public void CSPExternal_VerifyNonAnonymousSubmission() throws InterruptedException, AWTException {
		
		cspExternal.CSPExternal_VerifyNonAnonymousSubmission();
		

	}

	@Test(priority = 12)
	public void CSPExternal_CreateExternalSubmissionLocationNotRequired() throws InterruptedException, AWTException {
		
		cspExternal.CSPExternal_CreateExternalSubmissionLocationNotRequired();
		
	}

	@Test(priority = 13)
	public void CSPExternal_CreateExternalSubmissionWithPinaLocation() throws InterruptedException, AWTException {
	
		cspExternal.CSPExternal_CreateExternalSubmissionWithPinaLocation();
		

	}

	
	

}
