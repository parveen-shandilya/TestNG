package POM;

import BrowsersBase.BrowsersInvoked;

import java.awt.AWTException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import BrowsersBase.BrowsersInvoked;
import CommonMethods.CECommonMethods;
import CommonMethods.CRMCommonMethods;
import CommonMethods.Helper;
import CommonMethods.PropertiesUtils;
import CommonMethods.RandomStrings;
import TestCases.Login;
import org.testng.Assert;

public class CSPExternalUtility extends Helper {

	public WebDriver driver;
	LoginUtility log;

	public CSPExternalUtility(WebDriver driver) {
		super(driver);
		this.driver = driver;
		log = new LoginUtility(driver);

	}

	public static String reportAnIssuePage = "//nav[@class='crm-submission__navigation-bar']/h1";
	public static String issueDescriptionField = "//textarea[@name='description']";
	public static String validationMsgDescription = "//span[@class='field__error']";
	public static String nextButton = "(//button[text()='Next'])[1]";
	public static String nextButtonSec2 = "(//button[text()='Next'])[2]";
	public static String nextButtonSec3 = "(//button[text()='Next'])[3]";
	public static String selectedCategory = "//div[@class='chip__wrapper active clickable']";
	public static String otherCategories = "//div[@class='category-list-section']//div";
	public static String showMoreLinktext = "//a[@class='show-more']";
	public static String showMoreOnlyLinktext = "//a[@class='show-more' and text()='More']";
	public static String submissionUpdatesCheckbox = "//input[@name='hasSubscribed']";
	public static String noButton = "//button[text()='No']";
	public static String yesButton = "//button[text()='Yes']";
	public static String firstNameField = "//input[@name='firstName']";
	public static String lastNameField = "//input[@name='lastName']";
	public static String emailField = "//input[@name='email']";
	public static String emailPreferenceButton = "//button[text()='Email']";
	public static String otherField = "//input[@name='notificationNote']";
	public static String backButton = "//button[text()='Back']";
	public static String submitButton = "//button[text()='Submit']";
	public static String firstNameValidation = "//input[@name='firstName']/following::span[1]";
	public static String lastNameValidation = "//input[@name='firstName']/following::span[2]";
	public static String successMessage = "//section[@class='crm__success-message-section']//h5";
	public static String agencySearchField = "//span[@class='agencies-listing__search']/input";
	public static String editAgencyIcon = "//div[@class='agencies-listing__agency-actions']/button[3]";
	public static String cSPExternalURL = "//div[@class='agency-form__product-config']/a";
	public static String categoryExpandedSection = "//div[@class='crm-location-section']";
	public static String issueDescriptionTitle = "//h2[text()='Issue Description']";
	public static String attachmentThumbnail = "//img[@class='photos-tile__saved-thumb']";
	public static String deleteIconAttachment = "//img[@class='delete-button']";
	public static String locationSection = "//h2[text()='Location']";
	public static String locationSearchField = "//input[@type='text']";
	public static String changeLocationValue = "//button[contains(text(),'Change')]";
	public static String locationValidationMsg = "//div[@class='crm-location-field error']/following::span";
	// public static String locationSearchResult = "//div[@class='list-label']";
	public static String locationSearchResult = "//div[@class='list-label']//b";
	public static String selectCategoryTitle = "//h2[text()='Select Category']";
	public static String changeLocButton = "//button[text()='Change']";
	public static String submitSubmissionPage = "//div[@class='crm__anonymous-toggle col']/h5";
	// public static String emailValidationMsg = "//span[text()='Enter the
	// details.']";
	public static String emailValidationMsg = "//*[@name='email']/../../span";
	public static By attachmentThumbnail2 = By.xpath("(//img[@class='photos-tile__saved-thumb'])[2]");
	// public static By attachmentThumbnail2 =
	// By.xpath("(//img[@class='photos-tile__saved-thumb'])[2]");

	public static By ReportAnIssuePage = By.xpath(reportAnIssuePage);
	public static By IssueDescriptionField = By.xpath(issueDescriptionField);
	public static By ValidationMsgDescription = By.xpath(validationMsgDescription);
	public static By NextButton = By.xpath(nextButton);
	public static By NextButtonSec2 = By.xpath(nextButtonSec2);
	public static By NextButtonSec3 = By.xpath(nextButtonSec3);
	public static By SelectedCategory = By.xpath(selectedCategory);
	public static By OtherCategories = By.xpath(otherCategories);
	public static By ShowMoreLinktext = By.xpath(showMoreLinktext);
	public static By ShowMoreOnlyLinktext = By.xpath(showMoreOnlyLinktext);

