import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import utility.Config_Reader;

public class Test_demo_Site {
	
	@Test
	
	public void testing_Sits() {
		
		Config_Reader cr = new Config_Reader();
		
		System.setProperty("webdriver.gecko.driver", cr.getgeckopath());
		WebDriver driver = new FirefoxDriver();
		driver.get(cr.geturl());
		
	
		
		
		
	}

}
