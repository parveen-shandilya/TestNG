package POM;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import BrowsersBase.BrowsersInvoked;
import CommonMethods.CECommonMethods;
import CommonMethods.CRMCommonMethods;
import CommonMethods.Helper;

public class SubmissionSettingsUtility extends Helper {
	
	public WebDriver driver;
	LoginUtility log;
	public SubmissionSettingsUtility(WebDriver driver) {
		super(driver);
		this.driver = driver;
		log = new LoginUtility(driver);
		
	}
	
	    public static By YesToggle1 = By.xpath("//button[text()='Yes']");
	    public static By NoToggle1 = By.xpath("//button[text()='No']");
	    public static By YesToggle2 = By.xpath("(//button[text()='Yes'])[2]");
	    public static By NoToggle2 = By.xpath("(//button[text()='No'])[2]");
	    public static By DiscardChangesButton = By.xpath("//button[text()='Discard Changes']");
	    public static By SaveChangesButton = By.xpath("//button[text()='Save Changes']");
	    public static By CaseStatus = By.xpath("//h2[@class='case-details__case-status']");
	    public static By SubmissionStatus = By.xpath("//h2[@class='customer-submission-details__status']");

	    public static boolean ToggleButtonState;
	    public static boolean ToggleButtonState2;
	    public static boolean ToggleButtonState3;
	    public static String FetchCaseStatusForYes;
	    public static String FetchSubmissionStatusForYes;
	    public static String FetchCaseStatusForNo;
	    public static String FetchSubmissionStatusForNo;
	    public static boolean ToggleButtonState4;
	    public static boolean PostAnonymouslyPresence;
	    public static boolean PostAnonymouslyAbsence;
	    
	    
	    
	    public void LoginAgency() throws InterruptedException {
			log.LoginAgency();

		}

	    public  void SubmissionSettings_VerifyToggleButtonsState() throws InterruptedException {

	        driver.navigate().to(BrowsersInvoked.URLSubmissionSettings);
	        WaitForCurserRunning(8);
	        WaitUntilVisible(YesToggle1);
	        WaitUntilPresent(YesToggle1);
	        WaitForElementInteractable(YesToggle1);
	        ClickByJsExecuter(YesToggle1);
	        String GetClass = WaitUntilVisibleWE(YesToggle1).getAttribute("class");
	        ToggleButtonState = GetClass.equals("square-btn btn btn-primary");
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(ToggleButtonState);
			softAssert.assertAll();

	    }

	    public  void SubmissionSettings_VerifyDiscardButtonFunctionality() throws InterruptedException {

	        WaitUntilPresent(NoToggle1);
	        WaitForElementInteractable(NoToggle1);
	        ClickByJsExecuter(NoToggle1);
	        WaitForElementInteractable(SaveChangesButton);
	        ClickByJsExecuter(SaveChangesButton);
	        WaitForCurserRunning(4);
	        WaitUntilVisible(YesToggle1);
	        WaitUntilPresent(YesToggle1);
	        WaitForElementInteractable(YesToggle1);
	        ClickByJsExecuter(YesToggle1);
	        WaitForElementInteractable(DiscardChangesButton);
	        ClickByJsExecuter(DiscardChangesButton);
	        WaitForCurserRunning(5);
	        String GetClass = WaitUntilVisibleWE(YesToggle1).getAttribute("class");
	        ToggleButtonState2 = GetClass.equals("square-btn btn btn-primary");
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertFalse(ToggleButtonState2);
			softAssert.assertAll();

	    }

	    public  void SubmissionSettings_VerifyChangesGetSaved() throws InterruptedException {


	        WaitUntilVisible(YesToggle1);
	        WaitForElementInteractable(YesToggle1);
	        ClickByJsExecuter(YesToggle1);
	        WaitForElementInteractable(SaveChangesButton);
	        ClickByJsExecuter(SaveChangesButton);
	        WaitForCurserRunning(5);
	        WaitUntilVisible(YesToggle1);
	        String GetClass = WaitUntilVisibleWE(YesToggle1).getAttribute("class");
	        ToggleButtonState3 = GetClass.equals("square-btn btn btn-primary");
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(ToggleButtonState3);	
			softAssert.assertAll();

	    }

