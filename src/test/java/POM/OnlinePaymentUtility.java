package POM;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import BrowsersBase.BrowsersInvoked;
import CommonMethods.CECommonMethods;
import CommonMethods.CRMCommonMethods;
import CommonMethods.Helper;
import CommonMethods.RandomStrings;
import TestCases.CLP;




public class OnlinePaymentUtility extends Helper {

	public WebDriver driver;
	LoginUtility log;
	PerformInspectionUtility PI;
	CCPUtility ccp;
	ForcedAbatementUtility FA;
	CECommonMethods CEcommonMethod;
	CLPUtility clp;
	CRMCommonMethods crmCommonMethod;

	public OnlinePaymentUtility(WebDriver driver) {
		super(driver);
		this.driver = driver;
		log = new LoginUtility(driver);
		PI = new PerformInspectionUtility(driver);
		ccp = new CCPUtility(driver);
		FA = new ForcedAbatementUtility(driver);
		CEcommonMethod=new CECommonMethods(driver);
		 crmCommonMethod= new CRMCommonMethods(driver);
		clp=new CLPUtility(driver);
	}
	public static String outstandingBalDetails = "//label[text()='Outstanding Balance']//parent::div//a[@class='view-details']";
    public static String finePaymentDetailsPopup = "//div[contains(text(),'Fines & Payments Details')]";
    public static String selectFineDropdownArrow = "//label[@title='Select Fine']//parent::div//parent::div//span[@class='Select-arrow']";
    public static String selectFineOptions = "(//div[@class='Select-menu-outer']//div[@role='option'])[1]";
    public static String addNewFine = "//div[@class='add-transaction']//button[text()='Add Fine']";
    public static String closeFinePaymentDetailsPop = "//div[contains(text(),'Fines & Payments Details')]//parent::div//button[text()='Close']";
    public static String voidIconFinePaymentList = "(//img[@class='void-icon'])[1]";
    public static String unpaidButton = "//button[text()='Unpaid']";
    public static String contactName = "(//div[@class='contact__name']//label//b)[1]";
    public static String paymentSideBar = "//label[text()='Payments']";
    public static String citizenPaymentProtal = "//label[text()='Citizen Payment Portal']";
    public static String paymentPortallinkText = "//div[@class='payment-portal-form__url-section__url']//h5";
    public static String copyPaymentPortalLink = "//div[@class='payment-portal-form__url-section__url']//button";
    public static String defaultPaymentPortaltitle = "//input[@placeholder='Enter Payment Portal Title'][@name='title']";
    public static String savePaymentPorrtalSettings = "//button[text()='Save Changes']";
    public static String paymentPortalHeaderTitle = "//section[@class='payment-info']//h1";
    public static String paymentPortalDescription = "//div[@class='payment-description']//p";
    public static String paymentPortalParaGraphText = "//textarea[@name='description']";
    public static String caseSearchButton = "//div[@class='case-search-fields']//following-sibling::button";
    public static String validationErrorMessage = "//span[@class='field__error']";
    public static String notificationError = "//div[@class='notifications-wrapper']";
    public static String caseNumberField = "//input[@name='caseNumber']";
    public static String noticenameField = "//input[@name='nameOnNotice']";
    public static String balanceDetails = "//header[@class='outstanding-balance-details']//div[@class='balance']";
    public static String balnceOnCDP = "//div[@class='field-section outstanding-balance']//span";
    public static String totalTransactionAmount = "//header[@class='payment-portal-total-payment-details']//div[@class='amount']";
    public static String enterPaymentdetailbtn = "//div[@class='payment-details-btn-container']//button";
    public static String orderSummary = "//label[contains(text(),'Order Summary')]";
    public static String cardDetails = "//input[@id='cardNum'][@name='cardNum']";
    public static String cardExPDate = "//input[@id='expiryDate'][@name='expiryDate']";
    public static String cardCVVCode = "//input[@id='cvv'][@name='cvv']";
    public static String payButton = "//button[@id='payBtn']";
    public static String receiptMerchantName = "//label[@id='receiptMerchantName']";
    public static String receiptTransactMessage = "//label[@id='receiptTransactMessage']";
    public static String receiptTransactionId = "//label[@id='receiptTransactionId']";
    public static String paymnetdetailsExpander = "(//div[@class='rt-expander'])[1]";
    public static String paymentTransactionndetails = "//*[@class='field-section']//*[@class='field__label-label']//*[@class='field__label-data-field']";
    public static String voidPayment = "//div[contains(text(),'Void or Refund Payment')]";
    public static String reasonForVoid = "//textarea[@name='reason']";
    public static String voidPaymentbutton = "//button[text()='Void Payment']";
    public static String voidfineBtn = "//button[text()='Void Fine']";
    public static String waivefineBtn = "//button[text()='Waive Fine']";
    public static String voidLable = "((//div[@class='rt-expander'])[1]//ancestor::div[@role='rowgroup']//div[@role='gridcell'])[4]//button";
    public static String paymentNullified = "((//div[@class='rt-expander'])[1]//ancestor::div[@role='rowgroup']//div[@role='gridcell'])[5]//span[@class='payment_amount is-nullified']";
    public static String fineNullified = "((//div[@class='rt-expander'])[1]//ancestor::div[@role='rowgroup']//div[@role='gridcell'])[5]//span[@class='is-nullified']";
    public static String minimumPayAmount = "//input[@name='paymentAmount']";
    public static String cardInvalidError = "errorMsgID";
    public static String addedfineDetails = "//div[@role='rowgroup']//div[@role='gridcell']//span";
    public static String addPayment = "//button[text()='Add Payment']";
    public static String addPaymentAmnt = "//input[@name='amount']";
    public static String selectPayor = "//div[text()='Payor']";
    public static String selectPayorOpt = "(//div[@class='Select-menu-outer']//div[@class='Select-option'])[1]";
    public static String addPaymentbtn = "//div[@class='add-transaction']//button";
    public static String addFineToggle = "//button[text()='Add Fine']";
    public static String dueDatePicker = "//span[@class='datepicker-image']";
    public static String prevDateArrow = "//th[@class='rdtPrev']";
    public static String selectDate10 = "//td[@data-value='10']";
    public static String overdueFineLbl = "//Button[text()='Unpaid']//following-sibling::span[@class='is-overdue']";
    public static String paymentVoid = "(//div[@class='rt-td']//span[contains(text(),'Payment')]//parent::div//following-sibling::div[@role='gridcell'])[2]";
    public static String paymentCashNullified = "(//div[@class='rt-td']//span[contains(text(),'Payment')]//parent::div//following-sibling::div[@role='gridcell'])[3]//span[@class='payment_amount is-nullified']";
    public static String paymentVoidSymbol = "//div[@class='rt-td']//span[contains(text(),'Payment')]//parent::div//following-sibling::div[@role='gridcell']//img[@class='void-icon']";



