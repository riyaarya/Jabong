package Table_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Table_Boldr {
	
	@Test
	
	public void Table_boldr() {
		
		Config_Reader cr = new Config_Reader();
		
		System.setProperty("webdriver.gecko.driver", cr.getgecko_path());
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(cr.geturl());
		String test=driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
		System.out.println("Inner text"+test);
		
		
	}

}