	public static By SubmissionUpdatesCheckbox = By.xpath(submissionUpdatesCheckbox);
	public static By NoButton = By.xpath(noButton);
	public static By YesButton = By.xpath(yesButton);
	public static By FirstNameField = By.xpath(firstNameField);
	public static By LastNameField = By.xpath(lastNameField);
	public static By EmailField = By.xpath(emailField);
	public static By EmailPreferenceButton = By.xpath(emailPreferenceButton);
	public static By OtherField = By.xpath(otherField);
	public static By BackButton = By.xpath(backButton);
	public static By SubmitButton = By.xpath(submitButton);
	public static By FirstNameValidation = By.xpath(firstNameValidation);
	public static By LastNameValidation = By.xpath(lastNameValidation);
	public static By SuccessMessage = By.xpath(successMessage);
	public static By AgencySearchField = By.xpath(agencySearchField);
	public static By EditAgencyIcon = By.xpath(editAgencyIcon);
	public static By CSPExternalURL = By.xpath(cSPExternalURL);
	public static By CategoryExpandedSection = By.xpath(categoryExpandedSection);
	public static By IssueDescriptionTitle = By.xpath(issueDescriptionTitle);
	public static By AttachmentThumbnail = By.xpath(attachmentThumbnail);
	public static By DeleteIconAttachment = By.xpath(deleteIconAttachment);
	public static By LocationSection = By.xpath(locationSection);
	public static By LocationSearchField = By.xpath(locationSearchField);
	public static By ChangeLoactionValue = By.xpath(changeLocationValue);
	public static By LocationValidationMsg = By.xpath(locationValidationMsg);
	public static By LocationSearchResult = By.xpath(locationSearchResult);
	public static By SelectCategoryTitle = By.xpath(selectCategoryTitle);
	public static By ChangeLocButton = By.xpath(changeLocButton);
	public static By SubmitSubmissionPage = By.xpath(submitSubmissionPage);
	public static By EmailValidationMsg = By.xpath(emailValidationMsg);
	public static By TextMsgPreferenceButton = By.xpath("//button[text()='Text Message']");
	public static By MobileNumberField = By.xpath("//input[@name='phoneNumber']");
	public static By CategoriesTab = By.xpath(CategoryUtility.categoriesTab);

	public static String RASPageTitle;
	public static String TabTitle;
	public static String DescriptionValidation;
	public static String ExpectedDescriptionMsg;
	public static String Validation2000;
	public static String Expected2000Msg;
	public static boolean CategorySectionState;
	public static int CountAttachments;
	public static int CountAttachmentsAfter;
	public static String CategorySelected;
	public static boolean CountAllCategories;
	public static boolean NoLocationSection;
	public static String PageTitleSubmitSubmission;
	public static String ExpectedTitleSubmitSubmission;
	public static String ValidationMsgLocation;
	public static String ExpectedMsgLoc;
	public static String SubmitPageTitle;
	public static String ValidMsgFirstName;
	public static String ExpectedMsgName1;
	public static String ValidMsgLastName;
	public static String ExpectedMsgName2;
	public static String LimitMsgFirstName;
	public static String LimitMsgLastName;
	public static String CharLimitValidation;
	public static String EmailValidationMessage;
	public static String ExpectedEmailMsg;
	public static String InvalidMailMsg;
	public static String ExpectedInvalidMsg;
	public static String SubmissionSuccessMsg;
	public static String ExpectedSuccessMsg;
	public static String SubmissionSuccessMsgNA;
	public static Boolean categoryContains = false;
	public static String CategoryValidation;
	public static String ExpectedCAtegoryvalidMsg;

	public static String searchLocationKey1O = PropertiesUtils.getPropertyValue("searchLocationKey1O");
	public static String searchLocationKey = PropertiesUtils.getPropertyValue("searchLocationKey");

	public void LoginAgency() throws InterruptedException {
		log.LoginAgency();

	}

	public static String AgencyNameGrid(String name) {
		String xPath = "//div[text()='" + name + "']";
		return xPath;
	}

