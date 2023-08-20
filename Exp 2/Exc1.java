import java.awt.*;
public class Exc1 extends Frame 
{
    public static void main(String[] args)
    {
        Frame f = new Frame("Jayesh Wagh");
        List l = new List(10);
        l.setBounds(120,120,160,95);
        l.add("Mumbai");
        l.add("Bengaluru");
        l.add("Pune");
        l.add("Ahemdabad");
        l.add("Chennai");
        l.add("Hyderabad");
        l.add("Kolkata");
        l.add("New Delhi");
        l.add("Nagpur");
        l.add("Nashik");

        f.add(l);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}