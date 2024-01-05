package CommonMethods;

import BrowsersBase.BrowsersInvoked;
import POM.AppPreRequisiteUtility;
import POM.TemplateManagementUtility;
import POM.UserManagementUtility;
import POM.CCPUtility;
import POM.CDP_Utility;
import POM.CLPUtility;
import POM.CloseCaseUtility;
import POM.ForcedAbatementUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.Point;
import java.time.Duration;
import java.util.List;

import static POM.SubmissionAssignmentUtility.*;

public class CECommonMethods extends BrowsersInvoked {
	public WebDriver driver;
	public Helper helper;
	public CECommonMethods CEcommonMethod;
	public CCPUtility ccp;
	public CDP_Utility cdp;
	
	public CECommonMethods(WebDriver driver) {
		super();
		this.driver = driver;
		helper = new Helper(driver);
		
		
	}
	
	
    public  String searchLocationKey1O = PropertiesUtils.getPropertyValue("searchLocationKey1O");
    public  String searchLocationKey = PropertiesUtils.getPropertyValue("searchLocationKey");
    public  boolean ProActiveBtn;

    
  
    
    public  String SetTestDataFilePath(String filename) {
        String resourcePath ;
        if (System.getProperty("os.name").equalsIgnoreCase("windows")) {

            resourcePath = System.getProperty("user.dir") +"\\TestData\\" + filename;

        }
        else {
           resourcePath = System.getProperty("user.dir") + "/TestData/"+filename;

        }
        return resourcePath ;
    }
   
	public By addAttachmentCDP = By.xpath("//span[contains(text(),'Attachments')]//parent::h2//button[@class='attach-btn btn btn-primary']");

    By hamburger= By.xpath("//*[@class='app-header__menu__icon']");
    By agencySetupIcon=By.xpath("(//*[@class='tools-dropdown__tool flex-column--center']/a)[1]");
    By agencyName= By.xpath("//*[@class='agency-info__summary flex-column--left']/h2");
	
	public String getAgencyName()
	{
		helper.ClickByJsExecuter(hamburger);
		helper.ClickByJsExecuter(agencySetupIcon);
		//helper.ClickByJsExecuter(agencySetupIcon);
		String AgencyName =helper.GetText(agencyName).toUpperCase();

		
		
		
		return AgencyName;
		
		
		
	}
	
	public  void CE_AddAttachmentCDP(String path) throws InterruptedException{

        helper.WaitUntilVisible(addAttachmentCDP);
        helper.ScrollIntoView(addAttachmentCDP);
        helper.ClickByJsExecuter(addAttachmentCDP);
        WebElement UploadFile4 = driver.findElement(By.xpath("//input[@type='file']"));
        UploadFile4.sendKeys(path);
        helper.WaitForCurserRunning(5);
        helper.WaitForElementInteractable(ccp.AddBtn);
        helper.ClickOn(ccp.AddBtn);
    }
    
    public  void selectUserScheduleFollowUpInspection(String username) throws InterruptedException {
        int check = helper.fineElementsSize(By.xpath("//button[contains(text(),'"+username+"')]"));
        if(check > 0){
            helper.WaitUntilVisible(By.xpath("//button[contains(text(),'"+username+"')]"));
            helper.ClickOn(By.xpath("//button[contains(text(),'"+username+"')]"));
        }
       else{
    	   helper.WaitUntilVisible(By.xpath("//label[text()='More...']"));
    	   helper.ClickOn(By.xpath("//label[text()='More...']"));
    	   helper.forcedWaitTime(5);
    	   helper.WaitUntilVisible(By.xpath("(//input[@placeholder='Search...'])[2]"));
    	   helper.SendKeys(By.xpath("(//input[@placeholder='Search...'])[2]"),username);
    	   helper.forcedWaitTime(4);
            helper.WaitUntilVisible(By.xpath("//li//b[text()='"+username+"']"));
           helper.ClickOn(By.xpath("//li//b[text()='"+username+"']"));

        }
    }
    
