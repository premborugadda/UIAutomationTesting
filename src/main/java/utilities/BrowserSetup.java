package utilities;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserSetup {
	
	public static WebDriver webDriver;
	public static DesiredCapabilities caps = new DesiredCapabilities();
	
	public static WebDriver openBrowser(String url) throws IOException {		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\swaro\\eclipse-workspace\\UIAutomationTesting\\src\\test\\resources\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:/Users/swaro/Documents/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		
		Map<String, Object> prefs=new HashMap<String,Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		//1-Allow, 2-Block, 0-default

		options.setExperimentalOption("prefs",prefs);	
		caps.setBrowserName("chrome");
		caps.setCapability(ChromeOptions.CAPABILITY, options);
		webDriver = new ChromeDriver(options);	
		
		webDriver.get(url);
		webDriver.manage().window().maximize();
		return webDriver;
	}
	
	public void closeDriver() {
		webDriver.close();
		webDriver.quit();

	}
	
}

