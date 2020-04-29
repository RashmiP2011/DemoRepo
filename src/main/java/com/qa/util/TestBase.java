package com.qa.util;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()
	{
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\RashmiP2\\eclipse-workspace\\FreeCrmBDDFramwork\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(fis);
		}
		catch(IOException e)
		{
			e.getMessage();
		}
	}
	
	public static void initialization()
	{
		String browsername = prop.getProperty("browser");
		
		if(browsername.equals("Chrome"))
		{
			 System.setProperty("webdriver.chrome.driver","C:/Users/RashmiP2/Downloads/chromedriver_win32/chromedriver.exe");
			 driver = new ChromeDriver();
		}
		
		else if (browsername.equals("IE"))
		{
			 System.setProperty("webdriver.ie.driver","C:/Users/RashmiP2/Downloads/IEDriverServer_x64_3.150.1/IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
		}	
		
		
		else if (browsername.equals("FF"))
		{
			 System.setProperty("webdriver.gecko.driver","C:/Users/RashmiP2/Downloads/geckodriver-v0.26.0-win64/geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		
		driver.get(prop.getProperty("url"));
		
	}

}