    public  By performInspectionAndCreateCase = By.xpath("//button[text()='Create & Perform Inspection']");

    
    public  void createCaseAndPerformInspection() throws InterruptedException{
        if(driver.findElements(ccp.CloseCDP).size() > 0){
            CloseCaseDetailPage();
        }
        NavigateToCCP();
        helper.WaitUntilVisible(ccp.CCPTitle);
        helper.WaitForElementInteractable(ccp.CCButton);
        Thread.sleep(5000);
        CE_AddLocation();
        CE_AddViolationParam("Wa");
        Thread.sleep(5000);
        CE_AddContact();
        CE_AddAttachmentCrtCasePage(SetTestDataFilePath("pexels-mike-b-170811.jpg"));
        CE_AddAttachmentCrtCasePage(SetTestDataFilePath("pexels-mike-b-810357.jpg"));
        helper.WaitUntilVisible(ccp.CreateCaseButton);
        helper.ScrollIntoView(ccp.CreateCaseButton);
        helper.WaitForElementInteractable(ccp.CreateCaseButton);
        helper.ClickOn(ccp.CreateCaseButton);
        helper.WaitForCurserRunning(5);
        helper.WaitUntilVisible(By.xpath("//h5[text()='Assign Case To']//parent::div//button[@class='square-btn btn btn-primary']"));
        helper.WaitUntilPresent(By.xpath("//h5[text()='Assign Case To']//parent::div//button[@class='square-btn btn btn-primary']"));
        helper.WaitUntilVisible(ccp.performInspectionToogel);
        helper.ClickOn(ccp.performInspectionToogel);
        helper.WaitUntilVisible(ccp.proActiveButton);
        ProActiveBtn =   helper.ElementIsDisplayed(ccp.proActiveButton);
        helper.WaitUntilVisible(ccp.performInspectionAndCreateCase);
        helper.ScrollIntoView(ccp.performInspectionAndCreateCase);
        helper.ClickOn(ccp.performInspectionAndCreateCase);
        helper.WaitForCurserRunning(5);
        helper.WaitUntilVisible(By.xpath("//h1[contains(text(),'Verification Inspection')]"));
    }
    
//    public  void SearchCaseOnCLP (String caseId) throws InterruptedException{
//
//
//        NavigationTo_CaseListPage();
//        helper.WaitUntilPresent(cslp.CSLPSearchField);
//        helper.WaitUntilPresent(cslp.CSLPSearchField);
//        helper.Clear(cslp.CSLPSearchField);
//        helper.WaitForElementInteractable(cslp.CSLPSearchField);
//        helper.SendKeys(cslp.CSLPSearchField,caseId);
//        helper.WaitForCurserRunning(2);
//        helper.WaitUntilVisible(By.xpath("//a[text()='"+caseId+"']"));
//        helper.WaitUntilVisible(By.xpath("//a[text()='"+caseId+"']"));
//        helper.WaitForElementInteractable(By.xpath("//a[text()='"+caseId+"']"));
//
//    }
    
    
    public  void CE_CreateACase() throws InterruptedException {

    	helper.waitForPresenceandVisiblity(AppPreRequisiteUtility.AppMenuIcon);
    	helper.WaitForElementInteractable(AppPreRequisiteUtility.AppMenuIcon);
        WebElement CCPBtnJSE =helper.FindElementByXPath("//*[@class='app-header__new']");
    	//WebElement CCPBtnJSE =helper.GetWebElementByJS("#header > div.app-header__right > div:nth-child(2) > div.app-header__new')");
        helper.WaitUntilVisible(CCPBtnJSE);
        helper.WaitUntilVisible(CCPBtnJSE);
        helper.WaitForElementInteractable(CCPBtnJSE);
        helper.WaitUntilClickable(CCPBtnJSE);
//        helper.moveToWebElement(CCPBtnJSE);
//        helper.ClickOnWE20(CCPBtnJSE);
        helper.ClickByJsExecuter(CCPBtnJSE);
        helper.WaitUntilVisible(CCPUtility.CCPOption);
        helper.WaitForElementInteractable(CCPUtility.CCPOption);
        helper.ClickByJsExecuter(CCPUtility.CCPOption);

        CE_AddLocation();
        CE_AddViolationParam("Wa");
        Thread.sleep(5000);
        CE_AddContact();
        helper.WaitForElementInteractable(CCPUtility.CreateCaseButton);
        helper.ClickOn(CCPUtility.CreateCaseButton);
        
        By closeBtn= By.xpath("//button[text()='Close']");
        By keepContactBtn= By.xpath("//button[text()='Keep contact']");
        Thread.sleep(5000);
        
        if(driver.findElements(By.xpath("//button[text()='Close']")).size() >= 1)
        {
        	helper.ClickOn(closeBtn);
        	
        	List<WebElement> keepContacts= driver.findElements(keepContactBtn);
        	int size=keepContacts.size();
        	if(size==1)
        	{
        		helper.ScrollIntoView(keepContactBtn);
        		helper.ClickByJsExecuter(keepContactBtn);
        	}
        	if(size>1)
        	{
        		for(WebElement i : keepContacts)
        		{
        			helper.ScrollIntoView(i);
        			i.click();
        		}
        		
        	}
        	
        	helper.WaitForElementInteractable(CCPUtility.CreateCaseButton);
        	helper.ClickOn(CCPUtility.CreateCaseButton);
            
        }
        

        helper.WaitForCurserRunning(5);
        helper.WaitUntilVisible(By.xpath("//h5[text()='Assign Case To']//parent::div//button[@class='square-btn btn btn-primary']"));
        helper.WaitUntilPresent(By.xpath("//h5[text()='Assign Case To']//parent::div//button[@class='square-btn btn btn-primary']"));
        helper.WaitUntilVisible(CCPUtility.AssignCaseTo);
        helper.WaitForElementInteractable(CCPUtility.AssignCaseTo);
        helper.ClickOn(CCPUtility.AssignCaseTo);
        helper.WaitForElementInteractable(CCPUtility.InspectionAssigneeTo);
        helper.ClickOn(CCPUtility.InspectionAssigneeTo);
        helper.WaitForElementInteractable(CCPUtility.CreateScheduleInspectionButton);
        helper.ClickOn(CCPUtility.CreateScheduleInspectionButton);
        helper.WaitForCurserRunning(10);
    }

