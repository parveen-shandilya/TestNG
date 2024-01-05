package POM;

import BrowsersBase.BrowsersInvoked;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import CommonMethods.CRMCommonMethods;
import CommonMethods.Helper;
import CommonMethods.RandomStrings;

public class CSPInternalUtility extends Helper {

	public WebDriver driver;
	LoginUtility log;
	CRMCommonMethods crmCommonMethod;

	public CSPInternalUtility(WebDriver driver) {
		super(driver);
		this.driver = driver;
		log = new LoginUtility(driver);
		crmCommonMethod= new CRMCommonMethods(driver);
		
	}
	
	
	
	 public static String plusIconToCRM = "//*[@class='app-header__new']";
	    public static String customerSubmissionOption = "//label[text()='Customer Submission']";
	    public static String cancelCreateCase = "//h1[text()='Create A Case']//parent::div//button[text()='Cancel']";
	    public static String cSPPopupTitle = "//div[@class='full-page-modal__header']/h1";
	    public static String createSubmissionButton = "//button[text()='Create Submission']";
	    public static String globalErrorMessageCSP = "//div[@class='create-submission__global-error']/h2";
	    public static String postAnonymouslyCheckbox = "//label[text()='Post anonymously']";
	    public static String addExistingCustomerField = "//label[@class='contact-tile__searchbox-label']/following::input[1]";
	    public static String nameField = "//input[@name='name']";
	    public static String emailField = "//input[@name='email']";
	    public static String workPhoneField = "//input[@name='workPhone']";
	    public static String cellPhoneField = "//input[@name='phoneNumber']";
	    public static String selectedAnonymousToggle = "//div[@class='post-anonymous-section']//button[@class='square-btn btn btn-primary']";
	    public static String yesToggleAnonymous = "//div[@class='post-anonymous-section']//button[2]";
	    public static String saveChangesButton = "//button[text()='Save Changes']";
	    public static String contactSearchResults = "(//div[@class='react-autosuggest__suggestion-element']/div)[3]";
	    public static String categoryDropdown = "//div[@class='dropdown__selector__selected']/label";
	    public static String searchCategory = "//input[@name='query']";
	    public static String selectedCategory = "//label[@for='selectedCategory']/following::label[1]";
	    public static String searchResultsCategory = "//ul[@class='dropdown__options--single']//li//b";
	    public static String locationValidationMsg = "//div[@class='tile--error-msg']";
	    public static String locationField = "//div[@class='location-tile__inputs-container']//input";
	    public static String locationSearchResult = "//li[@id='react-autowhatever-1-section-0-item-0']";

	    public static String EditLocation = "//div[@class='edit-address__header']/button";
	    public static String issueDescriptionField = "//textarea[@name='issueDescription']";
	    public static String tagsField = "//div[@class='tags-input__chips']/input";
	    public static String attachmentIcon = "//div[text()='Attachments ']/following::button";
	    public static String cameraButton = "//span[text()='Camera']";
	    public static String addButton = "//button[text()='Add']";
	    public static String imageThumb = "//img[@class='attachments-tile__saved-thumb']";
	    public static String submisionStatus = "//h2[@class='customer-submission-details__status']";
	    public static String closeSubmissionIcon = "//div[@class='customer-submission-details__close-icon']/img";
	    public static String cancelButton = "//button[text()='Cancel']";
	    public static String toggleChecked = "//div[@class='react-toggle react-toggle--checked bs-toggle danger']";
	    public static String flagToggle = "(//div[@class='react-toggle-thumb'])[1]";
	    public static String postAnonymouslyCheckboxbtn = "//input[@name='isAnonymous'][@type='checkbox']";


