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

Mobile.tap(findTestObject('TransferBankNobu/XCUIElementTypeButton - btnTransfer'), 0)

Mobile.tap(findTestObject('TransferBankNobu/XCUIElementTypeButton - btnBank'), 0)

TestData ExcelData = findTestData('TransferRTOL/DF002-TransferRTOLNegative')

System.out.println('[Row Count] : ' + ExcelData.getRowNumbers())

int limitTrfMin = GlobalVariable.limitTrfMin

int limitTrfMax = GlobalVariable.limitTrfMax

int limitTrfMaxPlus = GlobalVariable.limitTrfMaxPlus

for (int i = 1; i <= ExcelData.getRowNumbers(); i++) {
    // System.out.println('[data files phonenumber] : ' + ExcelData.getValue(3, i))
    String NomorRekening = ExcelData.getValue(3, i)

    System.out.println('NomorRekening : ' + NomorRekening)

    int AmountTransfer = Integer.parseInt(ExcelData.getValue(4, i))

    String NominalTansfer = ExcelData.getValue(4, i)

    System.out.println('NominalTransfer : ' + NominalTransfer)

    //String pin = ExcelData.getValue(5, i)

    //System.out.println('pin : ' + pin)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('TransferAntarBank/XCUIElementTypeButton - btnDestinationBank'), 5, FailureHandling.OPTIONAL)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    //Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)
    Mobile.tap(findTestObject('TransferAntarBank/New Folder/XCUIElementTypeStaticText - BANK CENTRAL ASIA'), 5, FailureHandling.OPTIONAL)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('TransferBankNobu/XCUIElementTypeTextField - accountNumber'), 5, FailureHandling.OPTIONAL)

    Mobile.setText(findTestObject('TransferBankNobu/XCUIElementTypeTextField - accountNumber'), NomorRekening, 5, FailureHandling.OPTIONAL)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('TransferBankNobu/XCUIElementTypeTextField - amountTransfer'), 5, FailureHandling.OPTIONAL)

    Mobile.setText(findTestObject('TransferBankNobu/XCUIElementTypeTextField - amountTransfer'), NominalTansfer, 5, FailureHandling.OPTIONAL)

    Mobile.tap(findTestObject('TransferNeopay/XCUIElementTypeButton - Done'), 5, FailureHandling.OPTIONAL)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('TransferAntarBank/XCUIElementTypeButton - transferType'), 5, FailureHandling.OPTIONAL)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('TransferAntarBank/XCUIElementTypeStaticText - RTGS - Rp15.000'), 5, FailureHandling.OPTIONAL)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('TransferAntarBank/XCUIElementTypeButton - ic now sidebar close'), 5, FailureHandling.OPTIONAL)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('TransferNeopay/XCUIElementTypeButton - Selanjutnya'), 5, FailureHandling.OPTIONAL)

    boolean btnPopUp = Mobile.verifyElementVisible(findTestObject('TransferNeopay/XCUIElementTypeButton - OK'), 5, FailureHandling.OPTIONAL)

    if (btnPopUp) {
        //mobile tap ok
        Mobile.tap(findTestObject('TransferNeopay/XCUIElementTypeButton - OK'), 5, FailureHandling.OPTIONAL)

        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

        //Mobile.tap(findTestObject('New Folder (6)/XCUIElementTypeButton - ic now back (1)'), 5, FailureHandling.OPTIONAL)
        //Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
        //continue
    }
  
}

