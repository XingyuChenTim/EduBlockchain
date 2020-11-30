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

WebUI.click(findTestObject('Object Repository/Project/A block in Bitcoin/Page_Homepage/a_A block in Bitcoin'))

WebUI.click(findTestObject('Object Repository/Project/A block in Bitcoin/Page_block/input_Block_button'))

WebUI.click(findTestObject('Object Repository/Project/A block in Bitcoin/Page_block/input_Block_button'))

WebUI.click(findTestObject('Object Repository/Project/A block in Bitcoin/Page_block/input_Block_button'))

WebUI.setText(findTestObject('Object Repository/Project/A block in Bitcoin/Page_block/input_Block_sender_address'), '1292021')

WebUI.setText(findTestObject('Object Repository/Project/A block in Bitcoin/Page_block/input_Block_receiver_address'), '9383020')

WebUI.setText(findTestObject('Object Repository/Project/A block in Bitcoin/Page_block/input_Block_date'), '1483228800000')

WebUI.setText(findTestObject('Object Repository/Project/A block in Bitcoin/Page_block/input_Block_amount'), '2')

WebUI.click(findTestObject('Object Repository/Project/A block in Bitcoin/Page_block/input_Block_button'))

WebUI.click(findTestObject('Object Repository/Project/A block in Bitcoin/Page_block/a_Back to home page(current)'))

WebUI.closeBrowser()

