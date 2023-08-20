import java.awt.*;
public class Exc1
{
    public static void main(String[] args)
    {
        Frame frame = new Frame("Jayesh Wagh");
        Label nameLabel = new Label("Hello User! Welcome to Java");
        frame.add(nameLabel);
        frame.setSize(300, 250);
        frame.setVisible(true);

    }
}