package POM;

import BrowsersBase.BrowsersInvoked;
import CommonMethods.CECommonMethods;
import CommonMethods.CRMCommonMethods;
import CommonMethods.Helper;
import org.openqa.selenium.WebDriver;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import CommonMethods.RandomStrings;
import org.testng.annotations.Test;

import static POM.CDP_Utility.Assignee;
import static POM.CSDPUtility.SubmissionAssingee;
import static POM.CSPInternalUtility.CloseSubmissionIcon;

public class SubmissionAssignmentUtility extends Helper{


    public WebDriver driver;
    public LoginUtility log;
    public CECommonMethods ce;
    public CRMCommonMethods crm;


    public SubmissionAssignmentUtility(WebDriver driver) {
        super(driver);
        this.driver = driver;
        log = new LoginUtility(driver);
        ce = new CECommonMethods(driver);
        crm = new CRMCommonMethods(driver);


    }

    

	public void LoginAgency() throws InterruptedException {
		log.LoginAgency();

	}

    public static String editAssignmentIcon = "//div[text()='Submission Received']//following::button[1]";
    public static  String editCaseAssingment = "//div[text()='Case Created']//following::button[1]";
    public static String editAssignmentPopup = "//div[@class='full-page-modal__header']/h1";
    public static String nameField = "//label[@title='Name']/following::input[@name='label']";
    public static String descriptionField = "//input[@name='description']";
    public static String actionDropdown = "//div[@class='Select-value']";
    public static String optionActionDropdown = "//*[text()='Submission Received']";
    public static String saveButton = "//button[text()='Save']";
    public static String crossIconRuleSet = "//div[@class='sortable-table__body__td']/button[2]";
    public static String validationNoRule = "//div[@class='modal-base__error modal-base__error--show']";
    public static String addRuleButton = "//button[text()='Add Rule']";
    public static String createRule = "//h1[text()='Create Rule']";
    public static String criteriaFields = "//label[@title='Attribute']/following::div[@class='Select-placeholder'][1]";
    public static String zipOption = "//*[text()='Zip']";
    public static String equalsOption = "//*[text()='Equals']";
    public static String addCriteriaLink = "//a[text()='Add Criteria']";
    public static String valueField = "//input[@name='value']";
    public static String blockOption = "//*[text()='Block']";
    public static String equalsOption2 = "(//*[text()='Equals'])[2]";
    public static String valueField2 = "(//input[@name='value'])[2]";
    public static String caseAssigneeField = "//label[@for='caseAssignee']/following::label";
    public static String inspectionAssigneeField = "//label[@for='inspectionAssignee']/following::label[text()='Select Option']";
    public static String createRulebutton = "//button[text()='Create Rule']";
    public static String addedRule = "//div[@class='sortable-table__body__tr']";
    public static String editRuleIcon = "//div[@class='sortable-table__body__td']/button[1]";
    public static String crossCriteriaIcon = "(//div[@class='close-icon'])[2]";
    public static String saveButtonEditRule = "//h1[text()='Edit Rule']/following::button[text()='Save']";
    public static String assignCaseToColumn = "//div[@class='sortable-table__body__td'][2]";
    public static String deleteRuleIcon = "//div[@class='sortable-table__body__td']/button[2]";
    public static String inactiveToggle = "//button[text()='Inactive']";
    public static String activeToggle = "//button[text()='Active']";
    public static String defaultAssigneeField = "//label[@for='assignee']/following::label[1]";
    public static String selectCollaboratorField = "//label[@for='collaborators']/following::label[1]";
    public static String assigneeOption = "//label[@for='assignee']/following::ul/li[1]";
    public static String collaboratorsOption = "//label[@for='collaborators']/following::ul/li[1]";
    public static String assigneeOption2 = "//label[@for='assignee']/following::ul/li[2]";
    public static String assigneeSearch = "//div[@id='assignee']//input[@placeholder='Search...'][@name='query']";
    public static String searchedAssignee = "//div[@id='assignee']//ul//li//span//b";
    public static String collaboratorSearch = "//div[@id='collaborators']//input[@placeholder='Search...'][@name='query']";

