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
import java.util.regex.Matcher as Matcher
import java.util.regex.Pattern as Pattern

Mobile.callTestCase(findTestCase('RegisterFirstDownloader/TC001-StarAplication'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('RegisterFirstDownloader/OR001-ButtonDaftar'), 0)

Mobile.tap(findTestObject('RegisterFirstDownloader/OR002-ButtonTidak'), 0)

Mobile.tap(findTestObject('NeopayUnregistered/OR002-ButtonYa'), 0)

TestData ExcelData = findTestData('RegisterNeoPay/DF001-RegisterNeoPay')

System.out.println('[Row Count] : ' + ExcelData.getRowNumbers())

for (int i = 1; i <= ExcelData.getRowNumbers(); i++) {
    System.out.println('[data files phonenumber] : ' + ExcelData.getValue(3, i))

    String NomorHandphone = ExcelData.getValue(3, i)

    String OTP = ExcelData.getValue(4, i)

    String pin = ExcelData.getValue(5, i)

    String KonfirmasiPin = ExcelData.getValue(6, i)

    String Password = ExcelData.getValue(7, i)

    String KonfirmasiPassword = ExcelData.getValue(8, i)

    Mobile.getText(findTestObject('Objek Paswword Neopay/XCUIElementTypeTextField - phoneNumber'), 5, FailureHandling.OPTIONAL)

    Mobile.setText(findTestObject('Objek Paswword Neopay/XCUIElementTypeTextField - phoneNumber'), NomorHandphone, 5, FailureHandling.OPTIONAL)

    Mobile.tap(findTestObject('RegisterFirstDownloader/OR004-ButtonDone'), 5, FailureHandling.OPTIONAL)
	
	Mobile.tap(findTestObject('RegisterFirstDownloader/OR005-ButtonSelanjutnya'), 5, FailureHandling.OPTIONAL)
	
	Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
	
	Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

    //Boolean btnSelanjutnya = Mobile.getAttribute(findTestObject('Register/New Folder (1)/XCUIElementTypeButton - Selanjutnya'), 
    //'enabled', 0)
    println(' noHandphone >> ' + NomorHandphone)

    if (NomorHandphone.length() < 6) {
        println('screenshot')

        Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

        continue
    }
    
    boolean btnPopUp = Mobile.verifyElementVisible(findTestObject('Email FirstDownloader/XCUIElementTypeButton - OK (1)'), 
        5, FailureHandling.OPTIONAL)

    if (btnPopUp) {
        //mobile tap ok
        Mobile.tap(findTestObject('Email FirstDownloader/XCUIElementTypeButton - OK (1)'), 5, FailureHandling.OPTIONAL)

        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

        //Mobile.tap(findTestObject('New Folder (6)/XCUIElementTypeButton - ic now back (1)'), 5, FailureHandling.OPTIONAL)
        //Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
        continue
    }
    
   
    println('KodeOTP ' + OTP)

    Mobile.getText(findTestObject('RegisterFirstDownloader/OR006-InputOTP'), 5, FailureHandling.OPTIONAL)

    Mobile.setText(findTestObject('RegisterFirstDownloader/OR006-InputOTP'), OTP, 5, FailureHandling.OPTIONAL)

    //Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
    //Mobile.getText(findTestObject('Register/New Folder (4)/XCUIElementTypeKey - 1'), 0)
    //Mobile.setText(findTestObject('Register/New Folder (4)/XCUIElementTypeKey - 1'), OTP, 0)
    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

    if ((OTP.length() > 6) || (OTP != '999999')) {
        println('screenshot')

        println('KodeOTP8888888 ')

        Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Register/New Folder (5)/XCUIElementTypeButton - ic now back'), 0)

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
    
    if (pin != KonfirmasiPin) {
        Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

        continue
    }
    
    //Mobile.tap(findTestObject('New Folder (3)/XCUIElementTypeButton - ic now eye closed'), 0, FailureHandling.OPTIONAL)
    Mobile.tap(findTestObject('Objek Paswword Neopay/XCUIElementTypeSecureTextField - password'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.setText(findTestObject('Objek Paswword Neopay/XCUIElementTypeSecureTextField - password'), Password, 0, FailureHandling.OPTIONAL)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

    //Mobile.tap(findTestObject('RegisterFirstDownloader/OR0012-ButtonMata'), 0, FailureHandling.OPTIONAL)
    //Mobile.tap(findTestObject('New Folder (8)/XCUIElementTypeButton - Button'), 0, FailureHandling.OPTIONAL)
    //Mobile.scrollToText(KonfirmasiPassword, FailureHandling.OPTIONAL)
    Mobile.tap(findTestObject('Objek Paswword Neopay/XCUIElementTypeSecureTextField - confirmPassword'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.setText(findTestObject('Objek Paswword Neopay/XCUIElementTypeSecureTextField - confirmPassword'), KonfirmasiPassword, 
        0, FailureHandling.OPTIONAL)

    //Mobile.tap(findTestObject('RegisterFirstDownloader/OR0012-ButtonMata'), 0, FailureHandling.OPTIONAL)
    Mobile.tap(findTestObject('RegisterFirstDownloader/OR004-ButtonDone'), 5, FailureHandling.OPTIONAL)

    Mobile.tap(findTestObject('Register/New Folder (7)/XCUIElementTypeButton - Lanjut'), 5, FailureHandling.OPTIONAL)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

    println('PasswordDariInput' + Password)

    println('PasswordDariExcel ' + Password)

    println(('ComparePassword' + Password) != KonfirmasiPassword)

    String password_pattern = '^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;,?/*~$^+=<>]).{8,16}$'

    Pattern pt = Pattern.compile(password_pattern)

    Matcher m1 = pt.matcher(Password)

    Matcher m2 = pt.matcher(KonfirmasiPassword)

    boolean p1 = m1.find()

    boolean p2 = m2.find()

    println('hasil p1 >>> ' + p1)

    println('hasil p2 >>> ' + p2)

    if (!(p1) || !(p2)) {
        Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

        continue
    }
    
    if (Password != KonfirmasiPassword) {
        Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

        continue
    }
    
    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('New Folder (4)/XCUIElementTypeButton - Lanjut'), 5, FailureHandling.OPTIONAL)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

    //Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)
    //Mobile.tap(findTestObject('Register/New Folder (7)/XCUIElementTypeButton - Lanjut'), 5, FailureHandling.OPTIONAL)
    Mobile.tap(findTestObject('IsiSaldo/XCUIElementTypeButton - Isi Saldo'), 5, FailureHandling.OPTIONAL)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)
}

