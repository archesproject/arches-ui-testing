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

WebUI.click(findTestObject('Page_Arches  Heritage Data Manageme (9)/a_Login'))

WebUI.setText(findTestObject('Page_Arches 4.3 - (5)/input_username'), 'admin')

WebUI.setText(findTestObject('Page_Arches 4.3 - (5)/input_password'), 'admin')

WebUI.click(findTestObject('Page_Arches 4.3 - (5)/button_Sign In'))

WebUI.click(findTestObject('Page_Arches  Heritage Data Manageme (9)/a_Design'))

WebUI.delay(2)
WebUI.click(findTestObject('Page_Arches 4.3 - Graphs (4)/a_Reference Data Manager'))

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (2)/button_Tools'))

WebUI.delay(2)
WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (2)/a_Add Thesauri'))

WebUI.delay(2)
WebUI.setText(findTestObject('Page_Arches 4.3 - Reference Data Ma (2)/input_label'), 'Test')

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (2)/button_Save changes'))

WebUI.delay(2)
WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (3)/div_Test'))

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (2)/button_Manage'))

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (2)/a_Make Collection'))

WebUI.closeBrowser()

