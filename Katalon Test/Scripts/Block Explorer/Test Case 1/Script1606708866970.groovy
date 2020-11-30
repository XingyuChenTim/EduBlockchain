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

WebUI.click(findTestObject('Object Repository/Project/Block Explorer/Page_Homepage/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Project/Block Explorer/Page_Signin/input_NUID_nuid'), '555')

WebUI.setEncryptedText(findTestObject('Object Repository/Project/Block Explorer/Page_Signin/input_Password_password'), 'qR6uWNIaNDg=')

WebUI.click(findTestObject('Object Repository/Project/Block Explorer/Page_Signin/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Project/Block Explorer/Page_User page/a_Open up Explorer'))

WebUI.click(findTestObject('Object Repository/Project/Block Explorer/Page_BlockChain Explorer/i_BLOCKCHAIN EXPLORER_fas fa-search'))

WebUI.click(findTestObject('Object Repository/Project/Block Explorer/Page_Searchresults/a_Click to view your transaction details'))

WebUI.click(findTestObject('Object Repository/Project/Block Explorer/Page_Searchresults/li_00000d113c7bc90352b0eb0f336472f24ed39c48_8d9066'))

WebUI.click(findTestObject('Object Repository/Project/Block Explorer/Page_Searchresults/a_Go Back to Search Page'))

WebUI.setText(findTestObject('Object Repository/Project/Block Explorer/Page_BlockChain Explorer/input_BlockChain Explorer_keyword'), 
    '00000d113c7bc90352b0eb0f336472f24ed39c48fc9eaf23769048cacf7453c2')

WebUI.click(findTestObject('Object Repository/Project/Block Explorer/Page_BlockChain Explorer/i_BLOCKCHAIN EXPLORER_fas fa-search'))

WebUI.click(findTestObject('Object Repository/Project/Block Explorer/Page_Searchresults/a_Click to view your transaction details'))

WebUI.click(findTestObject('Object Repository/Project/Block Explorer/Page_Searchresults/a_Go Back to Search Page'))

WebUI.click(findTestObject('Object Repository/Project/Block Explorer/Page_BlockChain Explorer/a_Go Back to User Page'))

WebUI.click(findTestObject('Object Repository/Project/Block Explorer/Page_User page/a_Sign Out(current)'))

WebUI.closeBrowser()

