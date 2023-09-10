import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Exc2 extends JFrame implements MouseListener
{
    final JLabel res = new JLabel("0 Clicks Yet.....");
    int count = 0;
    Exc2()
    {
        res.setHorizontalAlignment(JLabel.CENTER);
        add(res, BorderLayout.CENTER);
        addMouseListener(this);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void mouseClicked(MouseEvent me)
    {
        res.setText((++count)+" clicks!");
    }
    public void mouseEntered(MouseEvent me)
    {
    }
    public void mouseExited(MouseEvent me)
    {
    }
    public void mousePressed(MouseEvent me)
    {
    }
    public void mouseReleased(MouseEvent me)
    {
    }
    public static void main(String args[])
    {
        Exc2 m=new Exc2();
        m.setTitle("Jayesh Wagh");
    }
}
