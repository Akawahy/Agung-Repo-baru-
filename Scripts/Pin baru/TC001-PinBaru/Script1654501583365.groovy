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

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('UbahPin/XCUIElementTypeStaticText - Ubah PIN'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

TestData ExcelData = findTestData('PInBaru/DF001-PinBaru')

System.out.println('[Row Count] : ' + ExcelData.getRowNumbers())

for (int i = 1; i <= ExcelData.getRowNumbers(); i++) {
	System.out.println('[data files phonenumber] : ' + ExcelData.getValue(3, i))
	
	String OldValidPin = ExcelData.getValue(3, i)

	String OldPin = ExcelData.getValue(4, i)

	String Pin = ExcelData.getValue(5, i)

	String KonfirmasiPin = ExcelData.getValue(6, i)
	
	println('PinDariExcel ' + OldPin)
	
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
	
		
	
		for (int k = 0; k < OldPin.length(); k++) {
			if ((OldPin[k]) == ButtonPin0) {
				Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 0'), 0, FailureHandling.OPTIONAL)
			} else if ((OldPin[k]) == ButtonPin1) {
				Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 1'), 0, FailureHandling.OPTIONAL)
			} else if ((OldPin[k]) == ButtonPin2) {
				Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeButton - 2'), 0, FailureHandling.OPTIONAL)
			} else if ((OldPin[k]) == ButtonPin3) {
				Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 3'), 0, FailureHandling.OPTIONAL)
			} else if ((OldPin[k]) == ButtonPin4) {
				Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 4'), 0, FailureHandling.OPTIONAL)
			} else if ((OldPin[k]) == ButtonPin5) {
				Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 5'), 0, FailureHandling.OPTIONAL)
			} else if ((OldPin[k]) == ButtonPin6) {
				Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 6'), 0, FailureHandling.OPTIONAL)
			} else if ((OldPin[k]) == ButtonPin7) {
				Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 7'), 0, FailureHandling.OPTIONAL)
			} else if ((OldPin[k]) == ButtonPin8) {
				Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeButton - 8'), 0, FailureHandling.OPTIONAL)
			} else if ((OldPin[k]) == ButtonPin9) {
				Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeButton - 9'), 0, FailureHandling.OPTIONAL)
			}
		}
		
		Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)
		if (OldPin != OldValidPin) {
			Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)
			
			Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)
			Mobile.tap(findTestObject('New Folder Login(1)/XCUIElementTypeButton - OK'), 2, FailureHandling.OPTIONAL)
			Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)
			Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)
			
			continue
				
	   
			
			
		}
		
		Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)
		
			for (int k = 0; k < Pin.length(); k++) {
				if ((Pin[k]) == ButtonPin0) {
					Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 0'), 5, FailureHandling.OPTIONAL)
				} else if ((Pin[k]) == ButtonPin1) {
					Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 1'), 5, FailureHandling.OPTIONAL)
				} else if ((Pin[k]) == ButtonPin2) {
					Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeButton - 2'), 5, FailureHandling.OPTIONAL)
				} else if ((Pin[k]) == ButtonPin3) {
					Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 3'), 5, FailureHandling.OPTIONAL)
				} else if ((Pin[k]) == ButtonPin4) {
					Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 4'), 5, FailureHandling.OPTIONAL)
				} else if ((Pin[k]) == ButtonPin5) {
					Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 5'), 5, FailureHandling.OPTIONAL)
				} else if ((Pin[k]) == ButtonPin6) {
					Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 6'), 5, FailureHandling.OPTIONAL)
				} else if ((Pin[k]) == ButtonPin7) {
					Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 7'), 5, FailureHandling.OPTIONAL)
				} else if ((Pin[k]) == ButtonPin8) {
					Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeButton - 8'), 5, FailureHandling.OPTIONAL)
				} else if ((Pin[k]) == ButtonPin9) {
					Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeButton - 9'), 5, FailureHandling.OPTIONAL)
				}
			}
			
			Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)
			
			for (int j = 0; j < KonfirmasiPin.length(); j++) {
				if ((KonfirmasiPin[j]) == ButtonPin0) {
					Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 0'), 5, FailureHandling.OPTIONAL)
				} else if ((KonfirmasiPin[j]) == ButtonPin1) {
					Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 1'), 5, FailureHandling.OPTIONAL)
				} else if ((KonfirmasiPin[j]) == ButtonPin2) {
					Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeButton - 2'), 5, FailureHandling.OPTIONAL)
				} else if ((KonfirmasiPin[j]) == ButtonPin3) {
					Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 3'), 5, FailureHandling.OPTIONAL)
				} else if ((KonfirmasiPin[j]) == ButtonPin4) {
					Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 4'), 5, FailureHandling.OPTIONAL)
				} else if ((KonfirmasiPin[j]) == ButtonPin5) {
					Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 5'), 5, FailureHandling.OPTIONAL)
				} else if ((KonfirmasiPin[j]) == ButtonPin6) {
					Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 6'), 5, FailureHandling.OPTIONAL)
				} else if ((KonfirmasiPin[j]) == ButtonPin7) {
					Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeStaticText - 7'), 5, FailureHandling.OPTIONAL)
				} else if ((KonfirmasiPin[j]) == ButtonPin8) {
					Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeButton - 8'), 5, FailureHandling.OPTIONAL)
				} else if ((KonfirmasiPin[j]) == ButtonPin9) {
					Mobile.tap(findTestObject('Register/New Folder (6)/XCUIElementTypeButton - 9'), 5, FailureHandling.OPTIONAL)
				}
			}
			
			
			println("Pin >>> " + Pin)
			
			println("KonfirmasiPin >>> " + KonfirmasiPin)
			
			if (Pin != KonfirmasiPin) {
				Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)
				
				Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)
				
				Mobile.tap(findTestObject('New Folder Login(1)/XCUIElementTypeButton - OK'), 2, FailureHandling.OPTIONAL)
				
				Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)
				
				Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)
		
				continue
			}
			
			Mobile.tap(findTestObject('New Folder Login(1)/XCUIElementTypeButton - OK'), 2, FailureHandling.OPTIONAL)

}
