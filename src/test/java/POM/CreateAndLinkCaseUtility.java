package POM;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import CommonMethods.CECommonMethods;
import CommonMethods.CRMCommonMethods;
import CommonMethods.Helper;


public class CreateAndLinkCaseUtility extends Helper{
	
	
	public WebDriver driver;
	LoginUtility log;
	CRMCommonMethods crmCommonMethod;
	CECommonMethods ceCommonMethod;

	public CreateAndLinkCaseUtility(WebDriver driver) {
		super(driver);
		this.driver = driver;
		log = new LoginUtility(driver);
		crmCommonMethod=new CRMCommonMethods(driver);
		ceCommonMethod=new CECommonMethods(driver);
	}
	
	
	 public static String descriptionTextCSDP = "(//div[@class='description tile'])/div[2]/div";
	    public static String attachmentsHeaderCSDP = "//div[@id='cs-attachments']//h2/span";
	    public static String addedCustomerCSDP = "//label[text()='Customer Name']/following::a[1]";
	    public static String submissionNumber = "//h2[@class='customer-submission-details__number']";
	    public static String moreButtonCSDP = "//button[text()='More...']";
	    public static String createAndLinkCaseOption = "//li[text()='Create & Link Case']";
	    public static String createACasePage = "//h1[text()='Create A Case']";
	    public static String issueDescriptionCCP = "//textarea[@name='issueDescription']";
	    public static String addedContactCCP = "//div[@class='contact__name-role']//b";
	    public static String attachmentHeaderCCP = "//div[@class='attachment-tile tile']//h2/span";
	    public static String locationSearchField = "//div[@class='location-tile__inputs-container']//input";
	    public static String locationSearchResults = "//div[@class='react-autosuggest__suggestion-element']";
	    public static String createCaseButton = "button.square-btn.space-left.btn.btn-primary";
	    public static String createCasePopup = "//div[text()='Create Case']";
	    public static String createScheduleInspectionButton = "//button[text()='Create & Schedule Inspection']";
	    public static String associatedSubmissionLink = "//label[text()='Associated Submission']/following::a[1]";
	    public static String linkedCaseNumber = "//h2[@class='case-details__case-number']";
	    public static String associatedCaseLink = "//label[text()='Associated Case']/following::a[1]";
	    public static String removeLink = "//a[text()='Remove Link']";

	    public static By DescriptionTextCSDP = By.xpath(descriptionTextCSDP);
	    public static By AttachmentsHeaderCSDP = By.xpath(attachmentsHeaderCSDP);
	    public static By AddedCustomerCSDP = By.xpath(addedCustomerCSDP);
	    public static By SubmissionNumber = By.xpath(submissionNumber);
	    public static By MoreButtonCSDP = By.xpath(moreButtonCSDP);
	    public static By CreateAndLinkCaseOption = By.xpath(createAndLinkCaseOption);
	    public static By CreateACasePage = By.xpath(createACasePage);
	    public static By IssueDescriptionCCP = By.xpath(issueDescriptionCCP);
	    public static By AddedContactCCP = By.xpath(addedContactCCP);
	    public static By AttachmentHeaderCCP = By.xpath(attachmentHeaderCCP);
	    public static By LocationSearchField = By.xpath(locationSearchField);
	    public static By LocationSearchResults = By.xpath(locationSearchResults);
	    public static By CreateCaseButton = By.cssSelector(createCaseButton);
	    public static By CreateCasePopup = By.xpath(createCasePopup);
	    public static By CreateScheduleInspectionButton = By.xpath(createScheduleInspectionButton);
	    public static By AssociatedSubmissionLink = By.xpath(associatedSubmissionLink);
	    public static By LinkedCaseNumber = By.xpath(linkedCaseNumber);
	    public static By AssociatedCaseLink = By.xpath(associatedCaseLink);
	    public static By RemoveLink = By.xpath(removeLink);

	    public static String DescriptionCSDP;
	    public static String AttachmentsCountCSDP;
	    public static String CustomerOnCSDP;
	    public static String SubmissionNumberCSDP;
	    public static String CaseNumberLinked;
	    public static String CCPTitle;
	    public static String AssociatedCase2;
	    public static String AssociatedCase;
	    public static String AssociatedSubmission;
	    public static String CreateCasePopupTitle;
	    public static String IssueDescriptionTextCCP;
	    public static String AttachmentCountCCP;
	    public static String ContactOnCCP;

	    public void LoginAgency() throws InterruptedException {
			log.LoginAgency();

		}
	    
	    
	    public  void CreateAndLinkCase_PreRequisite() throws InterruptedException {
	        CloseOtherTabs();

	        crmCommonMethod.CRM_CreateSubmission("No", "Yes", "Yes", "No", "Yes", "Location Not Required");
	        WaitForCurserRunning(10);
	        WaitUntilVisible(DescriptionTextCSDP);
	        DescriptionCSDP = GetText(DescriptionTextCSDP);
	        AttachmentsCountCSDP = GetText(AttachmentsHeaderCSDP);
	        CustomerOnCSDP = GetText(AddedCustomerCSDP);
	        String SubmissionNumberSplit[] = GetText(SubmissionNumber).split("#");
	        SubmissionNumberCSDP = SubmissionNumberSplit[1];
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertAll();
	    }

