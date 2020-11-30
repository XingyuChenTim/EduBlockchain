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

WebUI.click(findTestObject('Object Repository/Simulation/User_payment_hash/Page_Homepage/button_Blockchain Animation'))

WebUI.click(findTestObject('Object Repository/Simulation/User_payment_hash/Page_EDUBC/a_User Payment Hash'))

WebUI.click(findTestObject('Object Repository/Simulation/User_payment_hash/Page_EDUBC/button_Gen Pay Hash'))

WebUI.click(findTestObject('Object Repository/Simulation/User_payment_hash/Page_EDUBC/a_Verify'))

WebUI.click(findTestObject('Object Repository/Simulation/User_payment_hash/Page_EDUBC/button_Verify'))

WebUI.closeBrowser()

