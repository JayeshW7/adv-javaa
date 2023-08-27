import javax.swing.*;
import java.awt.*;
class X1 extends JFrame
{
    Object[] col= {"RANK (in terms of Geographical Area)","STATE","CAPITAL"};
    Object[][] row=
    {
        {"1","Rajasthan","Jaipur"},
        {"2","Madhya Pradesh","Bhopal"},
        {"3","Maharashtra","Mumbai"},
        {"4","Uttar Pradesh","Lucknow"},
        {"5","Gujarat","Gandhinagar"},
        {"6","Karnataka","Bengaluru"},
        {"7","Andhra Pradesh","Visakhapatnam"},
        {"8","Odisha","Bhuvaneshvara"},
        {"9","Chattisgarh","Raipur"},
        {"10","Tamil Nadu","Chennai"}
    };
    public X1(String s)
    {
        super(s);
        setVisible(true);
        setSize(300,300);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE
    );  
    JTable t=new JTable(row,col);
    JScrollPane sp=new JScrollPane(t);
    add(sp,BorderLayout.CENTER);
    }
    public static void main(String[] args)
    {
        new X1("Jayesh Wagh");
    }
}