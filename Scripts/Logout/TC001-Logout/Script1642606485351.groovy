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

Mobile.tap(findTestObject('New Folder (7)/XCUIElementTypeButton - ic now sidebar'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)


//Mobile.scrollToText('v.1.0.40(1)', FailureHandling.STOP_ON_FAILURE)
//Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

//Mobile.swipe(0, 0, 0, 0)(findTestObject('New Folder (9)/XCUIElementTypeTable'), 0)

//CustomKeywords.'mobileiosscroll.Scroll.ScrollDown'()

//CustomKeywords.'mobileiosscroll.Scroll.ScrollDown'()
//Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)


Mobile.tap(findTestObject('New Folder (7)/XCUIElementTypeButton - Keluar'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('New Folder (7)/XCUIElementTypeButton - Ya, Keluar'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)