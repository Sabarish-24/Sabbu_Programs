import java.io.*;
import java.net.*;
import java.util.*;
import javax.servlet.http.*;
import javax.servlet.*;

public class post{
    public static void main(String args[]) throws IOException{
        try{
            URL u = new URL("http://localhost:8080/hello/hello");
            HttpURLConnection con = (HttpURLConnection) u.openConnection();
            String name="uname=Fon";
            byte[] b = name.getBytes();
            con.setRequestMethod("POST");
            con.setDoOutput(true);
            OutputStream os = con.getOutputStream();
            os.write(b);
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String c;
            while((c=br.readLine())!=null){
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