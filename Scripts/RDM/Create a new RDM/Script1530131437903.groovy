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

WebUI.click(findTestObject('Page_Arches  Heritage Data Manageme (10)/a_Login'))

WebUI.setText(findTestObject('Page_Arches 4.3 - (6)/input_username'), 'admin')

WebUI.setText(findTestObject('Page_Arches 4.3 - (6)/input_password'), 'admin')

WebUI.click(findTestObject('Page_Arches 4.3 - (6)/button_Sign In'))

WebUI.click(findTestObject('Page_Arches  Heritage Data Manageme (10)/a_Manage Data'))

WebUI.click(findTestObject('Page_Arches 4.3 - Resource Manager (7)/i_fa fa-align-left'))

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (2)/button_Tools'))

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (2)/a_Add Thesauri'))

WebUI.setText(findTestObject('Page_Arches 4.3 - Reference Data Ma (2)/input_label'), 'Test')

WebUI.setText(findTestObject('Page_Arches 4.3 - Reference Data Ma (2)/textarea_note'), 'Testing')

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (2)/button_Save changes'))

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (2)/button_Manage'))

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (2)/a_Make Collection'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.openBrowser('')

WebUI.navigateToUrl('http://dev.archesproject.org/')

WebUI.click(findTestObject('Page_Arches  Heritage Data Manageme (13)/a_Login'))

WebUI.setText(findTestObject('Page_Arches 4.3 - (9)/input_username'), 'admin')

WebUI.setText(findTestObject('Page_Arches 4.3 - (9)/input_password'), 'admin')

WebUI.click(findTestObject('Page_Arches 4.3 - (9)/button_Sign In'))

WebUI.click(findTestObject('Page_Arches  Heritage Data Manageme (13)/a_Design'))

WebUI.click(findTestObject('Page_Arches 4.3 - Graphs (7)/i_fa fa-align-left'))

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (5)/div_Test'))

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (5)/h5_Values'))

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (5)/a_Add value'))

WebUI.setText(findTestObject('Page_Arches 4.3 - Reference Data Ma (5)/input_related_value_value'), 'Test')

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (5)/button_Save'))

WebUI.closeBrowser()

WebUI.navigateToUrl('http://dev.archesproject.org/')

WebUI.click(findTestObject('Page_Arches  Heritage Data Manageme (11)/a_Login'))

WebUI.setText(findTestObject('Page_Arches 4.3 - (7)/input_username'), 'admin')

WebUI.setText(findTestObject('Page_Arches 4.3 - (7)/input_password'), 'admin')

WebUI.click(findTestObject('Page_Arches 4.3 - (7)/button_Sign In'))

WebUI.click(findTestObject('Page_Arches  Heritage Data Manageme (11)/a_Design'))

WebUI.click(findTestObject('Page_Arches 4.3 - Graphs (5)/i_fa fa-align-left'))

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (3)/i_fa fa-chevron-down'))

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (3)/a_Add Thesauri'))

WebUI.setText(findTestObject('Page_Arches 4.3 - Reference Data Ma (3)/input_label'), 'Test')

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (3)/button_Save changes'))

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (3)/div_Test'))

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (3)/i_fa fa-chevron-down_1'))

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (3)/a_Make Collection'))

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (3)/a_Add note'))

WebUI.setText(findTestObject('Page_Arches 4.3 - Reference Data Ma (3)/textarea_note_value'), 'Test')

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (3)/button_Save'))

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (3)/a_Add related concept'))

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (3)/div_select2-drop-mask'))

WebUI.setText(findTestObject('Page_Arches 4.3 - Reference Data Ma (3)/input_s2id_autogen8_search'), 'test')

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (3)/div_select2-drop-mask'))

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (3)/button_Save'))

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (3)/a_Add value'))

WebUI.setText(findTestObject('Page_Arches 4.3 - Reference Data Ma (3)/input_related_value_value'), 'Test')

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (3)/div_select2-drop-mask'))

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (3)/span_collector'))

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (3)/button_Save'))

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (3)/a_Add images'))

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (3)/div_Drop files here to upload'))

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (3)/button_Done'))

WebUI.closeBrowser()

