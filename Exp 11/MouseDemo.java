import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class MouseDemo extends Applet implements MouseListener {
    Label l;

    public void init() {
        l = new Label("Hello Mouse");
        l.setBounds(50, 150, 200, 100);
        add(l);

        addMouseListener(this);
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("click");
        l.setText("Mouse Pressed no. of clicks:" + e.getClickCount() + " at position " + e.getX() + "," + e.getY());
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("MR");
        l.setText("Mouse Released; # of clicks:" + e.getClickCount());
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("Enter");
        l.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        l.setText("Mouse exited");
    }

    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse clicked (# of clicks:" + e.getClickCount() + ")");
    }
}
