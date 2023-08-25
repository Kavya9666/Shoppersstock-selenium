package genericLibraries;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverUtility 
{
	private WebDriver driver;
	public void navigateToApp(String browser,String url,long time)
	{
		switch(browser)
		{
		case "chrome":
			System.setProperty("Webdriver.chrome.driver","./src/main/resuurces/chromedriver.exe");
			ChromeOptions options=new ChromeOptions();
			HashMap<String,Boolean> prefs=new HashMap<String,Boolean>();
			prefs.put("autofill.profile_enabled", false);
			options.setExperimentalOption("prefs", prefs);
			driver = new ChromeDriver(options);
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
			default:
				System.out.println("Invalid browser info");
			
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
	}
	
}
