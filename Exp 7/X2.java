import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
public class X2 extends JFrame
{
public X2()
{
    DefaultMutableTreeNode india = new 
    DefaultMutableTreeNode("India");
    DefaultMutableTreeNode mh = new 
    DefaultMutableTreeNode("Maharashtra");
    mh.add(new DefaultMutableTreeNode("Mumbai"));
    mh.add(new DefaultMutableTreeNode("Pune"));
    mh.add(new DefaultMutableTreeNode("Nashik"));
    mh.add(new DefaultMutableTreeNode("Nagpur"));
    india.add(mh);
    india.add(new DefaultMutableTreeNode("Gujrath"));
    add(new JScrollPane(new JTree(india)));
    setVisible(true);
    setSize(500,500);
}
    public static void main(String[] args) 
    {
        new X2();
    }
}
