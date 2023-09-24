import java.io.*;
import java.net.*;
public class Exc2CLIENT
{
    public static void main(String [] args) throws Exception
    {
        System.out.println("Jayesh Wagh");
        int port = 9000;
        Socket s;
        BufferedReader br = new BufferedReader(new 
        InputStreamReader(System.in));
        
        s = new Socket(InetAddress.getLocalHost(),port);
        PrintWriter pw = new PrintWriter(new 
        OutputStreamWriter(s.getOutputStream()));
        BufferedReader brl = new BufferedReader(new 
        InputStreamReader(s.getInputStream()));
        System.out.print("Enter any number: ");
        String str = br.readLine();
        pw.println(str);
        pw.flush();
        String msg = brl.readLine();
        if(msg.equals("true"))
        {      
            System.out.println("It is a prime number");
        }
        else
        {
            System.out.println("It is not a prime number");
        }
    }
}
