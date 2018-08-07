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

WebUI.callTestCase(findTestCase('Authentication/Login To Resource Instance Editor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.click(findTestObject('RIT Objects/Resource Instance Editor/Pages and Buttons/a_Create Resource (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('RIT Objects/Resource Instance Editor/String/a_String_Click'))

WebUI.click(findTestObject('RIT Objects/Resource Instance Editor/String/input_String_Info'))

WebUI.setText(findTestObject('RIT Objects/Resource Instance Editor/String/input_String_Info'), 'Test')

WebUI.delay(2)

WebUI.click(findTestObject('RIT Objects/Resource Instance Editor/String/iframe_Rich_Text'))

WebUI.switchToFrame(findTestObject('RIT Objects/Resource Instance Editor/String/iframe_Rich_Text'), 60)

WebUI.delay(2)

//WebUI.scrollToElement(findTestObject('RIT Objects/Resource Instance Editor/String/iframe_Rich_Text'), 60)

//WebUI.click(findTestObject('RIT Objects/Resource Instance Editor/String/rich_Text_Input'))

//WebUI.delay(2)

WebUI.setText(findTestObject('RIT Objects/Resource Instance Editor/String/rich_Text_Input'), 'Test')
//failing to switch iframes... More work needs to be done to figure out why it is failing

