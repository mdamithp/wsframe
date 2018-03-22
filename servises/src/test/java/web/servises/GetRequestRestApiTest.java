package web.servises;

import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.junit.Test;
import static org.junit.Assert.*;

public class GetRequestRestApiTest {

	String Endpoint = "https://maps.googleapis.com/maps/api/timezone/json?";
	String Location = "=40.908133%2C77.047119&";
	String Timestamp = "=1458000000&";
	String Key = "=AIzaSyB83bZRQTaDV_NVZoTQO52h6Z9eG0znCMI";

	@Test
	public void getRestResponceTestOne() throws ClientProtocolException, IOException {
		HttpResponse response = GetRequestRestApi.getRestResponce(Endpoint, Location, Timestamp, Key);
		WriteResponceToFile write = new WriteResponceToFile();
		write.WriteToFile(response, "firsttest.json");
		assertEquals(200, response.getStatusLine().getStatusCode());

	}
	@Test
	public void getRestResponceTestTwo() throws ClientProtocolException, IOException {
		HttpResponse response = GetRequestRestApi.getRestResponce(Endpoint, Location, Timestamp, Key);
		WriteResponceToFile write = new WriteResponceToFile();
		write.WriteToFile(response, "socondtest.json");

	}
	

}
