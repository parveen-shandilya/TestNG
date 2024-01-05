package POM;

import BrowsersBase.BrowsersInvoked;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import CommonMethods.CECommonMethods;
import CommonMethods.CRMCommonMethods;
import CommonMethods.Helper;
import CommonMethods.PropertiesUtils;
import CommonMethods.RandomStrings;
public class CSDPUtility extends Helper {

	public WebDriver driver;
	LoginUtility log;
	CRMCommonMethods crmCommonMethod;
	CECommonMethods ceCommonMethod;

	public CSDPUtility(WebDriver driver) {
		super(driver);
		this.driver = driver;
		log = new LoginUtility(driver);
		crmCommonMethod=new CRMCommonMethods(driver);
		ceCommonMethod=new CECommonMethods(driver);
	}


	  public static String changeLinkDueDate = "//a[text()='Change']";
	    public static String closeSDPage = "div.customer-submission-details__close-icon img";
	    public static String changeDueByPopup = "//div[text()='Change Due By']";
	    public static String reasonField = "//textarea[@name='reason']";
	    public static String saveButton = "//button[text()='Save']";
	    public static String cancelButton = "//button[text()='Cancel']";
	    public static String validationMsgReason = "//textarea[@name='reason']/following::span";
	    public static String dueByDatepicker = "//input[@name='dueBy']";
	    public static String updateDueDate = "//td[@class='rdtDay rdtActive']/following::td[1]";
	    public static String updateDueDates = "//td[@class='rdtDay rdtActive rdtToday']/following::td[1]";
	    public static String changedDueDate = "//label[text()='Due By']/following::label[1]";
	    public static String internalNotesContent = "//div[@class='internal-note-tile-content__content']";
	    public static String internalNotesContent2 = "(//div[@class='internal-note-tile-content__content'])[2]";
	    public static String escalateIssueToggle = "(//div[@class='react-toggle-thumb'])[1]";
	    public static String customerNameLink = "//label[text()='Customer Name']/following::a[1]";
	    public static String coDPHeader = "//div[@class='contact-details__header__main']/h2[1]";
	    public static String closeIconCoDP = "//div[@class='contact-details__header__close-icon']/img";
	    public static String tagsLink = "//span[@class='clipped-text']/a";
	    public static String cSLPHeader = "(//label[@class='dropdown__selector__label'])[1]";
	    public static String imageIconCSDP = "//div[@id='cs-attachments']//button";
	    public static String internalNotesIcon = "//div[@id='cs-notes']//button[@class='compose-note-icon btn btn-primary']";
	    public static String addInternalNotePopup = "//div[text()='Add Internal Comment']";
	    public static String createNoteButton = "//button[text()='Create Comment']";
	    public static String internalNoteValidation = "//div[@class='notes']//span";
	    public static String internalNoteField = "//textarea[@name='internalComment']";
	    public static String editNoteIcon = "//button[@class='edit-btn internal-note-tile-content__actions__edit btn btn-primary']";
	    public static String editInternalNotePopup = "//div[text()='Edit Internal Comment']";

	    public static By ChangeLinkDueDate = By.xpath(changeLinkDueDate);
	    public static By CloseSDPage = By.cssSelector(closeSDPage);
	    public static By ChangeDueByPopup = By.xpath(changeDueByPopup);
	    public static By ReasonField = By.xpath(reasonField);
	    public static By SaveButton = By.xpath(saveButton);
	    public static By ValidationMsgReason = By.xpath(validationMsgReason);
	    public static By DueByDatepicker = By.xpath(dueByDatepicker);
	    public static By UpdateDueDate = By.xpath(updateDueDate);
	    public static By UpdateDueDates = By.xpath(updateDueDates);
	    public static By ChangedDueDate = By.xpath(changedDueDate);
	    public static By InternalNotesContent = By.xpath(internalNotesContent);
	    public static By InternalNotesContent2 = By.xpath(internalNotesContent2);
	    public static By EscalateIssueToggle = By.xpath(escalateIssueToggle);
	    public static By CustomerNameLink = By.xpath(customerNameLink);
	    public static By CoDPHeader = By.xpath(coDPHeader);
	    public static By CloseIconCoDP = By.xpath(closeIconCoDP);
	    public static By TagsLink = By.xpath(tagsLink);
	    public static By CSLPHeader = By.xpath(cSLPHeader);
	    public static By ImageIconCSDP = By.xpath(imageIconCSDP);
	    public static By InternalNotesIcon = By.xpath(internalNotesIcon);
	    public static By AddInternalNotePopup = By.xpath(addInternalNotePopup);
	    public static By CreateNoteButton = By.xpath(createNoteButton);
	    public static By InternalNoteValidation = By.xpath(internalNoteValidation);
	    public static By InternalNoteField = By.xpath(internalNoteField);
	    public static By EditNoteIcon = By.xpath(editNoteIcon);
	    public static By EditInternalNotePopup = By.xpath(editInternalNotePopup);

