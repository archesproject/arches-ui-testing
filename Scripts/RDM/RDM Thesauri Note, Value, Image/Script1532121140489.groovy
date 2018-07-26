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

WebUI.navigateToUrl('http://dev.archesproject.org/')

WebUI.click(findTestObject('Page_Arches  Heritage Data Manageme (12)/a_Login'))

WebUI.setText(findTestObject('Page_Arches 4.3 - (8)/input_username'), 'admin')

WebUI.setText(findTestObject('Page_Arches 4.3 - (8)/input_password'), 'admin')

WebUI.click(findTestObject('Page_Arches 4.3 - (8)/button_Sign In'))

WebUI.click(findTestObject('Page_Arches  Heritage Data Manageme (12)/a_Design'))

WebUI.delay(2)
WebUI.click(findTestObject('Page_Arches 4.3 - Graphs (4)/a_Reference Data Manager'))

WebUI.delay(2)
WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (4)/div_Test'))

WebUI.click(findTestObject('a_Add_Label'))

WebUI.delay(2)
WebUI.click(findTestObject('input_Concept_Label'))

WebUI.setText(findTestObject('Page_Arches 4.3 - Reference Data Ma (6)/input_concept-label'), '49er')

WebUI.click(findTestObject('label_Type'))

WebUI.click(findTestObject('alt_Label'))

WebUI.click(findTestObject('label_Save_Btn'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (3)/a_Add note'))

WebUI.delay(2)
WebUI.setText(findTestObject('Page_Arches 4.3 - Reference Data Ma (3)/textarea_note_value'), 'Test')

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (3)/button_Save'))

WebUI.delay(2)
WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (3)/a_Add value'))

WebUI.delay(2)
WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (3)/input_related_value_value'))

WebUI.setText(findTestObject('Page_Arches 4.3 - Reference Data Ma (3)/input_related_value_value'), 'Test')

WebUI.delay(2)
WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (5)/button_Save'))
/*
WebUI.delay(2)
WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (3)/a_Add images'))

WebUI.maximizeWindow()

WebUI.uploadFile(findTestObject('upload_Images'), '\\\\Users\\\\awuthrich\\\\Documents\\\\testimage.jpg')

FilePath = WebUI.getAttribute(findTestObject('Page_Arches 4.3 - Reference Data Ma (3)/a_Add images'), 'testimage')

WebUI.verifyMatch(FilePath, '\\fakepath\\testimage.jpg', false)
*/
WebUI.closeBrowser()
