package POM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;

import javax.mail.MessagingException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.rest.api.v2010.account.Message;

import BrowsersBase.BrowsersInvoked;
import CommonMethods.CECommonMethods;
import CommonMethods.CRMCommonMethods;
import CommonMethods.Helper;
import CommonMethods.PropertiesUtils;
import CommonMethods.RandomStrings;


public class SmsAndEmailVerificationUtility extends Helper {

	public WebDriver driver;
	LoginUtility log;
	
	public SmsAndEmailVerificationUtility(WebDriver driver) {
		super(driver);
		this.driver = driver;
		log = new LoginUtility(driver);
		

}
	
	public void LoginAgency() throws InterruptedException {
		log.LoginAgency();

	}

	 public static final String ACCOUNT_SID = PropertiesUtils.getPropertyValue("ACCOUNT_SID");
	    public static final String AUTH_TOKEN = PropertiesUtils.getPropertyValue("AUTH_TOKEN");
	    public static By MessagesIcon = By.xpath("//p[text()='Customer Messages']/parent::div//button");
	    public static By SubjectField = By.xpath("//div[@class='fade compose-email modal-base modal show']//input[@name='subject']");
	    public static By IframeBody = By.xpath("//iframe[@id='compose-email-html-editor-modal_ifr']");
	    public static By MessageBody = By.xpath("//body[@class='mce-content-body ']");
	    public static By SendButton = By.xpath("//button[text()='Send']");
	    public static By PrivateSubmissionHeader = By.xpath("//h2[@class='private-submission-details__number']");
	    public static By ReceivedMailHeader = By.xpath("//td[@align='center']/h2");
	    public static String RandomSubject;
	    public static String URLSubmissionInfo;
	    public static String LatestSID;

	    public  void ComposeMessage() throws InterruptedException {
	        SoftAssert softAssert = new SoftAssert();
	        refreshPage();
	        WaitForCurserRunning(5);
	        int loginCheckQA = fineElementsSize(LoginAgencyUtility.UsernameField);
	        int loginCheckStage = fineElementsSize(LoginAgencyUtility.OKTAUsernameField);
	        if(loginCheckQA > 0 || loginCheckStage >0){
	            log.LoginAgency();
	        }
	        
	        CRMCommonMethods crmCommonMethod=new CRMCommonMethods(driver);
	        crmCommonMethod.CRM_CreateSubmissionPreRequisite("No", "Yes", "Yes", "No", "Yes", "Location Not Required");
	        //CRMCommonMethods.CRM_CreateSubmission("No", "Yes", "Yes", "No", "Yes", "Location Not Required");
	        WaitForCurserRunning(7);
	        WaitUntilVisible(CreateAndLinkCaseUtility.SubmissionNumber);
	        String SubmissionNumberSplit[] = GetText(CreateAndLinkCaseUtility.SubmissionNumber).split("#");
	        String SubmissionNumberCSDP = SubmissionNumberSplit[1];
	        ClickOn(MessagesIcon);
	        RandomSubject = RandomStrings.RequiredCharacters(10);
	        SendKeys(SubjectField, RandomSubject);
	        WebElement switchFrame = WaitUntilVisibleWE(IframeBody);
	        driver.switchTo().frame(switchFrame);
	        String RandomBody = "Random Body" + RandomStrings.RequiredString(50);
	        WaitForElementInteractable(MessageBody);
	        SendKeys(MessageBody, RandomBody);
	        driver.switchTo().defaultContent();
	        ClickByJsExecuter(SendButton);
	        WaitUntilElementInvisible(SendButton);
	        WaitForCurserRunning(7);
	        WaitUntilVisible(CreateAndLinkCaseUtility.SubmissionNumber);
	        TwilioGetMessage();
	        String[] FetchAllText = URLSubmissionInfo.split("https");
	        String FetchSMSURL = ("https" + FetchAllText[1]).split(" ")[0];
	        driver.navigate().to(FetchSMSURL);
	        System.out.println(FetchSMSURL);
	        WaitForCurserRunning(8);
	        
	        WaitUntilVisible(PrivateSubmissionHeader);
	        String OpenedSubmissionHeader[] = GetText(PrivateSubmissionHeader).split("Submission #");
	        softAssert.assertEquals(SubmissionNumberCSDP, OpenedSubmissionHeader[1]);
	        softAssert.assertAll();
	    }

	    public  void TwilioGetMessage() throws InterruptedException {
	        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
	       
	        ResourceSet<Message> messages = Message.reader().limit(1).read();
	        for (Message record : messages) {
	           
	            LatestSID = record.getSid();

	        }

	        Message message = Message.fetcher(LatestSID).fetch();

	        URLSubmissionInfo = message.getBody();


	        ResourceSet<Call> calls = Call.reader().read();
	        for (Call call : calls) {

	        }
	    }

