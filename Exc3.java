import javax.swing.*;
import java.awt.*; 
import java.awt.event.*; 
public class Exc3 extends JFrame implements MouseMotionListener
{ 
    Exc3()
    { 
        addMouseMotionListener(this); 
        setSize(500,500); 
        setLayout(null); 
        setVisible(true); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    } 
    public void mouseDragged(MouseEvent e) 
    { 
        Graphics g=getGraphics(); 
        g.setColor(Color.YELLOW); 
        g.fillOval(e.getX(),e.getY(),20,20); 
    } 
    public void mouseMoved(MouseEvent e) 
    {
        Graphics g1 = getGraphics();
        g1.setColor(Color.RED);
        g1.fillOval(e.getX(),e.getY(),20,20);
    } 
    public static void main(String[] args) 
    { 
        Exc3 m=new Exc3(); 
        m.setTitle("Jayesh Wagh"); 
    } 
}