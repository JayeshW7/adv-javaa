import javax.swing.*;
import java.awt.*;
class X2 extends JFrame
{
    Object[] col={"ID","NAME","SALARY"};
    Object[][]row={{"101","Amit","670000"},{"102","Jai","780000"},{"103","Sachin","700000"}};
    public X2(String s)
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
        new X2("Jayesh Wagh ");
    }
}