    public  void CE_AddAttachmentCrtCasePage(String path) throws InterruptedException {

    	helper.ScrollIntoView(CCPUtility.addAttachmentCCP);
    	helper.ClickByJsExecuter(CCPUtility.addAttachmentCCP);
        WebElement UploadFile4 = driver.findElement(By.xpath("//input[@type='file']"));
        String testtDataPath = System.getProperty("user.dir");
        UploadFile4.sendKeys(path);
        helper.ClickOn(CCPUtility.AddBtn);
    }

    public  void CE_AddAttachment(String path) throws InterruptedException {

    	helper.WaitUntilVisible(CCPUtility.addAttachmenttop);
    	helper.ScrollIntoView(CCPUtility.addAttachmenttop);
    	helper.ClickByJsExecuter(CCPUtility.addAttachmenttop);
        WebElement UploadFile4 = driver.findElement(By.xpath("//input[@type='file']"));
        String testtDataPath = System.getProperty("user.dir");
        UploadFile4.sendKeys(testtDataPath + path);
        helper.WaitForCurserRunning(5);
        helper.WaitForElementInteractable(CCPUtility.AddBtn);
        helper.ClickOn(CCPUtility.AddBtn);
        helper.WaitForCurserRunning(5);
    }

    public  void CE_AddAttachmentBottom(String path) throws InterruptedException {

    	helper.WaitUntilVisible(CCPUtility.addAttachmentbottom);
    	helper.ScrollIntoView(CCPUtility.addAttachmentbottom);
    	helper.ClickByJsExecuter(CCPUtility.addAttachmentbottom);
        WebElement UploadFile4 = driver.findElement(By.xpath("//input[@type='file']"));
        String testtDataPath = System.getProperty("user.dir");
        UploadFile4.sendKeys(testtDataPath + path);
        helper.WaitForCurserRunning(5);
        helper.WaitForElementInteractable(CCPUtility.AddBtn);
        helper.ClickOn(CCPUtility.AddBtn);
    }


    public  void CE_AddAttachmentAddActivityPage(String path) throws InterruptedException {
    	helper.WaitUntilVisible(ForcedAbatementUtility.AddAttachment);
    	helper.ScrollIntoView(ForcedAbatementUtility.AddAttachment);
    	helper.ClickByJsExecuter(ForcedAbatementUtility.AddAttachment);
        WebElement UploadFile4 = driver.findElement(By.xpath("//input[@type='file']"));
        String testtDataPath = System.getProperty("user.dir");
        UploadFile4.sendKeys(testtDataPath + path);
        helper.WaitForCurserRunning(5);
        helper.WaitForElementInteractable(CCPUtility.AddBtn);
        helper.ClickOn(CCPUtility.AddBtn);
    }


