import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class Main {

    public static void main(String[] args){


        //Creating a HttpClient object
        CloseableHttpClient httpclient = HttpClients.createDefault();

        //Creating a HttpGet object
        HttpGet httpget = new HttpGet(args[0]);


        //Printing the method used
        System.out.println("Request Type: "+httpget.getMethod());

        //Executing the Get request
        try {
            HttpResponse httpresponse = httpclient.execute(httpget);
            int responseCode = httpresponse.getStatusLine().getStatusCode();
            System.out.println("Response code: " + responseCode);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
