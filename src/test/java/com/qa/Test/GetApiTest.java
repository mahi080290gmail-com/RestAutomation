package com.qa.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.client.RestClient;

public class GetApiTest extends TestBase  {
	
	public GetApiTest() throws FileNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}
	String url;
	RestClient restclient;
	String serviceurl;
	String apiurl;
	
	@BeforeMethod
	public void setup() throws FileNotFoundException
	{
		TestBase testbase=new TestBase();
		serviceurl=prop.getProperty("URL");
		apiurl=prop.getProperty("ServiceURL");
		url=serviceurl+apiurl;
		
	}
	@Test
	public void getTest() throws ClientProtocolException, IOException
	{
		restclient=new RestClient();
		restclient.get(url);
	}

}