	    public static By AddedCustomerName = By.xpath("//label[text()='Customer Name']/following-sibling::label");
	    public static By PrintButton = By.xpath("//button[text()='Print']");
	    public static By PrintSettingsPopup = By.xpath("//div[text()='Print Settings']");
	    public static By PrintButtonPSP = By.xpath("//div[text()='Print Settings']/following::button[text()='Print']");
	    public static By PrintPageSubmissionID = By.xpath("//h2[@class='customer-submission-print-details__number']");
	    public static By CSDPSubmissionID = By.xpath("//h2[@class='customer-submission-details__number']");
	    public static By ManageTagsButton = By.xpath("//button[text()='Manage Tags']");
	    public static By ManageTagsPopup = By.xpath("//div[text()='Manage Tags']");
	    public static By EnterTagsField = By.xpath("//input[@name='tags-input']");
	    public static By SaveButtonTags = By.xpath("//input[@name='tags-input']/following::button[2]");
	    public static By TagsSuccessMessage = By.xpath("//div[@class='success-custom-message']/span");
	    public static By TasksIcon = By.xpath("//p[text()='Tasks']/..//button");
	    public static By AddATaskPopup = By.xpath("//div[text()='Add a Task']");
	    public static By TaskNameField = By.xpath("//input[@name='name']");
	    public static By TaskAssigneeDropdown = By.xpath("//label[@for='assigneeId']/following::span[1]");
	    public static By TaskAssigneeOption = By.xpath("//label[@for='assigneeId']/following::ul/li[1]");
	    public static By AddTaskButton = By.xpath("//button[text()='Add Task']");
	    public static By AddedTaskName = By.xpath("//div[@class='tasks-table']//div[@class='rt-td'][2]/div");
	    public static By EditTaskIcon = By.xpath("//button[@class='edit-btn edit-task-content__actions__edit space-right btn btn-primary']");
	    public static By EditATaskPopup = By.xpath("//div[text()='Edit a Task']");
	    public static By SaveButtonTask = By.xpath("//div[text()='Edit a Task']/following::button[2]");
	    public static By TaskSectionIcon = By.xpath("//div[@class='cs-tasks__header']//button");
	    public static By DeleteTaskIcon = By.xpath("//button[@class='delete-btn space-right btn btn-primary']");
	    public static By TasksCountAtHeader = By.xpath("//div[@class='cs-tasks__header']/h2");
	    public static By TaskCoulumns = By.xpath("//div[@class='rt-tr -odd']");
	    public static By MoreButtonCSDP = By.xpath("//button[text()='More...']");
	    public static By CloseSubmissionOption = By.xpath("//li[text()='Close Submission']");
	    public static By YesCloseButton = By.xpath("//button[text()='Yes, Close']");
	    public static By SubmissionStatus = By.xpath("//h2[@class='customer-submission-details__status']");
	    public static By ReopenSubmissionOption = By.xpath("//li[text()='Reopen Submission']");
	    public static By YesReopenButton = By.xpath("//button[text()='Yes, Reopen']");
	    public static By YesDeleteButton = By.xpath("//button[text()='Yes, Delete']");
	    public static By PossibleDuplicateSubmissionsPopup = By.xpath("//h2[text()='Possible Duplicate Submissions']");
	    public static By SubmitAnywayButton = By.xpath("//button[text()='Submit Anyway']");
	    public static By SubmissionAssingee = By.xpath("(//div[@class='dropdown__selector__selected']//label)[4]");
	    public static By SubmissionAssingeeOpts = By.xpath("//div[@id='assignee']//ul[@class='dropdown__options--single']//li[@class='option']");
	    public static By submissionAssigneeSearch = By.xpath("//div[@id='assignee']//input[@name='query'][@placeholder='Search...']");
	    public static By SubmissionAssingeeOpt = By.cssSelector("div#assignee ul li");
	    public static By SubmissionCollaborator = By.xpath("(//div[@class='dropdown__selector__selected']//label)[2]");
	    public static By CollaboratorSearch = By.xpath("//div[@id='collaboratorIds']//input[@name='query'][@placeholder='Search...']");
	    public static By CollaboratorOpt = By.cssSelector("div#collaboratorIds ul li");
	    public static By collaboratorOption1 = By.xpath("(//div[@id='collaboratorIds']//ul[@class='dropdown__options--single']//li[@class='option'])[1]");
	    public static By emailTile = By.xpath("//div[@id='cs-emails']//h2");
	    public static By emailMoreLnkTxt = By.xpath("(//div[@class='email-item__body']//a[@class='clip-text'][text()='more'])[1]");
	    public static By selectEmailTempDropdown = By.xpath("(//div[@class='email-item__content__info'])[2]");
	    public static By emailBodyParaGraph = By.xpath("//div[@class='email-item__body']//span[@class='clipped-text']//p");
	    public static By mailSubject = By.xpath("//input[@name='subject']");
	    public static By sendmailReply = By.xpath("//div[@class='email-form__footer__form-actions']//button[text()='Send']");
	    public static By mailReplyFrame = By.xpath("//iframe[@id='email-tile-html-editor-form_ifr']");
	    public static By mailreplyMsz = By.xpath("//body[@id='tinymce']//p");
	    public static By mailedSubject = By.xpath("(//div[@class='email-item__content']//h4)[2]");
	    public static By attachmentDefaultbtn = By.xpath("(//button[@class='attach-btn btn btn-primary'])[1]");
	    public static By attachmentCount = By.xpath("//div[@class='icon-count attachment-count']");
	    public static By emailLessLnkTxt = By.xpath("(//div[@class='email-item__body']//a[@class='clip-text'][contains(text(),'less')])[1]");