	    public  void CreateAndLinkCase_OpenCCPToLinkTheCase() throws InterruptedException {
	        WaitUntilVisible(MoreButtonCSDP);
	        WaitForElementInteractable(MoreButtonCSDP);
	        ClickOn(MoreButtonCSDP);
	        WaitForElementInteractable(CreateAndLinkCaseOption);
	        ClickOn(CreateAndLinkCaseOption);
	        WaitForCurserRunning(7);
	        WaitUntilVisible(CreateACasePage);
	        CCPTitle = GetText(CreateACasePage);
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(CCPTitle.equals("Create A Case"));
			softAssert.assertAll();
	    }

	    public  void CreateAndLinkCase_VerifyAutopopulatedData() throws InterruptedException {
	        WaitUntilVisible(IssueDescriptionCCP);
	        WaitUntilPresent(IssueDescriptionCCP);
	        IssueDescriptionTextCCP = GetText(IssueDescriptionCCP);
	        AttachmentCountCCP = GetText(AttachmentHeaderCCP);
	        ContactOnCCP = GetText(AddedContactCCP);
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(IssueDescriptionTextCCP,DescriptionCSDP);
			softAssert.assertEquals(AttachmentCountCCP,AttachmentsCountCSDP);
			softAssert.assertEquals(ContactOnCCP,CustomerOnCSDP);
			softAssert.assertAll();
	    }

	    public  void CreateAndLinkCase_VerifyLinkedCase() throws InterruptedException {
	    	crmCommonMethod.CE_AddLocation();
	    	crmCommonMethod.CE_AddViolation();
	        WaitUntilVisible(CreateCaseButton);
	        ScrollIntoView(CreateCaseButton);
	        WaitForElementInteractable(CreateCaseButton);
	        movetoElementAndClick(CreateCaseButton);
	        WaitUntilElementInvisible(CreateCaseButton);
	        WaitForCurserRunning(8);
	        if(!ElementIsDisplayed(CreateCasePopup))
	        {
	            ClickByJsExecuter(CreateCaseButton);
	        }
	        
	        
	        WaitUntilVisible(CreateCasePopup);
	        CreateCasePopupTitle = GetText(CreateCasePopup);
	        WaitUntilVisible(CreateScheduleInspectionButton);
	        forcedWaitTime(2);
	        WaitUntilVisible(By.xpath("//div[@class='multi-choice-buttons'] //button[@class='square-btn btn btn-primary']"));
	        WaitUntilPresent(CreateScheduleInspectionButton);
	        WaitForElementInteractable(CreateScheduleInspectionButton);
	        ClickByJsExecuter(CreateScheduleInspectionButton);
	        WaitForCurserRunning(12);
	        WaitUntilVisible(AssociatedSubmissionLink);
	        WaitUntilPresent(AssociatedSubmissionLink);
	        AssociatedSubmission = GetText(AssociatedSubmissionLink);
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(CreateCasePopupTitle.equals("Create Case"));
			softAssert.assertTrue(AssociatedSubmission.equals(SubmissionNumberCSDP));
			softAssert.assertAll();
	    }

	    public  void CreateAndLinkCase_VerifyDirectionToAssociatedSubmission() throws InterruptedException {
	        WaitUntilVisible(LinkedCaseNumber);
	        String CaseNumberSplit[] = GetText(LinkedCaseNumber).split("#");
	        CaseNumberLinked = CaseNumberSplit[1];
	        WaitForElementInteractable(AssociatedSubmissionLink);
	        ClickByJsExecuter(AssociatedSubmissionLink);

	        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
	        WaitForPageLoadTime(3);
	        driver.switchTo().window((String) tabs.get(1));
	        WaitUntilVisible(AssociatedCaseLink);
	        AssociatedCase = GetText(AssociatedCaseLink);
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(AssociatedCase.equals(CaseNumberLinked));
			softAssert.assertAll();
	    }

	    public  void CreateAndLinkCase_VerifyDirectionToAssociatedCase() throws InterruptedException {
	        AssociatedCase2 = GetText(AssociatedCaseLink);
	        WaitUntilVisible(AssociatedCaseLink);
	        WaitForElementInteractable(AssociatedCaseLink);
	        ClickByJsExecuter(AssociatedCaseLink);

	        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
	        WaitForPageLoadTime(3);
	        driver.switchTo().window((String) tabs.get(2));
	        WaitUntilVisible(LinkedCaseNumber);
	        String CaseNumberSplit[] = GetText(LinkedCaseNumber).split("#");
	        CaseNumberLinked = CaseNumberSplit[1];
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(CaseNumberLinked.equals(AssociatedCase2));
			softAssert.assertAll();
	    }

}
