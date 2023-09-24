import java.io.*;
import java.net.*;
class Exc1CLIENT 
{
    public static void main(String args[])throws Exception 
    {
        BufferedReader user_ip=new 
        BufferedReader(new InputStreamReader(System.in));
        try
        {
            DatagramSocket clientsocket=new DatagramSocket();
            InetAddress ip=InetAddress.getLocalHost();
            byte[] sendData;
            byte[] receiveData=new byte[1024];
            while(true)
            {
                System.out.print("Client:");
                String sentence = user_ip.readLine();
                sendData=sentence.getBytes();
                DatagramPacket sendPacket=new 
                DatagramPacket(sendData,sendData.length,ip,1234);
                clientsocket.send(sendPacket);
                DatagramPacket receivePacket=new 
                DatagramPacket(receiveData,receiveData.length);
                clientsocket.receive(receivePacket);
                String serversentence=new String 
                (receivePacket.getData(),0,receivePacket.getLength());
                System.out.println("Server: " + serversentence);
            } 
        }
        catch(Exception e){}
    } 
}