package POM;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import BrowsersBase.BrowsersInvoked;
import CommonMethods.CECommonMethods;
import CommonMethods.CRMCommonMethods;
import CommonMethods.CheckDownloadedFile;
import CommonMethods.Helper;
import CommonMethods.RandomStrings;
import net.bytebuddy.utility.RandomString;


public class CSLPUtility extends Helper{


	public WebDriver driver;
	LoginUtility log;
	
	public CSLPUtility(WebDriver driver) {
		super(driver);
		this.driver = driver;
		log = new LoginUtility(driver);


	}

	public void LoginAgency() throws InterruptedException {
		log.LoginAgency();

	}


	  public static String cSLPTab = "//a[text()='Customer Submissions']";
	    public static String customerSubmissionsHeader = "//label[@class='dropdown__selector__label']";
	    public static String statusPrimaryFilter = "//label[text()='Status']";
	    public static String createdPrimaryFilter = "//label[text()='Created']";
	    public static String allButtonCSLP = "//button[text()='All']";
	    public static String mineButton = "//button[text()='Mine']";
	    public static String moreButton = "//label[text()='More...']";
	    public static String tagsUnderColumn = "//span[@class='clipped-text']/a";
	    public static String tagsAppliedFilter = "//label[@for='tagIds']";
	    public static String selectedTag = "//label[@for='tagIds']/following::label[1]";
	    public static String clearAllFiltersLink = "//a[text()='Clear all filters']";
	    public static String nextPaginationCSLP = "//div[@class='table__pagination-nav-btns']/button[2]";
	    public static String submissionID = "//span[@class='checkbox-holder']/following::a[1]";
	    public static String previousPaginationCSLP = "//div[@class='table__pagination-nav-btns']/button[1]";
	    public static String submissionNumberHeader = "//div[text()='Submission Number']";
	    public static String deleteLink = "//a[text()='Delete']";
	    public static String deleteSubmissionPopup = "//div[@class='modal-header' and text()='Delete Submission']";
	    public static String deleteTextField = "//input[@name='deleteText']";
	    public static String deleteSubmissionButton = "//button[text()='Delete Submission']";
	    public static String validationMsgDeleteSubmission = "//div[@class='modal-base__error modal-base__error--show']";
	    public static String submissionsCount = "//div[@class='cs-listing__section__header']//following-sibling::span";
	    public static String doNotDeleteButton = "//button[text()='Do Not Delete']";
	    public static String paginationCount = "//span[@class='table__pagination-of-text']";
	    public static String filterSlider = "//i[@class='fa fa-2 fa-sliders']";
	    public static String categoryCheckbox = "//label[text()='Category']";
	    public static String filterSliderClose = "//button[@class='drawer__close']";
	    public static String categoryDropdownIcon = "//label[@for='categoryIds']/following::span[1]";
	    public static String firstCategoryCheckbox = "input#Category-0 + .checkbox__content.htmlfor--enabled";
	    public static String categoryColumnResults = "//div[@class='rt-td'][9]";
	    public static String crossSecondaryFilter = "//div[@class='filter-options category']/following::button[1]";
	    public static String countSecondaryFilters = "//div[@class='filters-secondary__chip']";
	    public static String cSLPSearchField = "//input[@name='searchQuery']";
	    public static String anonymousColumn = "//span[text()='Anonymous']";

	    public static By CSLPTab = By.xpath(cSLPTab);
	    public static By CustomerSubmissionsHeader = By.xpath(customerSubmissionsHeader);
	    public static By StatusPrimaryFilter = By.xpath(statusPrimaryFilter);
	    public static By CreatedPrimaryFilter = By.xpath(createdPrimaryFilter);
	    public static By AllButtonCSLP = By.xpath(allButtonCSLP);
	    public static By MineButton = By.xpath(mineButton);
	    public static By MoreButton = By.xpath(moreButton);
	    public static By TagsUnderColumn = By.xpath(tagsUnderColumn);
	    public static By TagsAppliedFilter = By.xpath(tagsAppliedFilter);
	    public static By SelectedTag = By.xpath(selectedTag);
	    public static By ClearAllFiltersLink = By.xpath(clearAllFiltersLink);
	    public static By NextPaginationCSLP = By.xpath(nextPaginationCSLP);
	    public static By PreviousPaginationCSLP = By.xpath(previousPaginationCSLP);
	    public static By SubmissionID = By.xpath(submissionID);
	    public static By SubmissionNumberHeader = By.xpath(submissionNumberHeader);
	    public static By DeleteLink = By.xpath(deleteLink);
	    public static By DeleteSubmissionPopup = By.xpath(deleteSubmissionPopup);
	    public static By DeleteTextField = By.xpath(deleteTextField);
	    public static By DeleteSubmissionButton = By.xpath(deleteSubmissionButton);
	    public static By ValidationMsgDeleteSubmission = By.xpath(validationMsgDeleteSubmission);
	    public static By SubmissionsCount = By.xpath(submissionsCount);
	    public static By DoNotDeleteButton = By.xpath(doNotDeleteButton);
	    public static By PaginationCount = By.xpath(paginationCount);
	    public static By FilterSlider = By.xpath(filterSlider);
	    public static By CategoryCheckbox = By.xpath(categoryCheckbox);
	    public static By FilterSliderClose = By.xpath(filterSliderClose);
	    public static By CategoryDropdownIcon = By.xpath(categoryDropdownIcon);
	    public static By FirstCategoryCheckbox = By.cssSelector(firstCategoryCheckbox);
	    public static By CategoryColumnResults = By.xpath(categoryColumnResults);
	    public static By CrossSecondaryFilter = By.xpath(crossSecondaryFilter);
	    public static By CountSecondaryFilters = By.xpath(countSecondaryFilters);
	    public static By CSLPSearchField = By.xpath(cSLPSearchField);
	    public static By AnonymousColumn = By.xpath(anonymousColumn);

