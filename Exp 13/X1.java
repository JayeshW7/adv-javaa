import java.awt.*; 
import java.awt.event.*; 
public class X1
{ 
    Frame f; 
    X1()
    { 
        f=new Frame("Window Adapter"); 
        f.addWindowListener(new WindowAdapter()
        { 
            public void windowClosing(WindowEvent e)
            { 
                f.dispose(); 
            } 
        }
    ); 
    f.setSize(400,400); 
    f.setLayout(null); 
    f.setVisible(true);
    f.setTitle("Jayesh Wagh");
} 
    public static void main(String[] args)
    { 
        new X1(); 
    } 
}
