package POM;

import BrowsersBase.BrowsersInvoked;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebElement;

import CommonMethods.Helper;
import CommonMethods.RandomStrings;

public class CategoryUtility extends Helper {

	public WebDriver driver;
	LoginUtility log;

	public CategoryUtility(WebDriver driver) {
		super(driver);
		this.driver = driver;
		log = new LoginUtility(driver);
	}
	
	  public static String categoriesTab = "//div[@class='tab-name tab-name--active']";
	    public static String otherDefaultCategory = "//div[@class='sortable-table__body__td' and text()='Other']";
	    public static String editDefaultLink = "a#edit-default-resolution";
	    public static String resolutionTimePopup = "//div[@class='modal-header']";
	    public static String resolutionTimeField = "//input[@name='resolveByDays']";
	    public static String saveButton = "//button[text()='Save']";
	    public static String cancelButton = "//button[text()='Cancel']";
	    public static String defaultResolutionTime = "//span[@class='default-resolve-by-days']";
	    public static String editCategoryIcon = "//button[@class='edit-btn space-right btn btn-primary']";
	    public static String editOtherPopup = "//div[@class='full-page-modal__header']/h1";
	    public static String validationMsgResolutionTime = "//span[@class='field__error']";
	    public static String createCategoryButton = "//button[text()='Create Category']";
	    public static String createACategoryPopup = "//div[@class='full-page-modal__header']/h1";
	    public static String resolutionTime = "//span[@class='default-resolve-by-days']";
	    public static String createCategoryPopupBtn = "//div[@class='full-page-modal__header']//following::button[text()='Create Category']";
	    public static String validationMsgNameField = "(//span[@class='field__error'])[1]";
	    public static String resolutionTimeOnCategoryPopup = "//input[@name='resolveByDays']";
	    public static String keywordsField = "//input[@name='tags-input']";
	    public static String addedKeywords = "//div[@class='chip__body']";
	    public static String deleteIconKeyword = "//button[@class='chip__close-button']";
	    public static String addFieldLink = "//a[text()='Add Field']";
	    public static String addedFields = "//div[@class='category-modal__custom-fields']//li";
	    public static String labelValidationMsg = "//div[@class='category-modal__custom-field']//span";
	    public static String labelField = "//input[@name='label']";
	    public static String dropdownLinkEmail = "//span[@class='dropdown__arrow']";
	    public static String emailTemplatesOptions = "//div[@id='templateIds']//label";
	    public static String templatesCancelButton = "//div[@class='flex-row--center dropdown__actions']/button[1]";
	    public static String templatesSaveButton = "//div[@class='flex-row--center dropdown__actions']/button[2]";
	    public static String labelSelect = "//div[@class='dropdown__selector__selected']/label";
	    public static String selectedTemplates = "//div[@class='dropdown__selector__selected']/label";
	    public static String nameField = "//input[@name='name']";
//	    public static String categoriesCountHeader = "//div[@class='agency-setup-tab__section__header']/h2";
	public static String categoriesCountHeader = "(//div[@class='agency-setup-tab__section__header']/h2)[1]";
	    public static String addedCategories = "//li[@class='sortable__element']";
	    public static String notificationMsg = "//div[@class='notification-message']";
	    public static String editCategoryIcon2 = "(//button[@class='edit-btn space-right btn btn-primary'])[2]";
	    public static String inactiveToggle = "//button[text()='Inactive']";
	    public static String inactiveCategoriesCount = "(//div[@class='agency-setup-tab__section__header']/h2)[2]";
	    public static String inactiveAddedCategories = "//div[@class='rt-tr-group']";
	    public static String actualCategoriesCount = "//div[@class='sortable-table__body__tr']";
	    public static String locationRequiredCheckbox = "//label[text()='Location Required']";
	    public static String noLocationToggle = "//button[text()='No']";

