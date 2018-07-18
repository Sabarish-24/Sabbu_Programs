import java.io.*;
import java.net.*;
import java.util.*;
import javax.servlet.http.*;
import javax.servlet.*;

public class get{
    public static void main(String args[]) throws IOException{
        try{
            URL u = new URL("http://localhost:8080/examples/servlets/servlet/HelloWorldExample");
            HttpURLConnection con = (HttpURLConnection) u.openConnection();
            con.setRequestMethod("GET");
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String c;
            while((c=br.readLine()) != null){
                System.out.println(c);
            }
            System.out.println(con.getResponseCode());
            System.out.println(con.getResponseMessage());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
} 