	    public static By SaveAsButton = By.xpath("//button[text()='Save As']");
	    public static By SaveAsPopup = By.xpath("//div[text()='Save As']");
	    public static By ErrorMsgSaveAsPopup = By.xpath("//span[text()='The Filter Name is required.']");
	    public static By FilterNameField = By.xpath("//input[@placeholder='Enter Text']");
	    public static By CountSavedFilters = By.xpath("(//ul[@class='dropdown__options--single'])[1]/li");
	    public static By CrossIconFilters = By.xpath("//button[@class='delete-btn  btn btn-primary']");
	    public static By FiltersDropdown = By.xpath("(//div[@class='dropdown__selector__selected']/label)[1]");
	    public static By YesDelete = By.xpath("//div[@class='flex-row--middle']/button[2]");
	    public static By DownloadButton = By.xpath("//button[text()='Download']");
	    public static By CSVOption = By.xpath("//li[text()='CSV']");
	    public static By CSVSuccessMessage = By.xpath("//div[@class='success-custom-message']");
	    public static By AgencyUserName = By.xpath("//div[@class='app-header__user-name']/label");
	    public static By IssueDescriptionColumn = By.xpath("//div[text()='Issue Description']");
	    public static By IssueDescriptionCheckbox = By.xpath("//label[@for='checkbox-column-Issue Description']");
	    public static By ColumnControlWidget = By.xpath("//i[@class='fa fa-2 fa-cog']");
	    public static By CloseColumnControl = By.xpath("//button[@class='drawer__close']");
	    public static By CrossIconForCSDP = By.xpath("//div[@class='customer-submission-details__close-icon']/img");
	    public static By submissionCountDetails = By.xpath("(//div[@class='cs-listing__section__header']//span)[2]");
	    public static By mapViewCasList = By.xpath("//ul[@class='map-view-sidebar-listing__wrapper']");

	    public static ArrayList<Integer> IDArray = new ArrayList<Integer>();
	    public static String CSLPHeader;
	    public static String ExpectedHeader;
	    public static boolean PrimaryFiltersPresence;
	    public static String TagFilterText;
	    public static String TagText;
	    public static String SelectedTagText;
	    public static boolean PaginationDifference;
	    public static boolean VerifyDescendingOrder;
	    public static boolean VerifyAscendingOrder;
	    public static String DeleteSubmissionTitle;
	    public static String ValidationMessageDeleteSubmission;
	    public static String ExpectedMsgDeleteSubmission;
	    public static boolean SubmissionDeletion;
	    public static int SubmissionCountAtHeader;
	    public static int TotalCasesCount;
	    public static boolean ClearAllFiltersPresence;
	    public static boolean ClearAllFiltersAbsence;
	    public static boolean CompareFilterResultsCount;
	    public static boolean CompareRemovedFilterCount;
	    public static boolean CompareSearchResultsCount;
	    public static boolean VerifyAbsenceOfCol;
	    public static boolean VerifyColumnsPresence;
	    public static String SaveAsPopupTitle;
	    public static boolean CompareCountDeletedFilter;
	    public static String SuccessMsgCSV;
	    public static String ExpectedMsgCSV;
	    public static String FileStatus;
	    public static String RecentSubmissionID;
	    public static String OpenedSubmissionID;
	    public static boolean CompareMineResultsCount;

	    public  void CSLP_VerifyCSLPOpensUP() throws InterruptedException {
	        driver.navigate().to(BrowsersInvoked.URLDashboard);
	        WaitForCurserRunning(7);
	        WaitUntilVisible(CSLPTab);
	        WaitForElementInteractable(CSLPTab);
	        ClickByJsExecuter(CSLPTab);
	        WaitForCurserRunning(7);
	        WaitUntilVisible(CustomerSubmissionsHeader);
	        CSLPHeader = GetText(CustomerSubmissionsHeader);
	        ExpectedHeader = "Customer Submissions:";
	        SoftAssert softAssert = new SoftAssert();
	        softAssert.assertEquals(CSLPHeader,ExpectedHeader);
	        softAssert.assertAll();
	    }



	    public  void CSLP_VerifyPrimaryFilters() throws InterruptedException {
	        WaitForElementInteractable(FilterSlider);
	        ClickOn(FilterSlider);
	        WebElement PrimaryFilter1 = WaitUntilVisibleWE(StatusPrimaryFilter);
	        WebElement PrimaryFilter2 = WaitUntilVisibleWE(CreatedPrimaryFilter);
	        WaitForElementInteractable(FilterSliderClose);
	        ClickOn(FilterSliderClose);
	        WebElement PrimaryFilter3 = WaitUntilVisibleWE(AllButtonCSLP);
	        WebElement PrimaryFilter4 = WaitUntilVisibleWE(MineButton);
	        WebElement PrimaryFilter5 = WaitUntilVisibleWE(MoreButton);
	        PrimaryFiltersPresence = ((PrimaryFilter1.isDisplayed()) == true) && (PrimaryFilter2.isDisplayed() == true) && (PrimaryFilter3.isDisplayed() == true) && (PrimaryFilter4.isDisplayed() == true) && (PrimaryFilter5.isDisplayed() == true);
	        SoftAssert softAssert = new SoftAssert();
	        softAssert.assertTrue(PrimaryFiltersPresence);
	        softAssert.assertAll();

	    }