    public static By EditAssignmentIcon = By.xpath(editAssignmentIcon);
    public static By EditCaseAssingment = By.xpath(editCaseAssingment);
    public static By AssigneeSearch = By.xpath(assigneeSearch);
    public static By SearchedAssignee = By.xpath(searchedAssignee);
    public static By CollaboratorSearch = By.xpath(collaboratorSearch);
    public static By EditAssignmentPopup = By.xpath(editAssignmentPopup);
    public static By NameField = By.xpath(nameField);
    public static By DescriptionField = By.xpath(descriptionField);
    public static By ActionDropdown = By.xpath(actionDropdown);
    public static By OptionActionDropdown = By.xpath(optionActionDropdown);
    public static By CrossIconRuleSet = By.xpath(crossIconRuleSet);
    public static By SaveButton = By.xpath(saveButton);
    public static By ValidationNoRule = By.xpath(validationNoRule);
    public static By AddRuleButton = By.xpath(addRuleButton);
    public static By CreateRule = By.xpath(createRule);
    public static By CriteriaFields = By.xpath(criteriaFields);
    public static By ZipOption = By.xpath(zipOption);
    public static By EqualsOption = By.xpath(equalsOption);
    public static By ValueField = By.xpath(valueField);
    public static By AddCriteriaLink = By.xpath(addCriteriaLink);
    public static By EqualsOption2 = By.xpath(equalsOption2);
    public static By DefaultAssigneeField = By.xpath(defaultAssigneeField);
    public static By SelectCollaboratorField = By.xpath(selectCollaboratorField);
    public static By AssigneeOption = By.xpath(assigneeOption);
    public static By CollaboratorsOption = By.xpath(collaboratorsOption);
    public static By CreateRulebutton = By.xpath(createRulebutton);
    public static By AddedRule = By.xpath(addedRule);
    public static By EditRuleIcon = By.xpath(editRuleIcon);
    public static By AssigneeOption2 = By.xpath(assigneeOption2);
    public static By SaveButtonEditRule = By.xpath(saveButtonEditRule);
    public static By AssignCaseToColumn = By.xpath(assignCaseToColumn);
    public static By DeleteRuleIcon = By.xpath(deleteRuleIcon);
    public static By InactiveToggle = By.xpath(inactiveToggle);
    public static By BlockOption = By.xpath(blockOption);
    public static By ValueField2 = By.xpath(valueField2);
    public static By ActiveToggle = By.xpath(activeToggle);

    public  static String getSubmissionAttribute(String attr) {
        return "//div[text()='"+attr+"']";
    }

    public  String getSubmissionCollaborator(String col){
        return "//div[@id='collaborators']//ul//li//span//input[@name='"+col+"']";
    }

    public  String EditAssignmentPopupTitle;
    public  String NameValue;
    public  String RandomName;
    public  String NoRuleValidationText;
    public  String ExpectedValidation;
    public  String CreateRulePopupTitle;
    public  boolean SizeAfter;
    public  boolean CompareStr;
    public  boolean CompareCount_DeletedRule;

    public void SubmissionAssignment_OpenEditAssignmentPopup() throws InterruptedException {
        driver.navigate().to(BrowsersInvoked.URLAssignmentRules);
        WaitForCurserRunning(7);
        WaitUntilVisible(EditAssignmentIcon);
        WaitUntilPresent(EditAssignmentIcon);
        WaitForElementInteractable(EditAssignmentIcon);
        ClickByJsExecuter(EditAssignmentIcon);
        WaitUntilElementInvisible(EditAssignmentIcon);
        WaitUntilVisible(EditAssignmentPopup);
        WaitUntilPresent(EditAssignmentPopup);
        EditAssignmentPopupTitle =GetText(EditAssignmentPopup);
    }

    public  void SubmissionAssignment_VerifyNoUpdationWithoutARule() throws InterruptedException {
        RandomName = RandomStrings.RequiredString(10);
        WaitForElementInteractable(NameField);
        WebElement Name =findElement(NameField);
        Name.clear();
        Name.sendKeys(RandomName);
        NameValue =WaitUntilVisibleWE(NameField).getAttribute("value");

        int check = driver.findElements(CrossIconRuleSet).size();
        if (check > 0) {
            WaitForElementInteractable(CrossIconRuleSet);
            Boolean crosscheck = driver.findElement(CrossIconRuleSet).isDisplayed();
            while (crosscheck) {
                WaitForElementInteractable(CrossIconRuleSet);
                driver.findElement(CrossIconRuleSet).click();

                if (driver.findElements(CrossIconRuleSet).size() > 0) {
                    crosscheck = driver.findElement(CrossIconRuleSet).isDisplayed();
                } else {
                    crosscheck = false;
                }
            }
        }

        WaitForElementInteractable(SaveButton);
        ClickOn(SaveButton);
        WaitForCurserRunning(3);
        WaitUntilVisible(ValidationNoRule);
        NoRuleValidationText =GetText(ValidationNoRule);
        ExpectedValidation = "At least one rule should be present.";
    }

    public  void SubmissionAssignment_OpenCreateRulePopup() throws InterruptedException {
        ClickOn(AddRuleButton);
        WaitUntilVisible(CreateRule);
        CreateRulePopupTitle =GetText(CreateRule);
    }

