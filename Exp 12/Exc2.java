import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Exc2 implements ActionListener
{
    JTextField tf , tf1, tf2 ;
    JButton b;
    Exc2()
    {
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setTitle("Jayesh Wagh");
        f.setSize(250,250);
        f.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        JLabel jl = new JLabel("Enter 1st Number:"); 
        tf = new JTextField(5);
        JLabel jl1 = new JLabel("Enter 2nd Number:");
        tf1 = new JTextField(5);
        b = new JButton("Addition");
        tf2 = new JTextField(15);
        b.addActionListener(this);
        f.add(jl); f.add(tf); f.add(jl1); f.add(tf1); f.add(b); f.add(tf2);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b)
        {
            String str1 = tf.getText();
            double fn = Double.parseDouble(str1);
            double sn = Double.parseDouble(tf1.getText());
            tf2.setText("Sum is " + (fn+sn));
        }
    }
    public static void main(String[] args) 
    {
        Exc2 m = new Exc2();
    }
}