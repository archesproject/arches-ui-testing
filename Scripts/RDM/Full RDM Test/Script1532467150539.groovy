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

WebUI.delay(2)
WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (4)/div_Test'))

WebUI.delay(2)
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

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (3)/a_Add related concept'))

WebUI.delay(2)

WebUI.click(findTestObject('Search for a Concept'))

WebUI.setText(findTestObject('input_s2id_autogen4_search'), 'asbestos')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('input_s2id_autogen4_search'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Relation to Concept'))

//WebUI.click(findTestObject('Related Dropdown'))
//WebUI.sendKeys(findTestObject('Related Dropdown'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Test Click'))

WebUI.delay(2)

WebUI.click(findTestObject('btn_Concept_Save'))

WebUI.delay(2)
WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (3)/a_Add value'))

WebUI.delay(2)
WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (3)/input_related_value_value'))

WebUI.setText(findTestObject('Page_Arches 4.3 - Reference Data Ma (3)/input_related_value_value'), 'Test')

WebUI.delay(2)
WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (5)/button_Save'))

WebUI.delay(2)
WebUI.click(findTestObject('a_Collections'))

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (6)/div_Test'))

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (6)/div_Test'))

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (6)/h5_Labels'))

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (6)/a_Add label'))

WebUI.delay(2)

WebUI.click(findTestObject('input_Concept_Label'))

WebUI.setText(findTestObject('Page_Arches 4.3 - Reference Data Ma (6)/input_concept-label'), '49er')

WebUI.click(findTestObject('label_Type'))

WebUI.click(findTestObject('alt_Label'))

WebUI.click(findTestObject('label_Save_Btn'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (6)/a_Add note'))

WebUI.delay(2)

WebUI.click(findTestObject('Note_Value'))

WebUI.setText(findTestObject('Page_Arches 4.3 - Reference Data Ma (6)/textarea_note_value'), 'test')

WebUI.delay(2)

WebUI.click(findTestObject('note_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (6)/a_Add value'))

WebUI.delay(2)

//WebUI.click(findTestObject('define_A_Value'))

WebUI.setText(findTestObject('Page_Arches 4.3 - Reference Data Ma (6)/input_related_value_value'), 'test')

WebUI.click(findTestObject('value_Save_Btn'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (6)/i_fa fa-chevron-down'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (6)/a_Delete Collection'))

WebUI.delay(2)

WebUI.click(findTestObject('open_Deletion_Options'))

WebUI.setText(findTestObject('delete_Collection'), 'Test')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('delete_Collection'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('button_Delete_Collection'))

WebUI.closeBrowser()