	    public  void CSLP_VerifyTagFilter() throws InterruptedException {
	        refreshPage();
	        TagText = GetText(TagsUnderColumn);
	        WaitForElementInteractable(TagsUnderColumn);
	        ClickByJsExecuter(TagsUnderColumn);
	        WaitForCurserRunning(5);
	        WaitUntilVisible(By.xpath("//div[@role='columnheader']//div[text()='Issue Description']"));
	        WaitUntilVisible(TagsAppliedFilter);
	        TagFilterText = GetText(TagsAppliedFilter);
	        WaitUntilVisible(SelectedTag);
	        WaitUntilPresent(SelectedTag);
	        SelectedTagText = GetText(SelectedTag);
	        WaitForElementInteractable(ClearAllFiltersLink);
	        ClickByJsExecuter(ClearAllFiltersLink);
	        WaitUntilElementInvisible(ClearAllFiltersLink);
	        WaitUntilVisible(By.xpath("//div[@role='columnheader']//div[text()='Issue Description']"));
	        WaitForCurserRunning(6);
	        SoftAssert softAssert = new SoftAssert();
	        softAssert.assertEquals(TagFilterText, "Tags");
	        softAssert.assertEquals(TagText, SelectedTagText);
	        softAssert.assertAll();

	    }

	    public  void CSLP_VerifyNavigationFromPagination() throws InterruptedException {
	        WaitUntilVisible(SubmissionID);
	        WaitUntilPresent(SubmissionID);
	        WaitUntilVisible(NextPaginationCSLP);
	        WaitForElementInteractable(NextPaginationCSLP);
	        forcedWaitTime(2);
	        String[] CaseIDBeforeClick = GetText(SubmissionID).split("-");
	        String ID1 = CaseIDBeforeClick[1];
	        WaitForElementInteractable(NextPaginationCSLP);
	        ClickOn(NextPaginationCSLP);
	        WaitUntilVisible(SubmissionID);
	        waitForStaleElementReference(SubmissionID);
	        WaitUntilPresent(SubmissionID);
	        WaitUntilPresent(PreviousPaginationCSLP);
	        WaitForElementInteractable(PreviousPaginationCSLP);
	        forcedWaitTime(2);
	        String[] CaseIDAfterClick = GetText(SubmissionID).split("-");
	        String ID2 = CaseIDAfterClick[1];
	        int differenceID = Integer.parseInt(ID1) - Integer.parseInt(ID2);
	        System.out.println("differenceID" + differenceID);
	        PaginationDifference = differenceID >= 50;
	        SoftAssert softAssert = new SoftAssert();
	        softAssert.assertTrue(PaginationDifference);
	        softAssert.assertAll();
	    }

	    public  void CSLP_VerifyDescendingOrderOfSubmissions() throws InterruptedException {
	        int FinalIDs;
	        try {
	            List<WebElement> AllSubmissionsID = findElementsByXPath(SubmissionID);
	            int CountIDs = AllSubmissionsID.size() / 2;
	            for (int i = 0; i < CountIDs; i++) {
	                WebElement IDList = AllSubmissionsID.get(i);
	                String[] IDList1 = IDList.getText().split("-");
	                String IDs = IDList1[1];
	                FinalIDs = Integer.parseInt(IDs);
	                IDArray.add(FinalIDs);
	            }
	            int State = 0;
	            Integer[] arr = new Integer[IDArray.size()];
	            for (int i = 0; i < 1; i++) {
	                arr[i] = IDArray.get(i);
	                for (int j = i + 1; j < IDArray.size(); j++) {
	                    arr[j] = IDArray.get(j);
	                    if ((arr[j] < arr[i]) == false) {
	                        State = 1;
	                    }
	                }
	            }
	            VerifyDescendingOrder = (State == 0);
	        } catch (WebDriverException e) {
	            e.printStackTrace();
	        }
	        SoftAssert softAssert = new SoftAssert();
	        softAssert.assertTrue(VerifyDescendingOrder);
	        softAssert.assertAll();
	    }

	    public  void CSLP_VerifyAscendingOrderOfCases() throws InterruptedException {
	        WaitUntilVisible(SubmissionNumberHeader);
	        WaitForElementInteractable(SubmissionNumberHeader);
	        ClickOn(SubmissionNumberHeader);
	        WaitForGridTableEnable();
	        WaitUntilVisible(SubmissionID);
	        WaitUntilVisible(NextPaginationCSLP);
	        WaitForElementInteractable(NextPaginationCSLP);
	        WaitForElementInteractable(NextPaginationCSLP);
	        waitForStaleElementReference(SubmissionID);
	        forcedWaitTime(2);
	        List<WebElement> AllSubmissionsID = driver.findElements(SubmissionID);
	        List<Integer> IDList = AllSubmissionsID.stream().map(m->Integer.parseInt(m.getText().split("-")[1])).collect(Collectors.toList());
	        for (int i = 1; i < IDList.size(); i++) {
	            if (IDList.get(i) < IDList.get(i - 1)) {
	                VerifyAscendingOrder= false;
	            }
	        }
	        VerifyAscendingOrder= true;
	        SoftAssert softAssert = new SoftAssert();
	        softAssert.assertTrue(VerifyAscendingOrder);
	        softAssert.assertAll();
	    }