	    public static By CategoriesTab = By.xpath(categoriesTab);
	    public static By OtherDefaultCategory = By.xpath(otherDefaultCategory);
	    public static By EditDefaultLink = By.cssSelector(editDefaultLink);
	    public static By ResolutionTimePopup = By.xpath(resolutionTimePopup);
	    public static By ResolutionTimeField = By.xpath(resolutionTimeField);
	    public static By SaveButton = By.xpath(saveButton);
	    public static By CancelButton = By.xpath(cancelButton);
	    public static By DefaultResolutionTime = By.xpath(defaultResolutionTime);
	    public static By EditCategoryIcon = By.xpath(editCategoryIcon);
	    public static By EditOtherPopup = By.xpath(editOtherPopup);
	    public static By ValidationMsgResolutionTime = By.xpath(validationMsgResolutionTime);
	    public static By ResolutionTime = By.xpath(resolutionTime);
	    public static By CreateCategoryButton = By.xpath(createCategoryButton);
	    public static By CreateACategoryPopup = By.xpath(createACategoryPopup);
	    public static By CreateCategoryPopupBtn = By.xpath(createCategoryPopupBtn);
	    public static By ValidationMsgNameField = By.xpath(validationMsgNameField);
	    public static By ResolutionTimeOnCategoryPopup = By.xpath(resolutionTimeOnCategoryPopup);
	    public static By KeywordsField = By.xpath(keywordsField);
	    public static By AddedKeywords = By.xpath(addedKeywords);
	    public static By DeleteIconKeyword = By.xpath(deleteIconKeyword);
	    public static By AddFieldLink = By.xpath(addFieldLink);
	    public static By AddedFields = By.xpath(addedFields);
	    public static By LabelValidationMsg = By.xpath(labelValidationMsg);
	    public static By LabelField = By.xpath(labelField);
	    public static By DropdownLinkEmail = By.xpath(dropdownLinkEmail);
	    public static By EmailTemplatesOptions = By.xpath(emailTemplatesOptions);
	    public static By TemplatesCancelButton = By.xpath(templatesCancelButton);
	    public static By TemplatesSaveButton = By.xpath(templatesSaveButton);
	    public static By LabelSelect = By.xpath(labelSelect);
	    public static By SelectedTemplates = By.xpath(selectedTemplates);
	    public static By NameField = By.xpath(nameField);
	    public static By CategoriesCountHeader = By.xpath(categoriesCountHeader);
	    public static By AddedCategories = By.xpath(addedCategories);
	    public static By NotificationMsg = By.xpath(notificationMsg);
	    public static By EditCategoryIcon2 = By.xpath(editCategoryIcon2);
	    public static By InactiveToggle = By.xpath(inactiveToggle);
	    public static By InactiveCategoriesCount = By.xpath(inactiveCategoriesCount);
	    public static By ActualCategoriesCount = By.xpath(actualCategoriesCount);
	    public static By LocationRequiredCheckbox = By.xpath(locationRequiredCheckbox);
	    public static By NoLocationToggle = By.xpath(noLocationToggle);

	    public static String RandomCategoryname = RandomStrings.RequiredCharacters(4);
	    public static String NewResoTime;
	    public static int CategoriesCountBefore;
	    public static String TabTitle;
	    public static String OtherTabTitle;
	    public static String EditOtherPopupTitle;
	    public static String EditResolutionPopupTitle;
	    public static String ResolutionTimeValidationMsg;
	    public static String[] ResoTextAfter;
	    public static String CreateCategoryPopupTitle;
	    public static String NameFieldValidationMsg;
	    public static String ResoTimeOnPopup;
	    public static int KeywordsSizeBefore;
	    public static int KeywordsSizeAfter;
	    public static int FieldsCount;
	    public static String LabelFieldValidationMsg;
	    public static String LabelText;
	    public static String CheckedTemplate;
	    public static String SelectedTemplate;
	    public static int CategoriesCountAfter1;
	    public static int CategoriesCountAfter2;
	    public static int CategoriesCountAfter3;
	    public static String NotificationText;
	    public static int InactiveCountAfter;
	    public static int InactiveCountBefore;
	    public static int CategoriesCountHeader1;
	    public static int CountCategoriesActual;
	    
	    public void LoginAgency() throws InterruptedException {
			log.LoginAgency();

		}

