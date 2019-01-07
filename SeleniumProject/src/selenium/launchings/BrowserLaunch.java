package selenium.launchings;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Browser_Drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		//webdriver.chrome.driver
		//webdriver.gecko.driver
		//webdriver.ie.driver
		//webdriver.edge.driver
		

	}

}
