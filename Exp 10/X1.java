import java.awt.event.*; 
import java.awt.*; 
public class X1 extends Frame implements KeyListener
{ 
    Label l; 
    X1()
    { 
        l=new Label(); 
        l.setBounds(30,60,110,30); 
        addKeyListener(this);
        add(l); 
        setSize(500,500); 
        setLayout(null); 
        setVisible(true); 
    } 
    public void keyPressed(KeyEvent e) 
    { 
        l.setText("Key Pressed"); 
    }
    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}
    public static void main(String[] args) 
    {
        X1 m=new X1(); 
        m.setTitle("Jayesh Wagh");
    } 
} 
