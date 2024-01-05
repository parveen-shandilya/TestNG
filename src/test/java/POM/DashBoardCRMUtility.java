package POM;

import BrowsersBase.BrowsersInvoked;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import BrowsersBase.BrowsersInvoked;
import CommonMethods.Helper;

public class DashBoardCRMUtility extends Helper {

	public WebDriver driver;
	LoginUtility log;

	public DashBoardCRMUtility(WebDriver driver) {
		super(driver);
		this.driver = driver;
		log = new LoginUtility(driver);

		
	}
	
	
	
	  public static By CRMToggle = By.xpath("//div[@class='multi-choice-buttons']/button[2]");
	   // public static By SLAHeader = By.xpath("//div[@class='dashboard__widgets-holder dashboard__widgets-holder--cases']/h2");
	   public static By SLAHeader = By.xpath("//h2[text()='SLA']");
	   public static By CRMDashboard = By.xpath("//div[@class='dashboard__container']//h2");

	    public static By AssignedForMeLink = By.xpath("//div[@class='widget widget--all-dashboard']/a/label");
	    public static By MineButton = By.xpath("//button[text()='Mine']");
	    public static By ForMyDepartMentLink = By.xpath("//div[@class='widget widget--all-dashboard'][2]//label");
	    public static By ForMyAgency = By.xpath("//div[@class='widget widget--all-dashboard'][3]//label");
	   // public static By CountAtLink1 = By.xpath("//div[@class='widget widget--all-dashboard']//a/span[1]");
	   public static By CountAtLink1 = By.xpath("(//div[@class='widget widget--all-dashboard']//a/span[1])[1]");
	    public static By CountAtLink2 = By.xpath("(//div[@class='widget widget--all-dashboard']//a/span[1])[2]");
	    public static By CountAtLink3 = By.xpath("(//div[@class='widget widget--all-dashboard']//a/span[1])[3]");
	    public static By SubmissionID = By.xpath("//span[@class='checkbox-holder']/following::a[1]");

	    public static int CountAtCSLPForLink1;
	    public static int CountAtCSLPForLink2;
	    public static int CountAtCSLPForLink3;
	    public static String CRMToggleText;
	    public static String SLAHeaderText;
	    public static boolean CheckMineButtonState;
	    public static String SubCountForAssignedToMe;
	    public static String SubCountForMyDepartment;
	    public static String SubCountForMyAgency;
	    
	
	public void LoginAgency() throws InterruptedException {
		log.LoginAgency();
		
	}

	

    public  void Dashboard_VerifyCRMToggleButton() throws InterruptedException {
        driver.navigate().to(BrowsersInvoked.URLDashboard);
        WaitForCurserRunning(5);
        WaitUntilVisible(CRMToggle);
        WaitUntilPresent(CRMToggle);
        CRMToggleText = GetText(CRMToggle);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(CRMToggleText, "CRM");
        softAssert.assertAll();
    }

    public  void Dashboard_VerifyDirectionToCRMDashboard() throws InterruptedException {
        WaitForElementInteractable(CRMToggle);
        ClickByJsExecuter(CRMToggle);
        WaitForCurserRunning(4);
        ArrayList<String> CRMDashBoradHeaders ;
        CRMDashBoradHeaders = new ArrayList<String>();
        findElementsByXPath(CRMDashboard).stream().forEach(x->CRMDashBoradHeaders.add(x.getText()));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(CRMDashBoradHeaders.contains("Open Submissions"), "Does not contains OpenSubmission");
        softAssert.assertTrue(CRMDashBoradHeaders.contains("Tasks"), "Does not contains Tasks");
        softAssert.assertTrue(CRMDashBoradHeaders.contains("Unread Messages"), "Does not contains Unread Messages");
        softAssert.assertAll();

    }

