package com.qa.client;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;


public class RestClient {
	public CloseableHttpResponse get(String url) throws ClientProtocolException, IOException
	{
		CloseableHttpClient httpclient=HttpClients.createDefault();
		HttpGet httpget=new HttpGet(url);
		CloseableHttpResponse closabalehttpRes=httpclient.execute(httpget);
		int statuscode=closabalehttpRes.getStatusLine().getStatusCode();
		System.out.println("statuscode------->"+statuscode);
		String Response=EntityUtils.toString(closabalehttpRes.getEntity());
		JSONObject jsonresponse=new JSONObject(Response);
		System.out.println("jsonresponse------->"+jsonresponse);
		Header[] headerarray=closabalehttpRes.getAllHeaders();
		HashMap<String, String> alheaders=new HashMap<String,String>();
		for(Header header:headerarray)
		{
			alheaders.put(header.getName(), header.getValue());
		}
		System.out.println("allheaders----->"+alheaders);
		return closabalehttpRes;
		
	}
	

}
