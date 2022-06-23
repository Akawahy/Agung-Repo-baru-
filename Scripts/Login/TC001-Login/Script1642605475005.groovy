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

WebUI.callTestCase(findTestCase('RegisterFirstDownloader/TC001-StarAplication'), [:], FailureHandling.STOP_ON_FAILURE)

TestData ExcelData = findTestData('Login/DF001-Login')

System.out.println('[Row Count] : ' + ExcelData.getRowNumbers())

for (int i = 1; i <= ExcelData.getRowNumbers(); i++) {
    System.out.println('[data files phone number] : ' + ExcelData.getValue(5, i))

    String NomorHandphone = ExcelData.getValue(3, i)

    String OTP = ExcelData.getValue(4, i)

    String pin = ExcelData.getValue(5, i)

    Mobile.getText(findTestObject('New Folder Login(1)/XCUIElementTypeTextField'), 5, FailureHandling.OPTIONAL)

    Mobile.setText(findTestObject('New Folder Login(1)/XCUIElementTypeTextField'), NomorHandphone, 5, FailureHandling.OPTIONAL)

	Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)
	
    //Mobile.tap(findTestObject('RegisterFirstDownloader/OR004-ButtonDone'), 5, FailureHandling.OPTIONAL)
    //Boolean btnSelanjutnya = Mobile.getAttribute(findTestObject('Register/New Folder (1)/XCUIElementTypeButton - Selanjutnya'), 'enabled',
    // 0)
    println(' noHandphone >> ' + NomorHandphone)

    if (NomorHandphone.length() < 6) {
        println('screenshot')

        Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

        continue
    }
    
    Mobile.tap(findTestObject('Login/OR001-ButtonLogin'), 2, FailureHandling.OPTIONAL)

    println('KodeOTP ' + OTP)

    Mobile.getText(findTestObject('Login/OR002-InputOTP'), 2, FailureHandling.OPTIONAL)

    Mobile.setText(findTestObject('Login/OR002-InputOTP'), OTP, 2, FailureHandling.OPTIONAL)
	
	Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

    //Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
    //Mobile.getText(findTestObject('Register/New Folder (4)/XCUIElementTypeKey - 1'), 0)
    // Mobile.setText(findTestObject('Register/New Folder (4)/XCUIElementTypeKey - 1'), OTP, 0)
    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

    if ((OTP.length() > 6) || (OTP != '999999')) {
        println('screenshot')

        Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Register/New Folder (5)/XCUIElementTypeButton - ic now back'), 2, FailureHandling.OPTIONAL)

        Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

        continue
    }
    
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
            Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 0'), 0, FailureHandling.OPTIONAL)
        } else if ((pin[k]) == ButtonPin1) {
            Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 1'), 0, FailureHandling.OPTIONAL)
        } else if ((pin[k]) == ButtonPin2) {
            Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeButton - 2'), 0, FailureHandling.OPTIONAL)
        } else if ((pin[k]) == ButtonPin3) {
            Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 3'), 0, FailureHandling.OPTIONAL)
        } else if ((pin[k]) == ButtonPin4) {
            Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 4'), 0, FailureHandling.OPTIONAL)
        } else if ((pin[k]) == ButtonPin5) {
            Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 5'), 0, FailureHandling.OPTIONAL)
        } else if ((pin[k]) == ButtonPin6) {
            Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 6'), 0, FailureHandling.OPTIONAL)
        } else if ((pin[k]) == ButtonPin7) {
            Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 7'), 0, FailureHandling.OPTIONAL)
        } else if ((pin[k]) == ButtonPin8) {
            Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeButton - 8'), 0, FailureHandling.OPTIONAL)
        } else if ((pin[k]) == ButtonPin9) {
            Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeButton - 9'), 0, FailureHandling.OPTIONAL)
        }
    }
	
	Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)
    if (pin != "123456") {
        Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)
		
		Mobile.tap(findTestObject('New Folder Login(1)/XCUIElementTypeButton - OK'), 2, FailureHandling.OPTIONAL)
	
        continue
    } else {
		Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

		//continue
		
		
    }
}