	    public  void VerifyMailReceivedByAssignee() throws InterruptedException, MessagingException, IOException {
	        SoftAssert softAssert = new SoftAssert();
	        CRMCommonMethods crmCommonMethod=new CRMCommonMethods(driver);
	        crmCommonMethod.CRM_CreateExternalSubmission("Yes", "Location Not Required", "No", "Yes");
	       
	        driver.navigate().to(BrowsersInvoked.URLDashboard);
	       
	        ClickOn(CSLPUtility.CSLPTab);
	       
	        String SubmissionToSearch = GetText(CSLPUtility.SubmissionID);
	      //  ComposeMail.CustomerReceivedMail(SubmissionToSearch);
	      //  boolean ExpectedCount = GMailHelper.SearchedMailCount == 1;
	       // softAssert.assertTrue(ExpectedCount);
	        softAssert.assertAll();
	    }

	    public void VerifyMailReceivedByCollaborator() throws InterruptedException, MessagingException, IOException, AWTException {
	        SoftAssert softAssert = new SoftAssert();
	        CRMCommonMethods crmCommonMethod=new CRMCommonMethods(driver);
	        crmCommonMethod.CRM_CreateExternalSubmission("Yes", "Location Not Required", "No", "Yes");
	       
	        driver.navigate().to(BrowsersInvoked.URLDashboard);
	       
	        ClickOn(CSLPUtility.CSLPTab);
	       
	        String SubmissionToSearch = GetText(CSLPUtility.SubmissionID);
	        String CurrentWindow = driver.getWindowHandle();
	        Robot robot = new Robot();
	       
	        robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_T);

	        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
	       
	        driver.switchTo().window((String) tabs.get(1));
	       
	        driver.navigate().to("https://yopmail.com/en/");
	       
	        SendKeys(CreateCRMUserUtility.YopmailSearchUser, BrowsersInvoked.AgencyUsername);
	        ClickOn(CreateCRMUserUtility.YopmailInboxArrow);
	       
	        WebElement switchFrame = WaitUntilVisibleWE(CreateCRMUserUtility.IframeSwitch);
	       
	        driver.switchTo().frame(switchFrame);
	       
	        String GetHeaderFromMail[] = GetText(ReceivedMailHeader).split("#");
	        String ReceivedSubmissionID[] = GetHeaderFromMail[1].split(")");
	       
	        driver.switchTo().window(CurrentWindow);
	        softAssert.assertEquals(SubmissionToSearch, ReceivedSubmissionID[0]);
	        softAssert.assertAll();
	    }


	    public  void ComposeMail() throws InterruptedException {
	    	 CRMCommonMethods crmCommonMethod=new CRMCommonMethods(driver);
	    	 crmCommonMethod.CRM_CreateSubmissionPreRequisite("No", "Yes", "Yes", "No", "Yes", "Location Not Required");
	        String RandomSubject = RandomStrings.RequiredCharacters(10);
	        crmCommonMethod.ComposeCRMMessage(RandomSubject);
	        WaitUntilVisible(By.xpath("//label[text()='Customer Email']//following-sibling::label"));
	        String mailId = GetText(By.xpath("//label[text()='Customer Email']//following-sibling::label"));
	        ((JavascriptExecutor) driver).executeScript("window.open()");
	        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	        driver.switchTo().window(tabs.get(1));
	        driver.navigate().to("https://yopmail.com/en/");
	        WaitForCurserRunning(4);
	        forcedWaitTime(4);
	        WaitUntilVisible(CreateCRMUserUtility.YopmailSearchUser);
	        WaitUntilPresent(CreateCRMUserUtility.YopmailSearchUser);
	        WaitForElementInteractable(CreateCRMUserUtility.YopmailSearchUser);
	        SendKeys(CreateCRMUserUtility.YopmailSearchUser, mailId);
	        WaitForElementInteractable(CreateCRMUserUtility.YopmailInboxArrow);
	        ClickOn(CreateCRMUserUtility.YopmailInboxArrow);
	        WaitForCurserRunning(4);
	        WaitUntilVisible(By.xpath("//iframe[@id='ifinbox']"));
	        WaitForElementInteractable(By.xpath("//button[@id='refresh']"));
	        ClickByJsExecuter(By.xpath("//button[@id='refresh']"));
	        WaitUntilVisible(CreateCRMUserUtility.IframeSwitch);
	        WebElement switchFrame = WaitUntilVisibleWE(By.xpath("//iframe[@id='ifinbox']"));
	        driver.switchTo().frame(switchFrame);
	        //driver.switchTo().defaultContent();
	        forcedWaitTime(3);
	        WaitUntilVisible(By.xpath("(//div[@class='lmfd']//following-sibling::div[@class='lms'])[1]"));
	        String ActualSub = GetText(By.xpath("(//div[@class='lmfd']//following-sibling::div[@class='lms'])[1]"));
	        SoftAssert soft = new SoftAssert();
	        assert ActualSub != null;
	        soft.assertTrue(ActualSub.contains(RandomSubject));
	    }





}