	    public static String getYopMailSubject(int index){
	        return "(//div[@class='m'])["+index+"]//div[@class='lms']";
	    }



	    public static String RandomReason;
	    public static String Characters500 = PropertiesUtils.getPropertyValue("Characters500");
	    ;
	    public static String RandomReason2;
	    public static String RandomTaskName;
	    public static String StatusOfSubmission;
	    public static String PopupTitleChangeDueBy;
	    public static String ReasonValidationMsg;
	    public static String ValidationMsgMaxChar;
	    public static String InternalNotes;
	    public static String ValidationMsgCharLimit;
	    public static boolean EscalateToggleStatus;
	    public static String InternalNotes2;
	    public static String CustomerName;
	    public static String CustomerDetailHeader;
	    public static boolean CheckImageSize;
	    public static String InternalNotePopupTitle;
	    public static String EditNotePopupTitle;
	    public static String EditedNotes;
	    public static String PrintSettingsPopupTitle;
	    public static String PrintPageSubmissionHeader;
	    public static String CSDPSubmissionHeader;
	    public static String ManageTagsPopupTitle;
	    public static String SuccessMessageTags;
	    public static String ExpectedSuccessMsg;
	    public static String AddTaskPopupTitle;
	    public static String AddedTaskText;
	    public static String EditTaskPopupTitle;
	    public static String AddedTaskText2;
	    public static boolean TasksCount;
	    public static String ClosedStatusOfSubmission;
	    public static String OpenedStatusOfSubmission;
	    public static String RandomEditedNote;
	    public static String AgencyLoggedInUserName;




	    public void LoginAgency() throws InterruptedException {
			log.LoginAgency();

		}

	    public  String getSelectedCollaboratorXPath(int index) {
	        return "(//div[@id='collaboratorIds']//ul[@class='dropdown__options--single']//li[@class='option selected'])["+index+"]";
	    }

	    public  void CSDP_OpenCSDPAfterSubmissionCreation() throws InterruptedException {
	        WaitUntilVisible(LoginAgencyUtility.AgencyLoggedInUsername);
	        AgencyLoggedInUserName = GetText(LoginAgencyUtility.AgencyLoggedInUsername);
	        crmCommonMethod.CRM_CreateSubmission("No", "Yes", "Yes", "Yes", "Yes", "Location Required");
	        WaitUntilVisible(CSPInternalUtility.SubmisionStatus);
	        StatusOfSubmission = GetText(CSPInternalUtility.SubmisionStatus);
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(StatusOfSubmission.equals("Open"));
			softAssert.assertAll();
	    }

	    public  void CSDP_ChangeDueByDate() throws InterruptedException {
	        WaitForElementInteractable(ChangeLinkDueDate);
	        ClickOn(ChangeLinkDueDate);
	        WaitUntilVisible(ChangeDueByPopup);
	        PopupTitleChangeDueBy = GetText(ChangeDueByPopup);
	        ClickOn(SaveButton);
	        WaitUntilVisible(ValidationMsgReason);
	        ReasonValidationMsg = GetText(ValidationMsgReason);
	        SendKeys(ReasonField, Characters500);
	        ClickOn(SaveButton);
	        WaitUntilVisible(ValidationMsgReason);
	        ValidationMsgMaxChar = GetText(ValidationMsgReason);
	        WebElement ReasonFieldWE = WaitUntilVisibleWE(ReasonField);
	        ReasonFieldWE.clear();
	        RandomReason = RandomStrings.RequiredString(50);
	        SendKeys(ReasonField, RandomReason);
	        ClickOn(DueByDatepicker);
	        WaitForElementInteractable(UpdateDueDate);
	        ClickOn(UpdateDueDate);
	        WaitForElementInteractable(SaveButton);
	        ClickOn(SaveButton);
	        WaitForCurserRunning(2);
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(PopupTitleChangeDueBy.equals("Change Due By"));
			softAssert.assertTrue(ReasonValidationMsg.equals("The Reason is required."));
			softAssert.assertTrue(ValidationMsgMaxChar.equals("Min 1 and Max 500 characters limit."));
			softAssert.assertAll();
	    }

	    public  void CSDP_VerifyInternalNotesContent() throws InterruptedException {
	        InternalNotes = GetText(InternalNotesContent);
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(InternalNotes.equals(RandomReason));
			softAssert.assertAll();
	    }

