import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.testobject.SelectorMethod

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join
import org.testng.asserts.SoftAssert
import com.kms.katalon.core.testdata.CSVData
import org.openqa.selenium.Keys as Keys

SoftAssert softAssertion = new SoftAssert();
WebUI.openBrowser('https://www.google.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.google.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("https://testing-assessment-foh15kew9-edvora.vercel.app/s")
selenium.click("xpath=//button[@type='button']")
selenium.click("name=fullname")
selenium.type("name=fullname", "test1")
selenium.click("name=mobileNumber")
selenium.type("name=mobileNumber", "12345")
selenium.click("name=address")
selenium.type("name=address", "1123123123")
selenium.click("xpath=//div[@id='__next']/div/main/div/div/div[2]/div/div/div[2]/div[2]/div[2]/select")
selenium.select("xpath=//div[@id='__next']/div/main/div/div/div[2]/div/div/div[2]/div[2]/div[2]/select", "label=female")
selenium.click("name=dateOfBirth")
selenium.type("name=dateOfBirth", ("1970-02-01").toString())
selenium.type("name=dateOfBirth", ("1970-02-02").toString())
selenium.type("name=dateOfBirth", ("1970-02-22").toString())
selenium.type("name=dateOfBirth", ("0002-02-22").toString())
selenium.type("name=dateOfBirth", ("0022-02-22").toString())
selenium.type("name=dateOfBirth", ("0222-02-22").toString())
selenium.type("name=dateOfBirth", ("2222-02-22").toString())
selenium.click("xpath=//div[@id='__next']/div/main/div/div/div/div/div/button[2]")
