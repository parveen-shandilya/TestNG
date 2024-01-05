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
import POM.CreateCRMUserUtility;
import POM.ForcedAbatementUtility;
import POM.PerformInspectionUtility;
import POM.ReopenCasesUtility;

public class CreateCRMUser extends BrowsersInvoked{
	
	public WebDriver driver;
	CreateCRMUserUtility crmUser ;
	ExtentReportClass extentClass;
	ITestResult result;
	
	@BeforeClass
	public void setUp() {
		System.gc();
		driver = BrowsersInvoked.Setup();
		crmUser = new CreateCRMUserUtility(driver);
		
		
		
	}
	
	@AfterClass
	public void closeDriver() {
		BrowsersInvoked.tearDown(driver);
	}
	
	
	
	@Test(priority =0)
	public void LoginAgency() throws InterruptedException {
		crmUser.LoginAgency();

	}
	
	
	
	@Test(priority = 1)
	public void CreateCRMUser_CreateStandardUser() throws InterruptedException {
		
		crmUser.CreateCRMUser_CreateStandardUser();
		
		
	}

	@Test(priority = 2)
	public void CreateCRMUser_CreateProductAdminUser() throws InterruptedException {
		
		crmUser.CreateCRMUser_CreateProductAdminUser();
	
	}

	@Test(priority = 3)
	public void CreateCRMUser_UpdateCEOnlyUserToCRMOnly() throws InterruptedException {
		
		crmUser.CreateCRMUser_UpdateCEOnlyUserToCRMOnly();
		
	}

	@Test(priority = 4)
	public void CreateCRMUser_VerifyCRMProductAccessToCRMUser() throws InterruptedException, AWTException {
		
		crmUser.CreateCRMUser_VerifyCRMProductAccessToCRMUser();
		
	}

	@Test(priority = 5)
	public void CreateCRMUser_VerifyNoCEAccessToCRMOnlyUser() throws InterruptedException, AWTException {
		
		crmUser.CreateCRMUser_VerifyNoCEAccessToCRMOnlyUser();
		
	}
	
	
	

	
	

}