	    public  void CSDP_VerifyEscalatedIssue() throws InterruptedException {
	        ClickOn(EscalateIssueToggle);
	        RandomReason2 = RandomStrings.RequiredString(50);
	        SendKeys(ReasonField, Characters500);
	        ClickOn(SaveButton);
	        WaitUntilVisible(ValidationMsgReason);
	        ValidationMsgCharLimit = GetText(ValidationMsgReason);
	        WebElement ReasonFieldWE = WaitUntilVisibleWE(ReasonField);
	        ReasonFieldWE.clear();
	        SendKeys(ReasonField, RandomReason2);
	        ClickOn(SaveButton);
	        WaitUntilElementInvisible(SaveButton);
	        WaitForCurserRunning(2);
	        WaitUntilVisible(EscalateIssueToggle);
	        WebElement EscalateToggle = WaitUntilVisibleWE(EscalateIssueToggle);
	        EscalateToggleStatus = EscalateToggle.isEnabled();
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(ValidationMsgCharLimit.equals("500 character limit."));
			softAssert.assertTrue(EscalateToggleStatus);
			softAssert.assertAll();
	    }

	    public  void CSDP_VerifyReasonWithInternalNotes() throws InterruptedException {
	         WaitUntilVisible(InternalNotesContent2);
	        InternalNotes2 = GetText(InternalNotesContent2);
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(InternalNotes2.equals(RandomReason2));
			softAssert.assertAll();
	    }

	    public  void CSDP_VerifyNoEscalationOnCancel() throws InterruptedException {
	        WaitUntilVisible(EscalateIssueToggle);
	        WaitForElementInteractable(EscalateIssueToggle);
	        ClickByJsExecuter(EscalateIssueToggle);
	        WaitForElementInteractable(ReasonField);
	        SendKeys(ReasonField, RandomReason2);
	        WaitUntilVisible(CSPInternalUtility.CancelButton);
	        forcedWaitTime(3);
	        WaitForElementInteractable(CSPInternalUtility.CancelButton);
	        ClickOn(CSPInternalUtility.CancelButton);
	        WaitUntilElementInvisible(CSPInternalUtility.CancelButton);
	        WebElement EscalateToggle = WaitUntilVisibleWE(EscalateIssueToggle);
	        EscalateToggleStatus = EscalateToggle.isEnabled();
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(EscalateToggleStatus);
			softAssert.assertAll();
	    }

	    public  void CSDP_VerifyDirectionToCoDP() throws InterruptedException {
	        WaitUntilVisible(CustomerNameLink);
	        CustomerName = GetText(CustomerNameLink);
	        WaitUntilVisible(CustomerNameLink);
	        WaitForElementInteractable(CustomerNameLink);
	        ClickByJsExecuter(CustomerNameLink);
	        WaitForCurserRunning(5);
	        WaitUntilVisible(CoDPHeader);
	        CustomerDetailHeader = GetText(CoDPHeader);
	        WaitUntilVisible(CloseIconCoDP);
	        WaitForElementInteractable(CloseIconCoDP);
	        ClickOn(CloseIconCoDP);
	        WaitForCurserRunning(5);
	        WaitUntilVisible(TagsLink);
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(CustomerName.equals(CustomerDetailHeader));
			softAssert.assertAll();

	    }

	    public  void CSDP_VerifyDirectionToCSLPFromTags() throws InterruptedException {
	        WaitUntilVisible(TagsLink);
	        WaitForElementInteractable(TagsLink);
	        ClickByJsExecuter(TagsLink);
	        WaitForCurserRunning(2);
	        WaitUntilVisible(CSLPHeader);
	        CustomerDetailHeader = GetText(CSLPHeader);
	        driver.navigate().back();
	        WaitForCurserRunning(2);
	    	SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(CustomerDetailHeader.equals("Customer Submissions:"));
			softAssert.assertAll();
	    }

	    public  void CSDP_VerifyAddedAttachments() throws InterruptedException {
	        WaitUntilVisible(ImageIconCSDP);
	        WaitForElementInteractable(ImageIconCSDP);
	        ClickByJsExecuter(ImageIconCSDP);
	        forcedWaitTime(2);
	        WaitUntilVisible(By.cssSelector("div.modal-header > button[aria-label='Close']"));
	        WebElement UploadFile2 = driver.findElement(By.xpath("//input[@type='file']"));
	        UploadFile2.sendKeys(ceCommonMethod.SetTestDataFilePath("cow.jpg"));
	        WaitForCurserRunning(3);
	        WaitForElementInteractable(CSPInternalUtility.AddButton);
	        forcedWaitTime(2);
	        ClickOn(CSPInternalUtility.AddButton);
	        List<WebElement> CountAttachments = driver.findElements(CSPInternalUtility.ImageThumb);
	        int ImgSize = CountAttachments.size();
	        CheckImageSize = ImgSize >= 1;
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(CheckImageSize);
			softAssert.assertAll();
	    }

