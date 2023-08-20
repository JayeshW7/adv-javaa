import java.awt.*;
class Exc2 extends Frame
{
    Exc2()
    {
        setTitle("Jayesh Wagh");
        setLayout(new BorderLayout());
        Button b1 = new Button("North");
        Button b2 = new Button("South");
        Button b3 = new Button("West");
        Button b4 = new Button("East");
        Button b5 = new Button("Center");

        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.SOUTH);
        add(b3, BorderLayout.WEST);
        add(b4, BorderLayout.EAST);
        add(b5, BorderLayout.CENTER);
    }
    public static void main(String[] args) 
    {
        Exc2 exc = new Exc2();
        exc.setVisible(true);
        exc.setSize(500, 500);
    }
}