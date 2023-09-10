import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Exc3 extends JFrame implements ActionListener
{
    JPasswordField t2;
    JTextField t1;
    JLabel l1,l2,l3;
    JButton b;
    String msg;
    Exc3()
    {
        setSize(350,350);
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        l1=new JLabel("Enter Username : ");
        t1=new JTextField(20);
        l2=new JLabel("Enter Password : ");
        t2=new JPasswordField(20);
        t2.setEchoChar('*');
        b=new JButton("SUBMIT");
        b.addActionListener(this);
        l3=new JLabel("");
        add(l1);add(t1);add(l2);add(t2);add(l3);add(b);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    { String s=new String(t2.getPassword());
    if(s.length()<6)
        {
            l3.setText("Password length is less than 6 characters");
            t2.setText("");
        }
        else
        {
            l3.setText("User = "+t1.getText()+" Accepted. WELCOME !!!");
        }
    }
    public static void main(String[] args) 
    {
        Exc3 t=new Exc3();
        t.setTitle("Jayesh Wagh");
    }
}