	    public  void CSDP_VerifyAddedInternalNote() throws InterruptedException {
	        WaitUntilVisible(InternalNotesIcon);
	        WaitUntilPresent(InternalNotesIcon);
	        ScrollIntoView(InternalNotesIcon);
	        WaitForElementInteractable(InternalNotesIcon);
	        ClickByJsExecuter(InternalNotesIcon);
	        WaitUntilVisible(AddInternalNotePopup);
	        InternalNotePopupTitle = GetText(AddInternalNotePopup);
	        String AllChar5000 = "abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc def ghi jkl mno pqrs tuv wxyz ABC DEF GHI JKL MNO PQRS TUV WXYZ !\"§ $%& /() =?* '<> #|; ²³~ @`´ ©«» ¤¼× {} abc d. ";
	        SendKeys(InternalNoteField, AllChar5000);
	        WaitForElementInteractable(CreateNoteButton);
	        ClickByJsExecuter(CreateNoteButton);
	        WaitForCurserRunning(5);
	        WaitUntilVisible(InternalNoteField);
	        WebElement InternalNoteFieldWE = findElement(InternalNoteField);
	        WaitForElementInteractable(InternalNoteField);
	        InternalNoteFieldWE.clear();
	        String RandomNote = "Internal Note " + RandomStrings.RequiredString(40);
	        WaitForElementInteractable(InternalNoteField);
	        SendKeys(InternalNoteField, RandomNote);
	        ClickOn(CreateNoteButton);
	        WaitForCurserRunning(7);
	        WaitUntilVisible(EditNoteIcon);
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(InternalNotePopupTitle.equals("Add Internal Comment"));
			softAssert.assertAll();
	    }

	    public  void CSDP_VerifyUpdatedNote() throws InterruptedException {


	        WaitUntilVisible(EditNoteIcon);
	        WaitForElementInteractable(EditNoteIcon);
	        ClickOn(EditNoteIcon);

	        WaitUntilVisible(EditInternalNotePopup);
	        WaitForElementInteractable(InternalNoteField);
	        EditNotePopupTitle = GetText(EditInternalNotePopup);
	        WebElement InternalNoteFieldWE = WaitUntilVisibleWE(InternalNoteField);
	        InternalNoteFieldWE.clear();
	        String RandomNote = "***Edited*** Internal Note " + RandomStrings.RequiredString(5).trim();
	        RandomEditedNote = RandomNote;
	        SendKeys(InternalNoteField, RandomNote);
	        WaitForElementInteractable(SaveButton);
	        WaitForElementInteractable(SaveButton);
	        ClickByJsExecuter(SaveButton);
	        WaitUntilElementInvisible(SaveButton);
	        WaitForCurserRunning(5);
	        WaitUntilVisible(InternalNotesContent);
	        WaitUntilPresent(InternalNotesContent);
	        ScrollIntoView(InternalNotesContent);
	        EditedNotes = GetText(InternalNotesContent);
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(EditNotePopupTitle,"Edit Internal Comment");
			softAssert.assertEquals(EditedNotes,RandomEditedNote);
			softAssert.assertAll();
	    }

	    public  void CSDP_VerifyUserIsAbleToPrintCSD() throws InterruptedException {
	        CSDPSubmissionHeader = GetText(CSDPSubmissionID);
	        WaitUntilVisible(PrintButton);
	        WaitUntilPresent(PrintButton);
	        WaitForElementInteractable(PrintButton);
	        ClickByJsExecuter(PrintButton);
	        WaitUntilVisible(PrintSettingsPopup);
	        WaitForElementInteractable(PrintSettingsPopup);
	        PrintSettingsPopupTitle = GetText(PrintSettingsPopup);
	        WaitForElementInteractable(PrintButtonPSP);
	        moveToElement(PrintButtonPSP);
	        ClickByJsExecuter(PrintButtonPSP);
	        WaitForCurserRunning(4);
	        forcedWaitTime(4);
	        String currentWindow = driver.getWindowHandle();
	        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
	        driver.switchTo().window(tabs.get(1));
	        WaitForPageLoadTime(3);
	        WaitUntilVisible(PrintPageSubmissionID);
	        PrintPageSubmissionHeader = GetText(PrintPageSubmissionID);
	        driver.switchTo().window(currentWindow);
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(PrintSettingsPopupTitle.equals("Print Settings"));
			softAssert.assertTrue(PrintPageSubmissionHeader.equals(CSDPSubmissionHeader));
			softAssert.assertAll();
	    }

	    public  void CSDP_VerifyMultipleTagsAddition() throws InterruptedException {
	        WaitForElementInteractable(ManageTagsButton);
	        ClickByJsExecuter(ManageTagsButton);
	        WaitUntilVisible(ManageTagsPopup);

	        ManageTagsPopupTitle = GetText(ManageTagsPopup);
	        for (int i = 0; i < 3; i++) {
	            String RandomTags = RandomStrings.RequiredCharacters(4) + ",";
	            SendKeys(EnterTagsField, RandomTags);
	        }
	        ClickByJsExecuter(SaveButtonTags);
	        WaitForCurserRunning(2);
	        waitForPresenceandVisiblity(TagsSuccessMessage);
	        SuccessMessageTags = getTextByJSExecutor(TagsSuccessMessage);
	        WaitUntilInvisible(TagsSuccessMessage);


	        ExpectedSuccessMsg = "Tags saved successfully";
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(ManageTagsPopupTitle.equals("Manage Tags"));
			softAssert.assertEquals(SuccessMessageTags, ExpectedSuccessMsg);
			softAssert.assertAll();
	    }

