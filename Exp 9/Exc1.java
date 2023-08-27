import java.awt.*;
import javax.swing.*;
public class Exc1 extends JFrame
{
    JProgressBar pb;
    Exc1(String s)
    {
        super(s);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(490,490);
        pb=new 
        JProgressBar(SwingConstants.HORIZONTAL,0,100);
        pb.setStringPainted(true);
        pb.setValue(0);
        pb.setBounds(150,200,200,30);
        add(pb);
    }
    void iterate()
    {
        int i=0;
        while(i<=100)
        {
            i+=5;
            pb.setValue(i);
            try
            {
                Thread.sleep(420);
            }
            catch(Exception e)
            {
            }
        }
    }
    public static void main(String[] args)
    {
        Exc1 p=new Exc1("Jayesh Wagh");
    p.iterate();
    }
}