	    public  void SubmissionSettings_VerifyAutomaticClosingOfLinkedSubmission() throws InterruptedException {
	        WaitUntilPresent(YesToggle1);
	        WaitForElementInteractable(YesToggle1);
	        ClickByJsExecuter(YesToggle1);
	        WaitForElementInteractable(SaveChangesButton);
	        ClickByJsExecuter(SaveChangesButton);
	        WaitForCurserRunning(3);
	        CreateAndLinkCaseUtility createLinkCase= new CreateAndLinkCaseUtility(driver);
	        createLinkCase.CreateAndLinkCase_PreRequisite();
	        createLinkCase.CreateAndLinkCase_OpenCCPToLinkTheCase();
	        createLinkCase.CreateAndLinkCase_VerifyLinkedCase();
	        CRMCommonMethods crmMethod = new CRMCommonMethods(driver);
	        crmMethod.CE_CloseCaseOnCDP();
	        WaitForCurserRunning(5);
	        WaitUntilVisible(CaseStatus);
	        FetchCaseStatusForYes = GetText(CaseStatus);
	        ScrollIntoView(CreateAndLinkCaseUtility.AssociatedSubmissionLink);
	        WaitForElementInteractable(CreateAndLinkCaseUtility.AssociatedSubmissionLink);
	        ClickOn(CreateAndLinkCaseUtility.AssociatedSubmissionLink);
	        WaitForCurserRunning(2);

	        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
	        WaitForPageLoadTime(5);
	        driver.switchTo().window((String) tabs.get(1));
	        WaitUntilVisible(SubmissionStatus);
	        FetchSubmissionStatusForYes = GetText(SubmissionStatus);
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(FetchCaseStatusForYes, "Closed");
			softAssert.assertEquals(FetchSubmissionStatusForYes, "Closed");
			softAssert.assertAll();
	    }

	    public  void SubmissionSettings_VerifyCaseDoesntCloseForNoToggle() throws InterruptedException {
	        CloseOtherTabs();
	        driver.get(BrowsersInvoked.URLSubmissionSettings);
	        WaitForCurserRunning(10);
	        WaitUntilVisible(NoToggle1);
	        WaitForElementInteractable(NoToggle1);
	        ClickByJsExecuter(NoToggle1);
	        WaitUntilVisible(SaveChangesButton);
	        WaitForElementInteractable(SaveChangesButton);
	        ClickByJsExecuter(SaveChangesButton);
	        WaitForCurserRunning(4);
	        CreateAndLinkCaseUtility createLinkCase= new CreateAndLinkCaseUtility(driver);
	        createLinkCase.CreateAndLinkCase_PreRequisite();
	        createLinkCase.CreateAndLinkCase_OpenCCPToLinkTheCase();
	        createLinkCase.CreateAndLinkCase_VerifyLinkedCase();
	        CRMCommonMethods crmMethod= new CRMCommonMethods(driver);
	        crmMethod.CE_CloseCaseOnCDP();
	        WaitForCurserRunning(10);
	        WaitUntilVisible(CaseStatus);
	        WaitUntilVisible(CaseStatus);
	        FetchCaseStatusForNo = GetText(CaseStatus);
	        ScrollIntoView(CreateAndLinkCaseUtility.AssociatedSubmissionLink);
	        WaitForElementInteractable(CreateAndLinkCaseUtility.AssociatedSubmissionLink);
	        ClickOn(CreateAndLinkCaseUtility.AssociatedSubmissionLink);
	        WaitForCurserRunning(2);

	        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
	        driver.switchTo().window((String) tabs.get(1));
	        WaitForPageLoadTime(4);
	        WaitUntilVisible(SubmissionStatus);
	        FetchSubmissionStatusForNo = GetText(SubmissionStatus);
	        SubmissionSettings_VerifyToggleButtonsState();
	        WaitUntilVisible(SaveChangesButton);
	        WaitForElementInteractable(SaveChangesButton);
	        ClickByJsExecuter(SaveChangesButton);
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(FetchCaseStatusForNo, "Closed");
			softAssert.assertEquals(FetchSubmissionStatusForNo, "Open");
			softAssert.assertAll();
	    }

