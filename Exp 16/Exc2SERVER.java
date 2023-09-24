import java.io.*;
import java.net.*;
public class Exc2SERVER 
{
    public static boolean isPrime(int number)
    {
        boolean isPrimeNum = false;
        int i = (int) Math.ceil(Math.sqrt(number));
        while(i>1)
        {
            if((number != i) && (number % i ==0))
            {
                isPrimeNum = false;
                break;
            }
            else if(!isPrimeNum)
            {
                isPrimeNum = true;
            }
            --i;
        }
        return isPrimeNum;
    }
    public static void main(String [] args) throws Exception
    {
        System.out.println("Jayesh Wagh");
        Socket s;
        int port = 9000;
        ServerSocket ss = new ServerSocket(port);
        System.out.println("Waiting for client");
        s = ss.accept();
        BufferedReader br = new BufferedReader(new 
        InputStreamReader(s.getInputStream()));
        PrintWriter pw = new PrintWriter(new 
        OutputStreamWriter(s.getOutputStream()));
        int num = Integer.parseInt(br.readLine());
        System.out.println("Number sent by client: " + num);
        pw.println(isPrime(num));
        pw.flush();
    }
}