    public  void CE_AddLocation() throws InterruptedException {
        if (agencyConfig.equalsIgnoreCase(agencyConfigGisDirect1o) || BrowsersInvoked.agencyConfig.equalsIgnoreCase(BrowsersInvoked.agencyConfigGisDirect2o)) {
            serachLocationCCP(searchLocationKey1O);
        } else {
            serachLocationCCP(searchLocationKey);
        }

    }


    public  void CE_AddViolation() throws InterruptedException {
    	helper.WaitUntilVisible(CCPUtility.ViolationSearchBox);
    	helper.WaitForElementInteractable(CCPUtility.ViolationSearchBox);
    	helper.ClickOn(CCPUtility.ViolationSearchBox);
    	helper.SendKeys(CCPUtility.ViolationSearchBox, "Wa");
    	helper. WaitUntilVisible(By.xpath("//div[@class='list-label']//b[contains(text(),'Wa')]"));
    	try
    	{
    	helper.WaitForElementInteractable(CCPUtility.ViolationsList);
    	helper.ClickOn(CCPUtility.ViolationsList);
    	}
    	catch (StaleElementReferenceException e)
    	{
    		WebElement violationsList = driver.findElement(By.xpath("//div[@class='react-autosuggest__suggestion-element']/div"));
            helper.WaitForElementInteractable(violationsList);
            helper.ClickOn(violationsList);
    	}
    	
    	//div[@class='react-autosuggest__suggestion-element']/div
    }


    public  void CE_AddViolationParam(String vName) throws InterruptedException {
    	helper.WaitUntilVisible(CCPUtility.ViolationSearchBox);
    	helper.WaitForElementInteractable(CCPUtility.ViolationSearchBox);
    	helper.ClickOn(CCPUtility.ViolationSearchBox);
    	helper.WaitUntilVisible(CCPUtility.ViolationSearchBox);
    	helper.WaitForElementInteractable(CCPUtility.ViolationSearchBox);
    	helper.SendKeys(CCPUtility.ViolationSearchBox, vName);
    	helper.WaitUntilVisible(CCPUtility.ViolationsList);
    	helper.WaitForElementInteractable(CCPUtility.ViolationsList);
    	helper.ClickOn(CCPUtility.ViolationsList);
    }

    public  void CE_AddContact() throws InterruptedException {

    	helper.WaitUntilVisible(CCPUtility.AddContactField);
    	helper.ScrollIntoView(CCPUtility.AddContactField);
    	helper.WaitUntilVisible(CCPUtility.AddContactField);
    	helper.WaitForElementInteractable(CCPUtility.AddContactField);
    	helper.ClickOn(CCPUtility.AddContactField);
    	helper.WaitUntilVisible(CCPUtility.CreateNewContact);
    	helper.WaitForElementInteractable(CCPUtility.CreateNewContact);
    	helper.ClickOn(CCPUtility.CreateNewContact);
        String RandomName = RandomStrings.RequiredCharacters(8);
        String RandomMail = RandomName + "@yopmail.com";
        String RandomContact = RandomStrings.RequiredDigits(10);
        helper.SendKeys(CCPUtility.NameField, RandomName);
        helper.SendKeys(CCPUtility.EmailField, RandomMail);
        helper.SendKeys(CCPUtility.WorkPhoneField, RandomContact);

        helper.ScrollIntoView(CCPUtility.CreateContactBtn);
        helper.WaitForElementInteractable(CCPUtility.CreateContactBtn);
        helper.ClickOn(CCPUtility.CreateContactBtn);
        helper.WaitUntilVisible(CCPUtility.PropertyOwnerOption);
        helper.WaitForElementInteractable(CCPUtility.PropertyOwnerOption);
        helper.ClickOn(CCPUtility.PropertyOwnerOption);
        helper.WaitForElementInteractable(CCPUtility.ApplyButton);
        helper.ClickOn(CCPUtility.ApplyButton);

    }


