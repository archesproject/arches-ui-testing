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
import org.junit.After as After
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Authentication/Login To RDM'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('RDM Objects/RDM Pages/div_Test'))

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

WebUI.closeBrowser()

