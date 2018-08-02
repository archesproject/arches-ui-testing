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

WebUI.callTestCase(findTestCase('Authentication/Login To RDM'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.click(findTestObject('RDM Objects/RDM Pages/a_Collections'))

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

WebUI.closeBrowser()

