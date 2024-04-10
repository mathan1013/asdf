package factory;

import java.io.FileReader;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;




public class BaseClass {
	public static WebDriver driver;
	public static Properties p;
	public static Logger logger;
	
	public static WebDriver Setup()
	{
		if(System.getProperties().getProperty("browser").equalsIgnoreCase("chrome"))
			{
			
			driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.navigate().to(p.getProperty("url"));
			driver.manage().window().maximize();
			
			}
			else if(System.getProperties().getProperty("browser").equalsIgnoreCase("edge"))
			{
				driver=new EdgeDriver();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.navigate().to(p.getProperty("url"));
				driver.manage().window().maximize();
			
			}
			else
			{
				System.out.println("No valid browser found...");
			}
		
		
		return driver;
				
	}
	public static WebDriver driver()
	{
	return driver;
	}
	
	public static Properties getProperties() throws Exception
	{
		FileReader file=new FileReader(System.getProperty("user.dir")+"C:\\Users\\2318517\\eclipse-workspace\\cucumber\\src\\test\\resources\\config.properties");
		p=new Properties();
		p.load(file);
		return p;
	}
	
	public  void quitBrowser()
	{
		driver.quit();
	}
	
	public static Logger getLogger() 
	{		 
		logger=LogManager.getLogger(); //Log4j
		return logger;
	}
	
	


}
