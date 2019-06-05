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

// Open Men's Jerseys page in Browser
WebUI.openBrowser("https://www.rapha.cc/gb/en/mens-products/jerseys/category/jerseys")

//Select Classic Jersey II
WebUI.click(findTestObject('Test 02/Page_Mens Cycling Jerseys/div_Classic Jersey II'))

//Select Jersey Color
WebUI.click(findTestObject('Object Repository/Test 02/Page_Classic Jersey II/label_Black'))

//Select Jersey Size
WebUI.selectOptionByLabel(findTestObject('Object Repository/Test 02/Page_Classic Jersey II/select_Size'), 'Medium', true)

//Add to Basket
WebUI.click(findTestObject('Object Repository/Test 02/Page_Classic Jersey II/button_Add to basket'))

//Go to Basket
WebUI.click(findTestObject('Object Repository/Test 02/Page_Classic Jersey II/input_11000_checkout'))

//Proceed to Checkout
WebUI.click(findTestObject('Object Repository/Test 02/Page_Your Shopping Cart/a_Checkout'))

//Checkout as guest
WebUI.click(findTestObject('Object Repository/Test 02/Page_Proceed to Checkout/a_Guest Checkout'))

//Continue as Guest
WebUI.setText(findTestObject('Object Repository/Test 02/Page_Proceed to Checkout As Guest/input_Email_email'),'abc@gmail.com')
WebUI.click(findTestObject('Object Repository/Test 02/Page_Proceed to Checkout As Guest/button_Checkout as a Guest'))

//Enter personal details
WebUI.selectOptionByLabel(findTestObject('Object Repository/Test 02/Page_Checkout/select_Title'),'Mr',true)
WebUI.setText(findTestObject('Object Repository/Test 02/Page_Checkout/input_FIRST NAME'),'Jack')
WebUI.setText(findTestObject('Object Repository/Test 02/Page_Checkout/input_Last Name'),'Smith')
WebUI.setText(findTestObject('Object Repository/Test 02/Page_Checkout/input_Phone number'),'07394051359')
WebUI.setText(findTestObject('Object Repository/Test 02/Page_Checkout/input_Address line 1'),'50 Bradman Road')
WebUI.setText(findTestObject('Object Repository/Test 02/Page_Checkout/input_townCity'),'Enfield')
WebUI.setText(findTestObject('Object Repository/Test 02/Page_Checkout/input_Post Code'),'TW2 3TH')

//Continue to Shipping
WebUI.click(findTestObject('Object Repository/Test 02/Page_Checkout/button_Continue to Shipping'))

WebUI.delay(1)

//Continue to Payment
WebUI.click(findTestObject('Object Repository/Test 02/Page_Checkout/button_Continue to Payment'))