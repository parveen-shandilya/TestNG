package POM;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import BrowsersBase.BrowsersInvoked;
import CommonMethods.Helper;
import CommonMethods.RandomStrings;

public class ReportCRMUtility extends Helper {

	public WebDriver driver;
	LoginUtility log;

	public ReportCRMUtility(WebDriver driver) {
		super(driver);
		this.driver = driver;
		log = new LoginUtility(driver);

	}

	public void LoginAgency() throws InterruptedException {
		log.LoginAgency();

	}

	public static By CRMSectionEditIcon = By.xpath("//h4[text()='CRM']/following::button[1]");
	public static By BackToUrLCitizenView = By.xpath("//input[@name='citizenPortalHomeLinkURL']");
	public static By AddReportLinkText = By.xpath("//div[text()='Add Report']");
	public static By DashboardNameField = By.xpath("//label[@title='Dashboard Name']/following::input[1]");
	public static By DashboardIDField = By.xpath("//label[@title='Dashboard ID']/following::input[1]");
	public static By AddReportButton = By.xpath("//button[text()='Add Report']");
	public static By QSReportsList = By
			.xpath("//div[@class='product-form__executive-reports']//div[@class='rt-td'][1]");
	public static By QSReportEditIcon = By.xpath("//div[@class='product-form__executive-reports']//button");
	public static By DashboardIDList = By
			.xpath("//div[@class='product-form__executive-reports']//div[@class='rt-td'][2]");
	public static By SaveButton = By.xpath("//div[@class='integration__footer']/button[text()='Save']");
	public static By SaveQSReportPopup = By.xpath("//div[@class='product-form__footer']/button[text()='Save']");
	public static By SaveEditAgencyPopup = By.xpath("//div[@class='case-header__actions']/button[text()='Save']");
	public static By ReportsTab = By.xpath("//a[text()='Reports']");
	public static By CRMToggle = By.xpath("//button[text()='CRM']");
	public static By AppReportsList = By.xpath("//div[@class='sidebar']//label");
	public static By QsReportNextListButton = By.xpath(
			"(//div[text()='Edit & Configure CRM']//following::div[@class='table__pagination-nav-btns']//button)[2]");
	public static By QsReportPreListButton = By.xpath(
			"(//div[text()='Edit & Configure CRM']//following::div[@class='table__pagination-nav-btns']//button)[1]");

	public static By SaveReportAdded = By
			.xpath("//div[text()='Edit & Configure CRM']//following::button[text()='Save']");
	public static By SaveEditAgency = By.xpath("//h1[text()='Edit Agency']//following::button[text()='Save']");
	public static By ActiveQSReport = By.xpath(
			"//*[@class='product-form__executive-reports']//div[text()='Active']//ancestor::div[@class='rt-tr-group']//div[@class='rt-td'][1]");

	public static String RandomID;
	public static ArrayList<String> ReportsListAdmin = new ArrayList<String>();
	public static boolean StatusFound;
	public static boolean EditedIDFound;
	public static boolean CheckCRMToggle;
	public static boolean CompareReports;

	public static String AgencyNameGrid(String name) {
		String xPath = "//div[text()='" + name + "']";
		return xPath;
	}

	public void Reports_PreRequisite() throws InterruptedException {
		log.LoginAdmin();
		WaitForCurserRunning(2);
		WaitUntilVisible(CSPExternalUtility.AgencySearchField);
		WaitUntilPresent(CSPExternalUtility.AgencySearchField);
		WaitForElementInteractable(CSPExternalUtility.AgencySearchField);
		String AgencyID = Integer.toString(BrowsersInvoked.AgencyID);
		SendKeys(CSPExternalUtility.AgencySearchField, AgencyID);
		WaitUntilVisible(By.xpath(AgencyNameGrid(AgencyID)));
		WaitForElementInteractable(CSPExternalUtility.EditAgencyIcon);
		ClickOn(CSPExternalUtility.EditAgencyIcon);
		WaitUntilElementInvisible(CSPExternalUtility.EditAgencyIcon);
		WaitUntilVisible(CRMSectionEditIcon);
		WaitUntilPresent(CRMSectionEditIcon);
		JavascriptExecutor je = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(CRMSectionEditIcon);
		je.executeScript("arguments[0].scrollIntoView(true);", element);
		ClickOn(CRMSectionEditIcon);
		WaitForElementInteractable(BackToUrLCitizenView);
		Clear(BackToUrLCitizenView);
		SendKeys(BackToUrLCitizenView, "https://app-stage.comcate.com/agencies/181/setup");
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertAll();
	}

