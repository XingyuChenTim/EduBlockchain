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

WebUI.click(findTestObject('Object Repository/Project/Simulation/Page_Homepage/button_Blockchain Animation'))

WebUI.click(findTestObject('Object Repository/Project/Simulation/Page_EDUBC/button_Tap to unmute_ytp-large-play-button _201a86'))

WebUI.click(findTestObject('Object Repository/Project/Simulation/Page_EDUBC/div_An error occurred while retrieving shar_18d7dc'))

WebUI.click(findTestObject('Object Repository/Project/Simulation/Page_EDUBC/div_An error occurred while retrieving shar_18d7dc'))

WebUI.click(findTestObject('Object Repository/Project/Simulation/Page_EDUBC/video_Institute for the Future (IFTF)_video_d9c83c'))

WebUI.click(findTestObject('Object Repository/Project/Simulation/Page_EDUBC/video_Volume 90_jw-video jw-reset'))

WebUI.click(findTestObject('Object Repository/Project/Simulation/Page_EDUBC/video_Volume 90_jw-video jw-reset'))

WebUI.closeBrowser()

