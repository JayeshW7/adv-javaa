import java.io.*;
import java.net.*;
class Exc1SERVER
{
    public static void main(String args[])throws Exception
    {
        BufferedReader user_ip=new 
        BufferedReader(new InputStreamReader(System.in));
        try
        {
            DatagramSocket serverSocket=new DatagramSocket(1234);
            byte[] sendData;
            byte[] receiveData=new byte[1024];
            while(true)
            {
                DatagramPacket receivePacket=new DatagramPacket(receiveData, 
                receiveData.length);
                serverSocket.receive(receivePacket);
                String sentence=new 
                String(receivePacket.getData(),0,receivePacket.getLength());
                InetAddress ip=receivePacket.getAddress();
                int port=receivePacket.getPort();
                System.out.println("Client: " +sentence);
                System.out.print("Server:");
                String serversentence=user_ip.readLine();
                sendData=serversentence.getBytes();
                DatagramPacket sendPacket=new 
                DatagramPacket(sendData,sendData.length,ip,port);
                serverSocket.send(sendPacket);
            } 
        }
        catch(Exception e){}
    } 
}