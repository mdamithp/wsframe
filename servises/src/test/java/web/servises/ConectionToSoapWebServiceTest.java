package web.servises;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.junit.Test;

public class ConectionToSoapWebServiceTest {
	
	String endpoint="http://www.webservicex.net/geoipservice.asmx";
	@Test
	public void getSoapResponceTest() throws ClientProtocolException, IOException{
		HttpResponse response=ConectionToSoapWebService.getSoapResponce(endpoint, "FirstTest");
		WriteResponceToFile write = new WriteResponceToFile();
		write.WriteToFile(response, "FirstTest.xml");
		assertEquals(200, response.getStatusLine().getStatusCode());
	

}
}