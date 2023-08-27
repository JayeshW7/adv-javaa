import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
public class Exc1 extends JFrame
{
    public Exc1()
    {
        DefaultMutableTreeNode rt = new 
        DefaultMutableTreeNode("ROOT");
        DefaultMutableTreeNode c = new 
        DefaultMutableTreeNode("DRIVE C:");
        DefaultMutableTreeNode jv = new 
        DefaultMutableTreeNode("JAVA");
        jv.add(new DefaultMutableTreeNode("jdk 1.8.0_202"));
        jv.add(new DefaultMutableTreeNode("jdk-15.0.2"));
        jv.add(new DefaultMutableTreeNode("jre 1.8.0_311"));
        DefaultMutableTreeNode proFiles = new 
        DefaultMutableTreeNode("PROGRAM FILES");
        proFiles.add(new DefaultMutableTreeNode("Comman Files"));
        proFiles.add(new DefaultMutableTreeNode("Cisco Packet Tracer 8.0.1"));
        proFiles.add(new DefaultMutableTreeNode("Git"));
        proFiles.add(new DefaultMutableTreeNode("MySQL"));
        proFiles.add(new DefaultMutableTreeNode("Microsoft Visual Studio 10.0"));
        proFiles.add(new DefaultMutableTreeNode("Microsoft Office 15"));
        proFiles.add(new DefaultMutableTreeNode("Spark AR Studio"));
        proFiles.add(new DefaultMutableTreeNode("Windows Media Player"));
        proFiles.add(new DefaultMutableTreeNode("Microsoft Visual Studio 9.0"));
        DefaultMutableTreeNode xmp = new 
        DefaultMutableTreeNode("APPS");
        xmp.add(new DefaultMutableTreeNode("7VDFT"));
        xmp.add(new DefaultMutableTreeNode("334CH"));
        xmp.add(new DefaultMutableTreeNode("SupportAssist"));
        xmp.add(new DefaultMutableTreeNode("YR2T2"));
        c.add(jv);
        c.add(proFiles);
        c.add(xmp);
        rt.add(c);
        add(new JScrollPane(new JTree(rt)));
        setVisible(true);
        setSize(500,500);
        setTitle("Jayesh Wagh");
    }
    public static void main(String[] args) 
    {
        new Exc1();
    }
}