	    public  void SubmissionSettings_VerifyselectionOfAnonymousToggles() throws InterruptedException {
	        driver.navigate().to(BrowsersInvoked.URLSubmissionSettings);
	        WaitForCurserRunning(4);

	        WaitUntilVisible(YesToggle2);
	        WaitForElementInteractable(YesToggle2);
	        ClickByJsExecuter(YesToggle2);
	        WaitForElementInteractable(SaveChangesButton);
	        ClickByJsExecuter(SaveChangesButton);
	        WaitForCurserRunning(4);
	        WaitUntilVisible(YesToggle2);
	        WaitUntilPresent(YesToggle2);
	        String GetClass = findElement(YesToggle2).getAttribute("class");
	        ToggleButtonState4 = GetClass.equals("square-btn btn btn-primary");
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(ToggleButtonState4);	
			softAssert.assertAll();

	    }

	    public  void SubmissionSettings_VerifyPostAnonymouslyForYesToggle() throws InterruptedException {
	        WaitForElementInteractable(YesToggle2);
	        ClickOn(YesToggle2);
	        ClickOn(SaveChangesButton);
	        WaitForCurserRunning(8);
	        WaitUntilVisible(CSPInternalUtility.PlusIconToCRM);
	        WaitForElementInteractable(CSPInternalUtility.PlusIconToCRM);
	        ClickOn(CSPInternalUtility.PlusIconToCRM);
	        WaitForElementInteractable(CSPInternalUtility.CustomerSubmissionOption);
	        ClickOn(CSPInternalUtility.CustomerSubmissionOption);
	        WaitForCurserRunning(5);
	        WaitUntilVisible(CSPInternalUtility.PostAnonymouslyCheckbox);
	        WebElement PostAnonymously = WaitUntilVisibleWE(CSPInternalUtility.PostAnonymouslyCheckbox);
	        PostAnonymouslyPresence = PostAnonymously.isDisplayed();
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(PostAnonymouslyPresence);	
			softAssert.assertAll();
	    }

	    public  void SubmissionSettings_VerifyPostAnonymouslyForNoToggle() throws InterruptedException {
	        driver.navigate().to(BrowsersInvoked.URLSubmissionSettings);
	        WaitForCurserRunning(5);
	        WaitUntilVisible(NoToggle2);
	        WaitUntilPresent(NoToggle2);
	        WaitForElementInteractable(NoToggle2);
	        ClickByJsExecuter(NoToggle2);
	        WaitForElementInteractable(SaveChangesButton);
	        ClickByJsExecuter(SaveChangesButton);
	        WaitForCurserRunning(4);
	        WaitUntilVisible(CSPInternalUtility.PlusIconToCRM);
	        WaitForElementInteractable(CSPInternalUtility.PlusIconToCRM);
	        ClickByJsExecuter(CSPInternalUtility.PlusIconToCRM);
	        WaitUntilVisible(CSPInternalUtility.CustomerSubmissionOption);
	        WaitForElementInteractable(CSPInternalUtility.CustomerSubmissionOption);
	        ClickByJsExecuter(CSPInternalUtility.CustomerSubmissionOption);
	        WaitForCurserRunning(8);

	        List<WebElement> PostAnonymously = driver.findElements(CSPInternalUtility.PostAnonymouslyCheckbox);
	        PostAnonymouslyAbsence = PostAnonymously.size() == 0;
	        SubmissionDefaultsetttings();
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(PostAnonymouslyPresence);	
			softAssert.assertAll();
	    }


	    public  void SubmissionDefaultsetttings() throws InterruptedException {
	        driver.navigate().to(BrowsersInvoked.URLSubmissionSettings);
	        WaitForCurserRunning(5);
	        WaitUntilVisible(YesToggle2);
	        WaitForElementInteractable(YesToggle2);
	        ClickByJsExecuter(YesToggle2);
	        WaitUntilPresent(SaveChangesButton);
	        WaitForElementInteractable(SaveChangesButton);
	        ClickByJsExecuter(SaveChangesButton);
	        WaitForCurserRunning(4);


	    }


}