    public  void serachLocationCCP(String Address) throws InterruptedException {
    	helper.WaitUntilVisible(CCPUtility.LocationFld);
    	helper.WaitForElementInteractable(CCPUtility.LocationFld);
    	helper.SendKeys(CCPUtility.LocationFld, Address);
        if (BrowsersInvoked.agencyConfig.equalsIgnoreCase(BrowsersInvoked.agencyConfigGisDirect2o)) {
        	helper.WaitUntilVisible(CCPUtility.MapGis2);
        	helper.WaitForElementInteractable(CCPUtility.MapGis2);
        	helper.ClickOn(CCPUtility.MapGis2);

        } else {
        	helper.WaitUntilVisible(CCPUtility.Map3);
        	helper.WaitUntilVisible(CCPUtility.Map3);
        	helper.WaitForElementInteractable(CCPUtility.Map3);
        	helper.ClickOn(CCPUtility.Map3);
        }
        helper.WaitForCurserRunning(10);

    }


    public  void CreationOf50PlusCases() throws InterruptedException {

        for (int i = 0; i <= 50; i++) {
           CE_CreateACase();
           helper.WaitUntilVisible(CloseCaseUtility.CloseCDPIcon);
           helper.ScrollIntoView(CloseCaseUtility.CloseCDPIcon);
           helper.WaitForElementInteractable(CloseCaseUtility.CloseCDPIcon);
           helper.ClickOn(CloseCaseUtility.CloseCDPIcon);
           helper.WaitUntilElementInvisible(CloseCaseUtility.CloseCDPIcon);
           helper.WaitForCurserRunning(4);

        }
    }

    public  void NavigateToCCP() throws InterruptedException {

       helper.WaitForCurserRunning(5);
       helper.WaitUntilVisible(By.cssSelector("#header div.app-header__new"));
       helper.WaitUntilPresent(By.cssSelector("#header div.app-header__new"));
        WebElement CCPBtnJSE = driver.findElement(By.cssSelector("#header div.app-header__new"));
        helper.ScrollIntoView(By.cssSelector("#header div.app-header__new"));
        helper.WaitForElementInteractable(CCPBtnJSE);
        helper.WaitForElementInteractable(By.cssSelector("#header div.app-header__new"));
        helper.ClickByJsExecuter(By.cssSelector("#header div.app-header__new"));
        helper.WaitUntilVisible(CCPUtility.CCPOption);
        helper.WaitForElementInteractable(CCPUtility.CCPOption);
        helper.ClickByJsExecuter(CCPUtility.CCPOption);
        helper.WaitForCurserRunning(10);
        helper.WaitUntilVisible(CCPUtility.CCPTitle);
        helper.WaitUntilPresent(CCPUtility.CCPTitle);
        helper.WaitForElementInteractable(CCPUtility.CCButton);
    }

    public  void CloseCaseDetailPage() throws InterruptedException {
    	helper.WaitUntilVisible(CCPUtility.CloseCDP);
    	helper.ScrollIntoView(CCPUtility.CloseCDP);
    	helper.WaitForElementInteractable(CCPUtility.CloseCDP);
    	helper.ClickByJsExecuter(CCPUtility.CloseCDP);
    	helper.WaitUntilElementInvisible(CCPUtility.CloseCDP);
    	helper.WaitForCurserRunning(5);
    }


    public  void NavigateTo_UserManagement() throws InterruptedException {

    	helper.WaitUntilVisible(UserManagementUtility.UserMangementSideBar);
    	helper.WaitUntilPresent(UserManagementUtility.UserMangementSideBar);
    	helper.ScrollIntoView(UserManagementUtility.UserMangementSideBar);
    	helper.WaitForElementInteractable(UserManagementUtility.UserMangementSideBar);
    	helper.ClickOn(UserManagementUtility.UserMangementSideBar);
    	helper.WaitForCurserRunning(4);
    	helper.WaitUntilVisible(UserManagementUtility.CreateUserbtn);
    	helper.WaitUntilPresent(UserManagementUtility.CreateUserbtn);
    	helper.WaitForElementInteractable(UserManagementUtility.CreateUserbtn);

    }

    

    public void NavigationTo_CaseListPage() throws InterruptedException {
    	helper.WaitUntilVisible(CLPUtility.CLP);
    	helper.WaitUntilPresent(CLPUtility.CLP);
    	helper.ScrollIntoView(CLPUtility.CLP);
    	helper.WaitForElementInteractable(CLPUtility.CLP);
    	helper.WaitForElementInteractable(CLPUtility.CLP);
    	helper.ClickByJsExecuter(CLPUtility.CLP);
    	helper.WaitForCurserRunning(5);
    	helper.WaitUntilVisible(CLPUtility.Cases);
    	helper.WaitUntilPresent(CLPUtility.Cases);
        WebElement CasesText = helper.WaitUntilVisibleWE(CLPUtility.Cases);
        if ((CasesText.isDisplayed()) == false) {

            SoftAssert s1 = new SoftAssert();
            s1.assertEquals(false, true);
            s1.assertAll();
        }

    }
    
