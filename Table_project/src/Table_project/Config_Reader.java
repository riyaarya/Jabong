package Table_project;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Config_Reader {
	Properties pro;
	
	public Config_Reader() {
		
		File src = new File("./Configuration/Config.property");
		try {
			FileInputStream fis = new FileInputStream(src);
			
			pro = new Properties();
			pro.load(fis);
			
			
		} catch (Exception e) {
			
			
       System.out.println(e.getMessage());		
       
		}
		
		
	}
	
	
	public String getgecko_path() {
		String path = pro.getProperty("geckopath");
		return path;
	}
	
	public String geturl() {
		String url = pro.getProperty("url");
		return url;
	}

}
