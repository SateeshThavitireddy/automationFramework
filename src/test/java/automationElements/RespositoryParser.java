package automationElements;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

public class RespositoryParser {

	private FileInputStream stream;
	private String RepositoryFile;
	private Properties propertyFile = new Properties();

	public RespositoryParser(String fileName) throws IOException
	{
		this.RepositoryFile = fileName;
		stream = new FileInputStream(RepositoryFile);
		propertyFile.load(stream);
	}

	public String getbjectLocator(String locatorName)
	{
		String locatorProperty = propertyFile.getProperty(locatorName);
		
		return locatorProperty;
	}
}