    public void CCP_SearchCaseAndNavigatetoCDP (String caseId) throws InterruptedException{


        NavigationTo_CaseListPage();
        helper.WaitUntilPresent(CLPUtility.CSLPSearchField);
        helper.WaitUntilPresent(CLPUtility.CSLPSearchField);
        helper.WaitForElementInteractable(CLPUtility.CSLPSearchField);
        helper.SendKeys(CLPUtility.CSLPSearchField,caseId);
        helper.WaitForCurserRunning(2);
        helper.WaitUntilVisible(By.xpath("//a[text()='"+caseId+"']"));
        helper.WaitUntilVisible(By.xpath("//a[text()='"+caseId+"']"));
        helper.WaitForElementInteractable(By.xpath("//a[text()='"+caseId+"']"));
        helper.ClickByJsExecuter(By.xpath("//a[text()='"+caseId+"']"));
        helper.WaitForCurserRunning(10);
        helper.WaitUntilVisible(By.xpath("//h2[@class='case-details__case-number']"));

    }
    
    
    public void CreateACase() throws InterruptedException {
        NavigateToCCP();
        helper.WaitUntilVisible(CCPUtility.CCPTitle);
        helper.WaitForElementInteractable(CCPUtility.CCButton);
        CE_AddLocation();
        CE_AddContact();
        CE_AddViolationParam("Water");
        helper.WaitUntilVisible(CCPUtility.CreateCaseButton);
        helper.ScrollIntoView(CCPUtility.CreateCaseButton);
        helper.WaitForElementInteractable(CCPUtility.CreateCaseButton);
        helper.ClickOn(CCPUtility.CreateCaseButton);
        helper.WaitForCurserRunning(5);
        helper.WaitUntilVisible(CCPUtility.AssigneeTo);
        helper.WaitUntilPresent(CCPUtility.AssigneeTo);
        helper.WaitUntilVisible(CCPUtility.AssignCaseTo);
        helper.WaitForElementInteractable(CCPUtility.AssignCaseTo);
        helper.ClickOn(CCPUtility.AssignCaseTo);
        helper.WaitForElementInteractable(CCPUtility.InspectionAssigneeTo);
        helper.ClickOn(CCPUtility.InspectionAssigneeTo);
        helper.WaitForElementInteractable(CCPUtility.CreateScheduleInspectionButton);
        helper.ClickOn(CCPUtility.CreateScheduleInspectionButton);
        helper.WaitForCurserRunning(10);
        helper.WaitUntilVisible(CCPUtility.CaseStatus);
        WebElement Case = helper.findElement(CCPUtility.CaseStatus);
        if ((Case.isDisplayed()) == false) {

            SoftAssert s62 = new SoftAssert();
            s62.assertEquals(false, true);
            s62.assertAll();
        }
    }
    
    
    public void CE_AddViolationWithEntity(String Vname , String entityName) throws InterruptedException {

        if (agencyConfig.equalsIgnoreCase(agencyConfigGisDirect2o)) {
        	helper.WaitUntilVisible(CCPUtility.ViolationSearchBox);
        	helper.WaitForElementInteractable(CCPUtility.ViolationSearchBox);
        	helper.SendKeys(CCPUtility.ViolationSearchBox, Vname);
        	helper.WaitUntilVisible(CCPUtility.violationList20);
        	helper.WaitForElementInteractable(CCPUtility.violationList20);
        	helper.ClickOn(CCPUtility.violationList20);
        	helper.WaitUntilVisible(CCPUtility.EntityField1);
        	helper.WaitForElementInteractable(CCPUtility.EntityField1);
        	helper.SendKeys(CCPUtility.EntityField1, entityName);
        	helper.WaitForElementInteractable(CCPUtility.AddButton);
            helper.ClickOn(CCPUtility.AddButton);

        } else {
        	helper.WaitUntilVisible(CCPUtility.ViolationSearchBox);
        	helper.WaitForElementInteractable(CCPUtility.ViolationSearchBox);
        	helper.ClickOn(CCPUtility.ViolationSearchBox);
            helper.SendKeys(CCPUtility.ViolationSearchBox, Vname);
            helper.WaitUntilVisible(CCPUtility.ViolationList);
            helper.WaitForElementInteractable(CCPUtility.ViolationList);
            helper.ClickOn(CCPUtility.ViolationList);
            helper.WaitUntilVisible(CCPUtility.EntityField1);
            helper.WaitForElementInteractable(CCPUtility.EntityField1);
            helper.SendKeys(CCPUtility.EntityField1,entityName );
            helper.WaitForElementInteractable(CCPUtility.AddButton);
            helper.ClickOn(CCPUtility.AddButton);
        }
    }