	public void CSPExternal_PreRequisite_OpenReportAnIssuePage() throws InterruptedException {
		CloseOtherTabs();
		driver.navigate().to(BrowsersInvoked.AdminURL);
		WaitForCurserRunning(5);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		int lginCheck = driver.findElements(By.xpath("//input[@placeholder='Enter Email'][@name='email']")).size();
		if (lginCheck > 0) {
			log.LoginAdmin();
			WaitUntilVisible(AgencySearchField);
		}
		String AgencyID = Integer.toString(BrowsersInvoked.AgencyID);
		WaitUntilVisible(AgencySearchField);
		ScrollIntoView(AgencySearchField);
		WaitForElementInteractable(AgencySearchField);
		SendKeys(AgencySearchField, AgencyID);
		WaitUntilVisible(By.xpath(AgencyNameGrid(AgencyID)));
		WaitForElementInteractable(EditAgencyIcon);
		ClickByJsExecuter(EditAgencyIcon);
		WaitUntilVisible(CSPExternalURL);
		WaitForElementInteractable(CSPExternalURL);
		ScrollIntoView(CSPExternalURL);
		ClickByJsExecuter(CSPExternalURL);
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

		driver.switchTo().window((String) tabs.get(1));
		WaitUntilVisible(ReportAnIssuePage);
		RASPageTitle = GetText(ReportAnIssuePage);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(RASPageTitle, "Report an issue");
		softAssert.assertAll();
	}

	public void CSPExternal_PreRequisite_OpenReportAnIssuePageNOLogin() throws InterruptedException {
		CloseOtherTabs();
		WaitforCustometime(3);
		refreshPage();
		WaitForCurserRunning(4);
		String AgencyID = Integer.toString(BrowsersInvoked.AgencyID);
		WaitUntilVisible(AgencySearchField);
		ScrollIntoView(AgencySearchField);
		WaitForElementInteractable(AgencySearchField);
		SendKeys(AgencySearchField, AgencyID);
		WaitUntilVisible(By.xpath(AgencyNameGrid(AgencyID)));
		ClickOn(EditAgencyIcon);
		WaitUntilVisible(CSPExternalURL);
		WaitForElementInteractable(CSPExternalURL);
		ClickOn(CSPExternalURL);
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

		driver.switchTo().window((String) tabs.get(1));
		WaitUntilVisible(ReportAnIssuePage);
		RASPageTitle = GetText(ReportAnIssuePage);
	}

	public void CSPExternal_VerifyIssueDescription() throws InterruptedException {
		CRMCommonMethods crmMethods = new CRMCommonMethods(driver);
		WaitUntilVisible(By.xpath("//h2[@class='h2-dropdown']"));
		crmMethods.ClickOnIssueDescriptionNextButton();
		WaitUntilVisible(ValidationMsgDescription);
		WaitUntilPresent(ValidationMsgDescription);
		ScrollIntoView(ValidationMsgDescription);
		DescriptionValidation = GetText(ValidationMsgDescription);
		CategoryValidation = GetText(By.xpath("//h2[@class='error-h2']"));
		ExpectedDescriptionMsg = "The Issue description is required.";
		ExpectedCAtegoryvalidMsg = "The Category is required.";
		WaitUntilVisible(By.xpath("//div[contains(text(),'Select One')]"));
		ClickByJsExecuter(By.xpath("//div[contains(text(),'Select One')]"));
		WaitUntilVisible(By.xpath("//div[@class='dropdown-content__search-container']//input[@type='text']"));
		SendKeys(By.xpath("//div[@class='dropdown-content__search-container']//input[@type='text']"), "Other");
		WaitUntilVisible(By.xpath("//div[@class='option-black']"));
		ClickOn(By.xpath("//div[@class='option-black']"));

		String description = PropertiesUtils.getPropertyValue("Description2001");
		forcedWaitTime(2);
		SendKeys(IssueDescriptionField, description);
		forcedWaitTime(4);
		crmMethods.ClickOnIssueDescriptionNextButton();
		WaitUntilVisible(ValidationMsgDescription);
		Validation2000 = GetText(ValidationMsgDescription);
		Expected2000Msg = "2000 character limit.";
		WebElement DescriptionField = WaitUntilVisibleWE(IssueDescriptionField);
		DescriptionField.clear();
		String RandomDescription = RandomStrings.RequiredString(50);
		SendKeys(IssueDescriptionField, RandomDescription);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(DescriptionValidation, ExpectedDescriptionMsg);
		softAssert.assertEquals(Validation2000, Expected2000Msg);
		softAssert.assertEquals(CategoryValidation, ExpectedCAtegoryvalidMsg);
		softAssert.assertAll();
	}

