package POM;

import BrowsersBase.BrowsersInvoked;

import java.awt.AWTException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class CreateCRMUserUtility extends Helper {

	public WebDriver driver;
	LoginUtility log;

	public CreateCRMUserUtility(WebDriver driver) {
		super(driver);
		this.driver = driver;
		log = new LoginUtility(driver);

	}

	

	public void LoginAgency() throws InterruptedException {
		log.LoginAgency();

	}
	
	
	
	  public static String createUserButton = "//button[text()='Create User']";
	    public static String createUserPopupTitle = "//h1[text()='Create User']";
	    public static String firstNameField = "//input[@name='firstName']";
	    public static String lastNameField = "//input[@name='lastName']";
	    public static String emailField = "//input[@name='email']";
	    public static String roleDropdown = "//label[text()='Role']/following::span[1]";
	    public static String roleSelectArrow = "(//span[@class='Select-arrow-zone'])[2]//span";
	    public static String standardUserOption = "//*[text()='Standard User CRM']";

	    public static String productAdminOption = "//*[text()='Product Admin CRM']";
	    public static String addGroupDropdown = "//label[text()='Add Group']";
	    public static String standardGroupCheckbox = "//label[text()='Standard Group']";
	    public static String adminGroupCheckbox = "//label[text()='Admin Group']";
	    public static String applyButton = "//button[text()='Apply']";
	    public static String cancelButton = "//button[text()='Cancel']";
	    public static String saveButton = "//button[text()='Save']";
	    public static String searchField = "//input[@placeholder='Filter by name or email'][@type='TEXT']";

	    public static String usersCount = "//div[@class='agency-setup-tab__section__header']/h2";
	    public static String searchResultName = "//div[@class='rt-tr -odd']/div";
	    public static String createUserPopupBtn = "//div[@class='user-form__header full-page-modal__header']//button[text()='Create User']";
	    public static String editUserIcon = "//button[@class='edit-btn  btn btn-primary']";
	    public static String editUserIcon1 = "(//button[@class='edit-btn  btn btn-primary'])[1]";
	    public static String editUserpopupTitle = "//h1[text()='Edit User']";
	    public static String yopmailSearchUser = "//input[@class='ycptinput']";
	    public static String paginationText = "//span[@class='table__pagination-of-text']";
	    public static String userSearchResult = "//div[@class='rt-tr-group']";
	    public static String yopmailInboxArrow = "//button[@class='md']";
	    public static String rolesTab = "//div[text()='Roles']";
	    public static String createRoleButton = "//button[text()='Create Role']";
	    public static String createRolePopupTitle = "//h1[text()='Create Role']";
	    public static String roleNameField = "//input[@placeholder='Enter Text']";
	    public static String descriptionField = "//textarea[@name='description']";
	    public static String createRolePopupBtn = "//div[@class='modal-header']//following::button[text() ='Create Role']";
	    public static String roleCreatedSuccessMsg = "//span[text()='Role created']";
	    public static String resetPasswordLink = "//a[text()='Send Reset Password Link']";
	    public static String iframeSwitch = "//iframe[@id='ifmail']";
	    public static String firstMail = "//button[@class='lm']";
	    public static String activateOktaBtn = "//span[text()='Activate Okta Account']";
	    public static String newPassword = "//input[@name='newPassword']";
	    public static String verifyPassword = "//input[@name='verifyPassword']";
	    public static String resetPasswordBtn = "//span[text()='Reset Password']";
	    public static String productSettingsToggle = "//span[@class='toggle__children']";
	    public static String deleteReissueYesBtn = "//label[@title='Delete and Reissue Notice']/following::button[text()='Yes'][1]";
	    public static String basicToggle = "//button[text()='Basic']";
	    public static String groupsTab = "//div[text()='Groups']";
	    public static String createNewGroupBtn = "//button[text()='Create New Group']";
	    public static String createGroupPopupTitle = "//h1[text()='Create Group']";
	    public static String createGroupPopupBtn = "//button[text()='Create Group']";
	    public static String groupName = "//input[@name='label']";
	    public static String groupCreatedSuccessMsg = "//span[text()='Group created']";
	    public static String nextNavigationIcon = "//div[@class='table__pagination-nav-btns']/button[2]";
	    public static String createMyAccountBtn = "//input[@value='Create My Account']";
	    public static String standardUserCEOption = "//*[text()='Agency Admin CRM and CEM']";
	    public static String agencyAdminUseerCECRMOption = "//*[text()='Agency Admin CRM and CEM']";

	    public static By CreateUserButton = By.xpath(CreateCRMUserUtility.createUserButton);
	    public static By CreateUserPopupTitle = By.xpath(CreateCRMUserUtility.createUserPopupTitle);
	    public static By FirstNameField = By.xpath(CreateCRMUserUtility.firstNameField);
	    public static By LastNameField = By.xpath(CreateCRMUserUtility.lastNameField);
	    public static By EmailField = By.xpath(CreateCRMUserUtility.emailField);
	    public static By RoleDropdown = By.xpath(CreateCRMUserUtility.roleDropdown);
	    public static By StandardUserOption = By.xpath(CreateCRMUserUtility.standardUserOption);
	    public static By StandardUseerCEOption = By.xpath(standardUserCEOption);
	    public static By AgencyAdminUseerCECRMOption = By.xpath(agencyAdminUseerCECRMOption);
	    public static By ProductAdminOption = By.xpath(CreateCRMUserUtility.productAdminOption);
	    public static By RoleSelectArrow = By.xpath(CreateCRMUserUtility.roleSelectArrow);
	    public static By AddGroupDropdown = By.xpath(CreateCRMUserUtility.addGroupDropdown);
	    public static By StandardGroupCheckbox = By.xpath(CreateCRMUserUtility.standardGroupCheckbox);
	    public static By AdminGroupCheckbox = By.xpath(CreateCRMUserUtility.adminGroupCheckbox);
	    public static By ApplyButton = By.xpath(CreateCRMUserUtility.applyButton);
	    public static By CancelButton = By.xpath(CreateCRMUserUtility.cancelButton);
	    public static By SaveButton = By.xpath(CreateCRMUserUtility.saveButton);
	    public static By SearchField = By.xpath(CreateCRMUserUtility.searchField);
	    public static By CreateUserPopupBtn = By.xpath(CreateCRMUserUtility.createUserPopupBtn);
	    public static By UsersCount = By.xpath(CreateCRMUserUtility.usersCount);
	    public static By UserSearchResult = By.xpath(CreateCRMUserUtility.userSearchResult);
	    public static By EditUserIcon = By.xpath(CreateCRMUserUtility.editUserIcon);

	    public static By EditUseerIcon1 = By.xpath(CreateCRMUserUtility.editUserIcon1);

	    public static By ResetPasswordLink = By.xpath(CreateCRMUserUtility.resetPasswordLink);
	    public static By EditUserpopupTitle = By.xpath(CreateCRMUserUtility.editUserpopupTitle);
	    public static By YopmailSearchUser = By.xpath(CreateCRMUserUtility.yopmailSearchUser);
	    public static By PaginationText = By.xpath(CreateCRMUserUtility.paginationText);
	    public static By SearchResultName = By.xpath(CreateCRMUserUtility.searchResultName);
	    public static By YopmailInboxArrow = By.xpath(CreateCRMUserUtility.yopmailInboxArrow);
	    public static By CreateRoleButton = By.xpath(CreateCRMUserUtility.createRoleButton);
	    public static By RolesTab = By.xpath(CreateCRMUserUtility.rolesTab);
	    public static By CreateRolePopupTitle = By.xpath(CreateCRMUserUtility.createRolePopupTitle);
	    public static By RoleNameField = By.xpath(CreateCRMUserUtility.roleNameField);
	    public static By DescriptionField = By.xpath(CreateCRMUserUtility.descriptionField);
	    public static By CreateRolePopupBtn = By.xpath(CreateCRMUserUtility.createRolePopupBtn);
	    public static By IframeSwitch = By.xpath(CreateCRMUserUtility.iframeSwitch);
	    public static By FirstMail = By.xpath(CreateCRMUserUtility.firstMail);
	    public static By ActivateOktaBtn = By.xpath(CreateCRMUserUtility.activateOktaBtn);
	    public static By NewPassword = By.xpath(CreateCRMUserUtility.newPassword);
	    public static By VerifyPassword = By.xpath(CreateCRMUserUtility.verifyPassword);
	    public static By ResetPasswordBtn = By.xpath(CreateCRMUserUtility.resetPasswordBtn);
	    public static By RoleCreatedSuccessMsg = By.xpath(CreateCRMUserUtility.roleCreatedSuccessMsg);
	    public static By ProductSettingsToggle = By.xpath(CreateCRMUserUtility.productSettingsToggle);
	    public static By DeleteReissueYesBtn = By.xpath(CreateCRMUserUtility.deleteReissueYesBtn);
	    public static By BasicToggle = By.xpath(CreateCRMUserUtility.basicToggle);
	    public static By GroupsTab = By.xpath(CreateCRMUserUtility.groupsTab);
	    public static By CreateNewGroupBtn = By.xpath(CreateCRMUserUtility.createNewGroupBtn);
	    public static By CreateGroupPopupTitle = By.xpath(CreateCRMUserUtility.createGroupPopupTitle);
	    public static By CreateGroupPopupBtn = By.xpath(CreateCRMUserUtility.createGroupPopupBtn);
	    public static By GroupName = By.xpath(CreateCRMUserUtility.groupName);
	    public static By GroupCreatedSuccessMsg = By.xpath(CreateCRMUserUtility.groupCreatedSuccessMsg);
	    public static By NextNavigationIcon = By.xpath(CreateCRMUserUtility.nextNavigationIcon);
	    public static By CreateMyAccountBtn = By.xpath(CreateCRMUserUtility.createMyAccountBtn);
	    public static By CasesTab = By.xpath("//a[text()='Cases']");
	    public static By SubmissionsTab = By.xpath("//a[text()='Customer Submissions']");
	   // public static By LogoutDropdownArrow = By.xpath("//div[@class='app-header__user-name']//div[@class='app-header__user-name-caret']");
	   public static By LogoutDropdownArrow = By.cssSelector("div.app-header__user-profile div:nth-child(1)");
	    public static By LogoutOption = By.xpath("//label[text()='Logout']");
	    public static By AgencyAdminCEM = By.xpath("//*[text()='Agency Admin CEM']");
	    public static By AgencyAdminCRMOnly = By.xpath("//*[text()='Agency Admin CRM']");

	    public static String RandomFirstNameCRM = "CRM" + RandomStrings.RequiredCharacters(6);
	    public static String RandomLastNameCRM = RandomStrings.RequiredCharacters(6);

	    public static boolean CreateStandardUser_CompareCount;
	    public static boolean CreateProductAdminUser_CompareCount;
	    public static boolean CEAbsence;
	    public static boolean CRMAccess;
	    public static String FirstUserName;

	    public static String RandomupdatedPassword;

	    public  void CreateCRMUser_CreateStandardUser() throws InterruptedException {
	       CloseOtherTabs();
	        driver.get(BrowsersInvoked.URLUserManagement);
	       WaitForCurserRunning(10);
	       WaitUntilVisible(UsersCount);
	       WaitUntilPresent(UsersCount);
	        Thread.sleep(10000);
	       WaitUntilPresent(UsersCount);
	        String[] CountUsers1 = (driver.findElement(UsersCount).getText()).split(" ");
	        String UsersBefore = CountUsers1[0];
	        int TotalUsersBefore = Integer.parseInt(UsersBefore);
	        if(TotalUsersBefore == 0){
	            Thread.sleep(10000);
	            CountUsers1 = (driver.findElement(UsersCount).getText()).split(" ");
	            UsersBefore = CountUsers1[0];
	            TotalUsersBefore = Integer.parseInt(UsersBefore);
	        }
	       WaitUntilVisible(CreateUserButton);
	       WaitForElementInteractable(CreateUserButton);
	       ClickByJsExecuter(CreateUserButton);
	       WaitUntilVisible(FirstNameField);
	       WaitForElementInteractable(FirstNameField);
	       SendKeys(FirstNameField, "Stand" + RandomFirstNameCRM);
	       SendKeys(LastNameField, RandomLastNameCRM);
	        String EmailRandom = "stand" + RandomFirstNameCRM + RandomLastNameCRM + "@yopmail.com";
	       SendKeys(EmailField, EmailRandom);
	       ClickOn(RoleDropdown);
	       WaitUntilVisible(AgencyAdminUseerCECRMOption);
	       WaitForElementInteractable(AgencyAdminUseerCECRMOption);
	       ClickOn(AgencyAdminUseerCECRMOption);
	       ClickOn(AddGroupDropdown);
	       WaitUntilVisible(StandardGroupCheckbox);
	       WaitForElementInteractable(StandardGroupCheckbox);
	       ClickOn(StandardGroupCheckbox);
	       WaitUntilVisible(ApplyButton);
	       WaitForElementInteractable(ApplyButton);
	       ClickOn(ApplyButton);
	       WaitUntilVisible(CreateUserPopupBtn);
	       WaitForElementInteractable(CreateUserPopupBtn);
	        Thread.sleep(4000);
	       ClickOn(CreateUserPopupBtn);
	       WaitUntilElementInvisible(CreateUserPopupBtn);
	       WaitForCurserRunning(10);
	        Thread.sleep(4000);
	       WaitUntilVisible(UsersCount);
	        String[] CountUsers2 =GetText(UsersCount).split(" ");
	        String UsersAfter = CountUsers2[0];
	        int TotalUsersAfter = Integer.parseInt(UsersAfter);
	        System.out.println(TotalUsersAfter);
	        System.out.println(TotalUsersBefore + 1);
	        CreateStandardUser_CompareCount = (TotalUsersAfter == (TotalUsersBefore + 1));
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(CreateStandardUser_CompareCount, true);
			softAssert.assertAll();
	    }

	    public  void CreateCRMUser_CreateProductAdminUser() throws InterruptedException {

	        Thread.sleep(8000);
	        String[] CountUsers1 =GetText(UsersCount).split(" ");
	        String UsersBefore = CountUsers1[0];
	        int TotalUsersBefore = Integer.parseInt(UsersBefore);
	       waitForPresenceandVisiblity(CreateUserButton);
	       ScrollIntoView(CreateUserButton);
	       WaitForElementInteractable(CreateUserButton);
	       WaitUntilPresent(CreateUserButton);
	       ClickByJsExecuter(CreateUserButton);
	       waitForPresenceandVisiblity(FirstNameField);
	       WaitForElementInteractable(FirstNameField);
	        FirstUserName = "Prod Admin" + RandomFirstNameCRM;
	       SendKeys(FirstNameField, FirstUserName);
	       SendKeys(LastNameField, RandomLastNameCRM);
	        String EmailRandom = "prodadmin" + RandomFirstNameCRM + RandomLastNameCRM + "@yopmail.com";
	       SendKeys(EmailField, EmailRandom);
	       ClickOn(RoleDropdown);
	       WaitUntilVisible(ProductAdminOption);
	       WaitForElementInteractable(ProductAdminOption);
	       ClickOn(ProductAdminOption);
	       WaitUntilVisible(AddGroupDropdown);
	       WaitForElementInteractable(AddGroupDropdown);
	       ClickOn(AddGroupDropdown);
	       WaitUntilVisible(AdminGroupCheckbox);
	       WaitForElementInteractable(AdminGroupCheckbox);
	       ClickOn(AdminGroupCheckbox);
	       WaitUntilVisible(ApplyButton);
	       WaitForElementInteractable(ApplyButton);
	       ClickOn(ApplyButton);
	       WaitUntilVisible(CreateUserPopupBtn);
	        Thread.sleep(4000);
	       WaitForElementInteractable(CreateUserPopupBtn);
	       ClickByJsExecuter(CreateUserPopupBtn);
	       WaitUntilElementInvisible(CreateUserPopupBtn);
	       WaitForCurserRunning(10);
	        Thread.sleep(4000);
	       WaitUntilVisible(UsersCount);
	       WaitUntilVisible(By.xpath("//div[contains(text(),'"+FirstUserName+"')][@role='gridcell']"));
	        String[] CountUsers2 =GetText(UsersCount).split(" ");
	        String UsersAfter = CountUsers2[0];
	        int TotalUsersAfter = Integer.parseInt(UsersAfter);
	        System.out.println(TotalUsersAfter);
	        System.out.println(TotalUsersBefore + 1);
	        CreateProductAdminUser_CompareCount = (TotalUsersAfter == (TotalUsersBefore + 1));
	    	SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(CreateProductAdminUser_CompareCount, true);
			softAssert.assertAll();
	    }

	    public  void CreateStandardCEUser() throws InterruptedException {
	       WaitForElementInteractable(CreateUserButton);
	       ClickOn(CreateUserButton);
	       WaitUntilVisible(FirstNameField);
	       WaitForElementInteractable(FirstNameField);
	        String rn = RandomStrings.RequiredCharacters(3);
	       SendKeys(FirstNameField, "CE User" + RandomFirstNameCRM);
	       SendKeys(LastNameField, RandomLastNameCRM);
	        String EmailRandom = "stand" + RandomFirstNameCRM + rn + RandomLastNameCRM + "@yopmail.com";

	       WaitForElementInteractable(EmailField);
	       SendKeys(EmailField, EmailRandom);
	       WaitForElementInteractable(RoleDropdown);
	       ClickOn(RoleDropdown);
	       WaitUntilVisible(AgencyAdminUseerCECRMOption);
	       WaitForElementInteractable(AgencyAdminUseerCECRMOption);
	       ClickOn(AgencyAdminUseerCECRMOption);
	       WaitUntilVisible(AddGroupDropdown);
	       WaitForElementInteractable(AddGroupDropdown);
	       ClickOn(AddGroupDropdown);
	       WaitUntilVisible(StandardGroupCheckbox);
	       WaitForElementInteractable(StandardGroupCheckbox);
	       ClickOn(StandardGroupCheckbox);
	       WaitUntilVisible(ApplyButton);
	       WaitForElementInteractable(ApplyButton);
	       ClickOn(ApplyButton);
	       WaitUntilVisible(CreateUserPopupBtn);
	        Thread.sleep(4000);
	       WaitForElementInteractable(CreateUserPopupBtn);
	       ClickOn(CreateUserPopupBtn);
	       WaitUntilElementInvisible(CreateUserPopupBtn);
	       WaitForCurserRunning(10);
	        Thread.sleep(4000);
	        
	    }


	    public  void CreateStandardCRMUser() throws InterruptedException {
	       WaitForElementInteractable(CreateUserPopupBtn);
	       ClickOn(CreateUserButton);
	       WaitUntilVisible(FirstNameField);
	        Thread.sleep(2000);
	       WaitForElementInteractable(FirstNameField);
	        String rn = RandomStrings.RequiredCharacters(3);
	       SendKeys(FirstNameField, "CRM User" + RandomFirstNameCRM);
	       SendKeys(LastNameField, RandomLastNameCRM);
	        String EmailRandom = "stand" + RandomFirstNameCRM + rn + RandomLastNameCRM + "@yopmail.com";

	       WaitUntilVisible(EmailField);
	       WaitForElementInteractable(EmailField);
	       SendKeys(EmailField, EmailRandom);

	       WaitUntilVisible(RoleDropdown);
	       WaitForElementInteractable(RoleDropdown);
	       ClickOn(RoleDropdown);

	       WaitUntilVisible(AgencyAdminUseerCECRMOption);
	       WaitForElementInteractable(AgencyAdminUseerCECRMOption);
	       ClickOn(AgencyAdminUseerCECRMOption);

	       WaitUntilVisible(AddGroupDropdown);
	       WaitForElementInteractable(AddGroupDropdown);
	       ClickOn(AddGroupDropdown);

	       WaitUntilVisible(StandardGroupCheckbox);
	       WaitForElementInteractable(StandardGroupCheckbox);
	       ClickOn(StandardGroupCheckbox);

	       WaitUntilVisible(ApplyButton);
	       WaitForElementInteractable(ApplyButton);
	       ClickOn(ApplyButton);

	       WaitUntilVisible(CreateUserPopupBtn);
	        Thread.sleep(4000);
	       WaitForElementInteractable(CreateUserPopupBtn);
	       ClickOn(CreateUserPopupBtn);
	       WaitUntilElementInvisible(CreateUserPopupBtn);
	       WaitForCurserRunning(10);
	        Thread.sleep(4000);
	        
	    }


	    public  void CreateCRMUser_UpdateCEOnlyUserToCRMOnly() throws InterruptedException {
	       WaitUntilVisible(SearchField);
	       WaitUntilPresent(SearchField);
	       WaitForElementInteractable(SearchField);
	       SendKeys(SearchField, "CE User");
	       WaitForCurserRunning(4);
	        Thread.sleep(4000);
	        int count = driver.findElements(By.xpath("//div[contains(text(),'No user found')]")).size();
	        if (count > 0) {

	            CreateStandardCEUser();
	           WaitForElementInteractable(SearchField);
	           Clear(SearchField);
	           SendKeys(SearchField, "CE User");
	           WaitForCurserRunning(7);
	           WaitUntilVisible(By.xpath("//div[contains(text(),'CE User')]"));

	        }
	       WaitUntilVisible(By.xpath("//div[contains(text(),'CE User')]"));
	       WaitUntilPresent(By.xpath("//div[contains(text(),'CE User')]"));
	       WaitForElementInteractable(EditUserIcon);
	       ClickOn(EditUserIcon);
	       WaitUntilVisible(FirstNameField);
	       WaitForElementInteractable(FirstNameField);
	        Thread.sleep(8000);
	        WebElement FirstNameFld =WaitUntilVisibleWE(FirstNameField);
	       // FirstNameFld.clear();
	        driver.findElement(FirstNameField).clear();
	       forcedWaitTime(3);
	       WaitForElementInteractable(FirstNameField);
	       SendKeys(FirstNameField, "CE To CRM");
	       forcedWaitTime(4); // interactable issue could not be resolved by selenium waits
	       WaitUntilVisible(RoleDropdown);
	       WaitForElementInteractable(RoleDropdown);
	        Thread.sleep(2000);
	       ClickOn(RoleDropdown);
	       WaitUntilVisible(ProductAdminOption);
	       WaitForElementInteractable(ProductAdminOption);
	       ClickByJsExecuter(ProductAdminOption);
	        
	       WaitUntilVisible(SaveButton);
	        Thread.sleep(4000);
	       WaitForElementInteractable(SaveButton);
	       ClickOn(SaveButton);
	       WaitUntilElementInvisible(SaveButton);
	       WaitForCurserRunning(9);
	        Thread.sleep(2000);
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertAll();
	        

	    }

	    public  void CreateCRMUser_VerifyCRMProductAccessToCRMUser() throws InterruptedException, AWTException {
	        driver.get(BrowsersInvoked.URLUserManagement);
	       WaitForCurserRunning(10);
	       WaitUntilVisible(SearchField);
	       WaitForElementInteractable(SearchField);
	        WebElement SearchUserField =WaitUntilVisibleWE(SearchField);
	       forcedWaitTime(3);
	        SearchUserField.clear();
	        SearchUserField.sendKeys("CE To CRM");
	       WaitForCurserRunning(4);
	       forcedWaitTime(3);
	        int count = driver.findElements(By.xpath("//div[contains(text(),'No user found')]")).size();
	        if (count > 0) {

	            CreateStandardCRMUser();
	           forcedWaitTime(3);
	           Clear(SearchField);
	           SendKeys(SearchField, "CE To CRM");
	           WaitForCurserRunning(4);
	           WaitUntilVisible(By.xpath("//div[contains(text(),'CE To CRM')]"));

	        }
	       WaitUntilVisible(By.xpath("//div[contains(text(),'CE To CRM')]"));
	       WaitForElementInteractable(EditUserIcon);
	       ClickByJsExecuter(EditUserIcon);
	       WaitUntilVisible(EmailField);
	       forcedWaitTime(3);
	       WaitUntilVisible(ResetPasswordLink);
	       WaitForElementInteractable(ResetPasswordLink);
	       ClickByJsExecuter(ResetPasswordLink);
	       VisibilityOfElementLocated(EmailField, 2);
	        String YopmailID = driver.findElement(EmailField).getAttribute("value");
	        ((JavascriptExecutor) driver).executeScript("window.open()");
	        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	        driver.switchTo().window(tabs.get(1));
	        driver.navigate().to("https://yopmail.com/en/");
	       WaitForCurserRunning(4);
	       forcedWaitTime(4);
	       WaitUntilVisible(YopmailSearchUser);
	       WaitUntilPresent(YopmailSearchUser);
	       WaitForElementInteractable(YopmailSearchUser);
	       SendKeys(YopmailSearchUser, YopmailID);
	       WaitForElementInteractable(YopmailInboxArrow);
	       ClickOn(YopmailInboxArrow);
	       WaitForCurserRunning(4);
	       WaitUntilVisible(IframeSwitch);
	       WaitForElementInteractable(By.xpath("//button[@id='refresh']"));
	       ClickByJsExecuter(By.xpath("//button[@id='refresh']"));
	       WaitUntilVisible(IframeSwitch);
	       forcedWaitTime(3);
	        WebElement switchFrame =WaitUntilVisibleWE(IframeSwitch);
	        driver.switchTo().frame(switchFrame);
	       WaitUntilVisible(ResetPasswordBtn);
	       VisibilityOfElementLocated(ResetPasswordBtn, 2);
	       WaitForElementInteractable(ResetPasswordBtn);
	       ClickOn(ResetPasswordBtn);
	       WaitForCurserRunning(5);
	       forcedWaitTime(4);
	        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
	        driver.switchTo().window(tabs2.get(2));
	        
	        RandomupdatedPassword = "Hello@12" + RandomStrings.RequiredDigits(5);
	        int answerCheck = driver.findElements(By.xpath("//input[@id='input39']")).size();
	        if (answerCheck > 0) {
	           WaitForElementInteractable(By.xpath("//input[@id='input39']"));
	            driver.findElement(By.xpath("//input[@id='input39']")).sendKeys("good");
	            driver.findElement(By.xpath("//input[@value='Reset Password']")).click();
	           WaitForElementInteractable(By.xpath("//input[@name='newPassword']"));
	            driver.findElement(By.xpath("//input[@name='newPassword']")).sendKeys(RandomupdatedPassword);
	            driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(RandomupdatedPassword);
	           WaitUntilVisible(By.xpath("//input[@value='Reset Password']"));
	           WaitForElementInteractable(By.xpath("//input[@value='Reset Password']"));
	            driver.findElement(By.xpath("//input[@value='Reset Password']")).click();
	           WaitForCurserRunning(4);
	           forcedWaitTime(4);
	            driver.switchTo().window((String) tabs2.get(0));
	           refreshPage();
	           WaitForCurserRunning(5);
	            int cancelbtnCheck = driver.findElements(CancelButton).size();
	            if (cancelbtnCheck > 0) {
	               WaitForElementInteractable(CancelButton);
	               ClickOn(CancelButton);
	               WaitForElementInteractable(LogoutDropdownArrow);
	               ClickOn(LogoutDropdownArrow);
	               WaitForElementInteractable(LogoutOption);
	               ClickOn(LogoutOption);
	               WaitForCurserRunning(4);
	            }
	            driver.navigate().to(BrowsersInvoked.AgencyURL);
	           WaitForCurserRunning(8);
	           WaitUntilVisible(SubmissionsTab);
	            List<WebElement> CRMPresence = driver.findElements(SubmissionsTab);
	            CRMAccess = CRMPresence.size() == 1;


	        } else if (driver.findElements(By.xpath("//h1[contains(text(),'Welcome to Comcate')]")).size() > 0) {
	           WaitUntilVisible(By.xpath("//h1[contains(text(),'Welcome to Comcate')]"));
	           WaitForElementInteractable(NewPassword);
	           SendKeys(NewPassword, RandomupdatedPassword);
	           WaitForElementInteractable(VerifyPassword);
	           SendKeys(VerifyPassword, RandomupdatedPassword);
	           WaitForElementInteractable(By.xpath("//input[@id='loginForm.securityAnswer']"));
	           SendKeys(By.xpath("//input[@id='loginForm.securityAnswer']"), "good");
	           WaitForElementInteractable(CreateMyAccountBtn);
	           ClickOn(CreateMyAccountBtn);
	           WaitForCurserRunning(4);
	           forcedWaitTime(2);

	            driver.switchTo().window((String) tabs2.get(0));
	           refreshPage();
	           WaitForCurserRunning(5);
	           forcedWaitTime(2);
	            int cancelbtnCheck = driver.findElements(CancelButton).size();
	            if (cancelbtnCheck > 0) {
	               WaitForElementInteractable(CancelButton);
	               ClickOn(CancelButton);
	               WaitForElementInteractable(LogoutDropdownArrow);
	               ClickOn(LogoutDropdownArrow);
	               WaitForElementInteractable(LogoutOption);
	               ClickOn(LogoutOption);
	               WaitForCurserRunning(4);
	            }
	            driver.navigate().to(BrowsersInvoked.AgencyURL);
	           WaitForCurserRunning(8);
	           WaitUntilVisible(SubmissionsTab);
	            List<WebElement> CRMPresence = driver.findElements(SubmissionsTab);
	            CRMAccess = CRMPresence.size() == 1;
	        }
	        else{
	            List<WebElement> CRMPresence = driver.findElements(SubmissionsTab);
	            CRMAccess = CRMPresence.size() == 1;
	        }
	        
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(CRMAccess, true);
			softAssert.assertAll();


	    }

	    public  void CreateCRMUser_VerifyNoCEAccessToCRMOnlyUser() throws InterruptedException, AWTException {
	        driver.get(BrowsersInvoked.URLUserManagement);
	       WaitForCurserRunning(9);
	       WaitUntilVisible(SearchField);
	       WaitForElementInteractable(SearchField);
	       forcedWaitTime(3);
	        driver.findElement(SearchField).clear();
	       WaitForElementInteractable(SearchField);
	        driver.findElement(SearchField).sendKeys("CE To CRM");
	       WaitForCurserRunning(5);
	       WaitUntilVisible(By.xpath("//div[contains(text(),'CE To CRM')]"));
	       VisibilityOfElementLocated(EditUserIcon, 2);
	       WaitForElementInteractable(EditUserIcon);
	       ClickOn(EditUserIcon);
	       WaitForCurserRunning(8);
	       WaitUntilVisible(RoleDropdown);
	       WaitUntilPresent(RoleDropdown);
	       WaitForElementInteractable(RoleDropdown);
	       ClickOn(RoleDropdown);
	       forcedWaitTime(3);
	       WaitUntilVisible(AgencyAdminCRMOnly);
	       ScrollIntoView(AgencyAdminCRMOnly);
	       WaitForElementInteractable(AgencyAdminCRMOnly);
	       ClickOn(AgencyAdminCRMOnly);
	       WaitUntilVisible(FirstNameField);
	       WaitForElementInteractable(FirstNameField);
	        WebElement FirstNameFld =findElement(FirstNameField);
	        FirstNameFld.clear();
	       SendKeys(FirstNameField, "CRM to CE");
	        String YopmailID = driver.findElement(EmailField).getAttribute("value");
	       WaitForElementInteractable(SaveButton);
	       ClickOn(SaveButton);
	       WaitUntilElementInvisible(SaveButton);
	       WaitForCurserRunning(8);
	       WaitUntilVisible(LogoutDropdownArrow);
	       WaitUntilPresent(LogoutDropdownArrow);
	        Boolean check =findElement(LogoutDropdownArrow).isDisplayed();
	        System.out.println(check + "Log out present");
	       forcedWaitTime(4);
	       ScrollIntoView(LogoutDropdownArrow);
	       WaitForElementInteractable(LogoutDropdownArrow);
	       ClickByJsExecuter(LogoutDropdownArrow);
	       WaitForElementInteractable(LogoutOption);
	       ClickByJsExecuter(LogoutOption);
	       WaitForCurserRunning(3);
	       WaitUntilElementInvisible(CasesTab);
	       WaitForCurserRunning(5);
	       CloseOtherTabs();
	        driver.navigate().to(BrowsersInvoked.AgencyURL);
	       WaitForCurserRunning(8);
	       forcedWaitTime(4);
	            int Logoutbtncheck = driver.findElements(LogoutDropdownArrow).size();
	            if (Logoutbtncheck > 0) {
	               ClickOn(LogoutDropdownArrow);
	               WaitForElementInteractable(LogoutOption);
	               ClickOn(LogoutOption);
	               WaitForCurserRunning(8);

	               WaitForCurserRunning(5);
	            }

	        if (BrowsersInvoked.RunEnvironment.equalsIgnoreCase("QA")) {
	           SendKeys(LoginAgencyUtility.UsernameField, YopmailID);
	           SendKeys(LoginAgencyUtility.PasswordField, BrowsersInvoked.AgencyPassword);
	           ClickOn(LoginAgencyUtility.SubmitButton);
	        } else if (BrowsersInvoked.RunEnvironment.equalsIgnoreCase("STAGE") || BrowsersInvoked.RunEnvironment.equalsIgnoreCase("Production")) {

	           VisibilityOfElementLocated(LoginAgencyUtility.OKTAUsernameField, 2);
	           SendKeys(LoginAgencyUtility.OKTAUsernameField, YopmailID);
	           ClickOn(LoginAgencyUtility.NextButton);
	           SendKeys(LoginAgencyUtility.OKTAPasswordField,BrowsersInvoked.AgencyPassword);
	           WaitUntilVisible(LoginAgencyUtility.OKTASubmitButton);
	           ClickOn(LoginAgencyUtility.OKTASubmitButton);
	        } else {
	            System.out.print(BrowsersInvoked.RunEnvironment);
	        }

	        
	       //WaitUntilVisible(CasesTab);
	        List<WebElement> CLPPresence = driver.findElements(CasesTab);
	        CEAbsence = CLPPresence.size() == 0;
	        
	        SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(CEAbsence, true);
			softAssert.assertAll();
	    }


}
