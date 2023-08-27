import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class X1 extends JFrame implements ActionListener {
    JComboBox<String> cb;
    JLabel l;

    X1(String s) {
        super(s);
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(500, 500);
        String[] city = {"Solapur", "Pune", "Bangalore", "Mumbai"};
        cb = new JComboBox<>(city);
        l = new JLabel("");
        cb.addActionListener(this);
        add(cb);
        add(l);
    }

    public void actionPerformed(ActionEvent e) {
        String s = (String) cb.getSelectedItem();
        l.setText("You selected " + s);
    }

    public static void main(String[] args) {
        new X1("Sanika Lad_79");
    }
}