	    public  void Categories_PreRequisite() throws InterruptedException {

	        driver.navigate().to(BrowsersInvoked.URLCategories);
	        WaitForCurserRunning(5);
	        WaitUntilVisible(CategoriesTab);
	        WaitUntilPresent(CategoriesTab);
	        TabTitle = GetText(CategoriesTab);
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals("Categories", TabTitle);
			softAssert.assertAll();
	    }

	    public  void Categories_VerifyDefaultCategory() throws InterruptedException {

	        WaitUntilVisible(OtherDefaultCategory);
	        WaitUntilPresent(OtherDefaultCategory);
	        OtherTabTitle = GetText(OtherDefaultCategory);
	        scrollToRight();
	        WaitUntilPresent(EditCategoryIcon);
	        WaitForElementInteractable(EditCategoryIcon);
	        ClickByJsExecuter(EditCategoryIcon);
	        WaitUntilVisible(EditOtherPopup);
	        WaitUntilPresent(EditOtherPopup);
	        EditOtherPopupTitle = GetText(EditOtherPopup);
	        WaitUntilVisible(CancelButton);
	        WaitForElementInteractable(CancelButton);
	        ClickByJsExecuter(CancelButton);
	        WaitUntilElementInvisible(CancelButton);
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(OtherTabTitle.equals("Other"));
			softAssert.assertTrue(EditOtherPopupTitle.equals("Edit Other"));
	    }

	    public  void Categories_UpdateDefaultResolutionTime() throws InterruptedException {
	        WaitUntilVisible(ResolutionTime);
	        WaitUntilPresent(ResolutionTime);
	        String[] ResoTextBefore = GetText(ResolutionTime).split(" ");
	        int ResoTimeBefore = Integer.parseInt(ResoTextBefore[0]);
	        WaitForElementInteractable(EditDefaultLink);
	        moveToElement(EditDefaultLink);
	        ClickByJsExecuter(EditDefaultLink);
	        WaitUntilVisible(ResolutionTimePopup);
	        WaitUntilPresent(ResolutionTimePopup);
	        EditResolutionPopupTitle = GetText(ResolutionTimePopup);
	        WaitForElementInteractable(ResolutionTimeField);
	        WebElement ResolutionField = driver.findElement(ResolutionTimeField);
	        ResolutionField.clear();
	        NewResoTime = Integer.toString(ResoTimeBefore + 1);
	        ResolutionField.sendKeys(NewResoTime);
	        WaitForElementInteractable(SaveButton);
	        ClickOn(SaveButton);
	        WaitUntilElementInvisible(SaveButton);
	        WaitForCurserRunning(5);
	        WaitUntilVisible(ResolutionTime);
	        WaitUntilPresent(ResolutionTime);
	        ResoTextAfter = GetText(ResolutionTime).split(" ");
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(EditResolutionPopupTitle.equals("Edit Default Resolution Time"));
			softAssert.assertTrue(ResoTextAfter[0].equals(NewResoTime));
			softAssert.assertAll();
	    }

	    public  void Categories_OpenCreateACategoryPopup() throws InterruptedException {
	        String[] HeaderCount = GetText(CategoriesCountHeader).split(" ");
	        CategoriesCountBefore = Integer.parseInt(HeaderCount[0]);
	        WaitForElementInteractable(CreateCategoryButton);
	        ClickOn(CreateCategoryButton);
	        WaitForCurserRunning(2);
	        WaitUntilVisible(CreateACategoryPopup);
	        CreateCategoryPopupTitle = GetText(CreateACategoryPopup);
	        ClickOn(CreateCategoryPopupBtn);
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(CreateCategoryPopupTitle.equals("Create a Category"));
			String NameFieldValidationMsg = GetText(ValidationMsgNameField);
			softAssert.assertTrue(NameFieldValidationMsg.equals("The Name is required."));
			softAssert.assertAll();
	    }

	    public  void Categories_VerifyResolutionTimeOnCreateCategoryPopup() throws InterruptedException {
	        ResoTimeOnPopup = driver.findElement(ResolutionTimeOnCategoryPopup).getAttribute("value");
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(ResoTimeOnPopup.equals(NewResoTime));
			softAssert.assertAll();
	    }