	    public static By PostAnonymouslyCheckboxbtn = By.xpath(postAnonymouslyCheckboxbtn);
	    public static By PlusIconToCRM = By.xpath(plusIconToCRM);
	    public static By CancelCreateCase = By.xpath(cancelCreateCase);
	    public static By CustomerSubmissionOption = By.xpath(customerSubmissionOption);
	    public static By CSPPopupTitle = By.xpath(cSPPopupTitle);
	    public static By CreateSubmissionButton = By.xpath(createSubmissionButton);
	    public static By GlobalErrorMessageCSP = By.xpath(globalErrorMessageCSP);
	    public static By PostAnonymouslyCheckbox = By.xpath(postAnonymouslyCheckbox);
	    public static By AddExistingCustomerField = By.xpath(addExistingCustomerField);
	    public static By NameField = By.xpath(nameField);
	    public static By EmailField = By.xpath(emailField);
	    public static By WorkPhoneField = By.xpath(workPhoneField);
	    public static By CellPhoneField = By.xpath(cellPhoneField);
	    public static By SelectedAnonymousToggle = By.xpath(selectedAnonymousToggle);
	    public static By YesToggleAnonymous = By.xpath(yesToggleAnonymous);
	    public static By SaveChangesButton = By.xpath(saveChangesButton);
	    public static By ContactSearchResults = By.xpath(contactSearchResults);
	    public static By CategoryDropdown = By.xpath(categoryDropdown);
	    public static By SearchCategory = By.xpath(searchCategory);
	    public static By SelectedCategory = By.xpath(selectedCategory);
	    public static By SearchResultsCategory = By.xpath(searchResultsCategory);
	    public static By LocationValidationMsg = By.xpath(locationValidationMsg);
	    public static By LocationSearchResult = By.xpath(locationSearchResult);
	    public static By ToggleChecked = By.xpath(toggleChecked);
	    public static By FlagToggle = By.xpath(flagToggle);
	    public static By LocationField = By.xpath(locationField);
	    public static By IssueDescriptionField = By.xpath(issueDescriptionField);
	    public static By TagsField = By.xpath(tagsField);
	    public static By AttachmentIcon = By.xpath(attachmentIcon);
	    public static By CameraButton = By.xpath(cameraButton);
	    public static By AddButton = By.xpath(addButton);
	    public static By ImageThumb = By.xpath(imageThumb);
	    public static By SubmisionStatus = By.xpath(submisionStatus);
	    public static By CloseSubmissionIcon = By.xpath(closeSubmissionIcon);
	    public static By CancelButton = By.xpath(cancelButton);

	    public static String SelectedToggleForAnonymous;
	    public static String SelectedToggleNow;
	    public static String ErrMessageActual;
	    public static String ErrMessageExpected;
	    public static String CSPTitleActual;
	    public static String CSPTitleExpected;
	    public static boolean PostAnonymouslyState;
	    public static boolean ContactsTileState;
	    public static String EmailValue;
	    public static String ActualCategorySel;
	    public static String ActualCategorySel2;
	    public static String LocValidMsg;
	    public static boolean LocationPresence;
	    public static boolean CheckImgSize;
	    public static String StatusOfSubmission;
	    public static String CreatedCategory1;
	    public static String CreatedCategory2;
	    public static String CreatedCategory3;
	    
	    
	    public void LoginAgency() throws InterruptedException {
			log.LoginAgency();

		}

	    public  void CSPInternal_Prerequisites() throws InterruptedException {
	        driver.navigate().to(BrowsersInvoked.URLSubmissionSettings);
	        WaitForCurserRunning(8);

	        WaitUntilVisible(SelectedAnonymousToggle);
	        String SelectedToggleForAnonymous = GetText(SelectedAnonymousToggle);
	        if (SelectedToggleForAnonymous.equals("No")) {
	            WaitUntilVisible(YesToggleAnonymous);
	            WaitForElementInteractable(YesToggleAnonymous);
	            ClickByJsExecuter(YesToggleAnonymous);
	            WaitForElementInteractable(SaveChangesButton);
	            ClickByJsExecuter(SaveChangesButton);
	            WaitForCurserRunning(5);

	        }
	        WaitUntilVisible(SelectedAnonymousToggle);
	        SelectedToggleNow = GetText(SelectedAnonymousToggle);
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(SelectedToggleNow.equals("Yes"));
			softAssert.assertAll();
	    }

	    public  void CSPInternal_VerifyAllThreeCategoriesCreation() throws InterruptedException {
	        CreatedCategory1 = "Location Required";
	        CreatedCategory2 = "Location Not Included";
	        CreatedCategory3 = "Location Not Required";
	        crmCommonMethod.CRM_CreateCategory("Yes", "Yes", "No", CreatedCategory1);
	        crmCommonMethod.CRM_CreateCategory("No", "No", "No", CreatedCategory2);
	        crmCommonMethod.CRM_CreateCategory("Yes", "Yes", "No", CreatedCategory3);
	    }

