package POM;

import BrowsersBase.BrowsersInvoked;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import BrowsersBase.BrowsersInvoked;
import CommonMethods.Helper;

public class AgencyCreationUtility extends Helper {

	public WebDriver driver;
	LoginUtility log;

	public AgencyCreationUtility(WebDriver driver) {
		super(driver);
		this.driver = driver;
		log = new LoginUtility(driver);
	}
	
	
	
	    public static By CreateAgencyButton = By.xpath("//button[text()='Create Agency']");
	    public static By FinesTracking = By.xpath("//span[contains(text(),'Fines Tracking')]");
	    public static By FineTrackingLbl = By.xpath("//label[contains(text(),'Fines Tracking:')]//span");
	    public static By AgencyNameField = By.xpath("//input[@name='name']");
	    public static By StreetAddressField = By.xpath("//input[@name='streetAddress']");
	    public static By CityField = By.xpath("//input[@name='city']");
	    public static By StateDropdownField = By.xpath("//label[text()='Select Option']");
	    public static By ZipField = By.xpath("//input[@name='zip']");
	    public static By TimezoneDropdownField = By.xpath("//div[@class='Select-placeholder']");
	    public static By EmailField = By.xpath("//input[@name='email']");
	    public static By WebsiteURLField = By.xpath("//input[@name='websiteURL']");
	    public static By SendFromEmailField = By.xpath("//input[@name='sendFromEmail']");
	    public static By SendFromTextMessageToggle = By.xpath("(//div[@class='react-toggle-thumb'])[2]");
	    public static By CodeEnforcementLinkText = By.xpath("//div[text()='Code Enforcement']");
	    public static By CRMLinkText = By.xpath("//div[text()='CRM']");
	    public static By ProductNameField = By.xpath("//div[@class='product-form__info']//input");
	    public static By WaterVioToggle = By.xpath("//span[text()='General']");
	    public static By AnimalVioToggle = By.xpath("//span[text()='Animal']");
	    public static By AddCodeEnforcementButton = By.xpath("//button[text()='Add Code Enforcement']");
	    public static By CRMProductNameField = By.xpath("//div[@class='product-form__info crm']//input");
	    public static By AddCRMButton = By.xpath("//button[text()='Add CRM']");
	    public static By CreateAgencyButton2 = By.xpath("//h1[text()='Create Agency']/following::button[2]");
	    public static By CreateAgencyPopup = By.xpath("//h1[text()='Create Agency']");
	    public static By ValidationMsg = By.xpath("//span[@class='field__error']");
	    public static By PlusIconOnHeader = By.xpath("//div[@class='app-header__new']");
	    public static By CCPOption = By.xpath("//label[text()='Code Enforcement Case']");
	    public static By CSPOption = By.xpath("//label[text()='Customer submission']");
	    public static By AddAndConfigureCEPopup = By.xpath("//div[text()='Add & Configure Code Enforcement']");
	    public static By ValidationProdName = By.xpath("//div[@class='product-form__info']//span");
	    public static By AddAndConfigureCRMPopup = By.xpath("//div[text()='Add & Configure CRM']");
	    public static By ValidationProdNameCRM = By.xpath("//div[@class='product-form__info crm']//span");
	    public static By ProductNameFieldCRM = By.xpath("//div[@class='product-form__info crm']//input");
	    public static By BackToUrLCitizenView = By.xpath("//input[@name='citizenPortalHomeLinkURL']");
	    public static By StateSearchField = By.xpath("//input[@name='query']");
	    public static By SearchedStateOption = By.xpath("//ul[@class='dropdown__options--single']//span");
	    public static By PSTOption = By.xpath("//*[text()='PST']");
	    public static By SendFromTextMessageField = By.xpath("//input[@name='sendFromPhoneNumber']");
	    public static By AgencySearchField = By.xpath("//input[@placeholder='Search by keyword']");
	    public static By AddedCEProduct = By.xpath("//div[@class='agency-form__product-header-title']/h4[1]");
	    public static By AddedCRMProduct = By.xpath("(//div[@class='agency-form__product-header-title']/h4[1])[2]");
	    public static By NewAgencyCreated = By.xpath("//div[@class='rt-tr -odd']/div[2]");

	    public static String CreateAgencyPopupTitle;
	    public static String AddAndConfigureCEPopupTitle;
	    public static String ValidationMSgProdName;
	    public static String ValidationMSgCharLimit;
	    public static String ExpectedValidationMsgProdName;
	    public static String ExpectedProdCharLimitMsg;
	    public static String AddedCETitle;
	    public static String AddAndConfigureCRMPopupTitle;
	    public static String ValidationMSgProdNameCRM;
	    public static String AddedCRMTitle;
	    public static String ValidationMSgCharLimitCRM;
	    public static String RandomAgencyName;
	    public static String NewAgencyTitle;
	    public static String ExpectedProdCharLimitMsgCRM;
	    public static Boolean FineToggle;
	    public static String FineTrackingStatus;

}
