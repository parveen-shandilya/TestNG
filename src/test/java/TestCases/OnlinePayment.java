package TestCases;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BrowsersBase.BrowsersInvoked;
import ExtentReport.ExtentReportClass;
import POM.CCPUtility;
import POM.OnlinePaymentUtility;

public class OnlinePayment extends BrowsersInvoked {
	
	public WebDriver driver;
	//ExtentReportClass extentClass;
	ITestResult result;
	OnlinePaymentUtility op;

	@BeforeClass
	public void setUp() {
		driver = BrowsersInvoked.Setup();
		//extentClass = new ExtentReportClass(driver);
		op = new OnlinePaymentUtility(driver);
	}

//	@AfterClass
//	public void closeDriver() {
//		BrowsersInvoked.tearDown(driver);
//	}
	
	@Test(priority = 0)
	public void LoginAgency() throws InterruptedException {
		op.LoginAgency();

	}

	 @Test(priority = 1)
	   public void OnlinePaymentCasePreRequisite() throws InterruptedException {
	      
	        op.OnlinePaymentCasePreRequisite();
	        
	    }

	    @Test(priority = 2)
	   public void CopyPaymentPortalURLOnCitizenPaymentPortal() throws InterruptedException, IOException, UnsupportedFlavorException {
	       
	        op.CopyPaymentPortalURLOnCitizenPaymentPortal();
	        

	    }

		
		  @Test(priority = 3) public void UserNavigateToPaymentPortalThroughLink()
		  throws InterruptedException{ op.UserNavigateToPaymentPortalThroughLink();
		  
		  }
		  
		  
		  @Test(priority = 4) public void CaseDetailsValidationMessageOnPaymentPortal()
		  throws InterruptedException{
		  op.CaseDetailsValidationMessageOnPaymentPortal();
		  
		  }
		  
		  @Test(priority = 5) public void
		  WrongCaseDetailsValidationMessageOnPaymentPortal() throws
		  InterruptedException{ op.WrongCaseDetailsValidationMessageOnPaymentPortal();
		  
		  }
		  
		  @Test(priority = 6) public void
		  VerifytheReviewOutstandingFeeAndPaymentDatailsPage() throws
		  InterruptedException{
		  op.VerifytheReviewOutstandingFeeAndPaymentDatailsPage();
		  
		  }
		  
		  @Test(priority = 7) public void MakeOnlinePayment() throws
		  InterruptedException { op.MakeOnlinePayment();
		  
		  }
		  
		  
		  @Test(priority = 8) public void UserAbleToMarkPaymentAsVoid() throws
		  InterruptedException { op.UserAbleToMarkPaymentAsVoid();
		  
		  }
		  
		  @Test(priority = 9) public void UserAbleToMakeVoidPayment() throws
		  InterruptedException, IOException, UnsupportedFlavorException {
		  op.UserAbleToMakeVoidPayment();
		  
		  }
		  
		  @Test(priority = 10) public void UserAbleToMakePartialPayment() throws
		  InterruptedException, IOException, UnsupportedFlavorException{
		  op.UserAbleToMakeVoidPayment();
		  
		  }
		 

}