	    public  void CSDP_VerifyAdditionOfTasks() throws InterruptedException {
	        scrolltoPageTop();
	        WaitUntilVisible(TasksIcon);
	        ClickOn(TasksIcon);
	        WaitUntilVisible(AddATaskPopup);
	        AddTaskPopupTitle = GetText(AddATaskPopup);
	        RandomTaskName = RandomStrings.RequiredCharacters(8);
	        SendKeys(TaskNameField, RandomTaskName);
	        ClickOn(TaskAssigneeDropdown);
	        WaitUntilVisible(TaskAssigneeOption);
	        WaitForElementInteractable(TaskAssigneeOption);
	        ClickOn(TaskAssigneeOption);
	        WaitUntilVisible(AddTaskButton);
	        ClickOn(AddTaskButton);
	        WaitForCurserRunning(2);
	        WaitUntilVisible(AddedTaskName);
	        AddedTaskText = GetText(AddedTaskName);
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(AddTaskPopupTitle.equals("Add a Task"));
			softAssert.assertEquals(AddedTaskText, RandomTaskName);
			softAssert.assertAll();
	    }

	    public  void CSDP_VerifyUpdationAndDeletionOfTasks() throws InterruptedException {
	    	scrolltoUpCustom(0,driver.findElement(EditTaskIcon).getRect().getY()+50);
	    	ScrollIntoView(EditTaskIcon);
	        WaitForElementInteractable(EditTaskIcon);
	        ClickOn(EditTaskIcon);
	        EditTaskPopupTitle = GetText(EditATaskPopup);
	        WaitForElementInteractable(TaskNameField);
	        SendKeys(TaskNameField, " Edited");
	        WaitForElementInteractable(SaveButtonTask);
	        ClickOn(SaveButtonTask);
	        WaitForCurserRunning(4);

	        WaitForElementInteractable(TaskSectionIcon);
	        WaitUntilVisible(AddedTaskName);
	        AddedTaskText2 = GetText(AddedTaskName);
	        ClickOn(TaskSectionIcon);
	        SendKeys(TaskNameField, "TaskToDelete");
	        ClickOn(TaskAssigneeDropdown);
	        ClickOn(TaskAssigneeOption);
	        WaitUntilVisible(AddTaskButton);
	        ClickOn(AddTaskButton);
	        WaitUntilVisible(DeleteTaskIcon);
	        WaitUntilPresent(DeleteTaskIcon);
	        WaitForElementInteractable(DeleteTaskIcon);
	        ClickByJsExecuter(DeleteTaskIcon);

	        WaitUntilVisible(YesDeleteButton);
	        WaitUntilPresent(YesDeleteButton);
	        WaitForElementInteractable(YesDeleteButton);
	        ClickByJsExecuter(YesDeleteButton);
	        WaitUntilElementInvisible(YesDeleteButton);
	        waitForPresenceandVisiblity(TaskCoulumns);
	        List<WebElement> CountTasks = driver.findElements(TaskCoulumns);
	        TasksCount = CountTasks.size() == 1;
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(EditTaskPopupTitle.equals("Edit a Task"));
			softAssert.assertTrue(TasksCount);
			softAssert.assertAll();
	    }

	    public  void CSDP_VerifyClosedSubmission() throws InterruptedException {
	        WaitUntilVisible(MoreButtonCSDP);
	        WaitForElementInteractable(MoreButtonCSDP);
	        ScrollIntoView(MoreButtonCSDP);
	        ClickOn(MoreButtonCSDP);

	        WaitForElementInteractable(CloseSubmissionOption);
	        ClickOn(CloseSubmissionOption);
	        WaitUntilVisible(YesCloseButton);
	        WaitUntilPresent(YesCloseButton);
	        ClickOn(YesCloseButton);
	        WaitUntilElementInvisible(YesCloseButton);
	        WaitForCurserRunning(2);
	        WaitUntilVisible(SubmissionStatus);
	        ClosedStatusOfSubmission = GetText(SubmissionStatus);
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(AddedTaskText2, RandomTaskName + " Edited");
			softAssert.assertTrue(ClosedStatusOfSubmission.equals("Closed"));
			softAssert.assertAll();
	    }

	    public  void CSDP_VerifyReopenedSubmission() throws InterruptedException {
	        WaitUntilVisible(MoreButtonCSDP);
	        WaitUntilPresent(MoreButtonCSDP);
	        WaitForElementInteractable(MoreButtonCSDP);
	        ClickOn(MoreButtonCSDP);
	        WaitForElementInteractable(ReopenSubmissionOption);
	        ClickOn(ReopenSubmissionOption);
	        WaitUntilVisible(YesReopenButton);
	        ClickOn(YesReopenButton);
	        WaitUntilElementInvisible(YesReopenButton);
	        WaitForCurserRunning(4);
	        WaitUntilVisible(SubmissionStatus);
	        OpenedStatusOfSubmission = GetText(SubmissionStatus);
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(OpenedStatusOfSubmission.equals("Open"));
			softAssert.assertAll();
	    }


	    public  boolean DefaultAssingee;
	    public  boolean AssingeeOptions;
	    public  boolean readOnlyUser;
	    public  boolean UpdatedAssingee;