	public void CSPExternal_VerifyAddedAttachments() throws InterruptedException {

		CECommonMethods ceMethods = new CECommonMethods(driver);
		WebElement UploadFile = driver.findElement(By.xpath("//input[@type='file']"));
		UploadFile.sendKeys(ceMethods.SetTestDataFilePath("Panda_11zon.jpg"));
		WaitForCurserRunning(5);
		WebElement UploadFile2 = driver.findElement(By.xpath("//input[@type='file']"));
		UploadFile2.sendKeys(ceMethods.SetTestDataFilePath("Jellyfish_11zon.jpg"));
		WaitUntilVisible(AttachmentThumbnail);
		WaitUntilPresent(AttachmentThumbnail);
		List<WebElement> AttachmentCountBefore = driver.findElements(AttachmentThumbnail);
		CountAttachments = AttachmentCountBefore.size();
		ClickOn(DeleteIconAttachment);
		WaitUntilElementInvisible(attachmentThumbnail2);
		forcedWaitTime(3);
		List<WebElement> AttachmentCountAfter = driver.findElements(AttachmentThumbnail);
		CountAttachmentsAfter = AttachmentCountAfter.size();
		Assert.assertEquals(CountAttachments, 2, "Attachment Count is not equal to 2.");
		Assert.assertEquals(CountAttachmentsAfter, 1, "Attachment Count is not equal to 1.");
	}

	public void CSPExternal_VerifyCorrespondingCategoryToKeyword() throws InterruptedException {
		CRMCommonMethods crmMethods = new CRMCommonMethods(driver);
		ScrollIntoView(IssueDescriptionField);
		WaitForElementInteractable(IssueDescriptionField);
		findElement(IssueDescriptionField).clear();
		WaitForElementInteractable(IssueDescriptionField);
		SendKeys(IssueDescriptionField, "Location Not Included");
		crmMethods.ClickOnIssueDescriptionNextButton();
		CategorySelected = GetText(SelectedCategory);
		List<WebElement> ShowMoreLink = driver.findElements(ShowMoreLinktext);
		List<String> CategoriesText = new ArrayList<String>();

		if (ShowMoreLink.size() == 1) {
			ClickOn(ShowMoreLinktext);
			List<WebElement> CountCategories = driver.findElements(OtherCategories);

			driver.findElements(OtherCategories).stream().forEach(x -> CategoriesText.add(x.getText()));

			CountAllCategories = CountCategories.size() > 0;
			categoryContains = CategoriesText.contains("Location Not Included");
		} else {

			List<WebElement> CountCategories = driver.findElements(OtherCategories);
			driver.findElements(OtherCategories).stream().forEach(x -> CategoriesText.add(x.getText()));
			CountAllCategories = CountCategories.size() > 0;
			categoryContains = CategoriesText.contains("Location Not Included");
		}

		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(categoryContains);
		softAssert.assertTrue(CountAllCategories);
		softAssert.assertAll();
	}

	public void CSPExternal_VerifyNoLocationSection() throws InterruptedException {
		WaitUntilVisible(By.xpath("//h2[contains(text(),'Category')]//parent::div//div[@class='dropdown__label']"));
		ScrollIntoView(By.xpath("//h2[contains(text(),'Category')]//parent::div//div[@class='dropdown__label']"));
		ClickOn(By.xpath("//h2[contains(text(),'Category')]//parent::div//div[@class='dropdown__label']"));
		WaitUntilVisible(By.xpath("//div[@class='dropdown-content__search-container']//input[@type='text']"));
		SendKeys(By.xpath("//div[@class='dropdown-content__search-container']//input[@type='text']"),
				"Location Not Included");
		WaitUntilVisible(By.xpath("//div[@class='option-black']"));
		ClickOn(By.xpath("//div[@class='option-black'][contains(text(),'Location Not Included')]"));
		CRMCommonMethods crmMethods = new CRMCommonMethods(driver);
		crmMethods.ClickOnIssueDescriptionNextButton();
		List<WebElement> LocationSec = driver.findElements(LocationSection);
		NoLocationSection = LocationSec.size() == 0;
		PageTitleSubmitSubmission = GetText(SubmitSubmissionPage);
		ExpectedTitleSubmitSubmission = "Stay Updated on the Progress of your Submission";
		crmMethods.ClickOnBackButtonCRMExternal();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(NoLocationSection, "Location Section is present");
		softAssert.assertEquals(PageTitleSubmitSubmission, ExpectedTitleSubmitSubmission, "Page Tile is not matched.");
		softAssert.assertAll();
	}

