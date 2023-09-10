import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Exc1 extends JFrame implements ActionListener
{
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton b1;
    public Exc1()
    {
        l1=new JLabel("Enter 1st Number"); 
        l2=new JLabel("Enter 2nd Number");
        l3=new JLabel();
        t1=new JTextField(10);
        t2=new JTextField(10);
        b1=new JButton("Multiply");
        b1.addActionListener(this);
        add(l1);add(t1);add(l2);add(t2);add(b1);add(l3);
        setLayout(new FlowLayout());
        setSize(500,500);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        int a,b,c;
        a=Integer.parseInt(t1.getText());
        b=Integer.parseInt(t2.getText());
        c=a*b;
        l3.setText("Multiplication of the two number is:-"+Integer.toString(c));
    }
    public static void main(String[] args)
    {
        Exc1 m=new Exc1();
        m.setTitle("Jayesh Wagh");
    }
}