	    public  void CSDP_VerifySubmissionAssignee() throws InterruptedException {
	        WaitUntilVisible(SubmissionAssingee);
	        ScrollIntoView(SubmissionAssingee);
	        String expectedDefaultAssingee = GetText(SubmissionAssingee);
	        DefaultAssingee = expectedDefaultAssingee.equalsIgnoreCase("Unassigned");
	        WaitForElementInteractable(SubmissionAssingee);
	        ClickOn(SubmissionAssingee);
	        WaitUntilVisible(SubmissionAssingeeOpts);
	        AssingeeOptions = ElementIsDisplayed(SubmissionAssingeeOpts);
	        List<String> assineeOptionVal = new ArrayList<>();
	        driver.findElements(SubmissionAssingeeOpts).stream().forEach(x -> assineeOptionVal.add(x.getText()));
	        readOnlyUser = assineeOptionVal.contains("Read Only User");
	        WaitUntilVisible(submissionAssigneeSearch);
	        WaitForElementInteractable(submissionAssigneeSearch);

	        SendKeys(submissionAssigneeSearch, AgencyLoggedInUserName);
	        WaitUntilVisible(SubmissionAssingeeOpt);
	        WaitForElementInteractable(SubmissionAssingeeOpt);
	        movetoElementAndClick(SubmissionAssingeeOpt);
	        WaitForCurserRunning(3);
	        WaitUntilVisible(SubmissionAssingee);
	        String expectedUpdatedAssingee = GetText(SubmissionAssingee);
	        UpdatedAssingee = expectedUpdatedAssingee.equalsIgnoreCase(AgencyLoggedInUserName);
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(DefaultAssingee,"Default assignee must be unassigned");
			softAssert.assertTrue(AssingeeOptions,"Assinee options should display.");
			softAssert.assertFalse(readOnlyUser,"Read Only User must not be present in the list.");
			softAssert.assertTrue(UpdatedAssingee,"Updated Assingee.");
			softAssert.assertAll();
	    }


	    public  boolean DefaultCollaborator;
	    public  boolean UpdatedCollaborator;

	    public  void CSDP_VerifySubmissionCollaborator() throws InterruptedException {
	        WaitUntilVisible(SubmissionCollaborator);
	        ScrollIntoView(SubmissionCollaborator);
	        String expectedDefaultcol = GetText(SubmissionCollaborator);
	        DefaultCollaborator = expectedDefaultcol.equalsIgnoreCase("None");
	        WaitForElementInteractable(SubmissionCollaborator);
	        ClickOn(SubmissionCollaborator);
	        WaitUntilVisible(CollaboratorSearch);
	        SendKeys(CollaboratorSearch, "Amandeep");
	        WaitUntilVisible(CollaboratorOpt);
	        ClickOn(CollaboratorOpt);
	        WaitForCurserRunning(3);
	        WaitUntilVisible(SubmissionCollaborator);
	        ScrollIntoView(SubmissionCollaborator);
	        String actualDefaultcol = GetText(SubmissionCollaborator);
	        UpdatedCollaborator = actualDefaultcol.equalsIgnoreCase("Amandeep Singh");
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(DefaultCollaborator,"Default collaborator must be None.");
			softAssert.assertTrue(UpdatedCollaborator,"Updated collaborator");
			softAssert.assertAll();


	    }

	    public  String newCollaborator;
	    public  void CSDP_VerifySubmissionCollaboratorDeselect() throws InterruptedException{
	        WaitUntilVisible(CollaboratorSearch);
	        ClickByJsExecuter(By.xpath("(//div[@id='collaboratorIds']//span)[1]"));
	        WaitUntilVisible(collaboratorOption1);
	        ClickOn(collaboratorOption1);
	        WaitForCurserRunning(3);
	        WaitUntilVisible(SubmissionCollaborator);
	        WaitUntilVisible(By.xpath(getSelectedCollaboratorXPath(1)));
	        ClickOn(By.xpath(getSelectedCollaboratorXPath(1)));
	        WaitForCurserRunning(3);
	        WaitUntilVisible(SubmissionCollaborator);
	        WaitUntilVisible(By.xpath(getSelectedCollaboratorXPath(1)));
	        ClickOn(By.xpath(getSelectedCollaboratorXPath(1)));
	        WaitForCurserRunning(3);
	        WaitUntilVisible(SubmissionCollaborator);
	        ScrollIntoView(SubmissionCollaborator);
	        newCollaborator = GetText(SubmissionCollaborator);
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(newCollaborator,"None","new collaborator must be None after deselected all.");
			softAssert.assertAll();


	    }