	    public  void Categories_AddKeywordsAndCustomFields() throws InterruptedException {
	        WaitUntilVisible(KeywordsField);
	        WaitUntilPresent(KeywordsField);
	        WebElement AddKeywordsField = findElement(KeywordsField);
	        for (int i = 0; i < 10; i++) {
	            String RandomKeyword = RandomStrings.RequiredCharacters(4);
	            AddKeywordsField.sendKeys(RandomKeyword);
	            AddKeywordsField.sendKeys(Keys.SPACE);
	        }

	        WaitUntilVisible(AddedKeywords);
	        WaitUntilPresent(AddedKeywords);
	        List<WebElement> KeywordsAdded = driver.findElements(AddedKeywords);
	        KeywordsSizeBefore = KeywordsAdded.size();
	        for (int i = 0; i < 7; i++) {
	            ClickOn(DeleteIconKeyword);
	        }

	        WaitUntilVisible(AddedKeywords);
	        List<WebElement> KeywordsAfterDeletion = driver.findElements(AddedKeywords);
	        KeywordsSizeAfter = KeywordsAfterDeletion.size();
	        ClickOn(AddFieldLink);
	        List<WebElement> FieldsAdded = driver.findElements(AddedFields);
	        FieldsCount = FieldsAdded.size();
	        ClickOn(CreateCategoryPopupBtn);
	        LabelFieldValidationMsg = GetText(LabelValidationMsg);
	        SendKeys(LabelField, "TextLabel");
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(KeywordsSizeBefore == 10);
			softAssert.assertTrue(KeywordsSizeAfter == (KeywordsSizeBefore - 7));
			softAssert.assertTrue(FieldsCount == 1);
			softAssert.assertTrue(LabelFieldValidationMsg.equals("The Label is required."));
			softAssert.assertAll();
	    }

	    public  void Categories_VerifyLinkedEmailTemplates() throws InterruptedException {
	        WaitUntilPresent(DropdownLinkEmail);
	        WaitForElementInteractable(DropdownLinkEmail);
	        ClickOn(DropdownLinkEmail);
	        WaitForElementInteractable(EmailTemplatesOptions);
	        ClickOn(EmailTemplatesOptions);
	        WaitForElementInteractable(TemplatesCancelButton);
	        ClickOn(TemplatesCancelButton);
	        WaitUntilVisible(LabelSelect);
	        LabelText = GetText(LabelSelect);
	        ClickOn(DropdownLinkEmail);
	        ClickOn(EmailTemplatesOptions);
	        WaitUntilVisible(EmailTemplatesOptions);
	        CheckedTemplate = GetText(EmailTemplatesOptions);
	        WaitForElementInteractable(TemplatesSaveButton);
	        ClickOn(TemplatesSaveButton);
	        WaitUntilVisible(SelectedTemplates);
	        SelectedTemplate = GetText(SelectedTemplates);
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(LabelText.equals("Select"));
			softAssert.assertTrue(CheckedTemplate.equals(SelectedTemplate));
			softAssert.assertAll();
	    }

	    public  void Categories_VerifyCategoryCreation() throws InterruptedException {
	        String RandomCN = RandomStrings.RequiredCharacters(5);
	        RandomCategoryname = "Category " + RandomCN;
	        SendKeys(NameField, RandomCategoryname);
	        WaitForElementInteractable(CreateCategoryPopupBtn);
	        ClickOn(CreateCategoryPopupBtn);
	        WaitUntilElementInvisible(CreateCategoryPopupBtn);
	        WaitForCurserRunning(5);
	        WaitUntilVisible(CategoriesCountHeader);
	        WaitUntilPresent(CategoriesCountHeader);
	        String[] HeaderCount = GetText(CategoriesCountHeader).split(" ");
	        CategoriesCountAfter1 = Integer.parseInt(HeaderCount[0]);
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(CategoriesCountAfter1 == (CategoriesCountBefore + 1));
			softAssert.assertAll();
	    }

