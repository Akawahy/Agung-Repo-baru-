package pin

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Generatepin {

	@Keyword
	def SetPin(String OldPin){
		
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
	}
	
}
