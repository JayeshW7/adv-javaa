import java.awt.*;
public class Exc2    extends Frame 
{
    public static void main(String[] args)
    {
        Frame f = new Frame("Jayesh Wagh");
        List l = new List(10);
        l.setBounds(120,120,160,95);
        l.add("Times of India");
        l.add("Hindustan Time");
        l.add("Lokmat");
        l.add("The New York Times");
        l.add("Chicago Tribute");
        l.add("Los Angeles Times");
        l.add("USA Today");
        l.add("News Day");
        l.add("The Economic Times");
        l.add("Navbharat");

        f.add(l);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}