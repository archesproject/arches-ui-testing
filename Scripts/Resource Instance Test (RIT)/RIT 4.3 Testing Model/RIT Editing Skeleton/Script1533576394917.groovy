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

WebUI.setText(findTestObject('Page_Arches 4.3 -/input_username'), 'a')

WebUI.setText(findTestObject('Page_Arches 4.3 -/input_username'), 'admin')

WebUI.setText(findTestObject('Page_Arches 4.3 -/input_password'), 'admin')

WebUI.click(findTestObject('Page_Arches 4.3 -/button_Sign In'))

WebUI.click(findTestObject('Page_Arches  Heritage Data Manageme/a_Manage Data'))

WebUI.click(findTestObject('RIT Objects/Resource Instance Editor/Pages and Buttons/a_Create Resource (1)'))

WebUI.click(findTestObject('RIT Objects/Resource Instance Editor/Pages and Buttons/button_Add'))

WebUI.click(findTestObject('RIT Objects/Resource Instance Editor/Dates Widget/span_Dates'))

WebUI.click(findTestObject('RIT Objects/Resource Instance Editor/Dates Widget/Recycled/span_input-group-addon'))

WebUI.click(findTestObject('RIT Objects/Resource Instance Editor/Dates Widget/td_6 (1)'))

WebUI.click(findTestObject('RIT Objects/Resource Instance Editor/Pages and Buttons/button_Add'))

WebUI.click(findTestObject('RIT Objects/Resource Instance Editor/Number/span_number'))

WebUI.setText(findTestObject('RIT Objects/Resource Instance Editor/Number/input_form-control input-lg wi_1'), '123')

WebUI.click(findTestObject('RIT Objects/Resource Instance Editor/Pages and Buttons/button_Add'))

WebUI.click(findTestObject('Page_Arches 4.3 - Resource Manager/button_Save edit'))

WebUI.click(findTestObject('RIT Objects/Resource Instance Editor/Boolean/span_boolean'))

WebUI.click(findTestObject('RIT Objects/Resource Instance Editor/Boolean/span_switch switch-small switc'))

WebUI.click(findTestObject('RIT Objects/Resource Instance Editor/Boolean/span_switch switch-small switc'))

WebUI.click(findTestObject('RIT Objects/Resource Instance Editor/Boolean/div_boolean'))

WebUI.click(findTestObject('RIT Objects/Resource Instance Editor/Boolean/span_switch switch-small switc'))

WebUI.click(findTestObject('RIT Objects/Resource Instance Editor/Boolean/label_Yes'))

WebUI.closeBrowser()

