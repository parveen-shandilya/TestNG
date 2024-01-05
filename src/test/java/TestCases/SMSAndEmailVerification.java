package TestCases;
import BrowsersBase.BrowsersInvoked;

import java.awt.AWTException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

import javax.mail.MessagingException;

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
import POM.CreateCRMUserUtility;
import POM.ForcedAbatementUtility;
import POM.PerformInspectionUtility;
import POM.ReopenCasesUtility;
import POM.SmsAndEmailVerificationUtility;

public class SMSAndEmailVerification extends BrowsersInvoked{
	
	public WebDriver driver;
	SmsAndEmailVerificationUtility smsMail ;
	ExtentReportClass extentClass;
	ITestResult result;
	
	@BeforeClass
	public void setUp() {
		System.gc();
		driver = BrowsersInvoked.Setup();
		smsMail = new SmsAndEmailVerificationUtility(driver);
		
		
		
	}
	
	@AfterClass
	public void closeDriver() {
		BrowsersInvoked.tearDown(driver);
	}
	
	
	
	@Test(priority =0)
	public void LoginAgency() throws InterruptedException {
		smsMail.LoginAgency();

	}
	
	
	
	@Test(priority = 1)
	public void ComposeMessage() throws InterruptedException {
		smsMail.ComposeMessage();
	}

	@Test(priority = 2)
	public void ComposeMail() throws InterruptedException, AWTException, MessagingException, IOException {
		smsMail.ComposeMail();
	}
	
	
//	@Test(priority = 3,enabled = false)
//	public void VerifyMailReceivedByAssignee() throws InterruptedException, MessagingException, IOException {
//		smsMail.VerifyMailReceivedByAssignee();
//	}
//
//	@Test(priority = 4,enabled = false)
//	public void VerifyMailReceivedByCollaborator() throws InterruptedException, MessagingException, IOException, AWTException {
//		smsMail.VerifyMailReceivedByCollaborator();
//	}
//	

	
	

}