	public void CSPExternal_VerifyRequiredLocationSection() throws InterruptedException {
		WaitUntilVisible(By.xpath("//h2[contains(text(),'Category')]//parent::div//div[@class='dropdown__label']"));
		ScrollIntoView(By.xpath("//h2[contains(text(),'Category')]//parent::div//div[@class='dropdown__label']"));
		ClickOn(By.xpath("//h2[contains(text(),'Category')]//parent::div//div[@class='dropdown__label']"));
		WaitUntilVisible(By.xpath("//div[@class='dropdown-content__search-container']//input[@type='text']"));
		SendKeys(By.xpath("//div[@class='dropdown-content__search-container']//input[@type='text']"),
				"Location Required");
		WaitUntilVisible(By.xpath("//div[@class='option-black']"));
		ClickOn(By.xpath("//div[@class='option-black'][contains(text(),'Location Required')]"));
		CRMCommonMethods crmMethods = new CRMCommonMethods(driver);
		crmMethods.ClickOnIssueDescriptionNextButton();
		crmMethods.ClickOnLocationNextButton();
		WaitUntilVisible(LocationValidationMsg);
		ValidationMsgLocation = GetText(LocationValidationMsg);
		ExpectedMsgLoc = "The location is required.";
		WaitUntilVisible(LocationSearchField);
		WaitUntilPresent(LocationSearchField);
		ClickByJsExecuter(LocationSearchField);
		if (BrowsersInvoked.agencyConfig.equalsIgnoreCase(BrowsersInvoked.agencyConfigGisDirect1o)
				|| BrowsersInvoked.agencyConfig.equalsIgnoreCase(BrowsersInvoked.agencyConfigGisDirect2o)) {
			crmMethods.searchLocationExternalCS(searchLocationKey1O);
		} else {
			crmMethods.searchLocationExternalCS(searchLocationKey);
		}

		if (ElementIsDisplayed(CSPInternalUtility.ToggleChecked)) {
			ClickOn(CSPInternalUtility.FlagToggle);
			ClickOn(CSPInternalUtility.FlagToggle);

		}

		crmMethods.ClickOnLocationNextButton();
		WaitUntilVisible(SubmitSubmissionPage);
		SubmitPageTitle = GetText(SubmitSubmissionPage);
		crmMethods.ClickOnBackButtonCRMExternal();

		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(ValidationMsgLocation, ExpectedMsgLoc);
		softAssert.assertEquals(SubmitPageTitle, ExpectedTitleSubmitSubmission);
		softAssert.assertAll();
	}

	public void CSPExternal_VerifyNonMandatoryLocationSection() throws InterruptedException {
		WaitUntilVisible(By.xpath("//h2[text()='Issue Description']"));
		ScrollIntoView(By.xpath("//h2[text()='Issue Description']"));
		ClickByJsExecuter(By.xpath("//h2[text()='Issue Description']"));
		WaitUntilVisible(By.xpath("//h2[contains(text(),'Category')]//parent::div//div[@class='dropdown__label']"));
		ScrollIntoView(By.xpath("//h2[contains(text(),'Category')]//parent::div//div[@class='dropdown__label']"));
		ClickOn(By.xpath("//h2[contains(text(),'Category')]//parent::div//div[@class='dropdown__label']"));
		WaitUntilVisible(By.xpath("//div[@class='dropdown-content__search-container']//input[@type='text']"));
		SendKeys(By.xpath("//div[@class='dropdown-content__search-container']//input[@type='text']"),
				"Location Not Required");
		WaitUntilVisible(By.xpath("//div[@class='option-black']"));
		ClickOn(By.xpath("//div[@class='option-black'][contains(text(),'Location Not Required')]"));
		CRMCommonMethods crmMethods = new CRMCommonMethods(driver);
		crmMethods.ClickOnIssueDescriptionNextButton();
		WaitForElementInteractable(ChangeLocButton);
		ClickByJsExecuter(ChangeLocButton);

		crmMethods.ClickOnLocationNextButton();
		WaitUntilVisible(SubmitSubmissionPage);
		WaitUntilPresent(SubmitSubmissionPage);
		SubmitPageTitle = GetText(SubmitSubmissionPage);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(SubmitPageTitle, ExpectedTitleSubmitSubmission);
		softAssert.assertAll();
	}

