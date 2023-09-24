import java.net.*;
@SuppressWarnings("deprecation")

class URLDEMO {
    public static void main(String[] args) {
        try {
            URL hp = new URL("https://www.javapoint.com/javafx-tutorial");
            System.out.println("Protocol: " + hp.getProtocol());
            System.out.println("Port: " + hp.getPort());
            System.out.println("Host: " + hp.getHost());
            System.out.println("File: " + hp.getFile());
            System.out.println("Exit: " + hp.toExternalForm());
        } 
        catch (MalformedURLException e) // To get rid of URL error
        {
            // Handle the MalformedURLException
            System.err.println("Malformed URL: " + e.getMessage());
        }
    }
}
