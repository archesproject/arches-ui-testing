import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//Needs complete rework

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8000/auth/')

WebUI.setText(findTestObject('Page_Arches 4.3 - (2)/input_username'), 'admin')

WebUI.setText(findTestObject('Page_Arches 4.3 - (2)/input_password'), 'admin')

WebUI.click(findTestObject('Page_Arches 4.3 - (2)/button_Sign In'))

WebUI.click(findTestObject('Page_Arches  Heritage Data Manageme (6)/a_Design'))

WebUI.delay(2)
WebUI.click(findTestObject('Graph Manager Objects/Import Objects/i_ion-more'))

WebUI.uploadFile(findTestObject('Graph Manager Objects/Import Objects/a_Import BranchResource Model'), 'C:\\\\Users\\\\awuthrich\\\\Documents\\\\TestingModel.json')

WebUI.closeBrowser()

