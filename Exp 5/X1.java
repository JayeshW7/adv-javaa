import java.awt.*;
import java.awt.event.*;
class X1 extends Frame
{
    X1(String s)
    {
        setTitle(s);
        MenuBar mb = new MenuBar();
        setMenuBar(mb);

        Menu ma = new Menu("colors");
        mb.add(ma);

        MenuItem m1 = new MenuItem("Blue");
        MenuItem m2 = new MenuItem("Red");
        MenuItem m3 = new MenuItem("Red");
        MenuItem m4 = new MenuItem("Yellow");
        MenuItem m5 = new MenuItem("Green");
        MenuItem m6 = new MenuItem("Black");
        m6.setEnabled(false);
        
        ma.add(m1);
        ma.add(m2);
        ma.add(m3);        
        ma.add(m4);
        ma.add(m5);
        ma.add(m6);
    }
    public static void main(String[] args) 
    {
        X1 obj = new X1("Jayesh Wagh");
        obj.setVisible(true);    
        obj.setSize(500, 500);
    }
}