    public void addSubmissionAssignmentRule(String attribute,String operator,String value,String assignee,String collaborator) throws InterruptedException{
        helper.WaitUntilVisible(AddRuleButton);
        helper.ClickOn(AddRuleButton);
        helper.WaitUntilVisible(CreateRule);
        helper.WaitUntilPresent(CriteriaFields);
        helper.WaitForElementInteractable(CriteriaFields);
        helper.ClickOn(CriteriaFields);
        helper.WaitForElementInteractable(By.xpath(getSubmissionAttribute(attribute)));
        helper.ClickOn(By.xpath(getSubmissionAttribute(attribute)));
        helper.WaitUntilVisible(CriteriaFields);
        helper.ClickOn(CriteriaFields);
        helper.WaitForElementInteractable(By.xpath(getSubmissionAttribute(operator)));
        helper.ClickOn(By.xpath(getSubmissionAttribute(operator)));
        helper.WaitUntilVisible(CriteriaFields);
        helper.ClickOn(CriteriaFields);
        helper.WaitUntilVisible(By.xpath(getSubmissionAttribute(value)));
        helper.ScrollIntoView(By.xpath(getSubmissionAttribute(value)));
        helper.ClickOn(By.xpath(getSubmissionAttribute(value)));

        helper.WaitUntilVisible(DefaultAssigneeField);
        helper.ScrollIntoView(DefaultAssigneeField);
        helper.ClickOn(DefaultAssigneeField);
        helper.WaitUntilVisible(AssigneeSearch);
        helper.SendKeys(AssigneeSearch,assignee);
        helper.WaitUntilVisible(SearchedAssignee);
        helper.WaitForElementInteractable(SearchedAssignee);
        helper.ClickOn(SearchedAssignee);

        helper.WaitForElementInteractable(SelectCollaboratorField);
        helper.ClickOn(SelectCollaboratorField);
        helper.WaitForElementInteractable(CollaboratorSearch);
        helper.SendKeys(CollaboratorSearch,collaborator);

        if(BrowsersInvoked.RunEnvironment.equalsIgnoreCase("QA")){
            helper.WaitUntilVisible(By.xpath("//label[@for='collaborators']/following::ul//li[@class='option']//b"));
            helper.ClickOn(By.xpath("//label[@for='collaborators']/following::ul//li[@class='option']//b"));
        }
        else{
            helper.WaitUntilVisible(CollaboratorsOption);
            helper.ClickOn(CollaboratorsOption);
        }
        helper.WaitForElementInteractable(CreateRulebutton);
        helper.ClickOn(CreateRulebutton);
        helper.WaitUntilElementInvisible(CreateRulebutton);

        helper.WaitForCurserRunning(2);
        helper.WaitUntilVisible(AddedRule);
        helper.WaitUntilPresent(AddedRule);
    }


    public void deleteRules(int ruleCount) throws InterruptedException {
        int check = driver.findElements(CrossIconRuleSet).size();
        if (check > ruleCount ) {
            helper.WaitForElementInteractable(CrossIconRuleSet);
            Boolean crosscheck = driver.findElement(CrossIconRuleSet).isDisplayed();
            while (crosscheck) {
                helper.WaitForElementInteractable(CrossIconRuleSet);
                driver.findElement(CrossIconRuleSet).click();

                if (driver.findElements(CrossIconRuleSet).size() > 0) {
                    crosscheck = driver.findElement(CrossIconRuleSet).isDisplayed();
                } else {
                    crosscheck = false;
                }
            }
        }
    }