	    public  void CSPInternal_VerifyCSPOpensUp() throws InterruptedException {
	        WaitUntilVisible(PlusIconToCRM);
	        WaitForElementInteractable(PlusIconToCRM);
	        ClickByJsExecuter(PlusIconToCRM);
	        WaitUntilVisible(CustomerSubmissionOption);
	        WaitForElementInteractable(CustomerSubmissionOption);
	        ClickByJsExecuter(CustomerSubmissionOption);
	        WaitForCurserRunning(2);
	        WaitUntilVisible(CSPPopupTitle);
	        WaitUntilPresent(CSPPopupTitle);
	        CSPTitleActual = GetText(CSPPopupTitle);
	        CSPTitleExpected = "Create Customer Submission";
	        WaitUntilVisible(CreateSubmissionButton);
	        WaitForElementInteractable(CreateSubmissionButton);
	        ClickByJsExecuter(CreateSubmissionButton);
	        ErrMessageActual = GetText(GlobalErrorMessageCSP);
	        ErrMessageExpected = "Please complete all fields marked in red below to continue.";
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(CSPTitleActual.equals(CSPTitleExpected));
			softAssert.assertTrue(ErrMessageActual.equals(ErrMessageExpected));
			softAssert.assertAll();
	    }

	    public  void CSPInternal_VerifyPostAnonymouslycheckbox() throws InterruptedException {
	        WaitUntilVisible(PostAnonymouslyCheckbox);
	        WebElement PostAnonymously = findElement(PostAnonymouslyCheckbox);
	        PostAnonymouslyState = PostAnonymously.isDisplayed();
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(PostAnonymouslyState);
			softAssert.assertAll();
	    }

	    public  void CSPInternal_VerifyCustomerInformationTile() throws InterruptedException {
	        WaitForElementInteractable(PostAnonymouslyCheckboxbtn);
	        ClickByJsExecuter(PostAnonymouslyCheckboxbtn);
	        WaitUntilVisible(NameField);
	        WebElement ContactsTile = findElement(NameField);
	        ContactsTileState = ContactsTile.isEnabled();
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertFalse(ContactsTileState);
			softAssert.assertAll();
	    }

	    public  void CSPInternal_AddExistingCustomer() throws InterruptedException {
	        refreshPage();
	        WaitUntilVisible(AddExistingCustomerField);
	        WaitForElementInteractable(AddExistingCustomerField);
	        SendKeys(AddExistingCustomerField, "a");

	        WaitUntilVisible(ContactSearchResults);
	        WaitForElementInteractable(ContactSearchResults);
	        ClickByJsExecuter(ContactSearchResults);
	        WaitUntilVisible(EmailField);
	        EmailValue = driver.findElement(EmailField).getAttribute("value");
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertFalse(EmailValue.equals(null));
			softAssert.assertAll();
	    }

	    public  void CSPInternal_VerifyCategoriesList() throws InterruptedException {
	        CSPInternal_VerifyAllThreeCategoriesCreation();
	        driver.navigate().to(BrowsersInvoked.URLCreateCustomerSubmission);
	        WaitForCurserRunning(5);
	        WaitUntilVisible(CategoryDropdown);
	        ScrollIntoView(CategoryDropdown);
	        WaitForElementInteractable(CategoryDropdown);
	        ClickByJsExecuter(CategoryDropdown);
	        WaitUntilVisible(SearchCategory);
	        SendKeys(SearchCategory, CreatedCategory1);
	        WaitUntilVisible(SearchResultsCategory);
	        WaitForElementInteractable(SearchResultsCategory);
	        ClickByJsExecuter(SearchResultsCategory);
	        WaitUntilVisible(SelectedCategory);
	        ActualCategorySel = GetText(SelectedCategory);
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(ActualCategorySel.equals(CreatedCategory1));
			softAssert.assertAll();
	    }

	    public  void CSPInternal_SearchAndAddCategory() throws InterruptedException {
	        WaitUntilVisible(CategoryDropdown);
	        WaitUntilPresent(CategoryDropdown);
	        WaitForElementInteractable(CategoryDropdown);
	        ClickByJsExecuter(CategoryDropdown);
	        WaitUntilVisible(SearchCategory);
	        WaitUntilPresent(SearchCategory);
	        SendKeys(SearchCategory, CreatedCategory1);
	        WaitUntilVisible(SearchResultsCategory);
	        WaitForElementInteractable(SearchResultsCategory);
	        ClickOn(SearchResultsCategory);
	        WaitUntilVisible(SelectedCategory);
	        ActualCategorySel2 = GetText(SelectedCategory);
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(ActualCategorySel2.equals(CreatedCategory1));
			softAssert.assertAll();
	    }