	    public  void Categories_VerifyNoCategoryCreationOnCancel() throws InterruptedException {

	        WaitUntilVisible(CreateCategoryButton);
	        WaitUntilPresent(CreateCategoryButton);
	        WaitForElementInteractable(CreateCategoryButton);
	        ClickOn(CreateCategoryButton);
	        String RandomCategoryname = RandomStrings.RequiredCharacters(5);
	        SendKeys(NameField, "Category " + RandomCategoryname);
	        WaitForElementInteractable(DropdownLinkEmail);
	        ClickByJsExecuter(DropdownLinkEmail);
	        WaitForElementInteractable(EmailTemplatesOptions);
	        ClickByJsExecuter(EmailTemplatesOptions);
	        WaitForElementInteractable(TemplatesSaveButton);
	        ClickByJsExecuter(TemplatesSaveButton);
	        WaitForElementInteractable(CancelButton);
	        ClickByJsExecuter(CancelButton);
	        WaitForCurserRunning(2);
	        WaitUntilVisible(CategoriesCountHeader);
	        WaitUntilPresent(CategoriesCountHeader);
	        String[] HeaderCount = GetText(CategoriesCountHeader).split(" ");
	        CategoriesCountAfter2 = Integer.parseInt(HeaderCount[0]);
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(CategoriesCountAfter2 == (CategoriesCountBefore + 1));
			softAssert.assertAll();
	    }

	    public  void Categories_CantCreateCategoryWithExistingName() throws InterruptedException {
	        WaitUntilPresent(CreateCategoryButton);
	        ClickOn(CreateCategoryButton);
	        SendKeys(NameField, RandomCategoryname);
	        WaitForElementInteractable(CreateCategoryPopupBtn);
	        ClickByJsExecuter(CreateCategoryPopupBtn);
	        WaitUntilVisible(NotificationMsg);
	        NotificationText = GetText(NotificationMsg);
	        ClickOn(CancelButton);
	        WaitForCurserRunning(3);
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(NotificationText.equals("Category exists already."));
			softAssert.assertAll();
	    }

	    public  void Categories_VerifyUpdatedCategory() throws InterruptedException {

	        WaitUntilVisible(InactiveCategoriesCount);
	        WaitUntilPresent(InactiveCategoriesCount);
	        String[] InactiveCountHeader = GetText(InactiveCategoriesCount).split(" ");
	        InactiveCountBefore = Integer.parseInt(InactiveCountHeader[0]);
	        WaitForElementInteractable(EditCategoryIcon2);
	        ClickOn(EditCategoryIcon2);
	        forcedWaitTime(3);
	        WaitUntilVisible(InactiveToggle);
	        WaitUntilPresent(InactiveToggle);
	        WaitForElementInteractable(InactiveToggle);
	        ClickByJsExecuter(InactiveToggle);
	        WebElement NameFld = WaitUntilVisibleWE(NameField);
	        NameFld.clear();
	        NameFld.sendKeys("Edited " + RandomCategoryname);
	        WaitForElementInteractable(SaveButton);
	        ClickOn(SaveButton);
	        WaitUntilElementInvisible(SaveButton);
	        WaitForCurserRunning(2);
	        WaitUntilVisible(CategoriesCountHeader);
	        String[] ActiveHeaderCount = GetText(CategoriesCountHeader).split(" ");
	        CategoriesCountAfter3 = Integer.parseInt(ActiveHeaderCount[0]);
	        WaitUntilVisible(InactiveCategoriesCount);
	        String[] InactiveHeaderCount = GetText(InactiveCategoriesCount).split(" ");
	        InactiveCountAfter = Integer.parseInt(InactiveHeaderCount[0]);
	        Assert.assertEquals(InactiveCountAfter,(InactiveCountBefore + 1));
	    }

	    public  void Categories_VerifyAccurateCount() throws InterruptedException {
	        String[] HeaderCount = GetText(CategoriesCountHeader).split(" ");
	        CategoriesCountHeader1 = Integer.parseInt(HeaderCount[0]);
	        List<WebElement> ActualCountCategories = driver.findElements(ActualCategoriesCount);
	        CountCategoriesActual = ActualCountCategories.size();
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(CategoriesCountHeader1 == CountCategoriesActual);
			softAssert.assertAll();
	    }
	
	
	

}
