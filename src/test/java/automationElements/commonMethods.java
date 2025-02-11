package automationElements;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class commonMethods {
	
	private RespositoryParser parser;
	WebDriver driver;
	
	
	public commonMethods(WebDriver driver) {
		this.driver = driver;
		try {
			parser = new RespositoryParser("D://Job//automation//src//object.properties");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getTitle() {
		String title;
		WebElement element = driver.findElement(By.className("text-center"));
		title = element.getText();
		return title;
	}

}
