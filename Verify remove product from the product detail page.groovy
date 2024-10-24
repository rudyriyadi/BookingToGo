import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.saucedemo.com/')

// Wait for the input field to be visible
WebUI.waitForElementVisible(findTestObject('Page_Swag Labs/input_Swag Labs_user-name'), 10)

// Set text in username input field
WebUI.setText(findTestObject('Page_Swag Labs/input_Swag Labs_user-name'), 'standard_user')

// Set text in password input field
WebUI.setText(findTestObject('Page_Swag Labs/input_Swag Labs_password'), 'secret_sauce')

// Click on login button
WebUI.waitForElementClickable(findTestObject('Page_Swag Labs/input_Swag Labs_login-button'), 10)

WebUI.click(findTestObject('Page_Swag Labs/input_Swag Labs_login-button'))

WebUI.click(findTestObject('Page_Swag Labs/button_Add to cart (1)'))

WebUI.click(findTestObject('Page_Swag Labs/div_Sauce Labs Backpack'))

WebUI.click(findTestObject('Page_Swag Labs/btn btn_secondary btn_small btn_inventory'))

WebUI.click(findTestObject('Page_Swag Labs/a_1'))

WebUI.verifyElementNotVisible(findTestObject('Page_Swag Labs/div_1Sauce Labs Backpackcarry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.29.99Remove'))

WebUI.closeBrowser()

