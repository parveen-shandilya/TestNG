package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import BrowsersBase.BrowsersInvoked;
import CommonMethods.CECommonMethods;
import CommonMethods.CRMCommonMethods;
import CommonMethods.Helper;

public class LoginAgencyUtility extends Helper {
	
	public WebDriver driver;
	LoginUtility log;
	CRMCommonMethods crmCommonMethod;
	CECommonMethods ceCommonMethod;

	public LoginAgencyUtility(WebDriver driver) {
		super(driver);
		this.driver = driver;
		log = new LoginUtility(driver);
		crmCommonMethod=new CRMCommonMethods(driver);
		ceCommonMethod=new CECommonMethods(driver);
	}
	
	
	 public static String Username = "okta-signin-username";
	    public static String Password = "okta-signin-password";
	    public static String Button = "okta-signin-submit";
	    public static String agencyLoggedInUsername = "//div[@class='app-header__user-name']/label";
	    public static String plusIconToCECRM = "//*[@class='app-header__new']";
	    public static By NextButton = By.id("idp-discovery-submit");
	    public static By OKTAUsernameField = By.xpath("//input[@id='idp-discovery-username']");
	    public static By OKTAPasswordField = By.id("okta-signin-password");
	    public static By OKTASubmitButton = By.id("okta-signin-submit");
	    public static String adminUsername = "//input[@placeholder='Enter Email']";
	    public static String adminPassword = "//input[@placeholder='Enter Password']";
	    public static String adminButton = "//button[text()='Login']";
	    public static String searchAgency = "//span[@class='agencies-listing__search']/input";
	    public static String enterAgencyIcon = "//div[@class='agencies-listing__agency-actions']/button[2]";

	    public static By UsernameField = By.id(Username);
	    public static By PasswordField = By.id(Password);
	    public static By SubmitButton = By.id(Button);
	    public static By AdminUsername = By.xpath(adminUsername);
	    public static By AdminPassword = By.xpath(adminPassword);
	    public static By AdminButton = By.xpath(adminButton);
	    public static By SearchAgency = By.xpath(searchAgency);
	    public static By EnterAgencyIcon = By.xpath(enterAgencyIcon);
	    public static By AgencyLoggedInUsername = By.xpath(agencyLoggedInUsername);
	    public static By PlusIconToCECRM = By.xpath(plusIconToCECRM);

	    public static String AgencyLoggedInUserName;


	    public  void LoginAgencyStage() throws InterruptedException {
	        driver.navigate().to(BrowsersInvoked.AgencyURL);
	        VisibilityOfElementLocated(OKTAUsernameField, 2);
	        SendKeys(OKTAUsernameField, BrowsersInvoked.AgencyUsername);
	        ClickOn(NextButton);
	        SendKeys(OKTAPasswordField, BrowsersInvoked.AgencyPassword);
	        WaitUntilVisible(OKTASubmitButton);
	        ClickOn(OKTASubmitButton);
	        
	        WaitUntilVisible(PlusIconToCECRM);
	        WebElement CPPBtn = driver.findElement(PlusIconToCECRM);
	        if (CPPBtn.isDisplayed() == false) {
	            Assert.assertEquals(false, true);
	        }
	        AgencyLoggedInUserName = GetText(AgencyLoggedInUsername);

	    }

	    public  void LoginAgencyCI() throws InterruptedException {
	        driver.navigate().to(BrowsersInvoked.AgencyURL);
	        
	        SendKeys(UsernameField, BrowsersInvoked.AgencyUsername);
	        SendKeys(PasswordField, BrowsersInvoked.AgencyPassword);
	        WaitUntilVisible(SubmitButton);
	        ClickOn(SubmitButton);
	        
	        WaitUntilVisible(PlusIconToCECRM);
	        WebElement CPPBtn = driver.findElement(PlusIconToCECRM);
	        if (CPPBtn.isDisplayed() == false) {
	            Assert.assertEquals(false, true);
	        }
	        AgencyLoggedInUserName = GetText(AgencyLoggedInUsername);
	    }

	    public  void LoginAgencyQa() throws InterruptedException {
	        
	        SendKeys(UsernameField, BrowsersInvoked.AgencyUsername);
	        SendKeys(PasswordField, BrowsersInvoked.AgencyPassword);
	        WaitUntilVisible(SubmitButton);
	        ClickOn(SubmitButton);
	        
	        WaitUntilVisible(PlusIconToCECRM);
	        WebElement CPPBtn = driver.findElement(PlusIconToCECRM);
	        if (CPPBtn.isDisplayed() == false) {
	            Assert.assertEquals(false, true);
	        }
	        AgencyLoggedInUserName = GetText(AgencyLoggedInUsername);

	        
	    }

	    public  void LoginAgency() throws InterruptedException {
	        try {
	            driver.navigate().to(BrowsersInvoked.AgencyURL);
	            if (BrowsersInvoked.RunEnvironment.equalsIgnoreCase("STAGE") || BrowsersInvoked.RunEnvironment.equalsIgnoreCase("Production")) {
	                LoginAgencyStage();
	            } else if (BrowsersInvoked.RunEnvironment.equalsIgnoreCase("CI")) {
	                LoginAgencyCI();
	            } else {
	                LoginAgencyQa();
	            }

	            WaitUntilVisible(PlusIconToCECRM);
	            WebElement CPPBtn = driver.findElement(PlusIconToCECRM);
	            if (CPPBtn.isDisplayed() == false) {
	                Assert.assertEquals(false, true);
	            }
	            AgencyLoggedInUserName = GetText(AgencyLoggedInUsername);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }


	    }

	    public  void LoginAdmin() throws InterruptedException {
	        driver.navigate().to(BrowsersInvoked.AdminURL);
	        SendKeys(AdminUsername, BrowsersInvoked.AdminUsername);
	        SendKeys(AdminPassword, BrowsersInvoked.AdminPassword);
	        ClickOn(AdminButton);
	        WaitUntilElementInvisible(AdminButton);
	        WaitUntilVisible(AgencyCreationUtility.CreateAgencyButton);
	        WaitForElementInteractable(AgencyCreationUtility.CreateAgencyButton);
	        
	    }


}
