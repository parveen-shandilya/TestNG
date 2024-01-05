package TestCases;



import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BrowsersBase.BrowsersInvoked;
import POM.CCPUtility;
import POM.CategoryUtility;

public class Categories extends BrowsersInvoked {
	
	public WebDriver driver;
	ITestResult result;
	CCPUtility ccp;
	CategoryUtility category;
	
	@BeforeClass
	public void setUp() {
		driver = BrowsersInvoked.Setup();
		//extentClass = new ExtentReportClass(driver);
		ccp = new CCPUtility(driver);
		category=new CategoryUtility(driver);
	}

	@AfterClass
	public void closeDriver() {
		BrowsersInvoked.tearDown(driver);
	}
	
	@Test(priority = 0)
	public void LoginAgency() throws InterruptedException {
		category.LoginAgency();

	}
	
	@Test(priority = 1)
	public  void Categories_PreRequisite() throws InterruptedException {
		category.Categories_PreRequisite();
		
	}

	@Test(priority = 2)
	public  void Categories_VerifyDefaultCategory() throws InterruptedException {
		category.Categories_VerifyDefaultCategory();
		
	}

	@Test(priority = 3)
	public  void Categories_UpdateDefaultResolutionTime() throws InterruptedException {
		category.Categories_UpdateDefaultResolutionTime();
		
	}

	@Test(priority = 4)
	public  void Categories_OpenCreateACategoryPopup() throws InterruptedException {
		category.Categories_OpenCreateACategoryPopup();
		
	}

	@Test(priority = 5)
	public  void Categories_VerifyResolutionTimeOnCreateCategoryPopup() throws InterruptedException {
		
		category.Categories_VerifyResolutionTimeOnCreateCategoryPopup();
		
	}

	@Test(priority = 6)
	public  void Categories_AddKeywordsAndCustomFields() throws InterruptedException {
		category.Categories_AddKeywordsAndCustomFields();
		
	}

	@Test(priority = 7)
	public  void Categories_VerifyLinkedEmailTemplates() throws InterruptedException {
		category.Categories_VerifyLinkedEmailTemplates();
		
	}

	@Test(priority = 8)
	public  void Categories_VerifyCategoryCreation() throws InterruptedException {
		category.Categories_VerifyCategoryCreation();
		
	}

	@Test(priority = 9)
	public  void Categories_VerifyNoCategoryCreationOnCancel() throws InterruptedException {
		category.Categories_VerifyNoCategoryCreationOnCancel();
		
	}

	@Test(priority = 10)
	public  void Categories_CantCreateCategoryWithExistingName() throws InterruptedException {
		category.Categories_CantCreateCategoryWithExistingName();
		
	}

	@Test(priority = 11)
	public  void Categories_VerifyUpdatedCategory() throws InterruptedException {
		category.Categories_VerifyUpdatedCategory();
		
	}

	@Test(priority = 12)
	public  void Categories_VerifyAccurateCount() throws InterruptedException {
		
		category.Categories_VerifyAccurateCount();
		
	}




	


}