    public static By OutstandingBalDetails = By.xpath(outstandingBalDetails);
    public static By PaymentVoidSymbol = By.xpath(paymentVoidSymbol);
    public static By PaymentCashNullified = By.xpath(paymentCashNullified);
    public static By PaymentVoid = By.xpath(paymentVoid);
    public static By OverdueFineLbl = By.xpath(overdueFineLbl);
    public static By AddPayment = By.xpath(addPayment);
    public static By SelectDate10 = By.xpath(selectDate10);
    public static By PrevDateArrow = By.xpath(prevDateArrow);
    public static By DueDatePicker = By.xpath(dueDatePicker);
    public static By AddFineToggle = By.xpath(addFineToggle);
    public static By AddPaymentbtn = By.xpath(addPaymentbtn);
    public static By SelectPayorOpt = By.xpath(selectPayorOpt);
    public static By SelectPayor = By.xpath(selectPayor);
    public static By AddPaymentAmnt = By.xpath(addPaymentAmnt);
    public static By AddedfineDetails = By.xpath(addedfineDetails);
    public static By ReasonForVoid = By.xpath(reasonForVoid);
    public static By PaymentNullified = By.xpath(paymentNullified);
    public static By FineNullified = By.xpath(fineNullified);
    public static By VoidLable = By.xpath(voidLable);
    public static By VoidPaymentbutton = By.xpath(voidPaymentbutton);
    public static By VoidfineBtn = By.xpath(voidfineBtn);
    public static By PaymnetdetailsExpander = By.xpath(paymnetdetailsExpander);
    public static By PaymentTransactionndetails = By.xpath(paymentTransactionndetails);
    public static By PaymentSideBar  = By.xpath(paymentSideBar);
    public static By CitizenPaymentProtal = By.xpath(citizenPaymentProtal);
    public static By FinePaymentDetailsPopup = By.xpath(finePaymentDetailsPopup);
    public static By SelectFineDropdownArrow = By.xpath(selectFineDropdownArrow);
    public static By SelectFineOptions = By.xpath(selectFineOptions);
    public static By AddNewFine = By.xpath(addNewFine);
    public static By CloseFinePaymentDetailsPop = By.xpath(closeFinePaymentDetailsPop);
    public static By VoidIconFinePaymentList = By.xpath(voidIconFinePaymentList);
    public static By UnpaidButton = By.xpath(unpaidButton);
    public static By ContactName  = By.xpath(contactName);
    public static By PaymentPortallinkText = By.xpath(paymentPortallinkText);
    public static By CopyPaymentPortalLink = By.xpath(copyPaymentPortalLink);
    public static By DefaultPaymentPortaltitle = By.xpath(defaultPaymentPortaltitle);
    public static By SavePaymentPorrtalSettings = By.xpath(savePaymentPorrtalSettings);
    public static By PaymentPortalHeaderTitle = By.xpath(paymentPortalHeaderTitle);
    public static By PaymentPortalParaGraphText = By.xpath(paymentPortalParaGraphText);
    public static By PaymentPortalDescription = By.xpath(paymentPortalDescription);
    public static By CaseSearchButton = By.xpath(caseSearchButton);
    public static By ValidationErrorMessage = By.xpath(validationErrorMessage);
    public static By NotificationError = By.xpath(notificationError);
    public static By CaseNumberField = By.xpath(caseNumberField);
    public static By NoticenameField = By.xpath(noticenameField);
    public static By BalanceDetails = By.xpath(balanceDetails);
    public static By BalnceOnCDP = By.xpath(balnceOnCDP);
    public static By TotalTransactionAmount = By.xpath(totalTransactionAmount);
    public static By EnterPaymentdetailbtn = By.xpath(enterPaymentdetailbtn);
    public static By OrderSummary = By.xpath(orderSummary);
    public static By CardDetails = By.xpath(cardDetails);
    public static By CardExPDate = By.xpath(cardExPDate);
    public static By CardCVVCode = By.xpath(cardCVVCode);
    public static By PayButton = By.xpath(payButton);
    public static By ReceiptMerchantName = By.xpath(receiptMerchantName);
    public static By ReceiptTransactMessage = By.xpath(receiptTransactMessage);
    public static By ReceiptTransactionId = By.xpath(receiptTransactionId);
    public static By VoidPayment = By.xpath(voidPayment);
    public static By MinimumPayAmount = By.xpath(minimumPayAmount);
    public static By CardInvalidError = By.id(cardInvalidError);
    public static By WaivefineBtn = By.xpath(waivefineBtn);





