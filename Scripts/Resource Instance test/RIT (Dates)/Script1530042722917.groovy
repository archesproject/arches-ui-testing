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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8000/auth/')

WebUI.setText(findTestObject('Page_Arches 4.3 - (8)/input_username'), 'admin')

WebUI.setText(findTestObject('Page_Arches 4.3 - (8)/input_password'), 'admin')

WebUI.click(findTestObject('Page_Arches 4.3 - (8)/button_Sign In'))

WebUI.click(findTestObject('Page_Arches  Heritage Data Manageme (4)/a_Search'))

WebUI.click(findTestObject('Page_Arches 4.3 - Search/button_Select...'))

WebUI.click(findTestObject('Page_Arches 4.3 - Search/a_World Parks (Testing Model)'))

WebUI.click(findTestObject('Page_Arches 4.3 - Search/span_TEST'))

WebUI.switchToWindowTitle('Arches 4.3 - Resource Report')

WebUI.click(findTestObject('Page_Arches 4.3 - Resource Report/i_ion-edit'))

WebUI.click(findTestObject('Page_Arches 4.3 - Resource Manager (6)/span_Existence-Precision (date'))

WebUI.click(findTestObject('Page_Arches 4.3 - Resource Manager (6)/td_29'))

WebUI.click(findTestObject('Page_Arches 4.3 - Resource Manager (6)/div_select2-drop-mask'))

WebUI.click(findTestObject('Page_Arches 4.3 - Resource Manager (6)/span_Select an option'))

WebUI.click(findTestObject('Page_Arches 4.3 - Resource Manager (6)/td_6'))

WebUI.click(findTestObject('Page_Arches 4.3 - Resource Manager (6)/button_Add'))

WebUI.closeBrowser()

