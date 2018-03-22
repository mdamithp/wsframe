package web.servises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import org.apache.http.HttpResponse;

public class WriteResponceToFile {
	
	public void WriteToFile(HttpResponse response,String filename) throws IOException{
	
	BufferedReader br=new BufferedReader(new InputStreamReader(response.getEntity().getContent()) );
	String line="";
	StringBuffer sb=new StringBuffer();
	while((line=br.readLine())!=null){
		sb.append(line);
	}
	PrintWriter pw=new PrintWriter(System.getProperty("user.dir")+"//responcexml//"+filename);
	pw.write(sb.toString());
	pw.close();
	pw.flush();
	
	
}


}