    public static Boolean FinePaymentDetailsHeader;
    public static int UnPaidFinePaymentCounBefore ;
    public static int UnPaidFinePaymentCounAfter ;
    public static String caseId;
    public static String caseOutstandingBal;
    public static String BillToContactName;
    public static String expectedPortalLink;
    public static String actualPortalLink;
    public static String DefaultPaymentPortaltitleText;
    public static String DefaultPaymentParaGraphText;
    public static String paymentProtalText = "Look Up and Pay Outstanding Balances";
    public static String actualPaymentPortalHeaderTitle;
    public static String actualPaymentPortalDescription;
    public static String actualPaymentPortal;



    public void LoginAgency() throws InterruptedException {
		log.LoginAgency();

	}

    public static String agencyName;
    
    
    public void OnlinePaymentCasePreRequisite()  throws InterruptedException{

    	
    	agencyName=CEcommonMethod.getAgencyName();
    	
    	CEcommonMethod.CE_CreateACase();
        WaitUntilVisible(OutstandingBalDetails);
        WaitForElementInteractable(OutstandingBalDetails);
        ClickOn(OutstandingBalDetails);
        WaitForCurserRunning(3);
        WaitUntilVisible(FinePaymentDetailsPopup);
        WaitUntilVisible(AddNewFine);
        WaitUntilPresent(FinePaymentDetailsPopup);
        FinePaymentDetailsHeader = findElement(FinePaymentDetailsPopup).isDisplayed();
        UnPaidFinePaymentCounBefore = fineElementsSize(UnpaidButton);

        WaitForElementInteractable(SelectFineDropdownArrow);
        ClickOn(SelectFineDropdownArrow);
        WaitUntilVisible(SelectFineOptions);
        ClickOn(SelectFineOptions);
        WaitForElementInteractable(AddNewFine);
        ClickOn(AddNewFine);
        WaitForCurserRunning(3);
        WaitUntilVisible(CloseFinePaymentDetailsPop);
        WaitUntilPresent(CloseFinePaymentDetailsPop);
        WaitUntilVisible(UnpaidButton);

        UnPaidFinePaymentCounAfter = findElementsByXPath(UnpaidButton).size();
        WaitForElementInteractable(CloseFinePaymentDetailsPop);
        ClickOn(CloseFinePaymentDetailsPop);
        WaitForCurserRunning(5);
        WaitUntilVisible(OutstandingBalDetails);
        WaitForElementInteractable(OutstandingBalDetails);

        caseId = GetText(By.xpath("//h2[@class='case-details__case-number']")).split("#")[1];
        caseOutstandingBal = GetText(BalnceOnCDP);
        ScrollIntoView(By.xpath("(//input[@name='billableContact'][@type='checkbox'])[1]"));
        BillToContactName = GetText(ContactName);
        ClickByJsExecuter(By.xpath("//label//b[text()='"+BillToContactName+"']//ancestor::div[@class='contact__name']//following-sibling::div[@class='contact__bill-to-contact']//input[@name='billableContact'][@type='checkbox']"));
        WaitForCurserRunning(5);
        CEcommonMethod.CloseCaseDetailPage();
        SoftAssert SFA = new SoftAssert();
        SFA.assertEquals(FinePaymentDetailsHeader,Boolean.TRUE);
        SFA.assertEquals(UnPaidFinePaymentCounAfter,UnPaidFinePaymentCounBefore + 1);
        SFA.assertAll();

    }

