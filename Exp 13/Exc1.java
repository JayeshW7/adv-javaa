import java.awt.*; 
import java.awt.event.*; 
public class Exc1 extends WindowAdapter
{ 
    Frame f; 
    Label l; 
    Exc1()
    {
        f=new Frame("Jayesh Wagh"); 
        f.addWindowListener(this); 
        f.setSize(400,400); 
        f.setLayout(new FlowLayout()); 
        f.setVisible(true); 
        l=new Label(""); 
        f.add(l); 
    } 
    public void windowIconified(WindowEvent we)
    {
        l.setText("Iconified"); 
        System.out.println("Iconified"); 
    } 
    public void windowDeiconified(WindowEvent we)
    { 
        l.setText("Deiconified"); 
        System.out.println("Deiconified"); 
    } 
    public static void main(String[] args)
    { 
        new Exc1(); 
    } 
}