    public  void Dashboard_VerifyDirectionToCSLPForAssignedToMELink() throws InterruptedException {

        WaitUntilVisible(AssignedForMeLink);
        WaitForElementInteractable(AssignedForMeLink);
        ClickOn(AssignedForMeLink);
        WaitForCurserRunning(2);
        WaitUntilVisible(MineButton);
        WaitUntilPresent(MineButton);
        CheckMineButtonState = findElement(MineButton).isEnabled();
        List<WebElement> AllSubmissionsID = driver.findElements(SubmissionID);
        CountAtCSLPForLink1 = AllSubmissionsID.size();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(CheckMineButtonState);
        softAssert.assertAll();
    }

    public  void Dashboard_VerifyDirectionToCSLPForMyDepartment() throws InterruptedException {
        driver.navigate().to(BrowsersInvoked.URLDashboard);
        WaitForCurserRunning(5);
        WaitUntilVisible(CRMToggle);
        WaitUntilPresent(CRMToggle);
        WaitForElementInteractable(CRMToggle);
        ClickByJsExecuter(CRMToggle);
        WaitUntilVisible(By.xpath("//button[text()='CRM'][@class='square-btn btn btn-primary']"));
        WaitUntilPresent(By.xpath("//button[text()='CRM'][@class='square-btn btn btn-primary']"));
        WaitUntilVisible(ForMyDepartMentLink);
        WaitUntilPresent(ForMyDepartMentLink);
        WaitForElementInteractable(ForMyDepartMentLink);
        waitForStaleElementReference(ForMyDepartMentLink);
        WaitForElementInteractable(ForMyDepartMentLink);
        ClickByJsExecuter(ForMyDepartMentLink);
        WaitForCurserRunning(7);
        WaitUntilVisible(SubmissionID);
        WaitUntilPresent(SubmissionID);
        List<WebElement> AllSubmissionsID = driver.findElements(SubmissionID);
        CountAtCSLPForLink2 = AllSubmissionsID.size();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertAll();
    }

    public  void Dashboard_VerifyDirectionToCSLPForMyAgency() throws InterruptedException {

        driver.navigate().to(BrowsersInvoked.URLDashboard);
        WaitForCurserRunning(8);
        WaitUntilVisible(CRMToggle);
        WaitUntilPresent(CRMToggle);
        WaitForElementInteractable(CRMToggle);
        ClickByJsExecuter(CRMToggle);
        WaitForCurserRunning(5);
        WaitUntilVisible(By.xpath("(//div[@class='dashboard__widgets-holder__widgets']//label)[2]"));
        WaitUntilPresent(By.xpath("(//div[@class='dashboard__widgets-holder__widgets']//label)[2]"));
        WaitForElementInteractable(By.xpath("(//div[@class='dashboard__widgets-holder__widgets']//label)[2]"));
        ClickOn(By.xpath("(//div[@class='dashboard__widgets-holder__widgets']//label)[2]"));
        WaitForCurserRunning(8);
        WaitUntilVisible(SubmissionID);
        WaitUntilPresent(SubmissionID);
        List<WebElement> AllSubmissionsID = driver.findElements(SubmissionID);
        CountAtCSLPForLink3 = AllSubmissionsID.size();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertAll();
    }

    public  void Dashboard_VerifyTheCountOfSubmissions() throws InterruptedException {

        driver.navigate().to(BrowsersInvoked.URLDashboard);
        WaitForCurserRunning(5);
        WaitUntilVisible(CRMToggle);
        WaitUntilPresent(CRMToggle);
        WaitForElementInteractable(CRMToggle);
        ClickByJsExecuter(CRMToggle);
        WaitUntilVisible(SLAHeader);
        SubCountForAssignedToMe = GetText(CountAtLink1);
        SubCountForMyDepartment = GetText(CountAtLink2);
        SubCountForMyAgency = GetText(CountAtLink3);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(SubCountForAssignedToMe, CountAtCSLPForLink1);
        softAssert.assertEquals(SubCountForMyDepartment, CountAtCSLPForLink2);
        softAssert.assertEquals(SubCountForMyAgency, CountAtCSLPForLink3);
        softAssert.assertAll();
    }

}
