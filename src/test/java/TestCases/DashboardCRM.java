package TestCases;

import BrowsersBase.BrowsersInvoked;
import ExtentReport.ExtentReportClass;
import POM.CaseAssignmentUtility;
import POM.DashBoardCRMUtility;
import POM.SubmissionAssignmentUtility;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DashboardCRM extends BrowsersInvoked {
	 public WebDriver driver;
	 DashBoardCRMUtility dashCRM ;
	    ExtentReportClass extentClass;
	    ITestResult result;
	    SubmissionAssignmentUtility  subAss;

	    @BeforeClass
	    public void setUp() throws InterruptedException {
	        driver = BrowsersInvoked.Setup();
	        dashCRM = new DashBoardCRMUtility(driver);
	    
	    }

	    @AfterClass
	    public void closeDriver() {
	        BrowsersInvoked.tearDown(driver);
	    }

	    @Test(priority = 0,description="Login Test Case")
		public void LoginTest() throws InterruptedException {
			dashCRM.LoginAgency();
		}
	    
	    
	    @Test(priority = 1)
	    public void Dashboard_VerifyCRMToggleButton() throws InterruptedException {
	        
	        
	    	dashCRM.Dashboard_VerifyCRMToggleButton();
//	        SoftAssert softAssert = new SoftAssert();
//	        softAssert.assertEquals(CRMToggleText, "CRM");
//	        softAssert.assertAll();
	    }

	    @Test(priority = 2)
	    public void Dashboard_VerifyDirectionToCRMDashboard() throws InterruptedException {
	       
	    	dashCRM.Dashboard_VerifyDirectionToCRMDashboard();
	        
//	        SoftAssert softAssert = new SoftAssert();
//	        softAssert.assertTrue(CRMDashBoradHeaders.contains("Open Submissions"), "Does not contains OpenSubmission");
//	        softAssert.assertTrue(CRMDashBoradHeaders.contains("Tasks"), "Does not contains Tasks");
//	        softAssert.assertTrue(CRMDashBoradHeaders.contains("Unread Messages"), "Does not contains Unread Messages");
//	        softAssert.assertAll();
	    }

	    @Test(priority = 3)
	    public void Dashboard_VerifyDirectionToCSLPForAssignedToMELink() throws InterruptedException {
	      
	    	dashCRM.Dashboard_VerifyDirectionToCSLPForAssignedToMELink();
	        
	    }

	    @Test(priority = 4)
	    public void Dashboard_VerifyDirectionToCSLPForMyDepartment() throws InterruptedException {
	    	dashCRM.Dashboard_VerifyDirectionToCSLPForMyDepartment();
	       
	    }

	    @Test(priority = 5)
	    public void Dashboard_VerifyDirectionToCSLPForMyAgency() throws InterruptedException {
	        
	    	dashCRM.Dashboard_VerifyDirectionToCSLPForMyAgency();
	        
	    }

	    @Test(priority = 6)
	    public void Dashboard_VerifyTheCountOfSubmissions() throws InterruptedException {
	       
	    	dashCRM.Dashboard_VerifyTheCountOfSubmissions();
	       
	    }
}