	public void CSPExternal_VerifyMandatoryFieldsForNonAnonymous() throws InterruptedException {

		WaitUntilVisible(SubmitButton);
		ScrollIntoView(SubmitButton);
		WaitForElementInteractable(SubmitButton);
		ClickByJsExecuter(SubmitButton);
		WaitUntilVisible(FirstNameValidation);
		ScrollIntoView(FirstNameValidation);
		ValidMsgFirstName = GetText(FirstNameValidation);
		ExpectedMsgName1 = "The First Name is required.";
		ScrollIntoView(LastNameValidation);
		ValidMsgLastName = GetText(LastNameValidation);
		ExpectedMsgName2 = "The Last Name is required.";
		String Text21Chars = RandomStrings.RequiredCharacters(21);
		SendKeys(FirstNameField, Text21Chars);
		WaitUntilVisibleWE(FirstNameField).clear();
		SendKeys(LastNameField, Text21Chars);
		WaitUntilVisibleWE(LastNameField).clear();
		WaitUntilVisible(SubmitButton);
		ScrollIntoView(SubmitButton);
		WaitForElementInteractable(SubmitButton);
		ClickByJsExecuter(SubmitButton);
		WaitUntilVisible(FirstNameValidation);
		ScrollIntoView(FirstNameValidation);
		LimitMsgFirstName = GetText(FirstNameValidation);
		LimitMsgLastName = GetText(LastNameValidation);
		CharLimitValidation = "20 character limit.";

		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(ValidMsgFirstName, ExpectedMsgName1);
		softAssert.assertEquals(ValidMsgLastName, ExpectedMsgName2);
		softAssert.assertEquals(LimitMsgFirstName, CharLimitValidation);
		softAssert.assertEquals(LimitMsgLastName, CharLimitValidation);
		softAssert.assertAll();
	}

	public void CSPExternal_VerifyEmailFieldPreference() throws InterruptedException {
		WaitUntilVisible(EmailPreferenceButton);
		WaitUntilPresent(EmailPreferenceButton);
		ScrollIntoView(EmailPreferenceButton);
		WaitForElementInteractable(EmailPreferenceButton);
		ClickByJsExecuter(EmailPreferenceButton);
		WaitForElementInteractable(EmailPreferenceButton);
		WaitUntilVisible(SubmitButton);
		ScrollIntoView(SubmitButton);
		WaitForElementInteractable(SubmitButton);
		ClickByJsExecuter(SubmitButton);
		EmailValidationMessage = GetText(EmailValidationMsg);
		ExpectedEmailMsg = "Enter the details.";
		String InvalidMail = "invalid@mail";
		WaitForElementInteractable(EmailField);
		SendKeys(EmailField, InvalidMail);
		WaitUntilVisible(SubmitButton);
		ScrollIntoView(SubmitButton);
		WaitForElementInteractable(SubmitButton);
		ClickByJsExecuter(SubmitButton);
		WaitUntilVisible(EmailValidationMsg);
		InvalidMailMsg = GetText(EmailValidationMsg);
		ExpectedInvalidMsg = "Email format is invalid.";
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(EmailValidationMessage, ExpectedEmailMsg);
		softAssert.assertEquals(InvalidMailMsg, ExpectedInvalidMsg);
		softAssert.assertAll();
	}

	public void CSPExternal_VerifyAnonymousSubmission() throws InterruptedException {
		WaitUntilVisible(YesButton);
		WaitForElementInteractable(YesButton);
		ScrollIntoView(YesButton);
		WaitForElementInteractable(YesButton);
		ClickByJsExecuter(YesButton);
		WaitUntilVisible(SubmitButton);
		ScrollIntoView(SubmitButton);
		WaitForElementInteractable(SubmitButton);
		ClickByJsExecuter(SubmitButton);
		WaitUntilVisible(SuccessMessage);
		SubmissionSuccessMsg = GetText(SuccessMessage);
		ExpectedSuccessMsg = "Issue submitted successfully";
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(SubmissionSuccessMsg, ExpectedSuccessMsg);
		softAssert.assertAll();
	}

