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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8080/')

WebUI.click(findTestObject('Object Repository/Project/Check transaction poll/Page_Homepage/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Project/Check transaction poll/Page_Signin/input_NUID_nuid'), '555')

WebUI.setEncryptedText(findTestObject('Object Repository/Project/Check transaction poll/Page_Signin/input_Password_password'), 
    'qR6uWNIaNDg=')

WebUI.click(findTestObject('Object Repository/Project/Check transaction poll/Page_Signin/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Project/Check transaction poll/Page_User page/a_Check transaction poll'))

WebUI.click(findTestObject('Object Repository/Project/Check transaction poll/Page_Transactionpoll/a_Click to view pending transaction'))

WebUI.click(findTestObject('Object Repository/Project/Check transaction poll/Page_Transactionpoll/a_Go Back to User Page'))

WebUI.closeBrowser()

