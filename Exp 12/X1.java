import java.awt.*;
import javax.swing.*;
public class X1 extends JFrame 
{
    X1() 
    {
        setTitle("Jayesh Wagh");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPasswordField jpass = new JPasswordField(20);
        jpass.setEchoChar('#');
        add(jpass);
        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String[] args) 
    {
        new X1();
        
    }
}
