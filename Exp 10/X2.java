import java.awt.*;
import java.awt.event.*;
class X2 extends Frame implements KeyListener
{
    Label l1,l2;
    TextField tf1,tf2;
    public X2(String s)
    {
        super(s);
        setVisible(true);
        setLayout(null);
        setSize(500,500);
        l1=new Label("Key Code");
        l2=new Label("Key");
        l1.setBounds(50,100,100,15);
        l2.setBounds(50,150,100,15);
        tf1=new TextField();
        tf2=new TextField();
        tf1.setBounds(160,100,150,40);
        tf2.setBounds(160,150,150,40);
        tf1.addKeyListener(this);
        tf2.addKeyListener(this);
        add(l1);
        add(l2);
        add(tf1);
        add(tf2);
    }   
    public void keyPressed(KeyEvent e)
    {
        int keyNumber=e.getKeyCode();
        switch(keyNumber){
        case KeyEvent.VK_F1:
        tf1.setText(keyNumber+"");
        tf2.setText("Functional Key F1");
        break;
        case KeyEvent.VK_F2:
        tf1.setText(keyNumber+"");
        tf2.setText("Functional Key F2");
        break;
        case KeyEvent.VK_F3:
        tf1.setText(keyNumber+"");
        tf2.setText("Functional Key F3");
        break;
        case KeyEvent.VK_F4:
        tf1.setText(keyNumber+"");
        tf2.setText("Functional Key F4");
        break;
        case KeyEvent.VK_F5:
        tf1.setText(keyNumber+"");
        tf2.setText("Functional Key F5");
        break;
        case KeyEvent.VK_F6:
        tf1.setText(keyNumber+"");
        tf2.setText("Functional Key F6");
        break;
        case KeyEvent.VK_F7:
        tf1.setText(keyNumber+"");
        tf2.setText("Functional Key F7");
        break;  
        case KeyEvent.VK_F8:
        tf1.setText(keyNumber+"");
        tf2.setText("Functional Key F8");
        break;
        case KeyEvent.VK_F9:
        tf1.setText(keyNumber+"");
        tf2.setText("Functional Key F9");
        break;
        case KeyEvent.VK_F10:
        tf1.setText(keyNumber+"");
        tf2.setText("Functional Key F10");
        break;
        case KeyEvent.VK_F11:
        tf1.setText(keyNumber+"");
        tf2.setText("Functional Key F11");
        break;
        case KeyEvent.VK_F12:
        tf1.setText(keyNumber+"");
        tf2.setText("Functional Key F12");
        break;
        case KeyEvent.VK_UP:
        tf1.setText(keyNumber+"");
        tf2.setText("UP ARROW");
        break;
        case KeyEvent.VK_DOWN:
        tf1.setText(keyNumber+"");
        tf2.setText("DOWN ARROW");
        break;
        case KeyEvent.VK_RIGHT:
        tf1.setText(keyNumber+"");
        tf2.setText("RIGHT ARROW");
        break;
        case KeyEvent.VK_LEFT:
        tf1.setText(keyNumber+"");
        tf2.setText("LEFT ARROW");
        break;
    }
    }
    public void keyTyped(KeyEvent e){ }
    public void keyReleased(KeyEvent e){ }
    public static void main(String[] args)
    {
        new X2("Jayesh Wagh ");
    }
}