    public void addCaseAssignmentRule(String attribute,String operator,String value,String caseassignee,String inspectionAssignee) throws InterruptedException {
        helper.WaitUntilVisible(AddRuleButton);
        helper.ClickOn(AddRuleButton);
        helper.WaitUntilVisible(CreateRule);
        helper.WaitUntilPresent(CriteriaFields);
        helper.WaitForElementInteractable(CriteriaFields);
        helper.ClickOn(CriteriaFields);
        helper.WaitForElementInteractable(By.xpath(getSubmissionAttribute(attribute)));
        helper.ClickOn(By.xpath(getSubmissionAttribute(attribute)));
        helper.WaitUntilVisible(CriteriaFields);
        helper.ClickOn(CriteriaFields);
        helper.WaitForElementInteractable(By.xpath(getSubmissionAttribute(operator)));
        helper.ClickOn(By.xpath(getSubmissionAttribute(operator)));
        helper.WaitUntilVisible(CriteriaFields);
        helper.ClickOn(CriteriaFields);
        helper.WaitUntilVisible(By.xpath(getSubmissionAttribute(value)));
        helper.ScrollIntoView(By.xpath(getSubmissionAttribute(value)));
        helper.ClickOn(By.xpath(getSubmissionAttribute(value)));

        helper.WaitUntilVisible(By.xpath("//label[@for='caseAssignee']/following::label[1]"));
        helper.ScrollIntoView(By.xpath("//label[@for='caseAssignee']/following::label[1]"));
        helper.ClickOn(By.xpath("//label[@for='caseAssignee']/following::label[1]"));
        helper.WaitUntilVisible(By.xpath("//div[@id='caseAssignee']//input[@placeholder='Search...'][@name='query']"));
        helper.SendKeys(By.xpath("//div[@id='caseAssignee']//input[@placeholder='Search...'][@name='query']"),caseassignee);
        helper.WaitUntilVisible(By.xpath("(//label[@for='caseAssignee']/following::ul/li//b)[1]"));
        helper.WaitForElementInteractable(By.xpath("(//label[@for='caseAssignee']/following::ul/li//b)[1]"));
        helper.ClickOn(By.xpath("(//label[@for='caseAssignee']/following::ul/li//b)[1]"));


        helper.WaitForElementInteractable(By.xpath("//label[@for='inspectionAssignee']/following::label[1]"));
        helper.ClickOn(By.xpath("//label[@for='inspectionAssignee']/following::label[1]"));
        helper.WaitForElementInteractable(By.xpath("//div[@id='inspectionAssignee']//input[@placeholder='Search...'][@name='query']"));
        helper.SendKeys(By.xpath("//div[@id='inspectionAssignee']//input[@placeholder='Search...'][@name='query']"),inspectionAssignee);

        helper.WaitUntilVisible(By.xpath("//label[@for='inspectionAssignee']/following::ul/li//b"));
        helper.ClickOn(By.xpath("//label[@for='inspectionAssignee']/following::ul/li//b"));

        helper.WaitForElementInteractable(CreateRulebutton);
        helper.ClickOn(CreateRulebutton);
        helper.WaitUntilElementInvisible(CreateRulebutton);

        helper.WaitForCurserRunning(2);
        helper.WaitUntilVisible(AddedRule);
        helper.WaitUntilPresent(AddedRule);
    }
    
    
    
    
    
    public  void ExternalCSPPinLocation() throws InterruptedException {

        helper.WaitUntilVisible(CCPUtility.ZoomInMapLocation);
        helper.WaitForElementInteractable(CCPUtility.ZoomInMapLocation);
        WebElement zoomIn = helper.findElement(CCPUtility.ZoomInMapLocation);
        String aria = zoomIn.getAttribute("aria-disabled");
        while (aria.equalsIgnoreCase("false")) {
            helper.WaitForElementInteractable(CCPUtility.ZoomInMapLocation);
            helper.ClickByJsExecuter(CCPUtility.ZoomInMapLocation);
            helper.WaitUntilVisible(CCPUtility.ZoomInMapLocation);
            zoomIn = helper.findElement(CCPUtility.ZoomInMapLocation);
            aria = zoomIn.getAttribute("aria-disabled");
        }


        WebElement element = helper.findElement(By.xpath("(//div[@class='map-container map-container--hide-layer-control']//div)[1]"));
        Point offset = element.getLocation();
        int xoffset = (int) offset.getX();
        int yoffset = (int) offset.getY();
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(" + xoffset + "," + yoffset + ");");
        element.click();
    }


}
