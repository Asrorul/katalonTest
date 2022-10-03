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

org_name='testonboard'
response = WS.sendRequest(findTestObject('API/OrganizationLogin', [('org_name') : org_name]))

WS.verifyResponseStatusCode(response, 200)
slurper = new groovy.json.JsonSlurper()
result = slurper.parseText(response.getResponseBodyContent())
status = result.status
_id = result._id
name=result.name

if (_id  == '') {
    KeywordUtil.markWarning('No id Return')
    throw new AssertionError('ERROR: No id Return')
}
if (name  != org_name) {
	KeywordUtil.markWarning('Name is different')
	throw new AssertionError('ERROR: Name is different')
}
if (status  == null) {
	KeywordUtil.markWarning('Status is null')
	throw new AssertionError('ERROR: Status is null')
}

