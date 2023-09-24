import java.net.*; 
import java.io.*; 
@SuppressWarnings("deprecation")
class Exc1
{ 
    public static void main(String[] args) throws Exception
    { 
        System.out.println("Jayesh Wagh"); 
        URL url=new URL("http://www.msbte.org.in/portal/about-msbte"); 
        System.out.println(url.getProtocol()); 
        System.out.println(url.getHost()); 
        System.out.println(url.getPort()); 
        System.out.println(url.getFile()); 
    } 
}
//javac -Xlint:deprecation Exc1.java
// to supress compilation warnings