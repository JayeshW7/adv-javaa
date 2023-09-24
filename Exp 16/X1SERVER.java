import java.net.*;
import java.io.*;
public class X1SERVER
{
    public static void main(String[] args) throws IOException
    { 
        System.out.println("Jayesh Wagh");
        ServerSocket s = new ServerSocket(2019);
        System.out.println("Server Started, waiting for client");
        
        Socket s1 = s.accept();
        BufferedReader br = new BufferedReader( new 
        InputStreamReader(s1.getInputStream()));
        
        String user = br.readLine();
        String pass = br.readLine();
        OutputStream out = s1.getOutputStream();
        PrintStream ps = new PrintStream(out);
        if(user.equals("JayW07") && pass.equals("Kraken"))
        {
            ps.println("Validate Successfull");
        }
        else
        {
            ps.println("Validate Un-Successfull");
        }
    }
}
