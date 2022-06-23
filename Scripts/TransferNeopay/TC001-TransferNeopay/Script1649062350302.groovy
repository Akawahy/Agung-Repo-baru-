import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login/TC002-LoginPage'), [:], FailureHandling.STOP_ON_FAILURE)

//Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
//Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)
Mobile.tap(findTestObject('TransferNeopay/XCUIElementTypeButton - btnTransfer'), 0)

//Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
//Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)
Mobile.tap(findTestObject('TransferNeopay/XCUIElementTypeButton - btnNeopay'), 0)

//Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
//Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)
TestData ExcelData = findTestData('TransferNeopay/DF001-TransferNeopay')

System.out.println('[Row Count] : ' + ExcelData.getRowNumbers())

int limitTrfMin = GlobalVariable.limitTrfMin

int limitTrfMax = GlobalVariable.limitTrfMax

int limitTrfMaxPlus = GlobalVariable.limitTrfMaxPlus

for (int i = 1; i <= ExcelData.getRowNumbers(); i++) {
    // System.out.println('[data files phonenumber] : ' + ExcelData.getValue(3, i))
    String NomorPonsel = ExcelData.getValue(3, i)

    System.out.println('NomorPonsel : ' + NomorPonsel)

    int AmountTransfer = Integer.parseInt(ExcelData.getValue(4, i))

    String NominalTansfer = ExcelData.getValue(4, i)

    System.out.println('NominalTansfer : ' + NominalTansfer)
	
	String pin = ExcelData.getValue(5, i)
	
	System.out.println('pin : ' + pin)
	
	
    Mobile.tap(findTestObject('TransferNeopay/XCUIElementTypeTextField - numberTextField'), 5, FailureHandling.OPTIONAL)

    Mobile.setText(findTestObject('TransferNeopay/XCUIElementTypeTextField - numberTextField'), NomorPonsel, 5, FailureHandling.OPTIONAL)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('TransferNeopay/XCUIElementTypeTextField - amountTransfer'), 5, FailureHandling.OPTIONAL)

    Mobile.setText(findTestObject('TransferNeopay/XCUIElementTypeTextField - amountTransfer'), NominalTansfer, 5, FailureHandling.OPTIONAL)

    Mobile.tap(findTestObject('TransferNeopay/XCUIElementTypeButton - Done'), 5, FailureHandling.OPTIONAL)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('TransferNeopay/XCUIElementTypeButton - Selanjutnya'), 5, FailureHandling.OPTIONAL)

    //Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
    //Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
    //Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)
    //if (((NomorPonsel.length() < 9) || NomorPonsel.isEmpty())) {
    // Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)
    // Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)
    // Mobile.tap(findTestObject('TransferNeopay/XCUIElementTypeButton - OK'), 0)
    //continue
    //}  
    boolean btnPopUp = Mobile.verifyElementVisible(findTestObject('TransferNeopay/XCUIElementTypeButton - OK'), 5, FailureHandling.OPTIONAL)

    if (btnPopUp) {
        //mobile tap ok
        Mobile.tap(findTestObject('TransferNeopay/XCUIElementTypeButton - OK'), 5, FailureHandling.OPTIONAL)

        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

        //Mobile.tap(findTestObject('New Folder (6)/XCUIElementTypeButton - ic now back (1)'), 5, FailureHandling.OPTIONAL)
        //Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
        continue
    }
	
	Mobile.tap(findTestObject('TransferNeopay/New Folder/XCUIElementTypeButton - Konfirmasi'), 5, FailureHandling.OPTIONAL)
	
	println('PinDariExcel ' + pin)
	
		String ButtonPin0 = Mobile.getText(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 0'), 5, FailureHandling.OPTIONAL)
	
		String ButtonPin1 = Mobile.getText(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 1'), 5, FailureHandling.OPTIONAL)
	
		String ButtonPin2 = Mobile.getText(findTestObject('Register/New Folder (6)/XCUIElementTypeButton - 2'), 5, FailureHandling.OPTIONAL)
	
		String ButtonPin3 = Mobile.getText(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 3'), 5, FailureHandling.OPTIONAL)
	
		String ButtonPin4 = Mobile.getText(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 4'), 5, FailureHandling.OPTIONAL)
	
		String ButtonPin5 = Mobile.getText(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 5'), 5, FailureHandling.OPTIONAL)
	
		String ButtonPin6 = Mobile.getText(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 6'), 5, FailureHandling.OPTIONAL)
	
		String ButtonPin7 = Mobile.getText(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 7'), 5, FailureHandling.OPTIONAL)
	
		String ButtonPin8 = Mobile.getText(findTestObject('Register/New Folder (6)/XCUIElementTypeButton - 8'), 5, FailureHandling.OPTIONAL)
	
		String ButtonPin9 = Mobile.getText(findTestObject('Register/New Folder (6)/XCUIElementTypeButton - 9'), 5, FailureHandling.OPTIONAL)
	
		println(ButtonPin1)
	
		println(ButtonPin2)
	
		println(ButtonPin3)
	
		for (int k = 0; k < pin.length(); k++) {
			if ((pin[k]) == ButtonPin0) {
				Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 0'), 5, FailureHandling.OPTIONAL)
			} else if ((pin[k]) == ButtonPin1) {
				Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 1'), 5, FailureHandling.OPTIONAL)
			} else if ((pin[k]) == ButtonPin2) {
				Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeButton - 2'), 5, FailureHandling.OPTIONAL)
			} else if ((pin[k]) == ButtonPin3) {
				Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 3'), 5, FailureHandling.OPTIONAL)
			} else if ((pin[k]) == ButtonPin4) {
				Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 4'), 5, FailureHandling.OPTIONAL)
			} else if ((pin[k]) == ButtonPin5) {
				Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 5'), 5, FailureHandling.OPTIONAL)
			} else if ((pin[k]) == ButtonPin6) {
				Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 6'), 5, FailureHandling.OPTIONAL)
			} else if ((pin[k]) == ButtonPin7) {
				Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 7'), 5, FailureHandling.OPTIONAL)
			} else if ((pin[k]) == ButtonPin8) {
				Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeButton - 8'), 5, FailureHandling.OPTIONAL)
			} else if ((pin[k]) == ButtonPin9) {
				Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeButton - 9'), 5, FailureHandling.OPTIONAL)
			}
		}
		
		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
		
		Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)
		if (pin != "123456") {
			Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)
			
			Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)
			Mobile.tap(findTestObject('New Folder Login(1)/XCUIElementTypeButton - OK'), 2, FailureHandling.OPTIONAL)
			Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)
			Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)
			
			continue
				
	   // } else {
			
	
			//continue
			
			
		}
			
}




