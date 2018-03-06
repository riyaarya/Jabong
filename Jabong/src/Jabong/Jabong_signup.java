package Jabong;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Jabong_signup {
	@Test(dataProvider = "Jabong_signup")


	public void Jabong_TO_signup(String fname,String lname,String email,String pass, String mob) 
	{
		Config_Reader cr = new Config_Reader();
		
		System.setProperty("webdriver.gecko.driver", cr.getgecko_path());
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(cr.geturl());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.getWindowHandles();
		//driver.switchTo().alert().dismiss();
		driver.findElement(By.className("dialogify")).click();
		driver.findElement(By.id("firstname")).sendKeys(fname);
		driver.findElement(By.id("lastname")).sendKeys(lname);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pwd")).sendKeys(pass);
		driver.findElement(By.id("mobile")).sendKeys(mob);

		driver.quit();
		
	}
	
	@DataProvider(name = "Jabong_signup")
	
	public Object[][] pass_Data(){
		
		Config_Reader cr = new Config_Reader();
		Jabong_excel je = new Jabong_excel(cr.getepath());
		int row = je.getrow_count();
		
		Object[][] arr = new Object[row][5];
		for(int i=0; i<row; i++) {
		
			arr[i][0] = je.get_data(0,i,0);
			arr[i][1] = je.get_data(0,i,1);
			arr[i][2] = je.get_data(0,i,2);
			arr[i][3] = je.get_data(0,i,3);
			arr[i][4] = je.get_data(0,i,4);


		}
		
		return arr;
		
	}

}