    public  void clearClipboard() {
        // Create an empty StringSelection
        StringSelection emptySelection = new StringSelection("");

        // Get the system clipboard
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

        // Set the clipboard contents to an empty StringSelection
        clipboard.setContents(emptySelection, null);
    }
    
    
    public  void CopyPaymentPortalURLOnCitizenPaymentPortal() throws InterruptedException, IOException, UnsupportedFlavorException {

    	
      
    	 crmCommonMethod.NavigateTo_AgencySetup();
    	 crmCommonMethod.NavigationTo_Payment();
         WaitForElementInteractable(CopyPaymentPortalLink);
         ClickByJsExecuter(CopyPaymentPortalLink);
         expectedPortalLink = GetText(PaymentPortallinkText);
         ClickByJsExecuter(CopyPaymentPortalLink);

         DefaultPaymentPortaltitleText =  GetValueAttribute(DefaultPaymentPortaltitle);
         DefaultPaymentParaGraphText = GetText(PaymentPortalParaGraphText);

         Clear(DefaultPaymentPortaltitle);
         WebElement targetEle = findElement(DefaultPaymentPortaltitle);
         forcedWaitTime(2);
         Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
         Transferable contents = clipboard.getContents(null);
         String data = (String) contents.getTransferData(DataFlavor.stringFlavor);
         int i=0;
         while(!data.equalsIgnoreCase("https://app-stage.comcate.com/payment-portal/XQoufyeUAP8YIhU")&&i<5)
         {
             ClickByJsExecuter(CopyPaymentPortalLink);
             i++;
         }
         targetEle.sendKeys(data);

         actualPortalLink =  GetValueAttribute(DefaultPaymentPortaltitle);



    }

