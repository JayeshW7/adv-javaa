import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Exc1 extends JFrame implements ActionListener
{
    JPasswordField t2;
    JTextField t1;
    JLabel l0,l1,l2,l3;
    JButton b;
    String msg;
    Exc1()
    {
        setSize(350,350);
        setVisible(true);
        setLayout(new 
        FlowLayout(FlowLayout.CENTER,20,20));
        l0=new JLabel("WELCOME TO USER AUTHENTICATION!!");
        l1=new JLabel("Enter Username : ");
        t1=new JTextField(20);
        l2=new JLabel("Enter Password : ");
        t2=new JPasswordField(20);
        t2.setEchoChar('#');
        b=new JButton("LOGIN");
        b.addActionListener(this);
        l3=new JLabel("");
        add(l0);add(l1);add(t1);add(l2);add(t2);add(l3);add(b);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        String s=new String(t2.getPassword());
        if(s.equals("COTPOLY")==true)
        {
            l3.setText("Authentication Successful Welcome "+t1.getText());
        }
        else
        {
            l3.setText("Authentication Failed. Invalid User");
        }
    }
    public static void main(String[] args) 
    {
        Exc1 t=new Exc1 ();
        t.setTitle("Jayesh Wagh");
    }
}