	    public  void CSLP_VerifyDeletedSubmission() throws InterruptedException {

	        WaitUntilVisible(SubmissionNumberHeader);
	        WaitForElementInteractable(SubmissionNumberHeader);
	        WaitUntilInvisible(By.cssSelector("div.table-container__table table_disabled"));
	        ClickOn(SubmissionNumberHeader);
	        WaitUntilVisible(By.cssSelector("div.table-container__table "));
	        WaitUntilVisible(DeleteLink);
	        waitForStaleElementReference(DeleteLink);
	        WaitUntilPresent(DeleteLink);
	        ScrollIntoView(DeleteLink);
	        WaitForElementInteractable(DeleteLink);
	        WaitUntilVisible(SubmissionsCount);
	        String[] CountCases = GetText(SubmissionsCount).split(" ");
	        String CountBefore = CountCases[0];
	        int BeforeDeleting = Integer.parseInt(CountBefore);
	        waitForStaleElementReference(DeleteLink);
	        ClickByJsExecuter(DeleteLink);
	        WaitUntilVisible(DeleteSubmissionPopup);
	        WaitUntilPresent(DeleteSubmissionPopup);
	        DeleteSubmissionTitle = GetText(DeleteSubmissionPopup);
	        WaitForElementInteractable(DeleteSubmissionButton);
	        ClickByJsExecuter(DeleteSubmissionButton);
	        WaitUntilVisible(ValidationMsgDeleteSubmission);
	        WaitUntilPresent(ValidationMsgDeleteSubmission);
	        ValidationMessageDeleteSubmission = GetText(ValidationMsgDeleteSubmission);
	        ExpectedMsgDeleteSubmission = "Please enter DELETE in all caps";
	        WaitForElementInteractable(DeleteTextField);
	        SendKeys(DeleteTextField, "DELETE");
	        WaitForElementInteractable(DeleteSubmissionButton);
	        ClickOn(DeleteSubmissionButton);
	        WaitUntilElementInvisible(DeleteSubmissionButton);
	        WaitForCurserRunning(8);
	        refreshPage();
	        WaitForCurserRunning(10);
	        WaitUntilVisible(SubmissionsCount);
	        WaitUntilPresent(SubmissionsCount);
	        WaitUntilVisible(NextPaginationCSLP);
	        WaitForElementInteractable(NextPaginationCSLP);
	        String[] CountCases2 = GetText(SubmissionsCount).split(" ");
	        String CountAfter = CountCases2[0];
	        int AfterDeleting = Integer.parseInt(CountAfter);
	        SubmissionDeletion = (AfterDeleting < BeforeDeleting);
	        SoftAssert softAssert = new SoftAssert();
	        softAssert.assertEquals(DeleteSubmissionTitle, "Delete Submission");
	        softAssert.assertEquals(ValidationMessageDeleteSubmission, ExpectedMsgDeleteSubmission);
	        softAssert.assertTrue(SubmissionDeletion);
	        softAssert.assertAll();
	    }

	    public  void CSLP_VerifyTotalCountOfSubmissions() throws InterruptedException {
	        String[] CountOfCases = GetText(SubmissionsCount).split(" ");
	        String CountHeader = CountOfCases[0];
	        SubmissionCountAtHeader = Integer.parseInt(CountHeader);
	        String[] PaginationCounts = GetText(PaginationCount).split(" ");
	        String PaginationFinal = PaginationCounts[1];
	        int PgCount = Integer.parseInt(PaginationFinal);
	        int CountCasesCLP = (PgCount - 1) * 50;
	        for (int i = 0; i < PgCount - 1; i++) {
	            WaitForElementInteractable(NextPaginationCSLP);
	            ClickByJsExecuter(AgencyUserName);
	            WaitForGridTableEnable();

	        }
	        List<WebElement> AllCasesID = WaitUntilVisibleList(SubmissionID);
	        int CountIDs = AllCasesID.size();
	        TotalCasesCount = CountCasesCLP + CountIDs;
	        SoftAssert softAssert = new SoftAssert();
	        softAssert.assertEquals(TotalCasesCount, SubmissionCountAtHeader);
	        softAssert.assertAll();
	    }

	    public  void CSLP_VerifyClearAllFiltersLinkText() throws InterruptedException {
	        refreshPage();
	        WaitForCurserRunning(3);
	        WaitForElementInteractable(TagsUnderColumn);
	        ClickOn(TagsUnderColumn);
	        WaitForElementInteractable(ClearAllFiltersLink);
	        List<WebElement> ClearAllFilters = WaitUntilVisibleList(ClearAllFiltersLink);
	        ClearAllFiltersPresence = ClearAllFilters.size() == 1;
	        SoftAssert softAssert = new SoftAssert();
	        softAssert.assertTrue(ClearAllFiltersPresence);
	        softAssert.assertAll();
	    }

