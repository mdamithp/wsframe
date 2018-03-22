package web.servises;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.HttpClientBuilder;

public class ConectionToSoapWebService {

	public static HttpResponse getSoapResponce(String endpoint, String testfile) throws ClientProtocolException, IOException{
		File requestfile=new File(System.getProperty("user.dir")+"//requestxml//"+testfile+".xml");
		HttpClient client=HttpClientBuilder.create().build();
		
		HttpPost post=new HttpPost(endpoint);
		
		post.setEntity(new InputStreamEntity(new FileInputStream(requestfile)));
		post.setHeader("Content-Type","text/xml");
		 
		
		HttpResponse responce= client.execute(post);
		return responce;
		
	}
	
	

}
