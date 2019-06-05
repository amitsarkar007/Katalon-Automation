import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

// Open Browser
WebUI.openBrowser("https://www.rapha.cc/gb/en/")

//Click My Account Icon
WebUI.click(findTestObject('Test 01/Page_Homepage/My Account icon'))

//Wait for UI to load
WebUI.delay(1)

//Click Sign in Button
WebUI.click(findTestObject('Test 01/Page_Homepage/a_Sign in'))

//Select username field and enter username
WebUI.setText(findTestObject('Test 01/Page_Login/input_Email_j_username'),'raphatest@test.cc')

//Select password field and enter password
WebUI.setText(findTestObject('Test 01/Page_Login/input_Password_j_password'),'T3st2019')

//Click Submit button
WebUI.click(findTestObject('Test 01/Page_Login/button_Sign in'))