    public  void UserNavigateToPaymentPortalThroughLink() throws InterruptedException{
        driver.navigate().to(expectedPortalLink);
        WaitForCurserRunning(4);
        WaitUntilVisible(PaymentPortalHeaderTitle);
        WaitUntilPresent(PaymentPortalHeaderTitle);
        actualPaymentPortalHeaderTitle = GetText(PaymentPortalHeaderTitle);
        actualPaymentPortalDescription = GetText(PaymentPortalDescription);
        SoftAssert SFA = new SoftAssert();
        SFA.assertEquals(actualPaymentPortalHeaderTitle,DefaultPaymentPortaltitleText);
        SFA.assertEquals(actualPaymentPortalDescription,DefaultPaymentParaGraphText);
        SFA.assertAll();
    }

    public static String ActualcaseNumbervalidation = "The Case number is required.";
    public static String ExpectedcaseNumbervalidation ;

    public static String ActualNameOnNoticevalidation = "The Name on notice is required.";
    public static String ExpectedNameOnNoticevalidation ;

    public static String ExpectedwrongCaseError = "No matching cases found";
    public static String ActualwrongCaseError ;



    public  void CaseDetailsValidationMessageOnPaymentPortal() throws InterruptedException {

        WaitUntilVisible(CaseSearchButton);
        ScrollIntoView(CaseSearchButton);
        WaitForElementInteractable(CaseSearchButton);
        ClickByJsExecuter(CaseSearchButton);
        WaitUntilVisible(ValidationErrorMessage);
        WaitUntilPresent(ValidationErrorMessage);
        List<WebElement> ele = findElementsByXPath(ValidationErrorMessage);
        ExpectedcaseNumbervalidation = ele.get(0).getText();
        ExpectedNameOnNoticevalidation = ele.get(1).getText();
        SoftAssert SFA = new SoftAssert();
        SFA.assertEquals(ActualcaseNumbervalidation,ExpectedcaseNumbervalidation);
        SFA.assertEquals(ActualNameOnNoticevalidation,ExpectedNameOnNoticevalidation);
        SFA.assertAll();
    }

    public  void WrongCaseDetailsValidationMessageOnPaymentPortal() throws InterruptedException {

        String InvalidCaseNumber = RandomStrings.RequiredString(5);
        String InvalidNoticeName = RandomStrings.RequiredString(5);

        SendKeys(CaseNumberField,InvalidCaseNumber);
        SendKeys(NoticenameField,InvalidNoticeName);
        WaitUntilVisible(CaseSearchButton);
        ScrollIntoView(CaseSearchButton);
        WaitForElementInteractable(CaseSearchButton);
        ClickByJsExecuter(CaseSearchButton);
        WaitForCurserRunning(1);
        ActualwrongCaseError =  driver.findElement(NotificationError).getText();
        SoftAssert SFA = new SoftAssert();
        SFA.assertEquals(ActualwrongCaseError,ExpectedwrongCaseError);
        SFA.assertAll();

    }

    public static String reviewPaymentTitle ;
    public static String reviewBalance ;
    public static Boolean TotalAmountToPay ;

