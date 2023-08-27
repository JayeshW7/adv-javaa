import javax.swing.*;
import java.awt.*;
class Exc2 extends JFrame
{
    JComboBox<String> jc;
    JScrollPane sp;
    String[] 
    java={"Fields","Methods","Constructors","Blocks", "Polymorphism", "Inheritance", "Encapsulation", "Abstraction", "Swing" , "AWT", "Applet"};
    Exc2(String s)
    {
        super(s);
        setSize(350,350);
        setVisible(true);
        setLayout(new FlowLayout());
        jc=new JComboBox<String>(java);
        jc.setMaximumRowCount(7);
        sp=new JScrollPane(jc);
        add(sp);
    }
    public static void main(String[] args)
    {
        new Exc2("Jayesh Wagh");
    }
}
