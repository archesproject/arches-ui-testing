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

WebUI.click(findTestObject('RIT Objects/Resource Instance Editor/Pages and Buttons/a_Create Resource (1)'))

WebUI.click(findTestObject('RIT Objects/Resource Instance Editor/Domain/span_domains'))

WebUI.click(findTestObject('RIT Objects/Resource Instance Editor/Domain/label_option 1'))

WebUI.delay(2)

WebUI.click(findTestObject('RIT Objects/Resource Instance Editor/Domain/a_Select_Widget'))

WebUI.delay(2)

WebUI.setText(findTestObject('RIT Objects/Resource Instance Editor/Domain/input_Select_Option'), 'option 1')

WebUI.sendKeys(findTestObject('RIT Objects/Resource Instance Editor/Domain/input_Select_Option'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('RIT Objects/Resource Instance Editor/Domain/button_Add'))



