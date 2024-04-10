package stepDefinitions;

import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.BeforeStep;


public class hooks{
	WebDriver driver;
	Properties p;
	BaseClass bc = new BaseClass();
	
	@Before
	
	public void setupp()throws Exception
	{
		driver=BaseClass.Setup();
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		
	}
	
	@After
	
	public void quitt()throws Exception
	{
		driver.quit();
	}
	
	
	@BeforeStep
	
	public void screenShot()
	{
		driver=BaseClass.screenShot();
		
	}
	
	

}
