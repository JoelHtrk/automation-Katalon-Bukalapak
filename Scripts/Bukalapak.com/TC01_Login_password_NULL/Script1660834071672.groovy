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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.bukalapak.com/')

WebUI.click(findTestObject('Bukalapak.com/Menu_Login'))

WebUI.setText(findTestObject('Bukalapak.com/Page_Account/input_Nomor handphone atau email'), 'kakanda.ndi23@gmail.com')

WebUI.click(findTestObject('Bukalapak.com/Page_Account/button_Lanjut'))

WebUI.verifyElementText(findTestObject('Bukalapak.com/Page_Account/input_Password'), '')

WebUI.click(findTestObject('Bukalapak.com/Page_Account/button_Login'))

WebUI.verifyElementText(findTestObject('Bukalapak.com/Notifikasi_Login/p_Password wajib diisi, ya'), 'Password wajib diisi, ya.')

WebUI.takeScreenshot()