    public  void SubmissionAssignment_AddMultipleCriterias() throws InterruptedException {
        WaitUntilPresent(CriteriaFields);
        WaitForElementInteractable(CriteriaFields);
        ClickOn(CriteriaFields);
        WaitForElementInteractable(ZipOption);
        ClickOn(ZipOption);
        ClickOn(CriteriaFields);
        WaitForElementInteractable(EqualsOption);
        ClickOn(EqualsOption);
        WaitForElementInteractable(ValueField);
        SendKeys(ValueField, "77590");
        ClickOn(AddCriteriaLink);
        WaitForElementInteractable(CriteriaFields);
        ClickOn(CriteriaFields);
        WaitForElementInteractable(BlockOption);
        ClickOn(BlockOption);
        ClickOn(CriteriaFields);
        WaitForElementInteractable(EqualsOption2);
        ClickOn(EqualsOption2);
        WaitForElementInteractable(ValueField2);
        SendKeys(ValueField2, "1");
        ClickOn(DefaultAssigneeField);
        WaitForElementInteractable(AssigneeOption);
        ClickOn(AssigneeOption);
        WaitForElementInteractable(SelectCollaboratorField);
        ClickOn(SelectCollaboratorField);
        WaitForElementInteractable(CollaboratorsOption);
        ClickOn(CollaboratorsOption);
        WaitForElementInteractable(CreateRulebutton);
        ClickOn(CreateRulebutton);
        WaitUntilElementInvisible(CreateRulebutton);
        WaitForCurserRunning(2);
        WaitUntilVisible(AddedRule);
        WaitUntilPresent(AddedRule);
        List<WebElement> RulesCount = driver.findElements(AddedRule);
        SizeAfter = RulesCount.size() >= 1;
    }

    @Test(priority = 4)
    public  void SubmissionAssignment_VerifyAddedRule() throws InterruptedException {
    }

    @Test(priority = 5)
    public  void SubmissionAssignment_EditAddedRule() throws InterruptedException {
        String AssigneeBefore =GetText(AssignCaseToColumn);
        System.out.println("After Assignee: " + AssigneeBefore);
        WaitUntilPresent(EditRuleIcon);
        ClickOn(EditRuleIcon);
        WaitUntilVisible(DefaultAssigneeField);
        WaitForElementInteractable(DefaultAssigneeField);
        ClickOn(DefaultAssigneeField);
        WaitUntilVisible(AssigneeOption2);
        WaitForElementInteractable(AssigneeOption2);
        ClickOn(AssigneeOption2);
        WaitForElementInteractable(SaveButtonEditRule);
        ClickOn(SaveButtonEditRule);
        WaitUntilElementInvisible(SaveButtonEditRule);
        WaitForCurserRunning(8);
        WaitUntilVisible(AssignCaseToColumn);
        WaitUntilPresent(AssignCaseToColumn);
        WaitUntilPresent(DeleteRuleIcon);
        WaitForElementInteractable(DeleteRuleIcon);
        forcedWaitTime(2);
        String AssigneeAfter =GetText(AssignCaseToColumn);
        System.out.println("After Assignee: " + AssigneeAfter);
        CompareStr = AssigneeBefore.equalsIgnoreCase(AssigneeAfter);
    }

    public  void SubmissionAssignment_DeleteAddedRule() throws InterruptedException {
        List<WebElement> RulesCountBefore = driver.findElements(AddedRule);
        int BeforeDeleting = RulesCountBefore.size();
        ClickOn(DeleteRuleIcon);
        WaitUntilPresent(AddedRule);
        List<WebElement> RulesCountAfter = driver.findElements(AddedRule);
        int AfterDeleting = RulesCountAfter.size();
        CompareCount_DeletedRule = (AfterDeleting == BeforeDeleting - 1);
    }

    public  void SubmissionAssignment_AssignmentRuleUnderInactiveSection() throws InterruptedException {
        WaitUntilPresent(AddRuleButton);
        WaitForElementInteractable(AddRuleButton);
        ClickOn(AddRuleButton);
        WaitForElementInteractable(CriteriaFields);
        ClickOn(CriteriaFields);
        WaitForElementInteractable(ZipOption);
        ClickOn(ZipOption);
        ClickOn(CriteriaFields);
        WaitForElementInteractable(EqualsOption);
        ClickOn(EqualsOption);
        WaitForElementInteractable(ValueField);
        SendKeys(ValueField, "77590");
        ClickOn(DefaultAssigneeField);
        WaitForElementInteractable(AssigneeOption);
        ClickOn(AssigneeOption);
        ClickOn(SelectCollaboratorField);
        WaitForElementInteractable(CollaboratorsOption);
        ClickOn(CollaboratorsOption);
        ClickOn(CreateRulebutton);
        WaitUntilVisible(InactiveToggle);
        WaitForElementInteractable(InactiveToggle);
        ClickByJsExecuter(InactiveToggle);
        ClickOn(SaveButton);
        WaitUntilElementInvisible(SaveButton);
        WaitForCurserRunning(4);
        WaitUntilVisible(EditAssignmentIcon);
        WaitUntilPresent(EditAssignmentIcon);
        WaitForElementInteractable(EditAssignmentIcon);
        ClickByJsExecuter(EditAssignmentIcon);
        WaitForCurserRunning(4);
        WaitUntilVisible(ActiveToggle);
        WaitForElementInteractable(ActiveToggle);
        ClickOn(ActiveToggle);
        WaitForElementInteractable(SaveButton);
        ClickOn(SaveButton);
        WaitUntilElementInvisible(SaveButton);
        WaitForCurserRunning(2);
    }

