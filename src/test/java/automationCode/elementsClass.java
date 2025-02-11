package automationCode;

import org.testng.annotations.Test;

import automationElements.checkBoxElement;
import automationElements.commonMethods;
import automationElements.textBoxElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class elementsClass {

	WebDriver driver = new ChromeDriver();
	commonMethods common = new commonMethods(driver);
	textBoxElement textBox = new textBoxElement(driver);
	checkBoxElement checkbox = new checkBoxElement(driver);
	String title;
	@BeforeTest
	public void beforeTest() {

		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
	}

	@Test
	public void verifyTitleValue() {
		Reporter.log("Entered the verifyTitleValue Method");
	    title = common.getTitle();
		System.out.println("The is title value : " + title);
		Assert.assertEquals("Text Box", title, "The title should be Text Box");
		Reporter.log("Exited the verifyTitleValue method");
	}

	@Test
	public void enterFieldValues() {
		Reporter.log("Entered the enterFieldValues Method");
		textBox.enterFieldValue("FullName", "XYZ");
		textBox.enterFieldValue("Email", "abc@gmail.com");
		textBox.enterFieldValue("Current_Address", "XYZ Apartment");
		textBox.enterFieldValue("Permanent_Address", "XYZ Apartment");
		textBox.clickButton("submit");
		Reporter.log("Exited the enterFieldValues Method");
	}
	
	@Test
	public void verifyCheckBoxTitle() {
		Reporter.log("Entered the verifyCheckBoxTitle Method");
		title = common.getTitle();
		System.out.println("The is title value : " + title);
		Assert.assertEquals("Check Box", title, "The title should be Check Box");

		Reporter.log("Exited the verifyCheckBoxTitle Method");
	}
	@Test
	public void selectCheckBoxs() {
		Reporter.log("Entered the selectCheckBoxs Method");
		checkbox.clickArrowButton();
		Reporter.log("Exited the selectCheckBoxs Method");
	}
	
	@AfterTest
	public void afterTest() {

		driver.quit();
	}

}