    public  void VerifytheReviewOutstandingFeeAndPaymentDatailsPage()throws InterruptedException {
        driver.navigate().refresh();
        WaitUntilVisible(CaseNumberField);
        WaitUntilVisible(CaseNumberField);
        WaitForElementInteractable(CaseNumberField);
        Clear(CaseNumberField);
        WaitUntilVisible(CaseNumberField);
        WaitForElementInteractable(CaseNumberField);
        Clear(NoticenameField);

        SendKeys(CaseNumberField,caseId);
        System.out.println("Case id is "+ caseId +" Bill to contact "+ BillToContactName);
        SendKeys(NoticenameField,BillToContactName);
        WaitUntilVisible(CaseSearchButton);
        ScrollIntoView(CaseSearchButton);
        WaitForElementInteractable(CaseSearchButton);
        ClickByJsExecuter(CaseSearchButton);
        WaitForCurserRunning(3);
        WaitUntilVisible(PaymentPortalHeaderTitle);
        WaitUntilPresent(PaymentPortalHeaderTitle);
        reviewPaymentTitle = GetText(PaymentPortalHeaderTitle);
        reviewBalance = GetText(BalanceDetails);
        double Amount = Double.parseDouble((GetText(BalanceDetails)).split("\\$")[1]);
        double transactionFee = (Amount * 10)/100 ;
        double totalexpetedAmount = Amount + transactionFee ;
        double totalactalAmount = Double.parseDouble((GetText(TotalTransactionAmount)).split("\\$")[1]);

        TotalAmountToPay = totalexpetedAmount == totalactalAmount;
        SoftAssert SFA = new SoftAssert();
        SFA.assertEquals(reviewPaymentTitle,"Review Your Outstanding Fines & Fees");
        SFA.assertEquals(reviewBalance,caseOutstandingBal);
        SFA.assertEquals(Boolean.TRUE,TotalAmountToPay);
        SFA.assertAll();
    }

    public static Boolean orderSummaryLabel ;
    public static String ActualReceiptMerchantName ;
    public static String ActualReceiptTransactMessage;
    public static String TransactionId;
    public static String expectedTransactionId ;
    public static Boolean wronngDetailsPaybtnStatus;
    public static String InvalidCardError;

    public  void MakeOnlinePayment() throws InterruptedException{

        WaitForElementInteractable(EnterPaymentdetailbtn);
        ScrollIntoView(EnterPaymentdetailbtn);
        ClickOn(EnterPaymentdetailbtn);
        WaitForCurserRunning(3);
        WaitUntilVisible(OrderSummary);
        orderSummaryLabel = findElement(OrderSummary).isDisplayed();
        SendKeys(CardDetails, "4007000000028");
        SendKeys(CardExPDate, "08//25");
        SendKeys(CardCVVCode, "900");
        wronngDetailsPaybtnStatus = findElement(PayButton).isEnabled();

        Clear(CardDetails);
        Clear(CardExPDate);
        Clear(CardCVVCode);
        WaitForElementInteractable(CardDetails);
        WaitForElementInteractable(CardCVVCode);

//        SendKeys(CardDetails, "40070670000027");
//        SendKeys(CardExPDate, "08//25");
//        SendKeys(CardCVVCode, "9050");
//        WaitForElementInteractable(PayButton);
//        ClickByJsExecuter(PayButton);
//
//        WaitUntilVisible(CardInvalidError);
//        InvalidCardError = findElement(CardInvalidError).getText();

        Clear(CardDetails);
        Clear(CardExPDate);
        Clear(CardCVVCode);
        WaitForElementInteractable(CardDetails);
        WaitForElementInteractable(CardCVVCode);

        SendKeys(CardDetails, "4007000000027");
        SendKeys(CardExPDate, "08//25");
        SendKeys(CardCVVCode, "9300");
        WaitForElementInteractable(PayButton);
        ClickByJsExecuter(PayButton);
        WaitForCurserRunning(2);
        WaitUntilVisible(ReceiptMerchantName);
        ActualReceiptMerchantName = GetText(ReceiptMerchantName);
        ActualReceiptTransactMessage = GetText(ReceiptTransactMessage);
        TransactionId = GetText(ReceiptTransactionId).split(" ")[2];
        driver.navigate().to(BrowsersInvoked.URLCases);
        WaitForCurserRunning(4);
      //  WaitUntilVisible(CLP.CLP);
        Thread.sleep(5000);
        CEcommonMethod.CCP_SearchCaseAndNavigatetoCDP(caseId);
        caseOutstandingBal = (GetText(BalnceOnCDP)).split("\\$")[1];

        WaitUntilVisible(OutstandingBalDetails);
        WaitForElementInteractable(OutstandingBalDetails);
        ClickByJsExecuter(OutstandingBalDetails);
        WaitForCurserRunning(3);
        WaitUntilVisible(FinePaymentDetailsPopup);
        WaitUntilVisible(AddNewFine);
        WaitUntilPresent(FinePaymentDetailsPopup);
        WaitForElementInteractable(PaymnetdetailsExpander);
        Thread.sleep(5000);
        ClickByJsExecuter(PaymnetdetailsExpander);
        WaitUntilVisible(PaymentTransactionndetails);
        WaitUntilPresent(PaymentTransactionndetails);
        expectedTransactionId = GetText(PaymentTransactionndetails);
        System.out.println(PaymentTransactionndetails);
        SoftAssert SFA = new SoftAssert();
        SFA.assertEquals(ActualReceiptTransactMessage,"Thank you for your payment.");
        SFA.assertEquals(ActualReceiptMerchantName,agencyName);
        SFA.assertEquals(Boolean.TRUE,orderSummaryLabel);
        SFA.assertEquals(caseOutstandingBal,"0.00");
        SFA.assertEquals(TransactionId,expectedTransactionId);
        SFA.assertEquals(wronngDetailsPaybtnStatus,Boolean.FALSE);
//        SFA.assertEquals(op.InvalidCardError,"The credit card number is invalid.");
        SFA.assertAll();

    }

