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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://taskdev.mile.app/login')

WebUI.click(findTestObject('Page_Mile.app  Login/input_Organization Name_organization'))

WebUI.setText(findTestObject('Object Repository/Page_Mile.app  Login/input_Organization Name_organization'), 'testonboard')

WebUI.click(findTestObject('Object Repository/Page_Mile.app  Login/div_Email or Username_el-form-item__content'))

WebUI.waitForElementClickable(findTestObject('Page_Mile.app  Login/input_Email or Username_email or username'), 5)

WebUI.waitForElementClickable(findTestObject('Page_Mile.app  Login/input_Password_password'), 5)

WebUI.verifyElementClickable(findTestObject('Page_Mile.app  Login/input_Email or Username_email or username'))

WebUI.verifyElementClickable(findTestObject('Page_Mile.app  Login/input_Password_password'))

WebUI.closeBrowser()

