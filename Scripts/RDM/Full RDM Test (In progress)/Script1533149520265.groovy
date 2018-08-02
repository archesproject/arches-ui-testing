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

import org.junit.After
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://dev.archesproject.org/')

WebUI.click(findTestObject('Authentication Objects/a_Login'))

WebUI.setText(findTestObject('Authentication Objects/input_username'), 'admin')

WebUI.setText(findTestObject('Authentication Objects/input_password'), 'admin')

WebUI.click(findTestObject('Authentication Objects/button_Sign In'))

WebUI.click(findTestObject('Authentication Objects/a_Design'))

WebUI.delay(2)
WebUI.click(findTestObject('Authentication Objects/a_Reference Data Manager'))

WebUI.delay(2)
WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma/button_Tools'))

WebUI.delay(2)
WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma/a_Add Thesauri'))

WebUI.delay(2)
WebUI.setText(findTestObject('Page_Arches 4.3 - Reference Data Ma/input_label'), 'Test')

WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma/button_Save changes'))

WebUI.delay(2)
WebUI.click(findTestObject('RDM Objects/RDM Pages/div_Test'))

WebUI.click(findTestObject('RDM Objects/RDM Tool Menu/button_Manage'))

WebUI.click(findTestObject('RDM Objects/Collection Objects/Creation/a_Make Collection'))

WebUI.delay(2)
WebUI.click(findTestObject('RDM Objects/RDM Tool Menu/close_Success_Notification'))

WebUI.delay(2)
WebUI.click(findTestObject('Page_Arches 4.3 - Reference Data Ma (4)/div_Test'))

WebUI.click(findTestObject('RDM Objects/Thesauri Objects/Value/Related Objects (Secondary)/a_New_Label'))

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

WebUI.click(findTestObject('RDM Objects/Thesauri Objects/Related Concepts/a_Add related concept'))

WebUI.delay(2)

WebUI.click(findTestObject('RDM Objects/Thesauri Objects/Related Concepts/Concept Search/Search for a Concept'))

WebUI.setText(findTestObject('RDM Objects/Thesauri Objects/Related Concepts/Concept Search/input_s2id_autogen4_search'), 'asbestos')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('RDM Objects/Thesauri Objects/Related Concepts/Concept Search/input_s2id_autogen4_search'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('RDM Objects/Thesauri Objects/Related Concepts/Relation to Concept'))

//WebUI.click(findTestObject('Related Dropdown'))
//WebUI.sendKeys(findTestObject('Related Dropdown'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('RDM Objects/Thesauri Objects/Related Concepts/Test Click'))

WebUI.delay(2)

WebUI.click(findTestObject('RDM Objects/Thesauri Objects/Related Concepts/btn_Concept_Save'))

WebUI.delay(2)
WebUI.click(findTestObject('RDM Objects/Thesauri Objects/Value/a_Add value'))

WebUI.delay(2)
WebUI.click(findTestObject('RDM Objects/Thesauri Objects/Value/input_related_value_value'))

WebUI.setText(findTestObject('RDM Objects/Thesauri Objects/Value/input_related_value_value'), 'Test')

WebUI.delay(2)
WebUI.click(findTestObject('RDM Objects/Thesauri Objects/Value/Related Objects (Secondary)/button_Save'))

WebUI.delay(2)
WebUI.click(findTestObject('RDM Objects/RDM Pages/Related Objects/a_Collections (unused)'))

WebUI.click(findTestObject('RDM Objects/RDM Pages/div_Test_Collection'))

WebUI.click(findTestObject('RDM Objects/RDM Pages/div_Test_Collection'))

WebUI.click(findTestObject('RDM Objects/Collection Objects/Labels/h5_Labels'))

WebUI.click(findTestObject('RDM Objects/Collection Objects/Labels/a_Add label'))

WebUI.delay(2)

WebUI.click(findTestObject('RDM Objects/Thesauri Objects/Label/input_Concept_Label'))

WebUI.setText(findTestObject('RDM Objects/Thesauri Objects/Label/input_concept-label'), '49er')

WebUI.click(findTestObject('RDM Objects/Thesauri Objects/Label/label_Type'))

WebUI.click(findTestObject('RDM Objects/Thesauri Objects/Label/alt_Label'))

WebUI.click(findTestObject('RDM Objects/Thesauri Objects/Label/label_Save_Btn'))

WebUI.delay(2)

WebUI.click(findTestObject('RDM Objects/Collection Objects/Notes/a_Add note'))

WebUI.delay(2)

WebUI.click(findTestObject('RDM Objects/Collection Objects/Notes/Note_Value'))

WebUI.setText(findTestObject('RDM Objects/Collection Objects/Notes/textarea_note_value'), 'test')

WebUI.delay(2)

WebUI.click(findTestObject('RDM Objects/Collection Objects/Notes/note_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('RDM Objects/Collection Objects/Values/a_Add value'))

WebUI.delay(2)

//WebUI.click(findTestObject('RDM Objects/Collection Objects/Values/Related Objects (unused)/define_A_Value'))

WebUI.setText(findTestObject('RDM Objects/Collection Objects/Values/input_related_value_value'), 'test')

WebUI.click(findTestObject('RDM Objects/Collection Objects/Values/value_Save_Btn'))

WebUI.delay(2)

WebUI.click(findTestObject('RDM Objects/RDM Tool Menu/i_fa fa-chevron-down'))

WebUI.delay(2)

WebUI.click(findTestObject('RDM Objects/Collection Objects/Deletion/a_Delete Collection'))

WebUI.delay(2)

WebUI.click(findTestObject('RDM Objects/Collection Objects/Deletion/open_Deletion_Options'))

WebUI.setText(findTestObject('RDM Objects/Collection Objects/Deletion/delete_Collection'), 'Test')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('RDM Objects/Collection Objects/Deletion/delete_Collection'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('RDM Objects/Collection Objects/Deletion/button_Delete_Collection'))

WebUI.delay(2)

WebUI.click(findTestObject('RDM Objects/Thesauri Objects/Creation/a_Thesauri_Move_To'))
 
WebUI.delay(2)
WebUI.click(findTestObject('RDM Objects/RDM Tool Menu/button_Tools'))

WebUI.delay(2)
WebUI.click(findTestObject('RDM Objects/Thesauri Objects/Deletion/delete_Thesauri_Btn'))

WebUI.delay(2)
WebUI.click(findTestObject('RDM Objects/Thesauri Objects/Deletion/delete_Scheme_Search'))

WebUI.delay(2)
WebUI.setText(findTestObject('RDM Objects/Thesauri Objects/Deletion/input_Delete_Thesauri'), 'Test')

WebUI.delay(2)
WebUI.sendKeys(findTestObject('RDM Objects/Thesauri Objects/Deletion/input_Delete_Thesauri'), Keys.chord(Keys.ENTER))

WebUI.delay(2)
WebUI.click(findTestObject('RDM Objects/Thesauri Objects/Deletion/btn_Delete_Thesauri'))

WebUI.closeBrowser()