package com.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
	public Properties prop;
	public TestBase() throws FileNotFoundException
	{
		FileInputStream fi=new FileInputStream("D:\\Mahesh\\RestApiAutomation\\src\\main\\java\\com\\qa\\config\\config.properties");
		prop=new Properties();
		try {
			prop.load(fi);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
