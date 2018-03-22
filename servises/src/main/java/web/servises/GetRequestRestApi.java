package web.servises;

import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class GetRequestRestApi {

	public static HttpResponse getRestResponce(String Endpoint,String Location,String Timestamp, String Key ) throws ClientProtocolException, IOException{
		HttpClient  client=HttpClientBuilder.create().build();
		HttpGet request=new HttpGet(Endpoint+"location"+Location+"timestamp"+Timestamp+"key"+Key);
		HttpResponse response=client.execute(request);
		return response;
	}
	
	//HttpPost
			//HttpPut
			//HttpDelete
	
	
}