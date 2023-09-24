import java.net.*;
import java.io.*;
public class Exc2CLIENT
{
    public static void main(String args[])throws Exception
    { 
        byte b[] = new byte[1024];
        FileInputStream f = new FileInputStream("D:\\ADV JAVA Assigns\\javaa.txt");
        DatagramSocket dsoc = new DatagramSocket();
        int i=0;
        while(f.available() != 0)
        {
            b[i]=(byte)f.read();
            i++;
        } 
        f.close();
        dsoc.send(new 
        DatagramPacket(b,i,InetAddress.getLocalHost(),2019));
    }
}