    public static Boolean voidPaymentModel ;
    public static Boolean voidLableIcon ;
    public static String voidLableButton;
    public static Boolean paymentNullifiedPresent;

    public  void UserAbleToMarkPaymentAsVoid() throws InterruptedException{
             WaitUntilVisible(VoidIconFinePaymentList);
             WaitForElementInteractable(VoidIconFinePaymentList);
             ClickByJsExecuter(VoidIconFinePaymentList);
             voidPaymentModel =  findElement(VoidPayment).isDisplayed();
             SendKeys(ReasonForVoid,RandomStrings.RequiredString(4));
             WaitForElementInteractable(VoidPaymentbutton);
             ClickByJsExecuter(VoidPaymentbutton);
             WaitForCurserRunning(4);
             WaitUntilVisible(VoidLable);
             WaitUntilPresent(VoidLable);
             voidLableIcon = findElement(VoidLable).isDisplayed();
             voidLableButton = GetText(VoidLable);
             paymentNullifiedPresent = findElement(PaymentNullified).isDisplayed();
             SoftAssert SFA = new SoftAssert();
 	        SFA.assertEquals(voidPaymentModel,Boolean.TRUE);
 	        SFA.assertEquals(voidLableIcon,Boolean.TRUE);
 	        SFA.assertEquals(paymentNullifiedPresent,Boolean.TRUE);
 	        SFA.assertEquals(voidLableButton,"Void");
 	        SFA.assertAll();

    }