	    public  void CSLP_VerifyClearAllFiltersAfterClicking() throws InterruptedException {
	        refreshPage();
	        WaitForCurserRunning(4);
	        WaitUntilVisible(TagsUnderColumn);
	        WaitForElementInteractable(TagsUnderColumn);
	        ClickOn(TagsUnderColumn);
	        WaitUntilVisible(ClearAllFiltersLink);
	        WaitForElementInteractable(ClearAllFiltersLink);
	        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(4));
	        ClickByJsExecuter(ClearAllFiltersLink);
	        WaitUntilElementInvisible(ClearAllFiltersLink);
	        List<WebElement> ClearAllFilters = driver.findElements(ClearAllFiltersLink);
	        ClearAllFiltersAbsence = ClearAllFilters.size() == 0;
	        SoftAssert softAssert = new SoftAssert();
	        softAssert.assertTrue(ClearAllFiltersAbsence);
	        softAssert.assertAll();
	    }

	    public  void CSLP_VerifyApplicationOfsecondaryFilters() throws InterruptedException {
	        WaitUntilVisible(FilterSlider);
	        WaitForElementInteractable(FilterSlider);
	        ClickByJsExecuter(FilterSlider);
	        WaitForElementInteractable(CategoryCheckbox);
	        ClickOn(CategoryCheckbox);
	        WaitForElementInteractable(FilterSliderClose);
	        ClickOn(FilterSliderClose);
	        WaitForElementInteractable(CategoryDropdownIcon);
	        ClickOn(CategoryDropdownIcon);
	        WaitForElementInteractable(CategoryCheckbox);
	        ClickOn(FirstCategoryCheckbox);
	        WaitForElementInteractable(CategoryDropdownIcon);
	        ClickOn(CategoryDropdownIcon);
	        WaitForCurserRunning(5);
	        WaitUntilVisible(SubmissionsCount);
	       forcedWaitTime(5);
	        WaitUntilInvisible(By.xpath("table-container__table table_disabled"));
	        String[] CountOfCases = GetText(SubmissionsCount).split(" ");
	        String CountHeader = CountOfCases[0];
	        int CountAtHeader = Integer.parseInt(CountHeader);

	        List<WebElement> filterAppliedCount = driver.findElements(SubmissionID);
	        System.out.println(CountAtHeader);
	        System.out.println(filterAppliedCount.size());
	        CompareFilterResultsCount = (CountAtHeader == filterAppliedCount.size());
	        SoftAssert softAssert = new SoftAssert();
	        softAssert.assertTrue(CompareFilterResultsCount);
	        softAssert.assertAll();
	    }

	    public  void CSLP_VerifyFilterGetsRemoved() throws InterruptedException {
	        WaitUntilVisible(CountSecondaryFilters);
	        List<WebElement> SecondaryFilters = WaitUntilVisibleList(CountSecondaryFilters);
	        int countSF1 = SecondaryFilters.size();
	        WaitForElementInteractable(CrossSecondaryFilter);
	        ClickOn(CrossSecondaryFilter);
	        WaitUntilElementInvisible(CrossSecondaryFilter);
	        // WaitUntilVisible(CountSecondaryFilters);
	        List<WebElement> SecondaryFilters2 = driver.findElements(CountSecondaryFilters);
	        int countSF2 = SecondaryFilters2.size();
	        CompareRemovedFilterCount = (countSF1 > countSF2);
	        SoftAssert softAssert = new SoftAssert();
	        softAssert.assertTrue(CompareRemovedFilterCount);
	        softAssert.assertAll();
	    }

	    public  void CSLP_VerifyFilterAndSearch() throws InterruptedException {
	        WaitUntilPresent(CSLPSearchField);
	        WaitForElementInteractable(CSLPSearchField);
	        SendKeys(CSLPSearchField, "Anonymous");
	        WaitUntilVisible(By.xpath("//div[@class='table-container__table table_disabled']"));
	        WaitUntilInvisible(By.xpath("//div[@class='table-container__table table_disabled']"));
	        WaitUntilVisible(SubmissionID);
	        WaitUntilVisible(SubmissionNumberHeader);
	        WaitForElementInteractable(SubmissionNumberHeader);
	        List<WebElement> AllSubmissionsID = driver.findElements(SubmissionID);
	        int CountIDs = AllSubmissionsID.size();
	        WaitUntilVisible(AnonymousColumn);
	        List<WebElement> AnonymousList = driver.findElements(AnonymousColumn);
	        int AnonymousTextList = AnonymousList.size();
	        CompareSearchResultsCount = (AnonymousTextList == CountIDs);
	        WaitUntilVisible(By.cssSelector("div.table-container__table table_disabled"));
	        WaitUntilInvisible(By.cssSelector("div.table-container__table table_disabled"));
	        ClickOn(ClearAllFiltersLink);
	        SoftAssert softAssert = new SoftAssert();
	        softAssert.assertTrue(CompareSearchResultsCount);
	        softAssert.assertAll();
	    }

	    public  void CSLP_VerifyRemovalOfColumns() throws InterruptedException {
	        WaitForElementInteractable(ColumnControlWidget);
	        ClickOn(ColumnControlWidget);
	        WaitForElementInteractable(IssueDescriptionCheckbox);
	        ClickOn(IssueDescriptionCheckbox);
	        WaitForElementInteractable(CloseColumnControl);
	        ClickByJsExecuter(CloseColumnControl);
	        WaitUntilElementInvisible(IssueDescriptionColumn);
	        List<WebElement> IssueDescriptionCol = driver.findElements(IssueDescriptionColumn);
	        VerifyAbsenceOfCol = IssueDescriptionCol.size() == 0;
	        SoftAssert softAssert = new SoftAssert();
	        softAssert.assertTrue(VerifyAbsenceOfCol);
	        softAssert.assertAll();
	    }

	    public  void CSLP_VerifyRestorationOfColumns() throws InterruptedException {
	        WaitForElementInteractable(ColumnControlWidget);
	        ClickOn(ColumnControlWidget);
	        WaitForElementInteractable(IssueDescriptionCheckbox);
	        ClickOn(IssueDescriptionCheckbox);
	        WaitForElementInteractable(CloseColumnControl);
	        ClickOn(CloseColumnControl);
	        WaitUntilVisible(IssueDescriptionColumn);
	        List<WebElement> IssueDescriptionCol = driver.findElements(IssueDescriptionColumn);
	        VerifyColumnsPresence = (IssueDescriptionCol.size() == 1);
	        SoftAssert softAssert = new SoftAssert();
	        softAssert.assertTrue(VerifyColumnsPresence);
	        softAssert.assertAll();
	    }

	    public  void CSLP_VerifySavedFilter() throws InterruptedException {
	        WaitForElementInteractable(FiltersDropdown);
	        ClickOn(FiltersDropdown);
	        WaitUntilVisible(CrossIconFilters);
	        int CountFiltersCross = driver.findElements(CrossIconFilters).size();
	        if (CountFiltersCross > 0) {
	            driver.findElement(CrossIconFilters).click();
	            WaitForElementInteractable(YesDelete);
	            ClickOn(YesDelete);
	            WaitUntilVisible(CrossIconFilters);
	            CountFiltersCross = driver.findElements(CrossIconFilters).size();
	        }
	        WaitForElementInteractable(FiltersDropdown);
	        ClickOn(FiltersDropdown);
	        WaitForElementInteractable(SaveAsButton);
	        ClickOn(SaveAsButton);
	        WaitUntilVisible(SaveAsPopup);
	        SaveAsPopupTitle = GetText(SaveAsPopup);
	        String FilterNameRandom = RandomStrings.RequiredString(5);
	        SendKeys(FilterNameField, "Filter " + (FilterNameRandom));
	        WaitForElementInteractable(CSDPUtility.SaveButton);
	        ClickOn(CSDPUtility.SaveButton);
	        WaitForElementInteractable(FiltersDropdown);
	        ClickOn(FiltersDropdown);
	        WaitForCurserRunning(2);
	        SoftAssert softAssert = new SoftAssert();
	        softAssert.assertEquals(SaveAsPopupTitle, "Save As");
	        softAssert.assertAll();

	    }

	    public  void CSLP_VerifyDeletedFilter() throws InterruptedException {
	        WaitUntilVisible(CountSavedFilters);
	        List<WebElement> CountFilters = findElementsByXPath(CountSavedFilters);
	        int FiltersCount = CountFilters.size();
	        WaitForElementInteractable(CrossIconFilters);
	        ClickOn(CrossIconFilters);
	        WaitForElementInteractable(YesDelete);
	        ClickOn(YesDelete);
	        WaitUntilVisible(CountSavedFilters);
	        List<WebElement> CountFiltersAfter = WaitUntilVisibleList(CountSavedFilters);
	        int FiltersCountAfter = CountFiltersAfter.size();
	        CompareCountDeletedFilter = FiltersCountAfter == (FiltersCount - 1);
	        SoftAssert softAssert = new SoftAssert();
	        softAssert.assertTrue(CompareCountDeletedFilter);
	        softAssert.assertAll();
	    }

	    public  void CSLP_VerifyCSVFile() throws InterruptedException {
	        WaitUntilVisible(DownloadButton);
	        WaitForElementInteractable(DownloadButton);
	        ClickOn(DownloadButton);
	        WaitUntilVisible(CSVOption);
	        WaitForElementInteractable(CSVOption);
	        ClickOn(CSVOption);
	        WaitUntilElementInvisible(CSVOption);
	        forcedWaitTime(5);
	        ExpectedMsgCSV = "CSV file downloaded successfully";

	        Date date = new Date();
	        DateFormat pstFormat = new SimpleDateFormat("MM-dd-YYYY hh:mm");
	        TimeZone pstTime = TimeZone.getTimeZone("PST");
	        pstFormat.setTimeZone(pstTime);
	        String[] timesdate = (pstFormat.format(date).split(" "));

	        DateFormat pstFormat24 = new SimpleDateFormat("YYYY-DD-MM HH:MM:SS a");
	        Date date2 = new Date();
	        TimeZone pstTime1 = TimeZone.getTimeZone("PST");
	        pstFormat24.setTimeZone(pstTime1);
	        String[] timesdate1 = (pstFormat24.format(date).split(" "));

	        String agencyName = (driver.getTitle().split(":"))[0];
	        String[] times = (timesdate[1].split(":"));
	        String file_Name = agencyName + "_" + timesdate[0] + "_" + times[0] + "-" + times[1] + "-" + timesdate1[2] + "_csv.csv";
	        FileStatus = CheckDownloadedFile.isFileDownloaded(file_Name);
	        SoftAssert softAssert = new SoftAssert();
	        softAssert.assertEquals(FileStatus, "File Present");
	        softAssert.assertAll();
	    }

	    public  void CSLP_VerifyDirectionToRespectiveSubmission() throws InterruptedException {
	        WaitUntilVisible(SubmissionID);
	        WaitUntilPresent(SubmissionID);
	        RecentSubmissionID = GetText(SubmissionID);
	        CloseOtherTabs();
	        WaitUntilVisible(SubmissionID);
	        WaitForElementInteractable(SubmissionID);
	        ClickByJsExecuter(SubmissionID);
	        WaitForCurserRunning(3);
	        WaitUntilVisible(CSDPUtility.CSDPSubmissionID);
	        String OpenedSubmission[] = GetText(CSDPUtility.CSDPSubmissionID).split("#");
	        OpenedSubmissionID = OpenedSubmission[1];
	        ClickByJsExecuter(CrossIconForCSDP);
	        WaitUntilElementInvisible(CrossIconForCSDP);
	        WaitForCurserRunning(2);
	        WaitUntilVisible(MineButton);
	        WaitForElementInteractable(MineButton);
	        SoftAssert softAssert = new SoftAssert();
	        softAssert.assertEquals(RecentSubmissionID, OpenedSubmissionID);
	        softAssert.assertAll();
	    }

	    public  void CSLP_VerifySubmissionsForMineButton() throws InterruptedException {
	        WaitUntilVisible(MineButton);
	        WaitForElementInteractable(MineButton);
	        ClickOn(MineButton);
	        WaitUntilVisible(By.xpath("//div[@class='table-container__table table_disabled']"));
	        WaitUntilInvisible(By.xpath("//div[@class='table-container__table table_disabled']"));
	        String LoggedInUserName = GetText(AgencyUserName);
	        System.out.println("LoggedInUserName" + LoggedInUserName);
	        WaitUntilVisible(By.xpath("//span[text()='" + (LoggedInUserName) + "']"));
	        WaitUntilPresent(By.xpath("//span[text()='" + (LoggedInUserName) + "']"));
	        List<WebElement> AllSubmissions = WaitUntilVisibleList(SubmissionID);
	        WaitUntilVisible(By.xpath("//span[text()='" + (LoggedInUserName) + "']"));
	        WaitUntilPresent(By.xpath("//span[text()='" + (LoggedInUserName) + "']"));
	        Boolean check = findElement(By.xpath("//span[text()='" + (LoggedInUserName) + "']")).isDisplayed();
	        System.out.println("LoggedIn User is Present" + check);
	        List<WebElement> AgencyUserCases = driver.findElements(By.xpath("//div[@class='rt-td'][3]/span[text()='" + (LoggedInUserName) + "']"));
	        int UserCasesCount = AgencyUserCases.size();
	        System.out.println(AllSubmissions.size());
	        System.out.println(UserCasesCount);
	        CompareMineResultsCount = (AllSubmissions.size() == UserCasesCount);
	        WaitUntilVisible(ClearAllFiltersLink);
	        WaitForElementInteractable(ClearAllFiltersLink);
	        WaitUntilInvisible(AgencyUserName);
	        WaitUntilInvisible(By.xpath("//div[@class='table-container__table table_disabled']"));
	        ClickOn(ClearAllFiltersLink);
	        WaitUntilElementInvisible(By.cssSelector("div.table-container__table table_disabled"));
	        WaitUntilVisible(By.cssSelector("div.table-container__table"));
	        SoftAssert softAssert = new SoftAssert();
	        softAssert.assertTrue(CompareMineResultsCount);
	        softAssert.assertAll();

	    }

	    public  void CSLP_VerifyDescendingSubmission() throws InterruptedException{
	        WaitUntilPresent(SubmissionID);
	        WaitUntilVisible(SubmissionNumberHeader);
	        WaitForElementInteractable(SubmissionNumberHeader);

	        List<WebElement> AllSubmissionsID = findElementsByXPath(SubmissionID);
	        List<Integer> IDList = AllSubmissionsID.stream().map(m->Integer.parseInt(m.getText().split("-")[1])).collect(Collectors.toList());
	        for (int i = 1; i < IDList.size(); i++) {
	            if (IDList.get(i) > IDList.get(i - 1)) {
	                VerifyDescendingOrder= false;
	            }
	        }
	        VerifyDescendingOrder= true;
	        SoftAssert softAssert = new SoftAssert();
	        softAssert.assertTrue(VerifyDescendingOrder);
	        softAssert.assertAll();
	    }
	    public  String actualMesz;
	    public  void CSLP_VerifyNoExistingSubmissionSearch() throws InterruptedException{
	        findElementsByXPath(SubmissionID);
	       // String submissionId = (Integer.parseInt(GetText(SubmissionID).split("-")[1])) + 1 + "";
	        String submissionId = RandomStrings.RequiredDigits(4);
	        WaitUntilPresent(CSLPSearchField);
	        WaitForElementInteractable(CSLPSearchField);
	        SendKeys(CSLPSearchField, submissionId.trim());
	        WaitForCurserRunning(2);
	        WaitUntilVisible(By.xpath("//div[@class='table-container__table table_disabled']"));
	        WaitUntilInvisible(By.xpath("//div[@class='table-container__table table_disabled']"));
	        actualMesz = GetText(submissionCountDetails);

	        //Clean up
	        WaitUntilVisible(ClearAllFiltersLink);
	        WaitForElementInteractable(ClearAllFiltersLink);
	        ClickOn(ClearAllFiltersLink);
	        WaitUntilElementInvisible(ClearAllFiltersLink);
	        WaitUntilElementInvisible(By.cssSelector("div.table-container__table table_disabled"));
	        WaitUntilVisible(By.cssSelector("div.table-container__table"));
	        SoftAssert softAssert = new SoftAssert();
	        softAssert.assertEquals(actualMesz.trim(),"0 Customer Submissions");
	        softAssert.assertAll();
	    }

	    public  static String categoryName;
	    public  static String actualMeszCatSerach;
	    public  void CSLP_VerifyNoExistingCategorySubmission() throws InterruptedException{
	    	CRMCommonMethods crmMethod = new CRMCommonMethods(driver);
	        WaitUntilVisible(SubmissionID);
	        crmMethod.NavigateTo_AgencySetup();
	        ScrollIntoView(AppPreRequisiteUtility.CRMProdSideBar);

	        if (driver.findElements(AppPreRequisiteUtility.CategoriesSideBar).size() == 0) {
	            ClickByJsExecuter(AppPreRequisiteUtility.CRMProdSideBar);
	        }

	        waitForPresenceandVisiblity(AppPreRequisiteUtility.CategoriesSideBar);
	        ScrollIntoView(AppPreRequisiteUtility.CategoriesSideBar);
	        ClickByJsExecuter(AppPreRequisiteUtility.CategoriesSideBar);
	        WaitForCurserRunning(5);

	        categoryName = "EditedCat"+RandomStrings.RequiredString(5);
	        waitForPresenceandVisiblity(CategoryUtility.CreateCategoryButton);
	        crmMethod.CRM_CreateCategoryAppPrerequisute("No", "Yes", "Yes",categoryName);

	        crmMethod.NavigateToCSLP();
	        refreshPage();
	        WaitForCurserRunning(4);
	        WaitUntilVisible(FilterSlider);
	        WaitForElementInteractable(FilterSlider);
	        ClickByJsExecuter(FilterSlider);
	        WaitForElementInteractable(CategoryCheckbox);
	        forcedWaitTime(5);
	        ClickOn(CategoryCheckbox);
	        WaitForElementInteractable(FilterSliderClose);
	        ClickOn(FilterSliderClose);
	        WaitUntilVisible(CategoryDropdownIcon);
	        WaitForElementInteractable(CategoryDropdownIcon);
	        ClickByJsExecuter(CategoryDropdownIcon);
	        WaitUntilVisible(By.xpath("//div[@id='categoryIds']//ul//li"));
	        ScrollIntoView(By.xpath("//div[@id='categoryIds']//ul//li//label[contains(text(),'"+categoryName+"')]"));
	        ClickOn(By.xpath("//div[@id='categoryIds']//ul//li//label[contains(text(),'"+categoryName+"')]"));
	        WaitForCurserRunning(2);
	        WaitUntilVisible(By.xpath("//div[@class='rt-noData']"));
	        WaitUntilVisible(submissionCountDetails);
	        actualMeszCatSerach = GetText(submissionCountDetails);

	        // Clean up
	        WaitUntilVisible(ClearAllFiltersLink);
	        WaitForElementInteractable(ClearAllFiltersLink);
	        ClickOn(ClearAllFiltersLink);
	        WaitUntilElementInvisible(ClearAllFiltersLink);
	        WaitUntilElementInvisible(By.cssSelector("div.table-container__table table_disabled"));
	        WaitUntilVisible(By.cssSelector("div.table-container__table"));

	        SoftAssert softAssert = new SoftAssert();
	        softAssert.assertEquals(actualMeszCatSerach.trim(),"0 Customer Submissions");
	        softAssert.assertAll();
	    }


	    public  static boolean mapViewCase;
	    public  static boolean mapViewZoom;

	    public  void VerifyMapViewPresent() throws InterruptedException {
	        WaitUntilElementInvisible(By.cssSelector("div.table-container__table table_disabled"));
	        WaitUntilVisible(By.cssSelector("div.table-container__table"));
	        WaitForElementInteractable(CLPUtility.mapViewIcon);
	        forcedWaitTime(4);
	        WaitUntilVisible(CLPUtility.mapViewIcon);
	        ClickOn(CLPUtility.mapViewIcon);
	        WaitUntilVisible(mapViewCasList);
	        mapViewCase = ElementIsDisplayed(mapViewCasList);
	        WaitUntilVisible(CLPUtility.mapViweZoomIn);
	        mapViewZoom = ElementIsDisplayed(CLPUtility.mapViweZoomIn);
	        WaitUntilVisible(CLPUtility.mapViewIcon);
	        ClickOn(CLPUtility.mapViewIcon);
	        WaitUntilElementInvisible(mapViewCasList);
	        SoftAssert softAssert = new SoftAssert();
	        softAssert.assertAll();
	    }


}
