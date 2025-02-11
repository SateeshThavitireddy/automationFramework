package automationElements;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkBoxElement {
	WebDriver driver;
	private RespositoryParser parser;
	public checkBoxElement(WebDriver driver) {
		this.driver = driver;
		try {
			parser = new RespositoryParser("D://Job//automationFramework//src//test//java//textBox.properties");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickArrowButton() {
		WebElement element = driver.findElement(By.tagName("title"));
		element.click();
	}
	
	public String verifyText(String textValue) {
	
		String value = null;
		WebElement element = driver.findElement(By.xpath("//input[@id="+parser.getbjectLocator(textValue)+"]/../span[@class='rct-title']"));
		value = element.getText();
		
		return value;
		
	}
}