	    public  boolean emailTiles;
	    public  boolean emailParagraph;
	    public  boolean EmailLessLnkTxt;
	    public  void  CSDP_VerifyEmailTileWhenNoEmail() throws InterruptedException{
	        emailTiles = ElementIsDisplayed(emailTile);

	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertFalse(emailTiles);
			softAssert.assertAll();
	    }

//	    public  void CSDP_VerifyEmailTileExpandClickMore() throws InterruptedException {
//	        WaitUntilVisible(SmsAndEmailVerificationUtility.MessagesIcon);
//	        ClickOn(SmsAndEmailVerificationUtility.MessagesIcon);
//	        String RandomSubject = RandomStrings.RequiredCharacters(10);
//	        SendKeys(SmsAndEmailVerificationUtility.SubjectField, RandomSubject);
//	        WebElement switchFrame = WaitUntilVisibleWE(SmsAndEmailVerificationUtility.IframeBody);
//	        driver.switchTo().frame(switchFrame);
//	        String RandomBody = "Random Body" + RandomStrings.RequiredString(50);
//	        WaitForElementInteractable(SmsAndEmailVerificationUtility.MessageBody);
//	        SendKeys(SmsAndEmailVerificationUtility.MessageBody, RandomBody);
//	        driver.switchTo().defaultContent();
//	        ClickByJsExecuter(SmsAndEmailVerificationUtility.SendButton);
//	        WaitUntilElementInvisible(SmsAndEmailVerificationUtility.SendButton);
//	        WaitForCurserRunning(7);
//	        WaitUntilVisible(CreateAndLinkCaseUtility.SubmissionNumber);
//	        WaitUntilVisible(emailTile);
//	        emailTiles = ElementIsDisplayed(emailTile);
//	        WaitUntilVisible(emailMoreLnkTxt);
//	        ScrollIntoView(emailMoreLnkTxt);
//	        movetoElementAndClick(emailMoreLnkTxt);
//	        WaitUntilVisible(emailLessLnkTxt);
//	        EmailLessLnkTxt = ElementIsDisplayed(emailLessLnkTxt);
//	        WaitUntilVisible(emailBodyParaGraph);
//	        emailParagraph = ElementIsDisplayed(emailBodyParaGraph);
//	        SoftAssert softAssert = new SoftAssert();
//			softAssert.assertTrue(emailTiles,"Email Tile is not visible");
//			softAssert.assertTrue(emailParagraph,"Email Paragraph is not visible");
//			softAssert.assertTrue(EmailLessLnkTxt, "Email Less Text not visible");
//			softAssert.assertAll();
//
//	    }

	    public  boolean subjectUpdated;
	    public  boolean newMailSent;
	    public  void CSDP_UpdateTheSubjectOfMail() throws InterruptedException{
	        WaitUntilVisible(mailReplyFrame);
	        WebElement mailFrame = findElement(mailReplyFrame);
	        WaitUntilVisible(mailSubject);
	        String oldSubject =  GetValueAttribute(mailSubject);
	        Clear(mailSubject);
	        SendKeys(mailSubject,"Subject "+RandomStrings.RequiredString(4));
	        driver.switchTo().frame(mailFrame);
	        WaitUntilVisible(mailreplyMsz);
	        SendKeys(mailreplyMsz,"Mail Message" + RandomStrings.RequiredString(4));
	        driver.switchTo().defaultContent();
	        WaitUntilVisible(sendmailReply);
	        ClickOn(sendmailReply);
	        WaitForCurserRunning(5);
	        WaitUntilVisible(mailedSubject);
	        newMailSent = ElementIsDisplayed(mailedSubject);
	        String newSubject =  GetValueAttribute(mailSubject);
	        subjectUpdated = !(oldSubject.equalsIgnoreCase(newSubject));
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(subjectUpdated);
			softAssert.assertTrue(newMailSent);
			softAssert.assertAll();

	    }

	    public  boolean defaultAttachmentIcon;
	    public  boolean AfterAttachmentIcon;
	    public  boolean AttachmentCount;


	    public  void CSDP_SubmissionDetails() throws InterruptedException {
	        int CancelSubmission = driver.findElements(CSPInternalUtility.CloseSubmissionIcon).size();
	        if (CancelSubmission > 0) {
	            ScrollIntoView(CSPInternalUtility.CloseSubmissionIcon);
	            WaitForElementInteractable(CSPInternalUtility.CloseSubmissionIcon);
	            ClickOn(CSPInternalUtility.CloseSubmissionIcon);

	        }
	        WaitForCurserRunning(5);
	        crmCommonMethod.CRM_CreateSubmission("No", "Yes", "Yes", "Yes", "No", "Location Required");
	        WaitUntilVisible(attachmentDefaultbtn);
	        String attachemntStyle = findElement(attachmentDefaultbtn).getAttribute("style");
	        defaultAttachmentIcon = attachemntStyle.contains("add-attachment.png");
	        crmCommonMethod.AddAttachmentOnCSDP(ceCommonMethod.SetTestDataFilePath("cow.jpg"));
	        WaitUntilVisible(attachmentDefaultbtn);
	        WaitUntilVisible(attachmentCount);
	        String attachemntAfterStyle = findElement(attachmentDefaultbtn).getAttribute("style");
	        AfterAttachmentIcon = attachemntAfterStyle.contains("attachments-active.png");
	        WaitUntilVisible(attachmentCount);
	        int count = Integer.parseInt(GetText(attachmentCount));
	        AttachmentCount = count == 1;

	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(defaultAttachmentIcon);
			softAssert.assertTrue(AttachmentCount);
			softAssert.assertTrue(AfterAttachmentIcon);
			softAssert.assertAll();


	    }




}
