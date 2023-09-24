import java.net.*; 
import java.io.*; 
import java.util.*; 
@SuppressWarnings("deprecation")
class Exc2
{ 
    public static void main(String[] args) throws Exception
    { 
        System.out.println("Jayesh Wagh"); 
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter url to retrive information"); 
        String u=sc.nextLine(); 
        URL url=new URL(u); 
        URLConnection urlcon=url.openConnection(); 
        System.out.println("Date:"+ new Date(urlcon.getDate())); 
        System.out.println("Content Type:"+ urlcon.getContentType()); 
        System.out.println("Content Length:"+ urlcon.getContentLength()); 
    } 
}