	public void Reports_VerifyAdditionOfNewReports() throws InterruptedException {
		ClickOn(AddReportLinkText);
		String RandomName = RandomStrings.RequiredCharacters(9);
		RandomID = RandomStrings.RequiredString(15);
		SendKeys(DashboardNameField, RandomName);
		SendKeys(DashboardIDField, RandomID);
		ClickOn(AddReportButton);
		if (driver.findElements(QsReportPreListButton).size() > 0) {
			Boolean listPrebtncheck = driver.findElement(QsReportPreListButton).isEnabled();
			while (listPrebtncheck) {
				ClickOn(QsReportPreListButton);

				listPrebtncheck = driver.findElement(QsReportPreListButton).isEnabled();

			}

		}

		List<String> QSReportText = new ArrayList<String>();
		driver.findElements(ActiveQSReport).stream().forEach(x -> QSReportText.add(x.getText()));

		if (driver.findElements(QsReportNextListButton).size() > 0) {

			Boolean listbtncheck = driver.findElement(QsReportNextListButton).isEnabled();
			while (listbtncheck) {
				ClickOn(QsReportNextListButton);
				listbtncheck = driver.findElement(QsReportNextListButton).isEnabled();

				driver.findElements(ActiveQSReport).stream().forEach(x -> QSReportText.add(x.getText()));
			}
		}

		int Count = 0;
		for (int j = 0; j < QSReportText.size(); j++) {
			String QSReporty = QSReportText.get(j);

			if (QSReporty.equals(RandomName)) {
				Count++;
			}
		}

		for (int ix = 0; ix < QSReportText.size(); ix++) {
			String QSReportz = QSReportText.get(ix);

			ReportsListAdmin.add(QSReportz);
		}

		StatusFound = (Count == 1);
		WaitUntilPresent(SaveReportAdded);
		ClickOn(SaveReportAdded);
		WaitUntilElementInvisible(SaveReportAdded);
		WaitForElementInteractable(SaveEditAgency);
		ClickOn(SaveEditAgency);
		WaitUntilElementInvisible(SaveEditAgency);
		WaitUntilElementInvisible(SaveEditAgency);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(StatusFound);
		softAssert.assertAll();
	}

	public void Reports_VerifyEditedQSReport() throws InterruptedException {

		WaitUntilVisible(CSPExternalUtility.EditAgencyIcon);
		WaitUntilPresent(CSPExternalUtility.EditAgencyIcon);
		WaitForElementInteractable(CSPExternalUtility.EditAgencyIcon);
		ClickByJsExecuter(CSPExternalUtility.EditAgencyIcon);
		WaitUntilVisible(CRMSectionEditIcon);
		WaitUntilPresent(CRMSectionEditIcon);
		WaitForElementInteractable(CRMSectionEditIcon);
		JavascriptExecutor je = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(CRMSectionEditIcon);
		je.executeScript("arguments[0].scrollIntoView(true);", element);
		ClickByJsExecuter(CRMSectionEditIcon);
		WaitUntilVisible(QSReportEditIcon);
		WaitForElementInteractable(QSReportEditIcon);
		RandomID = RandomStrings.RequiredString(15);
		String DashboardNewId = "Edited123#";
		ClickOn(QSReportEditIcon);
		WaitForElementInteractable(DashboardIDField);
		driver.findElement(DashboardIDField).clear();
		SendKeys(DashboardIDField, DashboardNewId);
		ClickOn(SaveButton);
		WaitUntilElementInvisible(SaveButton);
		WaitUntilVisible(DashboardIDList);
		String DashboardIDs = driver.findElement(DashboardIDList).getText();
		int Count;

		if (DashboardIDs.equalsIgnoreCase(DashboardNewId)) {
			Count = 1;
		} else {
			Count = 0;
		}

		EditedIDFound = (Count == 1);
		ClickOn(SaveQSReportPopup);
		WaitUntilElementInvisible(SaveQSReportPopup);
		ClickOn(SaveEditAgencyPopup);
		WaitUntilElementInvisible(SaveEditAgencyPopup);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(EditedIDFound);
		softAssert.assertAll();
	}

	public void Reports_VerifyCRMToggleForReports() throws InterruptedException {

		driver.navigate().to(BrowsersInvoked.URLDashboard);
		WaitForCurserRunning(7);
		WaitUntilVisible(ReportsTab);
		WaitUntilPresent(ReportsTab);
		WaitForElementInteractable(ReportsTab);
		ClickByJsExecuter(ReportsTab);

		int checkCRM = findElementsByXPath(CRMToggle).size();
		if (checkCRM == 0) {
			refreshPage();
			WaitForCurserRunning(8);
			WaitUntilVisible(CRMToggle);
			WaitForElementInteractable(CRMToggle);
		}
		WaitUntilVisible(CRMToggle);
		WaitUntilPresent(CRMToggle);
		WaitForElementInteractable(CRMToggle);
		List<WebElement> CRMTogglePresence = driver.findElements(CRMToggle);
		CheckCRMToggle = CRMTogglePresence.size() == 1;
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(CheckCRMToggle);
		softAssert.assertAll();
	}

	public void Reports_VerifyAllCRMReports() throws InterruptedException {
		WaitForCurserRunning(5);
		WaitUntilVisible(CRMToggle);
		WaitUntilPresent(CRMToggle);
		// WebDriverWaits.ClickByJsExecuter(CRMToggle);
		driver.findElement(CRMToggle).click();
		WaitForCurserRunning(5);
		WaitUntilVisible(AppReportsList);
		WaitUntilPresent(AppReportsList);
		ArrayList<String> ReportsListApp = new ArrayList<String>();
		List<WebElement> ReportsList = driver.findElements(AppReportsList);
		for (int i = 0; i < ReportsList.size(); i++) {
			WebElement AppReports = ReportsList.get(i);
			String ReportsText = AppReports.getText();
			ReportsListApp.add(ReportsText);
		}
		CompareReports = (ReportsListApp.equals(ReportsListAdmin));
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(CompareReports);	
		softAssert.assertAll();
	}

}
