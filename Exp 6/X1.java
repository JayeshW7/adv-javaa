import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
public class X1 extends Frame
{
public static void main(String args[])
{
JFrame f=new JFrame();
f.setSize(500,500);
f.setTitle("Sanika Lad_79");
f.setVisible(true);
DefaultMutableTreeNode r1=new DefaultMutableTreeNode("INDIA");
DefaultMutableTreeNode r2=new DefaultMutableTreeNode("STATES");
DefaultMutableTreeNode c1=new DefaultMutableTreeNode("Maharastra");
r2.add(c1);
DefaultMutableTreeNode c2=new DefaultMutableTreeNode("Madhya Pradesh");
r2.add(c2);
DefaultMutableTreeNode c3=new DefaultMutableTreeNode("Delhi");
r2.add(c3);
DefaultMutableTreeNode c4=new DefaultMutableTreeNode("Gujarat");
r2.add(c4);
DefaultMutableTreeNode c5=new DefaultMutableTreeNode("Assam");
r2.add(c5);
DefaultMutableTreeNode c6=new DefaultMutableTreeNode("Meghalaya");
r2.add(c6);
DefaultMutableTreeNode c7=new DefaultMutableTreeNode("Jammu & Kashmir");
r2.add(c7);
DefaultMutableTreeNode r3=new DefaultMutableTreeNode("STATES WITH THEIR CAPITAL");
DefaultMutableTreeNode c8=new DefaultMutableTreeNode("Maharastra -Mumbai");
r3.add(c8);
DefaultMutableTreeNode c9=new DefaultMutableTreeNode("Madhya Pradesh - Bhopal");
r3.add(c9);
DefaultMutableTreeNode c10=new DefaultMutableTreeNode("Delhi - New Delhi");
r3.add(c10);
DefaultMutableTreeNode c11=new DefaultMutableTreeNode("Gujarat -Gandhinagar");
r3.add(c11);
DefaultMutableTreeNode c12=new DefaultMutableTreeNode("Assam -Dispur");
r3.add(c12);
DefaultMutableTreeNode c13=new DefaultMutableTreeNode("Meghalaya -Shillong ");
r3.add(c13);
DefaultMutableTreeNode c14=new DefaultMutableTreeNode("Jammu & Kashmir - Srinagar");
r3.add(c14);
r1.add(r2);
r1.add(r3);
JTree t=new JTree(r1);

f.add(t);
}
}