	public void CSPExternal_VerifyNonAnonymousSubmission() throws InterruptedException, AWTException {

		ExpectedSuccessMsg = "Issue submitted successfully";
		refreshPage();
		WaitForCurserRunning(7);
		driver.navigate().to(BrowsersInvoked.AdminURL);
		WaitForCurserRunning(5);
		CRMCommonMethods crmMethods = new CRMCommonMethods(driver);
		crmMethods.CRM_CreateExternalSubmission("Yes", "Location Not Required", "No", "Yes");
		WaitUntilVisible(SuccessMessage);
		ScrollIntoView(SuccessMessage);
		WaitUntilPresent(SuccessMessage);
		int successmessage = findElementsByXPath(SuccessMessage).size();
		while (successmessage == 0) {
			successmessage = findElementsByXPath(SuccessMessage).size();
		}
		SubmissionSuccessMsgNA = driver.findElement(By.xpath(successMessage)).getText();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(SubmissionSuccessMsgNA, ExpectedSuccessMsg);
		softAssert.assertAll();
	}

	public void CSPExternal_CreateExternalSubmissionLocationNotRequired() throws InterruptedException, AWTException {

		ExpectedSuccessMsg = "Issue submitted successfully";
		refreshPage();
		WaitForCurserRunning(7);
		driver.navigate().to(BrowsersInvoked.AdminURL);
		WaitForCurserRunning(5);
		CRMCommonMethods crmMethods = new CRMCommonMethods(driver);
		crmMethods.CRM_CreateExternalSubmission("Yes", "Location Not Required", "No", "Yes");
		WaitUntilVisible(SuccessMessage);
		ScrollIntoView(SuccessMessage);
		WaitUntilPresent(SuccessMessage);
		int successmessage = findElementsByXPath(SuccessMessage).size();
		while (successmessage == 0) {
			successmessage = findElementsByXPath(SuccessMessage).size();
		}
		SubmissionSuccessMsgNA = driver.findElement(By.xpath(successMessage)).getText();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(SubmissionSuccessMsgNA, ExpectedSuccessMsg);
		softAssert.assertAll();

	}

	public void CSPExternal_CreateExternalSubmissionWithPinaLocation() throws InterruptedException {
		CRMCommonMethods crmMethods = new CRMCommonMethods(driver);
		CloseOtherTabs();
		ExpectedSuccessMsg = "Issue submitted successfully";
		refreshPage();
		WaitForCurserRunning(7);
		driver.navigate().to(BrowsersInvoked.AdminURL);
		WaitForCurserRunning(5);
		String CategoryNname = "Required " + RandomStrings.RequiredString(6);
		String keyWords = RandomStrings.RequiredString(12);
		AppPreRequisiteUtility appPreReq = new AppPreRequisiteUtility(driver);
		appPreReq.AgencySetup_VerifyAppConfigurations(Integer.toString(BrowsersInvoked.AgencyID));
		crmMethods.NavigateTo_AgencySetup();
		driver.navigate().to(BrowsersInvoked.URLCategories);
		WaitForCurserRunning(5);
		WaitUntilVisible(CategoriesTab);
		WaitUntilPresent(CategoriesTab);
		TabTitle = GetText(CategoriesTab);
		crmMethods.CreateCategoryCustomKeyWord("No", "Yes", "Yes", CategoryNname, keyWords);
		crmMethods.CustomExternalSubmissionPinLocation(keyWords, "Yes", CategoryNname, "No", "Yes");
		WaitUntilVisible(SuccessMessage);
		ScrollIntoView(SuccessMessage);
		WaitUntilPresent(SuccessMessage);
		int successmessage = findElementsByXPath(SuccessMessage).size();
		while (successmessage == 0) {
			successmessage = findElementsByXPath(SuccessMessage).size();
		}
		SubmissionSuccessMsgNA = driver.findElement(By.xpath(successMessage)).getText();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(SubmissionSuccessMsgNA, ExpectedSuccessMsg);
		softAssert.assertAll();
	}

}