    public  void UserAbleToMakeVoidPayment() throws InterruptedException, IOException, UnsupportedFlavorException {

        WaitUntilVisible(FinePaymentDetailsPopup);
        WaitUntilVisible(AddNewFine);
        WaitUntilPresent(FinePaymentDetailsPopup);
        FinePaymentDetailsHeader = findElement(FinePaymentDetailsPopup).isDisplayed();
        UnPaidFinePaymentCounBefore = fineElementsSize(UnpaidButton);
        WaitUntilVisible(SelectFineDropdownArrow);
        WaitForElementInteractable(SelectFineDropdownArrow);
        ClickOn(SelectFineDropdownArrow);
        WaitUntilVisible(SelectFineOptions);
        ClickOn(SelectFineOptions);
        WaitForElementInteractable(AddNewFine);
        ClickOn(AddNewFine);
        WaitForCurserRunning(3);
        WaitUntilVisible(CloseFinePaymentDetailsPop);
        WaitUntilPresent(CloseFinePaymentDetailsPop);
        WaitUntilVisible(UnpaidButton);
        ClickByJsExecuter(CloseFinePaymentDetailsPop);
        WaitForCurserRunning(5);
        WaitUntilVisible(OutstandingBalDetails);
        WaitForElementInteractable(OutstandingBalDetails);
        caseId = GetText(By.xpath("//h2[@class='case-details__case-number']")).split("#")[1];
        caseOutstandingBal = GetText(BalnceOnCDP);
        ScrollIntoView(By.xpath("(//input[@name='billableContact'][@type='checkbox'])[1]"));
        BillToContactName = GetText(ContactName);
        CEcommonMethod.CloseCaseDetailPage();
        //CopyPaymentPortalURLOnCitizenPaymentPortal();
        UserNavigateToPaymentPortalThroughLink();
        VerifytheReviewOutstandingFeeAndPaymentDatailsPage();
        MakeOnlinePayment();
        SoftAssert SFA = new SoftAssert();
        SFA.assertEquals(ActualReceiptTransactMessage,"Thank you for your payment.");
        SFA.assertEquals(ActualReceiptMerchantName.toUpperCase(),agencyName);
        SFA.assertEquals(Boolean.TRUE,orderSummaryLabel);
        SFA.assertEquals(Double.parseDouble(caseOutstandingBal),Double.parseDouble(caseOutstandingBal) - totalexpetedAmountNew);
        SFA.assertEquals(TransactionId,expectedTransactionId);
        SFA.assertAll();
        
    }

    public static double totalactalAmountNew ;
    public static double totalexpetedAmountNew;
    public  void UserAbleToMakePartialPayment() throws InterruptedException, IOException, UnsupportedFlavorException {
        WaitUntilVisible(CloseFinePaymentDetailsPop);
        WaitUntilPresent(CloseFinePaymentDetailsPop);
        ClickByJsExecuter(CloseFinePaymentDetailsPop);
        WaitForCurserRunning(5);
        WaitUntilVisible(OutstandingBalDetails);
        WaitForElementInteractable(OutstandingBalDetails);
        caseId = GetText(By.xpath("//h2[@class='case-details__case-number']")).split("#")[1];
        caseOutstandingBal = GetText(BalnceOnCDP);
        ScrollIntoView(By.xpath("(//input[@name='billableContact'][@type='checkbox'])[1]"));
        BillToContactName = GetText(ContactName);
        CEcommonMethod.CloseCaseDetailPage();
        CopyPaymentPortalURLOnCitizenPaymentPortal();
        UserNavigateToPaymentPortalThroughLink();
        driver.navigate().refresh();
        WaitUntilVisible(CaseNumberField);
        WaitUntilVisible(CaseNumberField);
        WaitForElementInteractable(CaseNumberField);
        Clear(CaseNumberField);
        WaitUntilVisible(CaseNumberField);
        WaitForElementInteractable(CaseNumberField);
        Clear(NoticenameField);

        SendKeys(CaseNumberField,caseId);
        SendKeys(NoticenameField,BillToContactName);
        WaitUntilVisible(CaseSearchButton);
        ScrollIntoView(CaseSearchButton);
        WaitForElementInteractable(CaseSearchButton);
        ClickByJsExecuter(CaseSearchButton);
        WaitForCurserRunning(3);
        WaitUntilVisible(PaymentPortalHeaderTitle);
        WaitUntilPresent(PaymentPortalHeaderTitle);
        reviewPaymentTitle = GetText(PaymentPortalHeaderTitle);
        Clear(MinimumPayAmount);
        SendKeys(MinimumPayAmount,"20");
        reviewBalance = GetValueAttribute(BalanceDetails);
        double Amount = Double.parseDouble((GetValueAttribute(MinimumPayAmount)).split("\\$")[1]);
        double transactionFee = (Amount * 10)/100 ;
        double totalexpetedAmount = Amount + transactionFee ;
        totalexpetedAmountNew = totalexpetedAmount;
        double totalactalAmount = Double.parseDouble((GetText(TotalTransactionAmount)).split("\\$")[1]);
        TotalAmountToPay = totalexpetedAmount == totalactalAmount;
        totalactalAmountNew = totalactalAmount;
        MakeOnlinePayment();
    }

}