    public boolean submissionAssingee;
    public void SubmissionAssignmentBaseOnAddedRule() throws InterruptedException{
        WaitUntilVisible(EditAssignmentIcon);
        WaitForElementInteractable(EditAssignmentIcon);
        ClickOn(EditAssignmentIcon);
        WaitUntilElementInvisible(EditAssignmentIcon);
        WaitUntilVisible(EditAssignmentPopup);
        WaitUntilPresent(EditAssignmentPopup);
        ce.deleteRules(0);
        if(BrowsersInvoked.RunEnvironment.equalsIgnoreCase("stage")) {
            ce.addSubmissionAssignmentRule("Submission Category", "Equals", "Location Required", "Mark Shane", "Amandeep");
            ce.addSubmissionAssignmentRule("Submission Category", "Equals", "Location Not Required", "Mark Shane", "Amandeep");
            ce.addSubmissionAssignmentRule("Submission Category", "Equals", "Location Not Included", "Mark Shane", "Amandeep");
        }
        else {
            ce.addSubmissionAssignmentRule("Submission Category", "Equals", "Location Required", "Shane ES", "Amandeep");
            ce.addSubmissionAssignmentRule("Submission Category", "Equals", "Location Not Required", "Shane ES", "Amandeep");
            ce.addSubmissionAssignmentRule("Submission Category", "Equals", "Location Not Included", "Shane ES", "Amandeep");
        }


        WaitForElementInteractable(SaveButton);
        ClickOn(SaveButton);
        WaitUntilElementInvisible(SaveButton);
        WaitForCurserRunning(2);
        crm.CRM_CreateSubmission("No", "Yes", "Yes", "Yes", "Yes", "Location Required");
        WaitForCurserRunning(5);
        WaitUntilVisible(SubmissionAssingee);
        String Assingee =GetText(SubmissionAssingee);
        if(BrowsersInvoked.RunEnvironment.equalsIgnoreCase("stage")){
            assert Assingee != null;
            submissionAssingee = Assingee.equalsIgnoreCase("Mark Shane") ;
        }
        else{
            assert Assingee != null;
            submissionAssingee = Assingee.equalsIgnoreCase("Shane ES") ;
        }
    }


    public  boolean CaseAssingee;
    public  void CaseAssignmentBaseOnAddedRule() throws InterruptedException{
        int CancelSubmission = driver.findElements(CloseSubmissionIcon).size();
        if (CancelSubmission > 0) {
            ScrollIntoView(CloseSubmissionIcon);
            ClickOn(CloseSubmissionIcon);

        }
        WaitForCurserRunning(5);
        WaitUntilVisible(EditCaseAssingment);
        WaitForElementInteractable(EditCaseAssingment);
        ClickByJsExecuter(EditCaseAssingment);
        WaitUntilElementInvisible(EditCaseAssingment);
        WaitUntilVisible(EditAssignmentPopup);
        WaitUntilPresent(EditAssignmentPopup);

        ce.deleteRules(0);
        if(BrowsersInvoked.RunEnvironment.equalsIgnoreCase("Stage")) {
            ce.addCaseAssignmentRule("Case Violation", "Contains", "Water", "Mark Shane", "Amandeep");
        }
        else{
            ce.addCaseAssignmentRule("Case Violation", "Contains", "Water 01", "Shane ES", "Amandeep");

        }
        String caseAssignee =GetText(By.xpath("(//div[@class='sortable-table__body__tr']//div)[2]"));
        WaitForElementInteractable(SaveButton);
        ClickOn(SaveButton);
        WaitUntilElementInvisible(SaveButton);
        WaitForCurserRunning(2);
        ce.CE_CreateACase();
        WaitForCurserRunning(5);
        forcedWaitTime(3);
        WaitUntilVisible(Assignee);
        String Assingee =GetText(Assignee);
        if(BrowsersInvoked.RunEnvironment.equalsIgnoreCase("Stage")) {
            assert Assingee != null;
            CaseAssingee = Assingee.equalsIgnoreCase("Mark Shane");
        }
        else{
            assert Assingee != null;
            CaseAssingee = Assingee.equalsIgnoreCase("Shane ES");
        }

    }

}
