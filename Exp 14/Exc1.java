import java.net.*; 
import java.util.*; 
public class Exc1
{ 
    public static void main(String[] args) throws Exception
    { 
        System.out.println("Jayesh Wagh");
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter hostname to retrive its ip address."); 
        String hostname=sc.nextLine(); 
        InetAddress inet=InetAddress.getByName(hostname); 
        System.out.println("Host Name:"+inet.getHostName()+"\nIP Address:"+inet.getHostAddress()); 
    } 
}
