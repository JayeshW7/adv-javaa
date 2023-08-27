import javax.swing.*;
import java.awt.*;
public class Exc1 extends JFrame
{
    String[] states={"Tamil Nadu","Mizoram","Assam","Odisha","Rajasthan","Sikkim", "Andhra Pradesh", "Maharashtra", "Kerala", "Punjab" };
    Exc1(String s){
    super(s);
    JComboBox<String> jc=new JComboBox<String>(states);
    add(jc);
    setLayout(new FlowLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    setSize(500,500);
    }
    public static void main(String[] args)
    {
        new Exc1("Jayesh Wagh");
    }
}
