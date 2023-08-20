import java.awt.*;
public class X1
{
    public static void main(String[] args)
    {
        Frame f = new Frame("Jayesh Wagh");
        List l = new List(3);
        l.setBounds(120,120,160,95);
        l.add("Summer");
        l.add("Winter");
        l.add("Rainy");
        f.add(l);

        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}