	    public  void CSPInternal_LocationRequiredValCategory() throws InterruptedException {
	        WaitUntilVisible(CreateSubmissionButton);
	        WaitForElementInteractable(CreateSubmissionButton);
	        ClickByJsExecuter(CreateSubmissionButton);
	        WaitUntilVisible(LocationValidationMsg);
	        WaitUntilVisible(LocationValidationMsg);
	        ScrollIntoView(LocationValidationMsg);
	        LocValidMsg = GetText(LocationValidationMsg);
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(LocValidMsg.equals("The location is required."));
			softAssert.assertAll();
	    }

	    public  void CSPInternal_AddLocation() throws InterruptedException {
	        ClickOn(CategoryDropdown);
	        SendKeys(SearchCategory, "Location Not Required");
	        ClickOn(SearchResultsCategory);
	        SendKeys(LocationField, "Texas ");
	        WaitUntilVisible(LocationSearchResult);
	        SendKeys(LocationField, "City Museum");
	        WaitUntilVisible(LocationSearchResult);
	        WaitForElementInteractable(LocationSearchResult);
	        ClickOn(LocationSearchResult);
	    }

	    public  void CSPInternal_CategoryWithLocationIncluded() throws InterruptedException {
	        ClickOn(CategoryDropdown);
	        SendKeys(SearchCategory, CreatedCategory2);
	        WaitForElementInteractable(SearchResultsCategory);
	        ClickOn(SearchResultsCategory);
	        WaitforCustometime(2);
	        JavascriptExecutor jser = (JavascriptExecutor) driver;
	        jser.executeScript("window.scrollBy(0,550)", "");
	        WaitUntilVisible(LocationField);
	        List<WebElement> LocationTile = driver.findElements(LocationField);
	        LocationPresence = (LocationTile.size() == 0);
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(LocationPresence);
			softAssert.assertAll();
	    }

	    public  void CSPInternal_VerifyIssueDescription() throws InterruptedException {
	        String RandomDescription = RandomStrings.RequiredString(20);
	        SendKeys(IssueDescriptionField, RandomDescription);
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertAll();
	    }

	    public  void CSPInternal_AddMultipleTags() throws InterruptedException {
	        for (int i = 0; i < 5; i++) {
	            String RandomTags = RandomStrings.RequiredString(4);
	            SendKeys(TagsField, RandomTags + ",");
	        }
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertAll();
	    }

	    public  void CSPInternal_AddAttachments() throws InterruptedException {
	        ClickOn(AttachmentIcon);
	        WaitUntilVisible(By.xpath("//input[@type='file']"));
	        WebElement UploadFile3 = driver.findElement(By.xpath("//input[@type='file']"));
	        UploadFile3.sendKeys(System.getProperty("user.dir") + "/TestData/Cat_11zon.jpg");
	        WaitForCurserRunning(2);
	        WaitForElementInteractable(AddButton);
	        ClickOn(AddButton);
	        WaitUntilVisible(ImageThumb);
	        List<WebElement> CountAttachments = driver.findElements(ImageThumb);
	        int ImgSize = CountAttachments.size();
	        CheckImgSize = ImgSize >= 1;
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(CheckImgSize);
			softAssert.assertAll();
	    }

	    public  void CSPInternal_VerifySubmissionCreation() throws InterruptedException {
	        WaitUntilVisible(CreateSubmissionButton);
	        WaitForElementInteractable(CreateSubmissionButton);
	        ClickByJsExecuter(CreateSubmissionButton);
	        WaitForCurserRunning(8);
	        WaitUntilVisible(SubmisionStatus);
	        StatusOfSubmission = GetText(SubmisionStatus);
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertTrue(StatusOfSubmission.contains("Open"));
			softAssert.assertAll();
	    }

	    public  void CSPInternal_SubmissionDoesNotGetCreatedOnCancel() throws InterruptedException {
	    	WaitForElementInteractable(CloseSubmissionIcon);
	        ClickByJsExecuter(CloseSubmissionIcon);
	        WaitUntilVisible(PlusIconToCRM);
	        WaitForElementInteractable(PlusIconToCRM);
	        ClickOn(PlusIconToCRM);
	        WaitForElementInteractable(CustomerSubmissionOption);
	        ClickByJsExecuter(CustomerSubmissionOption);
	        WaitForCurserRunning(3);
	        WaitForElementInteractable(CancelButton);
	        ClickByJsExecuter(CancelButton);
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertAll();
	    }
	
	
	
	

}
