import java.awt.event.*;
import java.awt.*;
public class Exc1 extends Frame implements MouseListener
{ 
    Button b;
    String msg;
    int x=100,y=100;
    Exc1()
    {
        msg="Click the above button";
        FlowLayout f1=new FlowLayout();
        setLayout(f1);
        b=new Button("Click Here!!");
        b.addMouseListener(this);
        add(b);
        setVisible(true);
        setSize(400,400);
    }
    public void paint(Graphics g)
    {
        g.drawString(msg,x,y);
    }
    public void mouseClicked(MouseEvent e)
    {   
    }
    public void mousePressed(MouseEvent e)
    {
        setBackground(Color.red);
        msg="Mouse Pressed ";
    }
    public void mouseReleased(MouseEvent e)
    {
        setBackground(Color.blue);
        msg="Mouse Released ";
    }
    public void mouseEntered(MouseEvent e)
    {
        setBackground(Color.yellow);
        msg="Mouse Entered ";
    }   
    public void mouseExited(MouseEvent e)
    {
        setBackground(Color.white);
        msg="Mouse Exited ";
    }
    public static void main(String[] args)
    {
        Exc1 m=new Exc1();
        m.setTitle("Jayesh Wagh");
    }
}
