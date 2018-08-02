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

WebUI.callTestCase(findTestCase('Authentication/Login To RDM'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('RDM Objects/RDM Pages/div_Test'))

WebUI.click(findTestObject('RDM Objects/Thesauri Objects/Label/a_Add_Label'))

WebUI.delay(2)

WebUI.click(findTestObject('RDM Objects/Thesauri Objects/Label/input_Concept_Label'))

WebUI.setText(findTestObject('RDM Objects/Thesauri Objects/Label/input_concept-label'), '49er')

WebUI.click(findTestObject('RDM Objects/Thesauri Objects/Label/label_Type'))

WebUI.click(findTestObject('RDM Objects/Thesauri Objects/Label/alt_Label'))

WebUI.click(findTestObject('RDM Objects/Thesauri Objects/Label/label_Save_Btn'))

WebUI.delay(2)

WebUI.click(findTestObject('RDM Objects/Thesauri Objects/Note/a_Add note'))

WebUI.delay(2)

WebUI.setText(findTestObject('RDM Objects/Thesauri Objects/Note/textarea_note_value'), 'Test')

WebUI.click(findTestObject('RDM Objects/Thesauri Objects/Note/button_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('RDM Objects/Thesauri Objects/Value/a_Add value'))

WebUI.delay(2)

WebUI.click(findTestObject('RDM Objects/Thesauri Objects/Value/input_related_value_value'))

WebUI.setText(findTestObject('RDM Objects/Thesauri Objects/Value/input_related_value_value'), 'Test')

WebUI.delay(2)

WebUI.click(findTestObject('RDM Objects/Thesauri Objects/Value/btn_Value_Save'))

/*
Currently being worked on
WebUI.delay(2)
WebUI.click(findTestObject('RDM Objects/Thesauri Objects/Images/a_Add images'))

WebUI.maximizeWindow()

WebUI.uploadFile(findTestObject('RDM Objects/Thesauri Objects/Images/upload_Images'), '\\\\Users\\\\awuthrich\\\\Documents\\\\testimage.jpg')

FilePath = WebUI.getAttribute(findTestObject('RDM Objects/Thesauri Objects/Images/a_Add images'), 'testimage')

WebUI.verifyMatch(FilePath, '\\fakepath\\testimage.jpg', false)
*/
WebUI.closeBrowser()

