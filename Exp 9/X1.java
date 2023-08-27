import java.awt.*;
import javax.swing.*;
public class X1 extends JFrame
{
    JProgressBar pb;
    X1(String s)
    {
        super(s);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450,450);
        pb=new JProgressBar(0,100);
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
                Thread.sleep(500);
            }
            catch(Exception e)
            {
            }   
        }
    }
    public static void main(String[] args)
    {
            X1 p=new X1("Jayesh Wagh");
            p.iterate(); 
    } 
}    
