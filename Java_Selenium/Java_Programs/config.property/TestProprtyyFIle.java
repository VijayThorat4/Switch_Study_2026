package Testcase;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class TestProprtyyFIle {
	
	@Test
	public void testConfig() throws Exception {
		File src = new File("./Configuration/Config.property");
		FileInputStream fis = new FileInputStream(src);       // for reading the file
		
		Properties pro = new Properties();      // create object of property file
		pro.load(fis);	
		String url = pro.getProperty("URL");
		System.out.println("URL used for testing is " + url);
	}

}
