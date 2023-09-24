import java.net.*;
import java.io.*;
public class X1CLIENT
{
    public static void main(String[] args) throws IOException 
    {
        System.out.println("Jayesh Wagh");
        Socket s = new Socket("localhost" , 2019);

        BufferedReader br = new BufferedReader
        (
            new InputStreamReader(System.in)
        );
        System.out.print("Enter Username and Password: ");
        String user = br.readLine();
        String pass = br.readLine();
        OutputStream os = s.getOutputStream();
        PrintStream ps = new PrintStream(os);
        ps.println(user);
        ps.println(pass);
        BufferedReader br1 = new BufferedReader(
        new InputStreamReader(s.getInputStream()));
        String res = br1.readLine();
        System.out.println(res);
    }
}
